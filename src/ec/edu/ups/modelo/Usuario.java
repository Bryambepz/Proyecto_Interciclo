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

    public Usuario(String cedula, String nombre, String apellido, String telefono, String correo, String cotrasenia) {
        super(cedula, nombre, apellido, telefono, correo, cotrasenia);
        this.listaAutomoviles = new ArrayList<>();
    }
    
    public List<Automovil> getListaAutomoviles() {
        return listaAutomoviles;
    }

    public void setListaAutomoviles(List<Automovil> listaAutomoviles) {
        this.listaAutomoviles = listaAutomoviles;
    }
    
    public boolean create(Automovil auto){
        return listaAutomoviles.add(auto);
    }
    
    @Override
    public String toString() {
        return super.toString() + "\n---> Usuario ---> " + "listaAutomoviles=" + listaAutomoviles + '}';
    }
    
}
