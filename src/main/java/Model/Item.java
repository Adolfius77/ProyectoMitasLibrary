/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import org.bson.types.ObjectId;
/**
 *
 * @author jorge
 */
public class Item {
    
    private ObjectId libroId; 
    private String titulo;
    private int cantidad;
    private double precioUnitario;
    private double subtotal;

    public Item(ObjectId libroId, String titulo, int cantidad, double precioUnitario, double subtotal) {
        this.libroId = libroId;
        this.titulo = titulo;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.subtotal = subtotal;
    }

    public Item() {
    }

    public ObjectId getLibroId() {
        return libroId;
    }

    public void setLibroId(ObjectId libroId) {
        this.libroId = libroId;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
    
    
}
