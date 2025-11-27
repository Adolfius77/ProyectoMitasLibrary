package DAO;

import Model.Libro;
import exceptions.DaoException;
import org.bson.types.ObjectId;

import java.util.List;
import java.util.Optional;

public interface ILibroDAO {
    ObjectId crearLibro(Libro entidad)throws DaoException;
    Optional<Libro> encontrarPorId(ObjectId _id)throws DaoException;
    List<Libro> encontrarTodos()throws DaoException;
    boolean actualizar(Libro entidad)throws DaoException;
    boolean eliminarPorId(ObjectId _id)throws DaoException;
    Optional<Libro> encontrarPorTitulo(String titulo) throws DaoException;
    Optional<Libro> encontrarPorISBN(String ISBN) throws DaoException;
    boolean actualizaStock(String id, int cantidadComprada);
}
