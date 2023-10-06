/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import Entidades.Ciudad;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Tomas
 */
public class CiudadData {
    private Connection con = null;
    
     public CiudadData(){
         
         con = Conexion.getConexion();

    }
     
    public void crearCiudad(Ciudad ciudad) {
        String sql = "INSERT INTO ciudad (nombre, pais, provincia, estado) VALUES (?, ?, ?, ?)";
        try{
             PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
             ps.setString(1, ciudad.getNombre());
             ps.setString(2, ciudad.getPais());
             ps.setString(3, ciudad.getProvincia());
             ps.setBoolean(4, ciudad.isEstado());
             ps.executeUpdate();
             ResultSet rs = ps.getGeneratedKeys();
             System.out.println(rs);
             if(rs.next()){     
                 ciudad.setIdCiudad(rs.getInt(1));
                 JOptionPane.showMessageDialog(null, "Ciudad añadida con éxito.");
             }
             ps.close();
         }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Ciudad" + ex.getMessage());
         } 
    }
    
    public Ciudad buscarCiudadPorId(int id) {
        Ciudad ciudad = new Ciudad();
        String sql = "SELECT nombre, pais, provincia FROM ciudad WHERE idCiudad = ? AND estado = 1";
        PreparedStatement ps = null; 
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1,id ); 
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                ciudad.setIdCiudad(id);
                ciudad.setNombre(rs.getString("nombre"));
                ciudad.setPais(rs.getString("pais"));
                ciudad.setProvincia(rs.getString("provincia"));
                ciudad.setEstado(true);
            }else{
                JOptionPane.showMessageDialog(null, "Ciudad no disponible.");
                ps.close();
            } 
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Ciudad "+ex.getMessage()); 
        }
        return ciudad;
    }
    
    public void modificarCiudad(Ciudad ciudad) {
        String sql = "UPDATE ciudad SET  nombre = ?, pais = ?, provincia = ?, estado = ? WHERE idCiudad = ?";
        PreparedStatement ps = null;         
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, ciudad.getNombre());
            ps.setString(2, ciudad.getPais());
            ps.setString(3, ciudad.getProvincia());
            ps.setBoolean(4, ciudad.isEstado());
            ps.setInt(5, ciudad.getIdCiudad());
            int exito = ps.executeUpdate();
            if(exito == 1){
                JOptionPane.showMessageDialog(null, "Se actualizó los datos de la ciudad.");
            }else{
                JOptionPane.showMessageDialog(null, "Ciudad no disponible"); 
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Ciudad "+ex.getMessage());
        }
    }
    
    public List<Ciudad> listarCiudades() {
        List<Ciudad> ciudades = new ArrayList<>();
        try {
            String sql = "SELECT * FROM ciudad WHERE estado = 1";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Ciudad ciudad = new Ciudad();
                ciudad.setIdCiudad(rs.getInt("idCiudad"));
                ciudad.setNombre(rs.getString("nombre"));
                ciudad.setPais(rs.getString("pais"));
                ciudad.setProvincia(rs.getNString("provincia"));
                ciudad.setEstado(true);
                ciudades.add(ciudad);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Ciudad");
        }
        return ciudades;
    }
    
    public void eliminarCiudad(int id) {
        try{
            String sql = "UPDATE ciudad SET estado = 0 WHERE idCiudad = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila=ps.executeUpdate(); 
            if(fila == 1){
                JOptionPane.showMessageDialog(null, " Se eliminó la ciudad.");
            } 
            ps.close(); 
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Ciudad");
        }
    }
}
