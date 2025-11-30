/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Controllers;

import Model.Cliente;
import java.util.List;
import java.util.Optional;
import org.bson.types.ObjectId;

/**
 *
 * @author luisb
 */
public interface IClienteController {
    
    void registrarCliente(Cliente cliente) throws Exception;
    void actualizarCliente(Cliente cliente) throws Exception;
    void eliminarCliente(ObjectId id) throws Exception;
    Optional<Cliente> obtenerClientePorId(ObjectId id) throws Exception;
    Optional<Cliente> obtenerClientePorNombre(String nombre) throws Exception;
    List<Cliente> listarClientes() throws Exception;
    
}
