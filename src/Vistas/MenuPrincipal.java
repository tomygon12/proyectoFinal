/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.awt.BorderLayout;

/**
 *
 * @author Leo_1
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
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

        jPanel2 = new javax.swing.JPanel();
        jLbienvenido = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSalir = new javax.swing.JButton();
        jescritorio = new javax.swing.JPanel();
        jBusuario = new javax.swing.JButton();
        jBadmin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(64, 64, 64));

        jLbienvenido.setBackground(new java.awt.Color(255, 255, 255));
        jLbienvenido.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLbienvenido.setForeground(new java.awt.Color(255, 255, 255));
        jLbienvenido.setText("Bienvenido al Sistema de Paquete Turistico:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Para continuar seleccione una opcion:");

        jSalir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jSalir.setText("Salir");
        jSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalirActionPerformed(evt);
            }
        });

        jescritorio.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jescritorioLayout = new javax.swing.GroupLayout(jescritorio);
        jescritorio.setLayout(jescritorioLayout);
        jescritorioLayout.setHorizontalGroup(
            jescritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 865, Short.MAX_VALUE)
        );
        jescritorioLayout.setVerticalGroup(
            jescritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jBusuario.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jBusuario.setText("Usuario");
        jBusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBusuarioActionPerformed(evt);
            }
        });

        jBadmin.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jBadmin.setText("Admin");
        jBadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBadminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 38, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(28, 28, 28))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLbienvenido)
                            .addComponent(jSalir)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jBadmin, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jescritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(147, 147, 147)
                    .addComponent(jBusuario)
                    .addContainerGap(1013, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jLbienvenido)
                .addGap(87, 87, 87)
                .addComponent(jLabel4)
                .addGap(177, 177, 177)
                .addComponent(jBadmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 178, Short.MAX_VALUE)
                .addComponent(jSalir)
                .addContainerGap())
            .addComponent(jescritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(354, Short.MAX_VALUE)
                    .addComponent(jBusuario)
                    .addGap(305, 305, 305)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalirActionPerformed
        // TODO add your handling code here:
        
        System.exit(0);
        
        
    }//GEN-LAST:event_jSalirActionPerformed

    private void jBusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBusuarioActionPerformed
        // TODO add your handling code here:
        
        MenuUsuario user = new MenuUsuario();
        
        user.setSize(865, 699);
        user.setLocation(0, 0);
        
        jescritorio.removeAll();
        jescritorio.repaint();
        user.setVisible(true);
        jescritorio.add(user, BorderLayout.CENTER);
        jescritorio.revalidate();
        
        
    }//GEN-LAST:event_jBusuarioActionPerformed

    private void jBadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBadminActionPerformed
        // TODO add your handling code here:
        
        Login us = new Login();
        
        us.setSize(865, 699);
        us.setLocation(0, 0);
        
        jescritorio.removeAll();
        jescritorio.repaint();
        us.setVisible(true);
        jescritorio.add(us, BorderLayout.CENTER);
        jescritorio.revalidate();
        
        
    }//GEN-LAST:event_jBadminActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBadmin;
    private javax.swing.JButton jBusuario;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLbienvenido;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jSalir;
    private javax.swing.JPanel jescritorio;
    // End of variables declaration//GEN-END:variables

    
}
