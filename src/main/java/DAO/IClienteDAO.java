package DAO;

import Model.Cliente;
import Model.Direccion;
import Model.MetodoPago;
import exceptions.DaoException;
import org.bson.types.ObjectId;

import java.util.List;
import java.util.Optional;

public interface IClienteDAO {
    ObjectId registrarCliente(Cliente entidad)throws DaoException;
    Cliente autenticar(String correo, String password)throws  DaoException;
    Optional<Cliente> encontrarPorId(ObjectId _id)throws DaoException;
    List<Cliente> encontrarTodos()throws DaoException;
    boolean actualizar(Cliente entidad)throws DaoException;
    boolean eliminarPorId(ObjectId _id)throws DaoException;
    Optional<Cliente> encontrarPorNombre(String nombre) throws DaoException;
    void agregarDireccion(String clienteId, Direccion direccion) throws DaoException;
    void eliminarDirrecion(String clienteId, Direccion direccion) throws DaoException;
    void agregarMetodoPago(String clienteId, MetodoPago pago) throws DaoException;
    Optional<Cliente> encontrarPorEmail(String email) throws Exception;
}
