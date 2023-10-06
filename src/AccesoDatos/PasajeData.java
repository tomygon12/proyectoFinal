/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import Entidades.Pasaje;
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
public class PasajeData {
    private Connection con = null;
    
    public PasajeData() {
        con = Conexion.getConexion();
    }
    
    public void crearPasaje(Pasaje pasaje) {
        String sql = "INSERT INTO pasaje (tipoTransporte, importe, idCiudadOrigen, estado) VALUES (?, ?, ?, ?)";
        try{
             PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
             ps.setString(1, pasaje.getTipoTransporte());
             ps.setDouble(2, pasaje.getImporte());
             ps.setInt(3, pasaje.getCiudadOrigen().getIdCiudad());
             ps.setBoolean(4, pasaje.isEstado());
             ps.executeUpdate();
             ResultSet rs = ps.getGeneratedKeys();
             if(rs.next()){     
                 pasaje.setIdPasaje(rs.getInt(1));
                 JOptionPane.showMessageDialog(null, "Pasaje creado con éxito.");
             }
             ps.close();
         }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Pasaje" + ex.getMessage());
         } 
    }
    
    public Pasaje buscarPasajePorId(int id){
        CiudadData cd = new CiudadData();
        Pasaje pasaje = new Pasaje();
        String sql = "SELECT tipoTransporte, importe, idCiudadOrigen FROM pasaje WHERE idPasaje = ? AND estado = 1";
        PreparedStatement ps = null; 
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1,id ); 
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                pasaje.setIdPasaje(id);
                pasaje.setTipoTransporte(rs.getString("tipoTransporte"));
                pasaje.setImporte(rs.getDouble("importe"));
                pasaje.setCiudadOrigen(cd.buscarCiudadPorId(rs.getInt("idCiudadOrigen")));
                pasaje.setEstado(true);
            }else{
                JOptionPane.showMessageDialog(null, "Pasaje no disponible.");
                ps.close();
            } 
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Pasaje "+ex.getMessage()); 
        }
        return pasaje;
    }
    
    public void modificarPasaje(Pasaje pasaje) {
        String sql = "UPDATE pasaje SET  tipoTransporte = ?, importe = ?, idCiudadOrigen = ?, estado = ? WHERE idPasaje = ?";
        PreparedStatement ps = null;         
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, pasaje.getTipoTransporte());
            ps.setDouble(2, pasaje.getImporte());
            ps.setInt(3, pasaje.getCiudadOrigen().getIdCiudad());
            ps.setBoolean(4, pasaje.isEstado());
            ps.setInt(5, pasaje.getIdPasaje());
            int exito = ps.executeUpdate();
            if(exito == 1){
                JOptionPane.showMessageDialog(null, "Se actualizó el pasaje.");
            }else{
                JOptionPane.showMessageDialog(null, "Pasaje no disponible"); 
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Pasaje "+ex.getMessage());
        }
    }
    
    public List<Pasaje> listarPasajes() {
        List<Pasaje> pasajes = new ArrayList<>();
        CiudadData cd = new CiudadData();
        try {
            String sql = "SELECT * FROM pasaje WHERE estado = 1";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Pasaje pasaje = new Pasaje();
                pasaje.setIdPasaje(rs.getInt("idPasaje"));
                pasaje.setTipoTransporte(rs.getString("tipoTransporte"));
                pasaje.setImporte(rs.getDouble("importe"));
                pasaje.setCiudadOrigen(cd.buscarCiudadPorId(rs.getInt("idCiudadOrigen")));
                pasaje.setEstado(true);
                pasajes.add(pasaje);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Pasaje");
        }
        return pasajes;
    }
    
    public void eliminarPasaje(int id) {
        try{
            String sql = "UPDATE pasaje SET estado = 0 WHERE idPasaje = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila=ps.executeUpdate(); 
            if(fila == 1){
                JOptionPane.showMessageDialog(null, " Se eliminó el pasaje.");
            } 
            ps.close(); 
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Pasaje");
        }
    }
}
