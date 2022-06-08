/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package SysNews.UI.Components;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.font.TextAttribute;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.util.HashMap;
import java.util.Map;
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
        Map<TextAttribute, Object> attributes = new HashMap<TextAttribute, Object>();
        attributes.put(TextAttribute.TRACKING, 0.1);
        labTitleOpt.setFont(labTitleOpt.getFont().deriveFont(attributes));
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
        labTitleOpt = new javax.swing.JLabel();
        btnClose = new SysNews.UI.Swings.RoundedPanel();
        btnMin = new SysNews.UI.Swings.RoundedPanel();

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
        setMaximumSize(new java.awt.Dimension(32767, 40));
        setMinimumSize(new java.awt.Dimension(0, 40));
        setPreferredSize(new java.awt.Dimension(488, 70));

        labTitleOpt.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        labTitleOpt.setForeground(new java.awt.Color(204, 204, 204));
        labTitleOpt.setText("News App");

        btnClose.setBackground(new java.awt.Color(255, 102, 102));
        btnClose.setMinimumSize(new java.awt.Dimension(25, 25));
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
            .addGap(0, 25, Short.MAX_VALUE)
        );
        btnCloseLayout.setVerticalGroup(
            btnCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        btnMin.setBackground(new java.awt.Color(215, 215, 215));
        btnMin.setForeground(new java.awt.Color(215, 215, 215));
        btnMin.setMinimumSize(new java.awt.Dimension(25, 25));
        btnMin.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnMinMouseMoved(evt);
            }
        });
        btnMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMinMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnMinLayout = new javax.swing.GroupLayout(btnMin);
        btnMin.setLayout(btnMinLayout);
        btnMinLayout.setHorizontalGroup(
            btnMinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        btnMinLayout.setVerticalGroup(
            btnMinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(labTitleOpt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 281, Short.MAX_VALUE)
                .addComponent(btnMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labTitleOpt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseMoved
        // TODO add your handling code here:
        btnClose.setBackground(new Color(221, 87, 87));
    }//GEN-LAST:event_btnCloseMouseMoved

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        // TODO add your handling code here:
        frame.dispose();
    }//GEN-LAST:event_btnCloseMouseClicked

    private void btnCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseExited
        // TODO add your handling code here:
        btnClose.setBackground(new Color(255, 102, 102));
    }//GEN-LAST:event_btnCloseMouseExited

    private void btnMinMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinMouseMoved
        // TODO add your handling code here:
        btnMin.setBackground(new Color(185, 185, 185));
    }//GEN-LAST:event_btnMinMouseMoved

    private void btnMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinMouseClicked
        // TODO add your handling code here:
        frame.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_btnMinMouseClicked

    private void btnMinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinMouseExited
        // TODO add your handling code here:
        btnMin.setBackground(new Color(215, 215, 215));
    }//GEN-LAST:event_btnMinMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private SysNews.UI.Swings.RoundedPanel btnClose;
    private SysNews.UI.Swings.RoundedPanel btnMin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labTitleOpt;
    // End of variables declaration//GEN-END:variables
}
