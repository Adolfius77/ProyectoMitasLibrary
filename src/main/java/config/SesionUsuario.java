package config;

import Model.Cliente;
import Model.Item;
import Model.Libro;
import Model.Orden;
import java.util.ArrayList;

public class SesionUsuario {

    private static SesionUsuario instance;
    private Cliente clienteLogueado;
    private Orden carritoActual;

    private SesionUsuario() {
        inicializarCarrito();
    }

    private void inicializarCarrito() {
        carritoActual = new Orden();
        carritoActual.setItems(new ArrayList<>());
        carritoActual.setTotalPagado(0.0);
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

    public void agregarItem(Libro libro, int cantidad) {
        if (libro == null) {
            return;
        }

        for (Item item : carritoActual.getItems()) {
            if (item.getLibroId().equals(libro.getId())) {
                item.setCantidad(item.getCantidad() + cantidad);
                item.setSubtotal(item.getPrecioUnitario() * item.getCantidad());
                recalcularTotal();
                return;
            }
        }

        Item nuevoItem = new Item();
        nuevoItem.setLibroId(libro.getId());
        nuevoItem.setTitulo(libro.getTitulo());
        nuevoItem.setAutor(libro.getAutor());
        nuevoItem.setPrecioUnitario(libro.getPrecio());
        nuevoItem.setCantidad(cantidad);
        nuevoItem.setSubtotal(libro.getPrecio() * cantidad);
        nuevoItem.setPortadaURL(libro.getPortadaUrl());

        nuevoItem.setAnio(2024);

        carritoActual.getItems().add(nuevoItem);
        recalcularTotal();
    }

    public void limpiarCarrito() {
        inicializarCarrito();
    }

    private void recalcularTotal() {
        double total = 0;
        for (Item item : carritoActual.getItems()) {
            total += item.getSubtotal();
        }
        carritoActual.setTotalPagado(total);
    }

    public void cerrarSesion() {
        clienteLogueado = null;
        limpiarCarrito();
    }
}
