/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import Model.Cliente;
import Model.Orden;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class SesionUsuario {

    private static SesionUsuario instance;
    private Cliente clienteLogueado;
    private Orden carritoActual;

    public SesionUsuario() {
        carritoActual = new Orden();
        carritoActual.setItems(new ArrayList<>());
    }

    public static SesionUsuario get() {
        if (instance == null) {
            instance = new SesionUsuario();
        }
        return instance;
    }

    public void setCliente(Cliente cliente) {
        this.clienteLogueado = cliente;
    }

    public Cliente getCliente() {
        return clienteLogueado;
    }

    public Orden getCarrito() {
        return carritoActual;
    }

    public void cerrarSesion() {
        clienteLogueado = null;
        carritoActual = new Orden(); // Reiniciar carrito
        carritoActual.setItems(new ArrayList<>());
    }

}
