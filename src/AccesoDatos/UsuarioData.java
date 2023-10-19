/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import Entidades.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Tomas
 */
public class UsuarioData {
    private Connection con = null;
    
    public UsuarioData(){
        con = Conexion.getConexion();
    }
     
    public void crearUsuario(Usuario usuario) {
        String sql = "INSERT INTO usuario (nombre, password, estado) VALUES (?, ?, ?)";
        try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, usuario.getNombre());
            ps.setInt(2, usuario.getPassword());
            ps.setBoolean(3, usuario.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            System.out.println(rs);
            if(rs.next()){     
                usuario.setIdUsuario(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Usuario añadido con éxito.");
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Usuarios" + ex.getMessage());
        } 
    }
    
    public List<Usuario> listarUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        try {
            String sql = "SELECT * FROM usuario WHERE estado = 1";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setIdUsuario(rs.getInt("idUsuario"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setPassword(rs.getInt("password"));
                usuario.setEstado(true);
                usuarios.add(usuario);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Usuario");
        }
        return usuarios;
    }
    
    public void eliminarUsuario(int id) {
        try{
            String sql = "UPDATE usuario SET estado = 0 WHERE idUsuario = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila=ps.executeUpdate(); 
            if(fila == 1){
                JOptionPane.showMessageDialog(null, " Se eliminó el usuario.");
            } 
            ps.close(); 
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Usuario");
        }
    }
}
