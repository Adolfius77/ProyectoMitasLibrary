package DAO.impl;

import DAO.ILibroDAO;
import Model.Libro;
import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.UpdateResult;
import config.MongoClientProvider;
import exceptions.DaoException;
import org.bson.types.ObjectId;

import java.util.List;
import java.util.Optional;

public class LibroDAO implements ILibroDAO {
    private final MongoCollection<Libro> col;

    public LibroDAO(MongoCollection<Libro> col) {
        this.col = MongoClientProvider.INSTANCE.getcCollection("libros", Libro.class);
    }

    @Override
    public ObjectId crearLibro(Libro entidad) throws DaoException {
        try{
            if(entidad.getId() == null)entidad.setId(new ObjectId());
            col.insertOne(entidad);
            return entidad.getId();
        }catch (MongoException e){
            throw new DaoException("error al crear un libro", e);
        }
    }

    @Override
    public Optional<Libro> encontrarPorId(ObjectId _id) throws DaoException {
        try{
            return Optional.ofNullable(col.find(Filters.eq("_id",_id)).first());

        }catch (MongoException e){
            throw new DaoException("error al encontrar un libro", e);
        }
    }

    @Override
    public List<Libro> encontrarTodos() throws DaoException {
        try{
            return col.find().into(new java.util.ArrayList<>());

        }catch (MongoException e){
            throw new DaoException("error al encontrar todos los libros", e);
        }
    }

    @Override
    public boolean actualizar(Libro entidad) throws DaoException {
        try{
            UpdateResult resultado = col.replaceOne(
                    Filters.eq("_id", entidad.getId()),
                    entidad
            );
            return resultado.getModifiedCount() > 0;
        }catch (MongoException e){
            throw new DaoException("error al actualizar un libro", e);
        }
    }

    @Override
    public boolean eliminarPorId(ObjectId _id) throws DaoException {
        try{
            var resultado = col.deleteOne(Filters.eq("_id",_id));
            if(resultado.getDeletedCount() == 0)
                throw new DaoException("libro no existe: " + _id);
            return true;
        }catch (MongoException e){
            throw new DaoException("error al eliminar un libro", e);
        }
    }

    @Override
    public Optional<Libro> encontrarPorTitulo(String titulo) throws DaoException {
        try{
            return Optional.ofNullable(col.find(Filters.eq("titulo",titulo)).first());

        }catch (MongoException e){
            throw new DaoException("error al encontrar un libro", e);
        }
    }

    @Override
    public Optional<Libro> encontrarPorISBN(String ISBN) throws DaoException {
        try{
            return Optional.ofNullable(col.find(Filters.eq("isbn",ISBN)).first());
            }catch (MongoException e){
            throw new DaoException("error al encontrar un libro", e);
        }
    }

    @Override
    public void actualizaStock(String id, int cantidadComprada) {
        col.updateOne(
                Filters.eq("_id", new ObjectId(id)),
                Updates.inc("stock", -cantidadComprada)
        );
    }
}
