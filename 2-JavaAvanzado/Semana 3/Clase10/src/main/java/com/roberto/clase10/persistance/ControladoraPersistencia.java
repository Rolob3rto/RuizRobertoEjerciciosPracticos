
package com.roberto.clase10.persistance;

import com.roberto.clase10.model.Partido;
import com.roberto.clase10.persistance.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {
     PartidoJpaController partidoJpa = new PartidoJpaController();

    public boolean crearPartido(Partido partido) {
        try {
            partidoJpa.create(partido);
            return true; 
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public List<Partido> listadoPartidos() {
        return partidoJpa.findPartidoEntities();
    }

    public Partido buscarPartido(long id) {
        return partidoJpa.findPartido(id);
    }

    public boolean eliminarPartido(long id) {
        try {
            partidoJpa.destroy(id);
            return true;
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean modificarPartido(Partido partido) {
        try {
            partidoJpa.edit(partido);
             return true;
        } catch (Exception ex) {            
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
             return false;
        }
    }
    
    public boolean sumarVoto(Long id) {
         try {
            partidoJpa.sumarVoto(id);
            return true;
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
