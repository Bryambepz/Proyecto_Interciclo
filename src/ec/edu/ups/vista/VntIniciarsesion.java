/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorAdmin;
import ec.edu.ups.controlador.ControladorUsuario;
import java.awt.Graphics;
import javax.swing.JOptionPane;

/**
 *
 * @author braya
 */
public class VntIniciarsesion extends javax.swing.JInternalFrame {
    private ControladorAdmin ctrlAdmin;
    private ControladorUsuario ctrlUsuario;
    private VntPrincipal vntPrincipal;
   
    /**
     * Creates new form VntIniciarsesion
     * @param ctrlUsuario
     * @param ctrlAdmin
     * @param vntPrincipal
     */
    public VntIniciarsesion(ControladorUsuario ctrlUsuario, ControladorAdmin ctrlAdmin, VntPrincipal vntPrincipal) {
        initComponents();
        this.ctrlUsuario = ctrlUsuario;
        this.ctrlAdmin = ctrlAdmin;
        this.vntPrincipal = vntPrincipal;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        txtContrasenia = new javax.swing.JPasswordField();
        btnIniciar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setTitle("Inciar Sesion");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jLabel1.setText("Correo");

        jLabel2.setText("Contraseña");

        btnIniciar.setText("INICIAR SESION");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        btnCancelar.setText("CANCELAR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(txtContrasenia))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addComponent(btnIniciar)
                .addGap(38, 38, 38)
                .addComponent(btnCancelar)
                .addGap(81, 81, 81))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIniciar)
                    .addComponent(btnCancelar))
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        // TODO add your handling code here:
        String correo = txtCorreo.getText();
        String contrasenia = txtContrasenia.getText();
        
        System.out.println("---> " + ctrlAdmin.iniciarSesion(correo, contrasenia));
        if (ctrlAdmin.iniciarSesion(correo, contrasenia)) {
            JOptionPane.showMessageDialog(this, "Bienvenido Administrador" + "\nIniciado correctamente");
            vntPrincipal.getListarMenuItem().setVisible(true);
        }else if (ctrlUsuario.iniciarSesion(correo, contrasenia)) {
            JOptionPane.showMessageDialog(this, "Bienvenido" + "\nIniciado correctamente");
            vntPrincipal.getReservarMenuItem().setVisible(true);
            vntPrincipal.getRetirarMenuItem().setVisible(true);
        }else{
            JOptionPane.showMessageDialog(this, "Datos incorrectos");
            txtContrasenia.setText("");
            txtCorreo.setText("");
        }
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        // TODO add your handling code here:
//        System.out.println(ctrlAdmin.getListaObjetos());
//        dib();
    }//GEN-LAST:event_formInternalFrameActivated

//    public void dib(){
//        Graphics g = null;
//        super.paintComponent(g);
//        g.drawRect(50, 50, 200, 200);
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField txtContrasenia;
    private javax.swing.JTextField txtCorreo;
    // End of variables declaration//GEN-END:variables
}