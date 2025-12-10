/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers.impl;

import Controllers.IClienteController;
import DAO.IClienteDAO;
import DAO.impl.ClienteDAO;
import DAO.impl.LibroDAO;
import Model.Cliente;
import Model.Libro;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.bson.types.ObjectId;

/**
 *
 * @author luisb
 */
public class ClienteController implements IClienteController {

    private IClienteDAO clienteDAO;

    public ClienteController() {
        this.clienteDAO = new ClienteDAO();
    }

    @Override
    public void registrarCliente(Cliente cliente) throws Exception {

        if (cliente == null) {
            throw new Exception("El cliente es nulo.");
        }

        if (cliente.getNombre() == null || cliente.getNombre().isBlank()) {
            throw new Exception("El nombre del cliente no puede estar vacío.");
        }

        if (cliente.getEmail() == null || cliente.getEmail().isBlank()) {
            throw new Exception("El email no puede estar vacío.");
        }

        if (!cliente.getEmail().contains("@")) {
            throw new Exception("El email no tiene un formato válido.");
        }

        if (cliente.getPassword() == null || cliente.getPassword().length() < 6) {
            throw new Exception("La contraseña debe tener al menos 6 caracteres.");
        }

        if (cliente.getTelefono() != null && !cliente.getTelefono().matches("\\d{10}")) {
            throw new Exception("El teléfono debe tener 10 dígitos.");
        }
        if(cliente.getApellidos() == null ||  cliente.getApellidos().isBlank()){
            throw new Exception("los apellidos son obligatorios");
        }

        if (cliente.getDirecciones() == null) {
            cliente.setDirecciones(new ArrayList<>());
        }

        if (cliente.getMetodosPago() == null) {
            cliente.setMetodosPago(new ArrayList<>());
        }

        if (cliente.getFechaRegistro() == null) {
            cliente.setFechaRegistro(new Date());
        }

        clienteDAO.registrarCliente(cliente);

    }

    @Override
    public void actualizarCliente(Cliente cliente) throws Exception {

        if (cliente == null) {
            throw new Exception("El cliente es nulo.");
        }

        if (cliente.getId() == null) {
            throw new Exception("El cliente debe tener un ID para ser actualizado.");
        }

        if (cliente.getNombre() == null || cliente.getNombre().isBlank()) {
            throw new Exception("El nombre no puede estar vacío.");
        }

        if (cliente.getEmail() == null || cliente.getEmail().isBlank()) {
            throw new Exception("El email no puede estar vacío.");
        }

        if (!cliente.getEmail().contains("@")) {
            throw new Exception("Formato de email inválido.");
        }

        clienteDAO.actualizar(cliente);
    }

    @Override
    public void eliminarCliente(ObjectId id) throws Exception {

        if (id == null) {
            throw new Exception("El ID no puede ser nulo.");
        }

        clienteDAO.eliminarPorId(id);

    }

    @Override
    public Optional<Cliente> obtenerClientePorId(ObjectId id) throws Exception {
        if (id == null) {
            throw new Exception("El ID no puede ser nulo.");
        }

        return clienteDAO.encontrarPorId(id);
    }

    @Override
    public Optional<Cliente> obtenerClientePorNombre(String nombre) throws Exception {
        if (nombre == null || nombre.isBlank()) {
            throw new Exception("El nombre no puede estar vacío.");
        }

        return clienteDAO.encontrarPorNombre(nombre);
    }

    @Override
    public List<Cliente> listarClientes() throws Exception {
        return clienteDAO.encontrarTodos();
    }

    @Override
    public Model.Cliente autenticar(String email, String password) throws Exception {
        if (email == null || email.isBlank() || password == null || password.isBlank()) {
            throw new Exception("El email y la contraseña son obligatorios.");
        }

        java.util.Optional<Model.Cliente> clienteOpt = clienteDAO.encontrarPorEmail(email);

        if (clienteOpt.isPresent()) {
            Model.Cliente cliente = clienteOpt.get();

            if (cliente.getPassword().equals(password)) {
                return cliente;
            } else {
                throw new Exception("Contraseña incorrecta.");
            }
        } else {
            throw new Exception("No existe una cuenta con este correo.");
        }
    }
    @Override
    public List<Libro> filtrarLibros(String busqueda, String categoria) throws Exception {
        // Si no hay categoría seleccionada, lanzamos error
        if (categoria == null || categoria.isBlank()) {
            throw new Exception("La categoría es requerida");
        }
        
        // Si la búsqueda está vacía, devolvemos TODOS los de esa categoría
        if (busqueda == null || busqueda.trim().isEmpty()) {
            return listarPorCategoria(categoria);
        }
        
        return libroDAO.buscarPorTituloYCategoria(busqueda.trim(), categoria);
    }
}
