/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package SysNews.UI.Components;

import SysNews.EL.News;
import SysNews.EL.TopHeadlines;
import java.util.ArrayList;

/**
 *
 * @author alexq
 */
public class CardGroup extends javax.swing.JPanel {
    public ArrayList<News> data;
    /**
     * Creates new form CardGroup
     */
    public CardGroup() {
        initComponents();
    }
    
    public void FillContent(ArrayList<News> pdata){
        this.data = pdata;
        headCard.FillContent(data.get(0));
        card1.FillContent(data.get(1));
        card2.FillContent(data.get(2));
        card3.FillContent(data.get(3));
        card4.FillContent(data.get(4));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headCard = new SysNews.UI.Components.BigCard();
        jLabel3 = new javax.swing.JLabel();
        card1 = new SysNews.UI.Components.Card();
        card2 = new SysNews.UI.Components.Card();
        card3 = new SysNews.UI.Components.Card();
        card4 = new SysNews.UI.Components.Card();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(headCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 25, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("TOP HEADLINES");
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 750, 40));
        add(card1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, -1, -1));
        add(card2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 380, -1, -1));
        add(card3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 670, -1, -1));
        add(card4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 670, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private SysNews.UI.Components.Card card1;
    private SysNews.UI.Components.Card card2;
    private SysNews.UI.Components.Card card3;
    private SysNews.UI.Components.Card card4;
    private SysNews.UI.Components.BigCard headCard;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
