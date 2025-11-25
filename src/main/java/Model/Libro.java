/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author jorge
 */
public class Libro {
    private ObjectId _id;
    private String isbn;
    private String titulo;
    private String autor;
    private double precio;
    private int stock;
    private String portadaUrl;
    private List<String> categorias; 
    private DetalleLibro detalles;
    private List<Resena> resenas;

    public Libro(ObjectId _id, String isbn, String titulo, String autor, double precio, int stock, String portadaUrl, List<String> categorias, DetalleLibro detalles, List<Resena> resenas) {
        this._id = _id;
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.stock = stock;
        this.portadaUrl = portadaUrl;
        this.categorias = categorias;
        this.detalles = detalles;
        this.resenas = resenas;
    }

    public Libro() {
    }

    public ObjectId getId() {
        return _id;
    }

    public void setId(ObjectId _id) {
        this._id = _id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getPortadaUrl() {
        return portadaUrl;
    }

    public void setPortadaUrl(String portadaUrl) {
        this.portadaUrl = portadaUrl;
    }

    public List<String> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<String> categorias) {
        this.categorias = categorias;
    }

    public DetalleLibro getDetalles() {
        return detalles;
    }

    public void setDetalles(DetalleLibro detalles) {
        this.detalles = detalles;
    }

    public List<Resena> getResenas() {
        return resenas;
    }

    public void setResenas(List<Resena> resenas) {
        this.resenas = resenas;
    }
    
    
}
