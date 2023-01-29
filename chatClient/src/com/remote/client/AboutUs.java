package com.remote.client;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AboutUs extends javax.swing.JFrame {

    public AboutUs() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);

        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(997, 72, 34, 14);

        jLabel2.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ABOUT US");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(180, 40, 80, 20);

        jLabel5.setForeground(new java.awt.Color(204, 204, 255));
        jLabel5.setText("Group Members");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(120, 170, 230, 20);

        jLabel6.setForeground(new java.awt.Color(204, 204, 255));
        jLabel6.setText("We are Group no  ");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(90, 90, 230, 20);

        jLabel7.setForeground(new java.awt.Color(204, 204, 255));
        jLabel7.setText("We are Group no  ");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(90, 90, 230, 20);

        jLabel8.setForeground(new java.awt.Color(204, 204, 255));
        jLabel8.setText("Group Members");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(90, 120, 230, 20);

        jLabel9.setForeground(new java.awt.Color(204, 204, 255));
        jLabel9.setText("Group Members");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(120, 150, 230, 20);

        jLabel11.setForeground(new java.awt.Color(204, 204, 255));
        jLabel11.setText("Group Members");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(120, 190, 230, 20);

        jLabel10.setForeground(new java.awt.Color(204, 204, 255));
        jLabel10.setText("Group Members");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(120, 230, 230, 20);

        jLabel12.setForeground(new java.awt.Color(204, 204, 255));
        jLabel12.setText("Group Members");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(120, 210, 230, 20);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/remote/client/EXITLOGOO.png"))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel13);
        jLabel13.setBounds(380, 10, 30, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/remote/client/siniy-uzorchatyy-fon-temnaya.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-60, -20, 544, 400);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        if (JOptionPane.showConfirmDialog(new JFrame(),
            "Are you sure you want to close this chat ?", "Close chat?",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
            this.setVisible(false);
        
        }else{

        }
    }//GEN-LAST:event_jLabel13MouseClicked

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
            java.util.logging.Logger.getLogger(AboutUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AboutUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AboutUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AboutUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AboutUs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
