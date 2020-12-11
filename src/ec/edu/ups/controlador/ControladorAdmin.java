/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Admin;

/**
 *
 * @author braya
 */
public class ControladorAdmin extends ControladorAbstracto<Admin> {

    private static ControladorAdmin instancia;

    private ControladorAdmin() {
        super();
    }

    public static ControladorAdmin getInstancia() {
        if (instancia == null) {
            instancia = new ControladorAdmin();
        }
        return instancia;
    }

    /**
     *
     * @param correo
     * @param cedula
     * @return
     */
    public boolean comprobarDatosAdmin(String correo, String cedula) {
            return getListaObjetos().stream().filter(c -> correo.equals(c.getCorreo()) && cedula.equals(c.getCedula()))
                    .noneMatch(c1 -> c1.getCorreo().equals(correo) && c1.getCedula().equals(cedula));
    }

    /**
     *
     * @param correo
     * @param contrasenia
     * @return
     */
    public boolean iniciarSesion(String correo, String contrasenia) {
        return getListaObjetos().stream().filter(c -> correo.equals(c.getCorreo()) && contrasenia.equals(c.getCotrasenia())).anyMatch(c1 -> correo.equals(c1.getCorreo()) && contrasenia.equals(c1.getCotrasenia()));
    }
    
//    public static Usuario registar() {
//        if (usuario == null) {
//            usuario = new Usuario();
//        }
//        return usuario;
//    }
}
