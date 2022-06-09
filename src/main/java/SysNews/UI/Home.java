/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package SysNews.UI;

import SysNews.UI.Swing.ScrollBar.ScrollBarCustom;
import SysNews.BL.NewsBL;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;


public class Home extends javax.swing.JFrame {
    public Home(SysNews.EL.News news) {
        initComponents();
        this.setLocationRelativeTo(null);
        setBackground(new Color(0,0,0,0));

    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundedPanel1 = new SysNews.UI.Swings.RoundedPanel();
        nav1 = new SysNews.UI.Components.Nav();
        opts = new SysNews.UI.Components.OptionForm();
        roundedPanel2 = new SysNews.UI.Swings.RoundedPanel();
        roundedPanel3 = new SysNews.UI.Swings.RoundedPanel();
        roundedPanel9 = new SysNews.UI.Swings.RoundedPanel();
        jLabel10 = new javax.swing.JLabel();
        roundedPanel10 = new SysNews.UI.Swings.RoundedPanel();
        jLabel11 = new javax.swing.JLabel();
        roundedPanel11 = new SysNews.UI.Swings.RoundedPanel();
        jLabel12 = new javax.swing.JLabel();
        roundedPanel12 = new SysNews.UI.Swings.RoundedPanel();
        jLabel8 = new javax.swing.JLabel();
        roundedPanel13 = new SysNews.UI.Swings.RoundedPanel();
        jLabel14 = new javax.swing.JLabel();
        roundedPanel14 = new SysNews.UI.Swings.RoundedPanel();
        jLabel13 = new javax.swing.JLabel();
        roundedPanel15 = new SysNews.UI.Swings.RoundedPanel();
        jLabel9 = new javax.swing.JLabel();
        roundedPanel4 = new SysNews.UI.Swings.RoundedPanel();
        roundedPanel5 = new SysNews.UI.Swings.RoundedPanel();
        imageRoundel1 = new SysNews.UI.Swings.ImageRoundel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        roundedPanel6 = new SysNews.UI.Swings.RoundedPanel();
        imageRoundel2 = new SysNews.UI.Swings.ImageRoundel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        roundedPanel7 = new SysNews.UI.Swings.RoundedPanel();
        imageRoundel3 = new SysNews.UI.Swings.ImageRoundel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        roundedPanel1.setBackground(new java.awt.Color(255, 255, 255));
        roundedPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        roundedPanel1.add(nav1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1110, -1));

        opts.setPreferredSize(new java.awt.Dimension(488, 50));
        roundedPanel1.add(opts, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, -1));

        roundedPanel2.setBackground(new java.awt.Color(255, 255, 255));
        roundedPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundedPanel3.setBackground(new java.awt.Color(255, 255, 255));
        roundedPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundedPanel9.setBackground(new java.awt.Color(255, 255, 255));
        roundedPanel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                roundedPanel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                roundedPanel9MouseExited(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(161, 125, 237));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Categorías");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout roundedPanel9Layout = new javax.swing.GroupLayout(roundedPanel9);
        roundedPanel9.setLayout(roundedPanel9Layout);
        roundedPanel9Layout.setHorizontalGroup(
            roundedPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel9Layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        roundedPanel9Layout.setVerticalGroup(
            roundedPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel9Layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        roundedPanel3.add(roundedPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 70, 170, 40));

        roundedPanel10.setBackground(new java.awt.Color(255, 255, 255));
        roundedPanel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                roundedPanel10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                roundedPanel10MouseExited(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(161, 125, 237));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Me Gusta");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout roundedPanel10Layout = new javax.swing.GroupLayout(roundedPanel10);
        roundedPanel10.setLayout(roundedPanel10Layout);
        roundedPanel10Layout.setHorizontalGroup(
            roundedPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel10Layout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        roundedPanel10Layout.setVerticalGroup(
            roundedPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel10Layout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        roundedPanel3.add(roundedPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 112, 170, 40));

        roundedPanel11.setBackground(new java.awt.Color(255, 255, 255));
        roundedPanel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                roundedPanel11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                roundedPanel11MouseExited(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(161, 125, 237));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Leer Después");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout roundedPanel11Layout = new javax.swing.GroupLayout(roundedPanel11);
        roundedPanel11.setLayout(roundedPanel11Layout);
        roundedPanel11Layout.setHorizontalGroup(
            roundedPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel11Layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        roundedPanel11Layout.setVerticalGroup(
            roundedPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel11Layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        roundedPanel3.add(roundedPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 154, 170, 40));

        roundedPanel12.setBackground(new java.awt.Color(255, 255, 255));
        roundedPanel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                roundedPanel12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                roundedPanel12MouseExited(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(161, 125, 237));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Sugerencias");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout roundedPanel12Layout = new javax.swing.GroupLayout(roundedPanel12);
        roundedPanel12.setLayout(roundedPanel12Layout);
        roundedPanel12Layout.setHorizontalGroup(
            roundedPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedPanel12Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        roundedPanel12Layout.setVerticalGroup(
            roundedPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedPanel12Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        roundedPanel3.add(roundedPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 492, 170, 40));

        roundedPanel13.setBackground(new java.awt.Color(161, 125, 237));
        roundedPanel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                roundedPanel13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                roundedPanel13MouseExited(evt);
            }
        });

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Ayuda");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel14MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout roundedPanel13Layout = new javax.swing.GroupLayout(roundedPanel13);
        roundedPanel13.setLayout(roundedPanel13Layout);
        roundedPanel13Layout.setHorizontalGroup(
            roundedPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedPanel13Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        roundedPanel13Layout.setVerticalGroup(
            roundedPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedPanel13Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        roundedPanel3.add(roundedPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 534, 170, 40));

        roundedPanel14.setBackground(new java.awt.Color(255, 255, 255));
        roundedPanel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                roundedPanel14MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                roundedPanel14MouseExited(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(161, 125, 237));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Ajustes");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout roundedPanel14Layout = new javax.swing.GroupLayout(roundedPanel14);
        roundedPanel14.setLayout(roundedPanel14Layout);
        roundedPanel14Layout.setHorizontalGroup(
            roundedPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel14Layout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        roundedPanel14Layout.setVerticalGroup(
            roundedPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel14Layout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        roundedPanel3.add(roundedPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 450, 170, 40));

        roundedPanel15.setBackground(new java.awt.Color(161, 125, 237));
        roundedPanel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                roundedPanel15MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                roundedPanel15MouseExited(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(161, 125, 237));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Inicio");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout roundedPanel15Layout = new javax.swing.GroupLayout(roundedPanel15);
        roundedPanel15.setLayout(roundedPanel15Layout);
        roundedPanel15Layout.setHorizontalGroup(
            roundedPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel15Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        roundedPanel15Layout.setVerticalGroup(
            roundedPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel15Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        roundedPanel3.add(roundedPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 28, 170, 40));

        roundedPanel2.add(roundedPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 650));

        roundedPanel4.setBackground(new java.awt.Color(255, 255, 255));
        roundedPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundedPanel5.setBackground(new java.awt.Color(204, 204, 204));
        roundedPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout imageRoundel1Layout = new javax.swing.GroupLayout(imageRoundel1);
        imageRoundel1.setLayout(imageRoundel1Layout);
        imageRoundel1Layout.setHorizontalGroup(
            imageRoundel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 864, Short.MAX_VALUE)
        );
        imageRoundel1Layout.setVerticalGroup(
            imageRoundel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        roundedPanel5.add(imageRoundel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 200));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("TITULO");
        jLabel1.setOpaque(true);
        roundedPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 520, 40));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("FECHA");
        jLabel2.setOpaque(true);
        roundedPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 130, 20));

        roundedPanel4.add(roundedPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 620, 280));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("TOP HEADLINES");
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        roundedPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 750, 40));

        roundedPanel6.setBackground(new java.awt.Color(204, 204, 204));
        roundedPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout imageRoundel2Layout = new javax.swing.GroupLayout(imageRoundel2);
        imageRoundel2.setLayout(imageRoundel2Layout);
        imageRoundel2Layout.setHorizontalGroup(
            imageRoundel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );
        imageRoundel2Layout.setVerticalGroup(
            imageRoundel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );

        roundedPanel6.add(imageRoundel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 160));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("FECHA");
        jLabel5.setOpaque(true);
        roundedPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 120, 20));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("TITULO");
        jLabel4.setOpaque(true);
        roundedPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 300, 25));

        roundedPanel4.add(roundedPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, 320, 230));

        roundedPanel7.setBackground(new java.awt.Color(204, 204, 204));
        roundedPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout imageRoundel3Layout = new javax.swing.GroupLayout(imageRoundel3);
        imageRoundel3.setLayout(imageRoundel3Layout);
        imageRoundel3Layout.setHorizontalGroup(
            imageRoundel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );
        imageRoundel3Layout.setVerticalGroup(
            imageRoundel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );

        roundedPanel7.add(imageRoundel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 160));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("FECHA");
        jLabel6.setOpaque(true);
        roundedPanel7.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 120, 20));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("TITULO");
        jLabel7.setOpaque(true);
        roundedPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 300, 25));

        roundedPanel4.add(roundedPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 320, 230));

        roundedPanel2.add(roundedPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 930, 650));

        roundedPanel1.add(roundedPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 103, 1110, 650));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundedPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundedPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void roundedPanel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundedPanel9MouseEntered
        roundedPanel9.setBackground(new Color(161,125,237));
        jLabel10.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_roundedPanel9MouseEntered

    private void roundedPanel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundedPanel9MouseExited
        jLabel10.setForeground(new Color(161,125,237));
        roundedPanel9.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_roundedPanel9MouseExited

    private void roundedPanel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundedPanel10MouseEntered
        roundedPanel10.setBackground(new Color(161,125,237));
        jLabel11.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_roundedPanel10MouseEntered

    private void roundedPanel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundedPanel10MouseExited
        jLabel11.setForeground(new Color(161,125,237));
        roundedPanel10.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_roundedPanel10MouseExited

    private void roundedPanel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundedPanel11MouseEntered
        roundedPanel11.setBackground(new Color(161,125,237));
        jLabel12.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_roundedPanel11MouseEntered

    private void roundedPanel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundedPanel11MouseExited
        jLabel12.setForeground(new Color(161,125,237));
        roundedPanel11.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_roundedPanel11MouseExited

    private void roundedPanel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundedPanel12MouseEntered
        roundedPanel12.setBackground(new Color(161,125,237));
        jLabel8.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_roundedPanel12MouseEntered

    private void roundedPanel12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundedPanel12MouseExited
        jLabel8.setForeground(new Color(161,125,237));
        roundedPanel12.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_roundedPanel12MouseExited

    private void roundedPanel14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundedPanel14MouseEntered
        roundedPanel14.setBackground(new Color(161,125,237));
        jLabel13.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_roundedPanel14MouseEntered

    private void roundedPanel14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundedPanel14MouseExited
        jLabel13.setForeground(new Color(161,125,237));
        roundedPanel14.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_roundedPanel14MouseExited

    private void jLabel14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel14MouseEntered

    private void roundedPanel13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundedPanel13MouseExited
        roundedPanel13.setBackground(new Color(161,125,237));
        jLabel14.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_roundedPanel13MouseExited

    private void roundedPanel13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundedPanel13MouseEntered
        jLabel14.setForeground(new Color(161,125,237));
        roundedPanel13.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_roundedPanel13MouseEntered

    private void roundedPanel15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundedPanel15MouseEntered
        roundedPanel15.setBackground(new Color(255, 255, 255));
        jLabel9.setForeground(new Color(161,125,237));
    }//GEN-LAST:event_roundedPanel15MouseEntered

    private void roundedPanel15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundedPanel15MouseExited
        jLabel9.setForeground(new Color(255, 255, 255));
        roundedPanel15.setBackground(new Color(161,125,237));
    }//GEN-LAST:event_roundedPanel15MouseExited
                                            

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NewsBL bl = new NewsBL();
                SysNews.EL.News news = bl.FindNewsByTitle();
                Home frame = new Home(news);
                frame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private SysNews.UI.Swings.ImageRoundel imageRoundel1;
    private SysNews.UI.Swings.ImageRoundel imageRoundel2;
    private SysNews.UI.Swings.ImageRoundel imageRoundel3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private SysNews.UI.Components.Nav nav1;
    private SysNews.UI.Components.OptionForm opts;
    private SysNews.UI.Swings.RoundedPanel roundedPanel1;
    private SysNews.UI.Swings.RoundedPanel roundedPanel10;
    private SysNews.UI.Swings.RoundedPanel roundedPanel11;
    private SysNews.UI.Swings.RoundedPanel roundedPanel12;
    private SysNews.UI.Swings.RoundedPanel roundedPanel13;
    private SysNews.UI.Swings.RoundedPanel roundedPanel14;
    private SysNews.UI.Swings.RoundedPanel roundedPanel15;
    private SysNews.UI.Swings.RoundedPanel roundedPanel2;
    private SysNews.UI.Swings.RoundedPanel roundedPanel3;
    private SysNews.UI.Swings.RoundedPanel roundedPanel4;
    private SysNews.UI.Swings.RoundedPanel roundedPanel5;
    private SysNews.UI.Swings.RoundedPanel roundedPanel6;
    private SysNews.UI.Swings.RoundedPanel roundedPanel7;
    private SysNews.UI.Swings.RoundedPanel roundedPanel9;
    // End of variables declaration//GEN-END:variables
}
