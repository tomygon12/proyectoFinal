/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Leo_1
 */
public class Usuario {
    private int idUsuario;
    private String nombre;
    private int password;
    private boolean estado;
   
    
    public Usuario(){}

    public Usuario(String nombre, int password, boolean estado) {
        this.nombre = nombre;
        this.password = password;
        this.estado = estado;
    }
    
    public Usuario(int idUsuario){
    
        this.idUsuario = idUsuario;
    
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
    
}
