/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.time.LocalDate;

/**
 *
 * @author Tomas
 */
public class Alojamiento {
    
    private int idAlojamiento;
    private LocalDate fechaIn;
    private LocalDate fechaOn;
    private boolean estado;
    private String servicio;
    private double importeDiario;
    private Ciudad ciudadDestino;

    public Alojamiento() {
    }

    public Alojamiento(LocalDate fechaIn, LocalDate fechaOn, boolean estado, String servicio, double importeDiario, Ciudad ciudadDestino) {
        this.fechaIn = fechaIn;
        this.fechaOn = fechaOn;
        this.estado = estado;
        this.servicio = servicio;
        this.importeDiario = importeDiario;
        this.ciudadDestino = ciudadDestino;
    }

    public Alojamiento(int idAlojamiento) {
        this.idAlojamiento = idAlojamiento;
    }

    public int getIdAlojamiento() {
        return idAlojamiento;
    }

    public void setIdAlojamiento(int idAlojamiento) {
        this.idAlojamiento = idAlojamiento;
    }

    public LocalDate getFechaIn() {
        return fechaIn;
    }

    public void setFechaIn(LocalDate fechaIn) {
        this.fechaIn = fechaIn;
    }

    public LocalDate getFechaOn() {
        return fechaOn;
    }

    public void setFechaOn(LocalDate fechaOn) {
        this.fechaOn = fechaOn;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public double getImporteDiario() {
        return importeDiario;
    }

    public void setImporteDiario(double importeDiario) {
        this.importeDiario = importeDiario;
    }

    public Ciudad getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(Ciudad ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }
    
    
}
