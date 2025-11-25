/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author jorge
 */
public class DetalleLibro {
    private String editorial;
    private int anoPublicacion;
    private int numeroPaginas;
    private String idioma;
    private String sinopsis;

    public DetalleLibro() {
    }

    public DetalleLibro(String editorial, int anoPublicacion, int numeroPaginas, String idioma, String sinopsis) {
        this.editorial = editorial;
        this.anoPublicacion = anoPublicacion;
        this.numeroPaginas = numeroPaginas;
        this.idioma = idioma;
        this.sinopsis = sinopsis;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAnoPublicacion() {
        return anoPublicacion;
    }

    public void setAnoPublicacion(int anoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }
    
    
}
