package DAO;

import Model.Resena;
import exceptions.DaoException;
import org.bson.types.ObjectId;
import java.util.List;
import java.util.Optional;

/**
 * Interface para el manejo de datos de Reseñas
 * @author Angel Beltran
 */
public interface IRensaDAO {
    
    ObjectId registrar(Resena entidad) throws DaoException;
    Optional<Resena> encontrarPorId(ObjectId id) throws DaoException;
    List<Resena> encontrarTodas() throws DaoException;
    boolean actualizar(Resena entidad) throws DaoException;
    boolean eliminarPorId(ObjectId id) throws DaoException;
    List<Resena> encontrarPorUsuario(String usuarioNombre) throws DaoException;
    List<Resena> listarResenasPorLibro(String libroId) throws Exception;


}
