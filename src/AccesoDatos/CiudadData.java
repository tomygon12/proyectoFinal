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
  
}
