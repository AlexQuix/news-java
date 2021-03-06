/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package SysNews.UI.Swings;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

/**
 *
 * @author alexq
 */
public class RoundedPanel extends javax.swing.JPanel {
    protected boolean highQuality = true;
    /** Double values for Horizontal and Vertical radius of corner arcs */
    public Dimension arcs = new Dimension(20, 20);
    /** Distance between shadow border and opaque panel border */
    protected int shadowGap = 0;
    /** The offset of shadow.  */
    protected int shadowOffset = 0;
    /** The transparency value of shadow. ( 0 - 255) */
    protected int shadowAlpha = 150;
    
    public RoundedPanel() {
       super();
       setOpaque(false);
       this.setBackground(new Color(20,20,20));
   }
    
   @Override
   protected void paintComponent(Graphics g) {
       super.paintComponent(g);
       int width = getWidth();
       int height = getHeight();
       Graphics2D graphics = (Graphics2D) g;

       //Sets antialiasing if HQ.
       if (highQuality) {
           graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);
       }

        graphics.setColor(this.getBackground());
        graphics.fillRoundRect(
                shadowOffset,// X position
                shadowOffset,// Y position
                width, // width
                height, // height
                arcs.width, arcs.height);// arc Dimension
   }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(20, 20, 20));
        setForeground(new java.awt.Color(184, 76, 76));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
