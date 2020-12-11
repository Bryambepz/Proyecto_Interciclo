/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.io.Serializable;

/**
 *
 * @author braya
 */
public class Admin extends Usuario implements Serializable{
    private int lugares;

    public Admin() {
    }

    public Admin(int lugares, String cedula, String nombre, String apellido, String correo, String cotrasenia) {
        super(cedula, nombre, apellido, correo, cotrasenia);
        this.lugares = lugares;
    }
    
    public int getLugares() {
        return lugares;
    }

    public void setLugares(int lugares) {
        this.lugares = lugares;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + this.lugares;
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
        return this.lugares == other.lugares;
    }

    @Override
    public String toString() {
        return super.toString() + "\n---> Admin ---> " + "lugares=" + lugares + '}';
    }
    
}
