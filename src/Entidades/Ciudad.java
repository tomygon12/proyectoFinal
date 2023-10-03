/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Tomas
 */
public class Ciudad {
    private int idCiudad;
    private String nombre;
    private String provincia;
    private String pais;
    private boolean estado;
    
    public Ciudad(){
    }
    
    public Ciudad(String nombre, String provincia, String pais, boolean estado) {
        this.nombre = nombre;
        this.provincia = provincia;
        this.pais = pais;
        this.estado = estado;
    }
    
    public Ciudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }

    public int getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Ciudad{" + "idCiudad=" + idCiudad + ", nombre=" + nombre + ", provincia=" + provincia + ", pais=" + pais + '}';
    }
   
}
