/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers.impl;

import Controllers.IOrdenController;
import DAO.IOrdenDAO;
import Model.Orden;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.bson.types.ObjectId;

/**
 *
 * @author luisb
 */
public class OrdenController implements IOrdenController {
    
    private final IOrdenDAO ordenDAO;

    public OrdenController(IOrdenDAO ordenDAO) {
        this.ordenDAO = ordenDAO; 
    }

    @Override
    public void registrarOrden(Orden orden) throws Exception {
        if (orden == null) {
            throw new Exception("La orden no puede ser nula.");
        }

        if (orden.getCliente_Id() == null) {
            throw new Exception("La orden debe tener un cliente asociado.");
        }

        if (orden.getItems() == null || orden.getItems().isEmpty()) {
            throw new Exception("La orden debe incluir al menos un item.");
        }

        if (orden.getTotalPagado() < 0) {
            throw new Exception("El total pagado no puede ser negativo.");
        }

        if (orden.getMetodoEnvio() == null || orden.getMetodoEnvio().isBlank()) {
            throw new Exception("El método de envío no puede estar vacío.");
        }

        if (orden.getEstado() == null || orden.getEstado().isBlank()) {
            throw new Exception("El estado de la orden no puede estar vacío.");
        }

        if (orden.getDireccionEnvio() == null) {
            throw new Exception("La orden debe incluir una dirección de envío.");
        }

        if (orden.getFechaCompra() == null) {
            orden.setFechaCompra(new Date()); // Asignación automática si no viene
        }

        ordenDAO.registrar(orden);
    }

    @Override
    public void actualizarOrden(Orden orden) throws Exception {
        if (orden == null || orden.getId() == null) {
            throw new Exception("La orden o su ID no pueden ser nulos.");
        }

        if (orden.getTotalPagado() < 0) {
            throw new Exception("El total pagado no puede ser negativo.");
        }

        if (orden.getItems() == null || orden.getItems().isEmpty()) {
            throw new Exception("La orden debe incluir al menos un item.");
        }

        ordenDAO.actualizar(orden);
    }

    @Override
    public void eliminarOrden(ObjectId id) throws Exception {
        if (id == null) {
            throw new Exception("El ID no puede ser nulo.");
        }

        ordenDAO.eliminarPorId(id);
    }

    @Override
    public Optional<Orden> buscarOrdenPorId(ObjectId id) throws Exception {
        if (id == null) {
            throw new Exception("El ID no puede ser nulo.");
        }
        return ordenDAO.encontrarPorId(id);
    }

    @Override
    public List<Orden> buscarOrdenPorClientId(ObjectId id) throws Exception {
        if (id == null) {
            throw new Exception("El ID no puede ser nulo.");
        }
        return ordenDAO.encontrarPorCliente(id);
    }

    @Override
    public List<Orden> listarOrdenes() throws Exception {
        return ordenDAO.encontrarTodas();
    }
}

