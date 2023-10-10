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
 * @author Leo_1
 */
public class Usuariodata {
    
    private Connection con = null;
    
     public Usuariodata(){
         
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
                 JOptionPane.showMessageDialog(null, "Usuario registrado con exito");
             }
             ps.close();
         }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error el usuario no pudo ser registrado" + ex.getMessage());
         } 
    }
    
    public Usuario buscarUsuarioPorId(String nombre, int password) {
        Usuario usuario = null;
        String sql = "SELECT * FROM usuario WHERE nombre = ? and password = ?";
        PreparedStatement ps = null; 
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setInt(2, password);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                
                usuario = new Usuario();
                
                JOptionPane.showMessageDialog(null, "Usuario Correcto");
            }else{
                JOptionPane.showMessageDialog(null, "Usuario no encontrado");
                ps.close();
            } 
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Usuario "+ex.getMessage()); 
        }
        return usuario;
    }
    
    
    
    
    
}
