package Model;

import java.util.Date;
import org.bson.types.ObjectId; 

/**
 *
 * @author jorge y Angel
 */
public class Resena {
    
    private ObjectId id;
    
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

    public Resena() {
        
    }
    
    // Getter y Setter para el ID
    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
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
