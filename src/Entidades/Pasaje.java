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
public class Pasaje {
    
    private int idPasaje;
    private String tipoTransporte;
    private double importe;
    private Ciudad CiudadOrigen;
    private boolean estado;
    
    
    public Pasaje() {
    }

    public Pasaje(String tipoTransporte, double importe, Ciudad CiudadOrigen, boolean estado) {
        this.tipoTransporte = tipoTransporte;
        this.importe = importe;
        this.CiudadOrigen = CiudadOrigen;
        this.estado = estado;
    }

    public Pasaje(int idPasaje) {
        this.idPasaje = idPasaje;
    }

    public int getIdPasaje() {
        return idPasaje;
    }

    public void setIdPasaje(int idPasaje) {
        this.idPasaje = idPasaje;
    }

    public String getTipoTransporte() {
        return tipoTransporte;
    }

    public void setTipoTransporte(String tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public Ciudad getCiudadOrigen() {
        return CiudadOrigen;
    }

    public void setCiudadOrigen(Ciudad CiudadOrigen) {
        this.CiudadOrigen = CiudadOrigen;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
}
