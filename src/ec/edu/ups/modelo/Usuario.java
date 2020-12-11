/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author braya
 */
public class Usuario extends Persona implements Serializable{
//    private int id;
    private List<Automovil> listaAutomoviles;

    public Usuario() {
        this.listaAutomoviles = new ArrayList<>();
    }
    
    public Usuario(String cedula, String nombre, String apellido, String correo, String cotrasenia) {
        super(cedula, nombre, apellido, correo, cotrasenia);
    }

    @Override
    public String toString() {
        return super.toString() + "\n---> Usuario ---> " + "listaAutomoviles=" + listaAutomoviles + '}';
    }
    
}
