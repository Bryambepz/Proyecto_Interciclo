/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author braya
 */
public class Admin extends Usuario implements Serializable{
    private int lugaresDisponibles;
    private int lugaresOcupados;
    private List<Usuario> listaUsuarios;
            
    public Admin() {
        this.listaUsuarios = new ArrayList<>();
        this.lugaresDisponibles = 40;
        this.lugaresOcupados = 0;
    }

    public Admin(int lugaresDisponibles, int lugaresOcupados, String cedula, String nombre, String apellido, String telefono, String correo, String cotrasenia) {
        super(cedula, nombre, apellido, telefono, correo, cotrasenia);
        this.listaUsuarios = new ArrayList<>();
        this.lugaresDisponibles = 40;
        this.lugaresOcupados = 0;
    }

    public int getLugares() {
        return lugaresDisponibles;
    }

    public void setLugares(int lugares) {
        this.lugaresDisponibles = lugares;
    }

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }
    
    public boolean create(Usuario usuario){
        return listaUsuarios.add(usuario);
    }
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + this.lugaresDisponibles;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Admin other = (Admin) obj;
        return this.lugaresDisponibles == other.lugaresDisponibles;
    }

    @Override
    public String toString() {
        return super.toString() + "\n---> Admin ---> " + "lugares=" + lugaresDisponibles + '}';
    }
    
}
