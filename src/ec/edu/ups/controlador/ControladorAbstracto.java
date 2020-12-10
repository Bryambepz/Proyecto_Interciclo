/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author braya
 * @param <T>
 */
public abstract class ControladorAbstracto<T> {
    private List<T> listaObjetos;
    
    public ControladorAbstracto() {
        this.listaObjetos = new ArrayList<>();
//        listaObjetos = new ArrayList<>();
    }
    
    public List<T> cargarDatos(String ruta) throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream archivo = new FileInputStream(ruta);
        ObjectInputStream datos = new ObjectInputStream(archivo);
        return listaObjetos = (List<T>) datos.readObject();
    } 
    
    public void guardarDatos(String ruta) throws FileNotFoundException, IOException{
        FileOutputStream archivo = new FileOutputStream(ruta);
        ObjectOutputStream datos = new ObjectOutputStream(archivo);
        datos.writeObject(listaObjetos);
    }
    
    public boolean create(T objeto){
        return listaObjetos.add(objeto);
    }

    public List<T> getListaObjetos() {
        return listaObjetos;
    }

    public void setListaObjetos(List<T> listaObjetos) {
        this.listaObjetos = listaObjetos;
    }
}
