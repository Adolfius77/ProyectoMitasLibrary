/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author jorge
 */
public class Orden {
    private ObjectId _id;
    private ObjectId cliente_Id;
    private Date fechaCompra;
    private double totalPagado;
    private String metodoEnvio;
    private String estado;
    private Direccion direccionEnvio;
    private List<Item> items;

    public Orden() {
    }

    public Orden(ObjectId _id, ObjectId cliente_Id, Date fechaCompra, double totalPagado, String metodoEnvio, String estado, Direccion direccionEnvio, List<Item> items) {
        this._id = _id;
        this.cliente_Id = cliente_Id;
        this.fechaCompra = fechaCompra;
        this.totalPagado = totalPagado;
        this.metodoEnvio = metodoEnvio;
        this.estado = estado;
        this.direccionEnvio = direccionEnvio;
        this.items = items;
    }

    public ObjectId getId() {
        return _id;
    }

    public void setId(ObjectId _id) {
        this._id = _id;
    }

    public ObjectId getCliente_Id() {
        return cliente_Id;
    }

    public void setCliente_Id(ObjectId cliente_Id) {
        this.cliente_Id = cliente_Id;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public double getTotalPagado() {
        return totalPagado;
    }

    public void setTotalPagado(double totalPagado) {
        this.totalPagado = totalPagado;
    }

    public String getMetodoEnvio() {
        return metodoEnvio;
    }

    public void setMetodoEnvio(String metodoEnvio) {
        this.metodoEnvio = metodoEnvio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Direccion getDireccionEnvio() {
        return direccionEnvio;
    }

    public void setDireccionEnvio(Direccion direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
    
    
    
}
