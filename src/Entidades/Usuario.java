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
    private String user;
    private int password;
    
    public Usuario(){}

    public Usuario(String user, int password) {
        this.user = user;
        this.password = password;
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

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
    
    
    
}
