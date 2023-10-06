/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import Entidades.Paquete;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Tomas
 */
public class PaqueteData {
    private Connection con = null;
    
    public PaqueteData() {
        con = Conexion.getConexion();
    }
    
    public void crearPaquete(Paquete paquete) {
        String sql = "INSERT INTO paquete (idCiudadOrigen, idCiudadDestino, idAlojamiento, idPasaje) VALUES (?, ?, ?, ?)";
        try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, paquete.getOrigen().getIdCiudad());
            ps.setInt(2, paquete.getDestino().getIdCiudad());
            ps.setInt(3, paquete.getAlojamiento().getIdAlojamiento());
            ps.setInt(4, paquete.getPasaje().getIdPasaje());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            System.out.println(rs);
            if (rs.next()){     
                paquete.setIdPaquete(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Paquete creado con éxito.");
            }
            ps.close();
        } catch(SQLException ex){
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Paquete" + ex.getMessage());
        }
    }
    
    public void modificarPaquete(Paquete paquete) {
        
    }
}
