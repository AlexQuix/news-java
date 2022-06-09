/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package SysNews.UI;

import SysNews.UI.Swing.ScrollBar.ScrollBarCustom;
import SysNews.BL.NewsBL;
import SysNews.EL.TopHeadlines;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;


public class Home extends javax.swing.JFrame {
    private TopHeadlines data;
    public Home(SysNews.EL.TopHeadlines pdata) {
        initComponents();
        this.setLocationRelativeTo(null);
        setBackground(new Color(0,0,0,0));
        opts.frame = this;
        cardGroup1.FillContent(pdata.articles);
    }
    
    private void FillContent(){
        
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundedPanel1 = new SysNews.UI.Swings.RoundedPanel();
        nav1 = new SysNews.UI.Components.Nav();
        opts = new SysNews.UI.Components.OptionForm();
        roundedPanel2 = new SysNews.UI.Swings.RoundedPanel();
        menu1 = new SysNews.UI.Components.Menu();
        jScrollPane1 = new javax.swing.JScrollPane();
        cardGroup1 = new SysNews.UI.Components.CardGroup();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        roundedPanel1.setBackground(new java.awt.Color(255, 255, 255));
        roundedPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        roundedPanel1.add(nav1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1110, -1));

        opts.setPreferredSize(new java.awt.Dimension(488, 50));
        roundedPanel1.add(opts, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, -1));

        roundedPanel2.setBackground(new java.awt.Color(243, 243, 243));
        roundedPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        roundedPanel2.add(menu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, 640));

        jScrollPane1.setViewportView(cardGroup1);

        roundedPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 890, 630));

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
                                            

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NewsBL bl = new NewsBL();
                SysNews.EL.TopHeadlines news = bl.FindTopHead();
                Home frame = new Home(news);
                frame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private SysNews.UI.Components.CardGroup cardGroup1;
    private javax.swing.JScrollPane jScrollPane1;
    private SysNews.UI.Components.Menu menu1;
    private SysNews.UI.Components.Nav nav1;
    private SysNews.UI.Components.OptionForm opts;
    private SysNews.UI.Swings.RoundedPanel roundedPanel1;
    private SysNews.UI.Swings.RoundedPanel roundedPanel2;
    // End of variables declaration//GEN-END:variables
}
