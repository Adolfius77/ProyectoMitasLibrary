package DAO.impl;

import DAO.IRensaDAO;
import Model.Resena;
import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mongodb.client.result.UpdateResult;
import config.MongoClientProvider;
import exceptions.DaoException;
import exceptions.EntityNotFoundException;
import org.bson.types.ObjectId;

import java.util.List;
import java.util.Optional;
import java.util.ArrayList;

/**
 *
 * @author Angel Beltran
 */
public class ResenaDAO implements IRensaDAO {
    
    private final MongoCollection<Resena> col;

    public ResenaDAO() {
        this.col = MongoClientProvider.INSTANCE.getcCollection("resenas", Resena.class);
    }

    @Override
    public ObjectId registrar(Resena entidad) throws DaoException {
        try {
            if (entidad.getId() == null) {
                entidad.setId(new ObjectId());
            }
            col.insertOne(entidad);
            return entidad.getId();
        } catch (MongoException e) {
            throw new DaoException("error al registrar una reseña", e);
        }
    }

    @Override
    public Optional<Resena> encontrarPorId(ObjectId _id) throws DaoException {
        try {
            return Optional.ofNullable(col.find(Filters.eq("_id", _id)).first());
        } catch (MongoException e) {
            throw new DaoException("error al encontrar la reseña", e);
        }
    }

    @Override
    public List<Resena> encontrarTodas() throws DaoException {
        try {
            return col.find().into(new ArrayList<>());
        } catch (MongoException e) {
            throw new DaoException("error al listar todas las reseñas", e);
        }
    }

    @Override
    public boolean actualizar(Resena entidad) throws DaoException {
        try {
            UpdateResult resultado = col.replaceOne(
                    Filters.eq("_id", entidad.getId()),
                    entidad
            );
            return resultado.getModifiedCount() > 0;
        } catch (MongoException e) {
            throw new DaoException("error al actualizar la reseña", e);
        }
    }

    @Override
    public boolean eliminarPorId(ObjectId _id) throws DaoException {
        try {
            var resultado = col.deleteOne(Filters.eq("_id", _id));
            if (resultado.getDeletedCount() == 0) {
                throw new EntityNotFoundException("reseña no existe: " + _id);
            }
            return true;
        } catch (MongoException e) {
            throw new DaoException("error al eliminar la reseña", e);
        }
    }

    @Override
    public List<Resena> encontrarPorUsuario(String usuarioNombre) throws DaoException {
        try {
            // Busca todas las reseñas que coincidan con el usuario
            return col.find(Filters.eq("usuarioNombre", usuarioNombre))
                      .into(new ArrayList<>());
        } catch (MongoException e) {
            throw new DaoException("error al buscar reseñas por usuario", e);
        }
    }
}
