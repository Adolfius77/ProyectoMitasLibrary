package DAO.impl;

import DAO.IOrdenDAO;
import Model.Orden;
import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mongodb.client.result.UpdateResult;
import config.MongoClientProvider;
import exceptions.DaoException;
import exceptions.EntityNotFoundException;
import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Angel Beltran
 */
public class OrdenDAO implements IOrdenDAO {

    private final MongoCollection<Orden> col;

    public OrdenDAO() {
        this.col = MongoClientProvider.INSTANCE.getcCollection("ordenes", Orden.class);
    }

    @Override
    public ObjectId registrar(Orden entidad) throws DaoException {
        try {
            
            if (entidad.getId() == null) {
                entidad.setId(new ObjectId());
            }
            col.insertOne(entidad);
            return entidad.getId();
        } catch (MongoException e) {
            throw new DaoException("error al registrar la orden", e);
        }
    }

    @Override
    public Optional<Orden> encontrarPorId(ObjectId id) throws DaoException {
        try {
            return Optional.ofNullable(col.find(Filters.eq("_id", id)).first());
        } catch (MongoException e) {
            throw new DaoException("error al encontrar la orden", e);
        }
    }

    @Override
    public List<Orden> encontrarTodas() throws DaoException {
        try {
            return col.find().into(new ArrayList<>());
        } catch (MongoException e) {
            throw new DaoException("error al listar todas las ordenes", e);
        }
    }

    @Override
    public boolean actualizar(Orden entidad) throws DaoException {
        try {
            
            UpdateResult resultado = col.replaceOne(
                    Filters.eq("_id", entidad.getId()),
                    entidad
            );
            return resultado.getModifiedCount() > 0;
        } catch (MongoException e) {
            throw new DaoException("error al actualizar la orden", e);
        }
    }

    @Override
    public boolean eliminarPorId(ObjectId id) throws DaoException {
        try {
            var resultado = col.deleteOne(Filters.eq("_id", id));
            if (resultado.getDeletedCount() == 0) {
                throw new EntityNotFoundException("orden no existe: " + id);
            }
            return true;
        } catch (MongoException e) {
            throw new DaoException("error al eliminar la orden", e);
        }
    }

    @Override
    public List<Orden> encontrarPorCliente(ObjectId clienteId) throws DaoException {
        try {
            
            return col.find(Filters.eq("cliente_Id", clienteId))
                      .into(new ArrayList<>());
        } catch (MongoException e) {
            throw new DaoException("error al buscar ordenes por cliente", e);
        }
    }
}
