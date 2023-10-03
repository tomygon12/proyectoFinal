/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import AccesoDatos.CiudadData;
import AccesoDatos.Conexion;
import Entidades.Ciudad;

/**
 *
 * @author Tomas
 */
public class ProyectoFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //System.out.println(Conexion.getConexion());
        
        Ciudad buenosAires = new Ciudad("Capital Federal", "Buenos Aires", "Argentina", true);
        CiudadData cd = new CiudadData();
        cd.crearCiudad(buenosAires);
    }
    
}
