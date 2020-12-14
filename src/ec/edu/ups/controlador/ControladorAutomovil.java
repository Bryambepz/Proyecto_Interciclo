/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Automovil;

/**
 *
 * @author braya
 */
public class ControladorAutomovil extends ControladorAbstracto<Automovil>{

    public ControladorAutomovil() {
        super();
    }
    
    public Automovil actualizar(int id, Automovil auto) {
        for (int i = 0; i < getListaObjetos().size(); i++) {
            var get = getListaObjetos().get(i);
            if (id == get.getTicket().getId()) {
                return getListaObjetos().set(id, auto);
            }
        }
        return null;
    }
}
