/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Controllers;

import Model.Orden;
import java.util.List;
import java.util.Optional;
import org.bson.types.ObjectId;

/**
 *
 * @author luisb
 */
public interface IOrdenController {
    
    void registrarOrden(Orden orden) throws Exception;
    void actualizarOrden(Orden orden) throws Exception;
    void eliminarOrden(ObjectId id) throws Exception;
    Optional<Orden> buscarOrdenPorId(ObjectId id) throws Exception;
    List<Orden> buscarOrdenPorClientId(ObjectId id) throws Exception;
    List<Orden> listarOrdenes() throws Exception;
}
