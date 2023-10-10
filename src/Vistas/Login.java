/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import AccesoDatos.Usuariodata;
import Entidades.Usuario;
import java.awt.BorderLayout;

/**
 *
 * @author Leo_1
 */
public class Login extends javax.swing.JPanel {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPescritoriouser = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextpassword = new javax.swing.JTextField();
        jTextuser = new javax.swing.JTextField();
        jBiniciar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Ingrese el usuario:");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Ingrese la contraseña:");

        jTextpassword.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jTextuser.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jBiniciar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jBiniciar.setText("Iniciar");
        jBiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBiniciarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setText("Inicio de Sesion");

        javax.swing.GroupLayout jPescritoriouserLayout = new javax.swing.GroupLayout(jPescritoriouser);
        jPescritoriouser.setLayout(jPescritoriouserLayout);
        jPescritoriouserLayout.setHorizontalGroup(
            jPescritoriouserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPescritoriouserLayout.createSequentialGroup()
                .addGroup(jPescritoriouserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPescritoriouserLayout.createSequentialGroup()
                        .addGap(339, 339, 339)
                        .addComponent(jLabel3))
                    .addGroup(jPescritoriouserLayout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addGroup(jPescritoriouserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBiniciar)
                            .addGroup(jPescritoriouserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPescritoriouserLayout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextuser, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPescritoriouserLayout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(30, 30, 30)
                                    .addComponent(jTextpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(193, Short.MAX_VALUE))
        );
        jPescritoriouserLayout.setVerticalGroup(
            jPescritoriouserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPescritoriouserLayout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jLabel3)
                .addGap(76, 76, 76)
                .addGroup(jPescritoriouserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addGroup(jPescritoriouserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(96, 96, 96)
                .addComponent(jBiniciar)
                .addContainerGap(184, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPescritoriouser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPescritoriouser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBiniciarActionPerformed
        // TODO add your handling code here:
        
        String us = jTextuser.getText();
        int password = Integer.parseInt(jTextpassword.getText());
        Usuariodata user = new Usuariodata();
        Usuario comp = new Usuario();
        
        comp.setUser(us);
        comp.setPassword(password);
        user.buscarUsuarioPorId(us, password);
        
        
        
        MenuAdmin menu = new MenuAdmin();
        
        menu.setSize(865, 699);
        menu.setLocation(0, 0);
        
        
        
        jPescritoriouser.removeAll();
        jPescritoriouser.repaint();
        menu.setVisible(true);
        jPescritoriouser.add(menu, BorderLayout.CENTER);
        jPescritoriouser.revalidate();
        menu.setResizable(false);
       
       
        
        
    }//GEN-LAST:event_jBiniciarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBiniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPescritoriouser;
    private javax.swing.JTextField jTextpassword;
    private javax.swing.JTextField jTextuser;
    // End of variables declaration//GEN-END:variables
}
