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
    
    public Automovil buscar(int id){
        for (int i = 0; i < listaAutomoviles.size(); i++) {
            Automovil get = listaAutomoviles.get(i);
            if (id == get.getTicket().getId()) {
                return get;
            }
        }
        return null;
    }
    
    public Automovil actualizar(int id, Automovil nAuto){
        for (int i = 0; i < listaAutomoviles.size(); i++) {
            Automovil auto = listaAutomoviles.get(i);
            if (auto.getTicket().getId() == id) {
                return listaAutomoviles.set(i, nAuto);
            }
        }
        return null;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\n---> Usuario ---> " + "listaAutomoviles=" + listaAutomoviles + '}';
    }
    
}
