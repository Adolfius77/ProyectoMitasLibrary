/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers.impl;

import Controllers.ILibroController;
import DAO.ILibroDAO;
import Model.Libro;
import java.util.List;
import java.util.Optional;
import org.bson.types.ObjectId;

/**
 *
 * @author luisb
 */
public class LibroController implements ILibroController {
    
    private final ILibroDAO libroDAO;

    public LibroController(ILibroDAO libroDAO) {
        this.libroDAO = libroDAO; 
    }

    @Override
    public void registrarLibro(Libro libro) throws Exception {
        if (libro == null) {
            throw new Exception("El libro no puede ser nulo.");
        }

        if (libro.getTitulo() == null || libro.getTitulo().isBlank()) {
            throw new Exception("El título no puede estar vacío.");
        }

        if (libro.getIsbn() == null || libro.getIsbn().isBlank()) {
            throw new Exception("El ISBN no puede estar vacío.");
        }

        if (libro.getPrecio() < 0) {
            throw new Exception("El precio no puede ser negativo.");
        }

        if (libro.getStock() < 0) {
            throw new Exception("El stock no puede ser negativo.");
        }

        libroDAO.crearLibro(libro);
    }

    @Override
    public void actualizarLibro(Libro libro) throws Exception {
        if (libro == null || libro.getId() == null) {
            throw new Exception("El libro o su ID no pueden ser nulos.");
        }

        if (libro.getTitulo() == null || libro.getTitulo().isBlank()) {
            throw new Exception("El título no puede estar vacío.");
        }

        if (libro.getPrecio() < 0) {
            throw new Exception("El precio no puede ser negativo.");
        }

        libroDAO.actualizar(libro);
    }

    @Override
    public void eliminarLibro(ObjectId id) throws Exception {
        if (id == null) {
            throw new Exception("El ID no puede ser nulo.");
        }

        libroDAO.eliminarPorId(id);
    }

    @Override
    public Optional<Libro> buscarPorId(ObjectId id) throws Exception {
        if (id == null) {
            throw new Exception("El ID no puede ser nulo.");
        }

        return libroDAO.encontrarPorId(id);
    }

    @Override
    public Optional<Libro> buscarPorTitulo(String titulo) throws Exception {
        if (titulo == null || titulo.isBlank()) {
            throw new Exception("El título no puede estar vacío.");
        }

        return libroDAO.encontrarPorTitulo(titulo);
    }

    @Override
    public List<Libro> listarLibros() throws Exception {
        return libroDAO.encontrarTodos();
    }

    @Override
    public Optional<Libro> buscarPorISBN(String isbn) throws Exception {
        if (isbn == null || isbn.isBlank()) {
            throw new Exception("El título no puede estar vacío.");
        }

        return libroDAO.encontrarPorISBN(isbn);
    }
    
}
