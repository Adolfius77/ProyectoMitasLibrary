/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Controllers;

import Model.Libro;
import java.util.List;
import java.util.Optional;
import org.bson.types.ObjectId;

/**
 *
 * @author luisb
 */
public interface ILibroController {
    
    void registrarLibro(Libro libro) throws Exception;
    void actualizarLibro(Libro libro) throws Exception;
    void eliminarLibro(ObjectId id) throws Exception;
    Optional<Libro> buscarPorId(ObjectId id) throws Exception;
    Optional<Libro> buscarPorISBN(String isbn) throws Exception;
    Optional<Libro> buscarPorTitulo(String titulo) throws Exception;
    List<Libro> listarLibros() throws Exception;
    
}
