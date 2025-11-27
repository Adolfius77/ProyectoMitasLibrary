package DAO.impl;

import DAO.ILibroDAO;
import Model.Libro;
import exceptions.DaoException;
import org.bson.types.ObjectId;

import java.util.List;
import java.util.Optional;

public class LibroDAO implements ILibroDAO {
    @Override
    public ObjectId crearLibro(Libro entidad) throws DaoException {
        return null;
    }

    @Override
    public Optional<Libro> encontrarPorId(ObjectId _id) throws DaoException {
        return Optional.empty();
    }

    @Override
    public List<Libro> encontrarTodos() throws DaoException {
        return List.of();
    }

    @Override
    public boolean actualizar(Libro entidad) throws DaoException {
        return false;
    }

    @Override
    public boolean eliminarPorId(ObjectId _id) throws DaoException {
        return false;
    }

    @Override
    public Optional<Libro> encontrarPorTitulo(String titulo) throws DaoException {
        return Optional.empty();
    }

    @Override
    public Optional<Libro> encontrarPorISBN(String ISBN) throws DaoException {
        return Optional.empty();
    }

    @Override
    public boolean actualizaStock(String id, int cantidadComprada) {
        return false;
    }
}
