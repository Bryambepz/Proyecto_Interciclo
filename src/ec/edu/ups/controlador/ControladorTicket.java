/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Ticket;
import java.lang.reflect.Method;

/**
 *
 * @author braya
 */
public class ControladorTicket extends ControladorAbstracto<Ticket> {

    public ControladorTicket() {
        super();
    }

    public int generarID() {
        if (!getListaObjetos().isEmpty()) {
            return getListaObjetos().size();
        }
        return 0;
    }

}
