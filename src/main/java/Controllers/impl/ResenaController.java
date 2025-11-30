/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers.impl;

import Controllers.IResenaController;
import DAO.IRensaDAO;
import Model.Resena;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.bson.types.ObjectId;

/**
 *
 * @author luisb
 */
public class ResenaController implements IResenaController {
    
    private final IRensaDAO resenaDAO;

    public ResenaController(IRensaDAO resenaDAO) {
        this.resenaDAO = resenaDAO;
    }

    @Override
    public void registrarResena(Resena resena) throws Exception {
        if (resena == null) {
            throw new Exception("La reseña no puede ser nula.");
        }

        if (resena.getUsuarioNombre() == null || resena.getUsuarioNombre().isBlank()) {
            throw new Exception("El nombre del usuario no puede estar vacío.");
        }

        if (resena.getComentario() == null || resena.getComentario().isBlank()) {
            throw new Exception("El comentario no puede estar vacío.");
        }

        if (resena.getCalificacion() < 1 || resena.getCalificacion() > 5) {
            throw new Exception("La calificación debe ser entre 1 y 5.");
        }

        if (resena.getFecha() == null) {
            resena.setFecha(new Date());
        }

        resenaDAO.registrar(resena);
    }

    @Override
    public void actualizarResena(Resena resena) throws Exception {
        if (resena == null || resena.getId() == null) {
            throw new Exception("La reseña o su ID no pueden ser nulos.");
        }

        if (resena.getUsuarioNombre() == null || resena.getUsuarioNombre().isBlank()) {
            throw new Exception("El nombre del usuario no puede estar vacío.");
        }

        if (resena.getComentario() == null || resena.getComentario().isBlank()) {
            throw new Exception("El comentario no puede estar vacío.");
        }

        if (resena.getCalificacion() < 1 || resena.getCalificacion() > 5) {
            throw new Exception("La calificación debe ser entre 1 y 5.");
        }

        resenaDAO.actualizar(resena);
    }

    

    @Override
    public Optional<Resena> buscarResenaPorId(ObjectId id) throws Exception {
        if (id == null) {
            throw new Exception("El ID no puede estar vacío.");
        }

        return resenaDAO.encontrarPorId(id);
    }
    

   
    @Override
    public List<Resena> listarResenas() throws Exception {
        return resenaDAO.encontrarTodas();
    }

    @Override
    public void eliminarResena(ObjectId id) throws Exception {
        if (id == null) {
            throw new Exception("El ID no puede estar vacío.");
        }

        resenaDAO.eliminarPorId(id);
    }

    @Override
    public List<Resena> listarResenasPorLibro(ObjectId libroId) throws Exception {

        if (libroId == null) {
            throw new Exception("El ID del libro no puede estar vacío.");
        }
        //duda en metodo dao encontrarUsuario, no debería de chambear con id ObjectId y no con idString
        return resenaDAO.listarResenasPorLibro(libroId.toString());
    }

    
    //duda en metodo dao encontrarUsuario, no debería de chambear con id ObjectId y no con idString
    @Override
    public List<Resena> buscarPorUsuario(ObjectId id) throws Exception {
        if (id == null) {
            throw new Exception("El ID del usuario no puede ser nulo.");
        }

        return resenaDAO.encontrarPorUsuario(id.toString());
    }

    
    
}
