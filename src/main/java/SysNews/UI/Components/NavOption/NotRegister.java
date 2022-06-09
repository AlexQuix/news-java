/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package SysNews.UI.Components.NavOption;

import SysNews.UI.Login;
import java.awt.Color;
import java.awt.Dimension;

/**
 *
 * @author alexq
 */
public class NotRegister extends javax.swing.JPanel {

    /**
     * Creates new form Login
     */
    public NotRegister() {
        initComponents();
        setBackground(new Color(0,0,0,0));
        roundedPanel1.arcs = new Dimension(1, 1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundedPanel1 = new SysNews.UI.Swings.RoundedPanel();
        btnLogIn = new SysNews.UI.Swings.RoundedPanel();
        jLabel1 = new javax.swing.JLabel();
        btnSignIn = new SysNews.UI.Swings.RoundedPanel();
        jLabel2 = new javax.swing.JLabel();

        javax.swing.GroupLayout roundedPanel1Layout = new javax.swing.GroupLayout(roundedPanel1);
        roundedPanel1.setLayout(roundedPanel1Layout);
        roundedPanel1Layout.setHorizontalGroup(
            roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        roundedPanel1Layout.setVerticalGroup(
            roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLogIn.setBackground(new java.awt.Color(161, 125, 237));
        btnLogIn.setForeground(new java.awt.Color(255, 255, 255));
        btnLogIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogInMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Iniciar Sesion");

        javax.swing.GroupLayout btnLogInLayout = new javax.swing.GroupLayout(btnLogIn);
        btnLogIn.setLayout(btnLogInLayout);
        btnLogInLayout.setHorizontalGroup(
            btnLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnLogInLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        btnLogInLayout.setVerticalGroup(
            btnLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnLogInLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        add(btnLogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 31));

        btnSignIn.setBackground(new java.awt.Color(244, 244, 244));
        btnSignIn.setForeground(new java.awt.Color(161, 125, 237));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(161, 125, 237));
        jLabel2.setText("Crear Cuenta");

        javax.swing.GroupLayout btnSignInLayout = new javax.swing.GroupLayout(btnSignIn);
        btnSignIn.setLayout(btnSignInLayout);
        btnSignInLayout.setHorizontalGroup(
            btnSignInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnSignInLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        btnSignInLayout.setVerticalGroup(
            btnSignInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSignInLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        add(btnSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 0, 170, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogInMouseClicked
        // TODO add your handling code here:
        Login f = new Login();
        f.setVisible(true);
    }//GEN-LAST:event_btnLogInMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private SysNews.UI.Swings.RoundedPanel btnLogIn;
    private SysNews.UI.Swings.RoundedPanel btnSignIn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private SysNews.UI.Swings.RoundedPanel roundedPanel1;
    // End of variables declaration//GEN-END:variables
}