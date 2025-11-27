package DAO.impl;

import DAO.IClienteDAO;
import Model.Cliente;
import Model.Direccion;
import Model.MetodoPago;
import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.UpdateResult;
import config.MongoClientProvider;
import exceptions.DaoException;
import exceptions.EntityNotFoundException;
import org.bson.types.ObjectId;

import java.util.List;
import java.util.Optional;

public class ClienteDAO implements IClienteDAO {
private final MongoCollection<Cliente>col;
    public ClienteDAO(MongoCollection<Cliente> col) {
        this.col = MongoClientProvider.INSTANCE.getcCollection("clientes", Cliente.class);
    }

    @Override
    public ObjectId registrarCliente(Cliente entidad) throws DaoException {
        try{
            if(entidad.getId() == null)entidad.setId(new ObjectId());
            col.insertOne(entidad);
            return entidad.getId();

        }catch (MongoException e){
            throw new DaoException("error al registrar un cliente", e);
        }
    }

    @Override
    public Cliente autenticar(String correo, String password)throws DaoException{
        try {
            return col.find(Filters.and(
                    Filters.eq("correo",correo),
                    Filters.eq("password",password)
            )).first();
        }catch (MongoException e){
            throw new DaoException("error al autenticar un cliente", e);
        }
    }

    @Override
    public Optional<Cliente> encontrarPorId(ObjectId _id) throws DaoException {
        try{
            return Optional.ofNullable(col.find(Filters.eq("_id",_id)).first());

        }catch (MongoException e){
            throw new DaoException("error al encontrar un cliente", e);

        }
    }

    @Override
    public List<Cliente> encontrarTodos() throws DaoException {
        try{
            return col.find().into(new java.util.ArrayList<>());
        }catch (MongoException e){
            throw new DaoException("error al encontrar todos los clientes", e);
        }
    }

    @Override
    public boolean actualizar(Cliente entidad) throws DaoException {
        try{
            UpdateResult resultado = col.replaceOne(
                    Filters.eq("_id",entidad.getId()),
                    entidad
            );
            return resultado.getModifiedCount() > 0;
        }catch (MongoException e){
            throw new DaoException("error al actualizar un cliente", e);

        }
    }

    @Override
    public boolean eliminarPorId(ObjectId _id) throws DaoException {
       try{
           var resultado = col.deleteOne(Filters.eq("_id",_id));
           if(resultado.getDeletedCount()== 0)
               throw new EntityNotFoundException("cliente no existe: " + _id);
           return true;

       }catch (MongoException e){
           throw new DaoException("error al eliminar un cliente", e);
       }
    }

    @Override
    public Optional<Cliente> encontrarPorNombre(String nombre) throws DaoException {
        try{
            return Optional.ofNullable(col.find(Filters.eq("nomnbre",nombre)).first());
        }catch (MongoException e){
            throw new DaoException("error al encontrar un cliente", e);
        }
    }

    @Override
    public void agregarDireccion(String clienteId, Direccion direccion) throws DaoException {
        try{
            col.updateOne(
                    Filters.eq("_id", new ObjectId(clienteId)),
                    Updates.push("dirrecciones",direccion)
            );
        }catch (MongoException e){
            throw new DaoException("error al agregar una direccion", e);
        }
    }

    @Override
    public void eliminarDirrecion(String clienteId, Direccion direccion) throws DaoException {
        try{
            col.updateOne(
                    Filters.eq("_id", new ObjectId(clienteId)),
                    Updates.pull("dirrecciones",direccion)
            );
        }catch (MongoException e){
            throw new DaoException("error al agregar una direccion", e);
        }
    }

    @Override
    public void agregarMetodoPago(String clienteId, MetodoPago pago) throws DaoException {
          try{
              col.updateOne(
                      Filters.eq("_id",new ObjectId(clienteId)),
                      Updates.push("metodosPago",pago)
              );
          }catch (MongoException e){
              throw new DaoException("error al agregar un metodo de pago", e);
          }
    }
}
