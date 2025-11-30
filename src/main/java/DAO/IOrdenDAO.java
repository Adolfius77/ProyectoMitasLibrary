package DAO;

import Model.Orden;
import exceptions.DaoException;
import org.bson.types.ObjectId;
import java.util.List;
import java.util.Optional;

/**
 * Interface para el manejo de datos de Órdenes
 * @author Angel Beltran
 */
public interface IOrdenDAO {
    
    ObjectId registrar(Orden entidad) throws DaoException;
    
    Optional<Orden> encontrarPorId(ObjectId id) throws DaoException;
    
    List<Orden> encontrarTodas() throws DaoException;
    
    boolean actualizar(Orden entidad) throws DaoException;
    
    boolean eliminarPorId(ObjectId id) throws DaoException;
    
    List<Orden> encontrarPorCliente(ObjectId clienteId) throws DaoException;
}
