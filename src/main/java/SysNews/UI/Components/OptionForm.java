/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package SysNews.UI.Components;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JFrame;

/**
 *
 * @author alexq
 */
public class OptionForm extends javax.swing.JPanel {
    public JFrame frame;
    
    public OptionForm() {
        initComponents();
        setOpaque(false);
        setBackground(new Color(50,50,50));
    }

    @Override
    public void paint(Graphics graph){
        Graphics2D g2 = (Graphics2D) graph.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, 
                RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        
        Area area = new Area(new RoundRectangle2D.Double(0, 0, 
                getWidth(), getHeight(), 20, 20));
        area.add(new Area(new Rectangle2D.Double(0, 20, 
                this.getWidth(), this.getHeight())));
        g2.fill(area);
        g2.dispose();
        super.paint(graph);
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnClose = new SysNews.UI.Swings.RoundedPanel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(20, 23, 20));

        btnClose.setBackground(new java.awt.Color(255, 102, 102));
        btnClose.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnCloseMouseMoved(evt);
            }
        });
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCloseMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnCloseLayout = new javax.swing.GroupLayout(btnClose);
        btnClose.setLayout(btnCloseLayout);
        btnCloseLayout.setHorizontalGroup(
            btnCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );
        btnCloseLayout.setVerticalGroup(
            btnCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(402, Short.MAX_VALUE)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseMoved

        btnClose.setBackground(new Color(225,95,255));
    }//GEN-LAST:event_btnCloseMouseMoved

    private void btnCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseExited
        btnClose.setBackground(new Color(255,102,102));
    }//GEN-LAST:event_btnCloseMouseExited

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked

        frame.dispose();
    }//GEN-LAST:event_btnCloseMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private SysNews.UI.Swings.RoundedPanel btnClose;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
