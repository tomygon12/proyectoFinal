/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import AccesoDatos.CiudadData;
import AccesoDatos.Conexion;
import AccesoDatos.Usuariodata;
import Entidades.Ciudad;
import Entidades.Usuario;
import java.util.List;

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
        
        //Ciudad buenosAires = new Ciudad("Manhattan", "New York", "Estados Unidos", true);
        //buenosAires.setIdCiudad(1);
        //CiudadData cd = new CiudadData();
        //cd.crearCiudad(buenosAires);
        //System.out.println(cd.buscarCiudadPorId(1).toString());
        //cd.eliminarCiudad(2);
        //cd.modificarCiudad(buenosAires);
        //List <Ciudad> ciudades = cd.listarCiudades();
        /*for (Ciudad ciudad : ciudades) {
            System.out.println(ciudad.toString());
        }*/
        
        Usuario us = new Usuario("Leo", 1234, true);
        
        Usuariodata ud = new Usuariodata();
        
        ud.crearUsuario(us);
        
        
        
        
    }
    
}
