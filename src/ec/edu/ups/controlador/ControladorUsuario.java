/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Usuario;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author braya
 */
public class ControladorUsuario extends ControladorAbstracto<Usuario> {

    private static Usuario usuario;
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

    public static Usuario registar() {
        if (usuario == null) {
            usuario = new Usuario();
        }
        return usuario;
    }
}
