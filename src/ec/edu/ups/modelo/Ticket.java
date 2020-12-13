/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 *
 * @author braya
 */
public class Ticket extends Persona implements Serializable{
    private int id;
    private int lugar;
    private LocalDateTime fechaIngreso;
    private LocalDateTime fechaSalida;
    private String tipoContrato;
//    private Automovil ticketAuto;

    public Ticket() {
    }

    public Ticket(int id, int lugar, LocalDateTime fechaIngreso, String tipoContrato, String cedula, String nombre, String apellido, String telefono) {
        super(cedula, nombre, apellido, telefono);
        this.id = id;
        this.lugar = lugar;
        this.fechaIngreso = fechaIngreso;
        this.tipoContrato = tipoContrato;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLugar() {
        return lugar;
    }

    public void setLugar(int Lugar) {
        this.lugar = Lugar;
    }
    
    public LocalDateTime getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDateTime fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public LocalDateTime getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDateTime fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

//    public Automovil getTicketAuto() {
//        return ticketAuto;
//    }
//
//    public void setTicketAuto(Automovil ticketAuto) {
//        this.ticketAuto = ticketAuto;
//    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.id;
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
        final Ticket other = (Ticket) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Ticket{" + "id=" + id + ",lugar="+ lugar +", fechaIngreso=" + fechaIngreso + ", fechaSalida=" + fechaSalida + ", tipoContrato=" + tipoContrato + '}';
    }
        
}
