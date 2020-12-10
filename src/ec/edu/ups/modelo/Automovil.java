/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

/**
 *
 * @author braya
 */
public class Automovil {
    private int id;
    private String placa;
    private String modelo;
    private String color;

    public Automovil() {}

    public Automovil(int id, String placa, String modelo, String color) {
        this.id = id;
        this.placa = placa;
        this.modelo = modelo;
        this.color = color;
    }
    
}
