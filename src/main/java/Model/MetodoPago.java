/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author jorge
 */
public class MetodoPago {
    private String tipo; 
    private String marca;
    private String terminacion;
    private String titular;
    private Date fechaExpiracion; 
    private int NumeroTarjeta;

    public MetodoPago() {
    }

    public MetodoPago(String tipo, String marca, String terminacion, String titular, Date fechaExpiracion, int NumeroTarjeta) {
        this.tipo = tipo;
        this.marca = marca;
        this.terminacion = terminacion;
        this.titular = titular;
        this.fechaExpiracion = fechaExpiracion;
        this.NumeroTarjeta = NumeroTarjeta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTerminacion() {
        return terminacion;
    }

    public void setTerminacion(String terminacion) {
        this.terminacion = terminacion;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Date getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(Date fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public int getNumeroTarjeta() {
        return NumeroTarjeta;
    }

    public void setNumeroTarjeta(int NumeroTarjeta) {
        this.NumeroTarjeta = NumeroTarjeta;
    }
    
    
    

    
}
