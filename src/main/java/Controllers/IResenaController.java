/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Controllers;

import Model.Resena;
import java.util.List;
import java.util.Optional;
import org.bson.types.ObjectId;

/**
 *
 * @author luisb
 */
public interface IResenaController {
    
    void registrarResena(Resena resena) throws Exception;
    void actualizarResena(Resena resena) throws Exception;
    void eliminarResena(ObjectId id) throws Exception;
    Optional<Resena> buscarResenaPorId(ObjectId id) throws Exception;
    List<Resena> buscarPorUsuario(ObjectId id) throws Exception;
    List<Resena> listarResenasPorLibro(ObjectId libroId) throws Exception;
    List<Resena> listarResenas() throws Exception;
}
