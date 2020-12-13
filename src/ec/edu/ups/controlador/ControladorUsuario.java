/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Persona;
import ec.edu.ups.modelo.Usuario;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.stream.Stream;

/**
 *
 * @author braya
 */
public class ControladorUsuario extends ControladorAbstracto<Usuario> {

//    private static Usuario usuario;
    private static ControladorUsuario instancia;

    private ControladorUsuario() {
        super();
    }

    public static ControladorUsuario getInstancia() {
        if (instancia == null) {
            instancia = new ControladorUsuario();
        }
        return instancia;
    }

    /**
     *
     * @param correo
     * @param cedula
     * @param ruta
     * @return
     * @throws IOException
     * @throws FileNotFoundException
     * @throws ClassNotFoundException
     */
    public boolean comprobarDatos(String correo, String cedula){
        return getListaObjetos().stream().filter(c -> correo.equals(c.getCorreo()) && cedula.equals(c.getCedula()))
                .noneMatch(c1 -> c1.equals(correo) && c1.equals(cedula));
    }
    
    Usuario obtenerSesion;
    /**
     *
     * @param correo
     * @param contrasenia
     * @return
     */
    public boolean iniciarSesion(String correo, String contrasenia) {
        for (int i = 0; i < getListaObjetos().size(); i++) {
            var admin = getListaObjetos().get(i);
            if (correo.equals(admin.getCorreo()) && contrasenia.equals(admin.getCotrasenia())) {
                obtenerSesion = admin;
                return true;
            }
        }
        return false;
    }
    
    public Usuario obtenerSesion(){
        return obtenerSesion;
    }
//    public static Usuario registar() {
//        if (usuario == null) {
//            usuario = new Usuario();
//        }
//        return usuario;
//    }
}
