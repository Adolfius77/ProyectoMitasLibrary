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
public class Resena {
    
    private String usuarioNombre;
    private int calificacion;
    private String comentario;
    private Date fecha;

    public Resena(String usuarioNombre, int calificacion, String comentario, Date fecha) {
        this.usuarioNombre = usuarioNombre;
        this.calificacion = calificacion;
        this.comentario = comentario;
        this.fecha = fecha;
    }
    public Resena(){
        
    }
    

    public String getUsuarioNombre() {
        return usuarioNombre;
    }

    public void setUsuarioNombre(String usuarioNombre) {
        this.usuarioNombre = usuarioNombre;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
    
}
