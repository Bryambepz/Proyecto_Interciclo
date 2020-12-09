/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author braya
 * @param <T>
 */
public class ControladorAbstracto<T> {
    private List<T> listaObjetos = new ArrayList<>();

    public ControladorAbstracto() {}
    
    public boolean create(T objeto){
        return listaObjetos.add(objeto);
    }
}
