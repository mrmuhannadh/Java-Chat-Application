package com.remote.client;

import AppPackage.AnimationClass;
import com.remote.server.InterfaceServer;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileSystemView;


public class ChatView extends javax.swing.JFrame implements Runnable{
    private ChatClient client;
    private InterfaceServer server;
    private DefaultListModel<String> model = new DefaultListModel<>();
    private Vector<String> listClients;
    private String name;
    private GroupLayout groupLayout;
    String userName="";
//    JTextField t1,t2;  
    //constructeur
    public ChatView(String name,String autorization,InterfaceServer server) {
        initComponents();
        jLabel6.setText(name);
        jPanel3.setVisible(false);
        this.server = server;
        jPanel3.setEnabled(false);
        this.name = name;
        userName=name;
        //detecter le group de client: simple user ou admin pour bourser a l'admin les permission (activer,block,supprimer) clients
        if(autorization.equals("Administrator")){
            System.out.print(autorization);
            //if the user is admin set the popup menu to control users
            listConnect.setComponentPopupMenu(jPopupMenu1);
             

        }
        //to title bar
        this.setLocationRelativeTo(null);
        this.setTitle("Welcome (" + name + ")");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("chat.jpg")));
        
        

        this.addWindowListener(new java.awt.event.WindowAdapter() {    
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                if (JOptionPane.showConfirmDialog(new JFrame(), 
                    "Are you sure you want to close this chat ?", "Close chat?", 
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
                    try {
                        server.removeClient(name);
                    } catch (RemoteException ex) {
                        System.out.println("Error: " + ex.getMessage());
                    }
                    System.exit(0);
                }else{
                   
                }
            }
        });
        
        inputMsg.setForeground(Color.GRAY);
        inputMsg.setText("Enter your Message ...");
        inputMsg.addFocusListener(new FocusListener() {
        @Override
         public void focusGained(FocusEvent e) {
            if (inputMsg.getText().equals("Enter your Message ...")) {
                inputMsg.setText("");
                inputMsg.setForeground(Color.BLACK);
            }
        }
        @Override
        //input box
         public void focusLost(FocusEvent e) {
            if (inputMsg.getText().isEmpty()) {
                inputMsg.setForeground(Color.GRAY);
                inputMsg.setText("Enter your Message ...");
            }
        }
        });
        
        listClients = new Vector<>();
        listConnect.setListData(listClients);
        
        try{
            //sending message and the updating the messages area
            client = new ChatClient(name,server,inputMsg,jTextArea1);
        } catch (RemoteException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        

        Timer minuteur = new Timer();
        TimerTask tache = new TimerTask() {
            @Override
            public void run() {
                try {
                    int[] indices = listConnect.getSelectedIndices();
                    model.clear();
                    listClients = server.getListClientByName(name);
                    int i=0;
                    while(i<listClients.size()){
                        model.addElement(listClients.get(i));
                        i++;
                    }
                    listConnect.setModel(model);
                    listConnect.setSelectedIndices(indices);
                } catch (RemoteException ex) {
                    System.out.println("Error: " + ex.getMessage());
                }
            }
        };
        minuteur.schedule(tache,0,20000);
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu2 = new javax.swing.JPopupMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listConnect = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        kButton2 = new com.k33ptoo.components.KButton();
        jLabel1 = new javax.swing.JLabel();
        kButton1 = new com.k33ptoo.components.KButton();
        jLabel3 = new javax.swing.JLabel();
        inputMsg = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jMenuItem4.setText("CHANE PASSWORD");
        jMenuItem4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem4MouseClicked(evt);
            }
        });
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jPopupMenu2.add(jMenuItem4);

        jMenuItem5.setText("LOGOUT");
        jMenuItem5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem5MouseClicked(evt);
            }
        });
        jPopupMenu2.add(jMenuItem5);

        jMenuItem1.setText("Remove Users");
        jMenuItem1.setActionCommand("");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        jMenuItem2.setText("Block Users");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem2);

        jMenuItem3.setText("Reactive Users");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem3);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        listConnect.setBackground(new java.awt.Color(240, 240, 240));
        listConnect.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        listConnect.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listConnect.setToolTipText("");
        jScrollPane1.setViewportView(listConnect);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 170, 310));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setText("OTHER MEMBERS");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, 20));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/remote/client/output-onlinepngtools.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/remote/client/images/icons8_Close_20px_1.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, 20));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 270, 400));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/remote/client/images/icons8_Logout_30px.png"))); // NOI18N
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 460, 40, 50));

        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 270, 360));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/remote/client/images/icons8_male_user_50px_4.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel7MouseReleased(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        kButton2.setText("VIEW OTHERS");
        kButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(kButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 510, 140, 30));

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel1.setText("GROUP CHAT");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        kButton1.setText(">");
        kButton1.setkBackGroundColor(new java.awt.Color(0, 51, 0));
        kButton1.setkEndColor(new java.awt.Color(0, 102, 102));
        kButton1.setkHoverEndColor(new java.awt.Color(0, 102, 102));
        kButton1.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton1.setkHoverStartColor(new java.awt.Color(51, 102, 0));
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(kButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 30, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/remote/client/images/icons8-email-send-30.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, -1, -1));

        inputMsg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputMsgActionPerformed(evt);
            }
        });
        jPanel1.add(inputMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 230, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/remote/client/images/icons8-home-50 (1).png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/remote/client/images/bg4.jpg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 350, 570));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/remote/client/images/icons8_Logout_30px.png"))); // NOI18N
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel26MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 500, 40, 50));

        jLabel6.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 50, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        //admin control
        //remove a client
        try {
            server.removeClient(listConnect.getSelectedValuesList());
        } catch (RemoteException ex) {
            System.out.println("Error: " + ex.getMessage());
        } 
    }//GEN-LAST:event_jMenuItem1ActionPerformed


    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        //admin control
        //block a client
        try {
            server.blockClient(listConnect.getSelectedValuesList());
        } catch (RemoteException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed


    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        //refrech clients list
        try {
            server.reactiveClient(listConnect.getSelectedValuesList());
        } catch (RemoteException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem5MouseClicked
        if (JOptionPane.showConfirmDialog(new JFrame(), 
            "Are you sure you want to logout from chat ?", "LOGOUT ?", 
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
            try {
                server.removeClient(name);
            } catch (RemoteException ex) {
                System.out.println("Error: " + ex.getMessage());
            }
            System.exit(0);
        }else{

        }
    }//GEN-LAST:event_jMenuItem5MouseClicked

    private void jMenuItem4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem4MouseClicked
           
    }//GEN-LAST:event_jMenuItem4MouseClicked

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        System.out.println("Clicked");
       
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jLabel7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseReleased
        if(evt.isPopupTrigger()){
            jPopupMenu2.show(this,evt.getX(),evt.getY());
        }
    }//GEN-LAST:event_jLabel7MouseReleased

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        Thread thread = new Thread(this);
        thread.start();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        if(!inputMsg.getText().equals("")){
            if(!inputMsg.getText().equals("Enter you Message ...")){
                
                //sending the message that entered
                //leient from ChatClient
                client.sendMessage(listConnect.getSelectedValuesList());
                inputMsg.setText("");
            }else{
                JOptionPane.showMessageDialog(this,"Please insert something to set your message","Alert",JOptionPane.WARNING_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this,"Please insert something to send your message","Alert",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void inputMsgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputMsgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputMsgActionPerformed

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        
        
        AnimationClass ani2 = new AnimationClass();
        ani2.jLabelXRight(-30, 10, 10, 5, jLabel27);
        
        AnimationClass anii = new AnimationClass();
        anii.jLabelXLeft(10, -30, 10, 5, jLabel27);
        
            
    }//GEN-LAST:event_kButton1ActionPerformed

    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked
        if (JOptionPane.showConfirmDialog(new JFrame(),
            "Are you sure you want to close this chat ?", "Close chat?",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
        try {
            
            server.removeClient(name);

        } catch (RemoteException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        System.exit(0);
        }else{

        }
    }//GEN-LAST:event_jLabel26MouseClicked

    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
        //exit
        if (JOptionPane.showConfirmDialog(new JFrame(),
            "Are you sure you want to close this chat ?", "Close chat?",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
        try {
           
            server.removeClient(name);

        } catch (RemoteException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        System.exit(0);
        }else{

        }
    }//GEN-LAST:event_jLabel27MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        jPanel3.setVisible(false);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        jPanel3.setVisible(true);
    }//GEN-LAST:event_kButton2ActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        this.setVisible(false);
        new LoginView().setVisible(true);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseEntered

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField inputMsg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private com.k33ptoo.components.KButton kButton1;
    private com.k33ptoo.components.KButton kButton2;
    private javax.swing.JList<String> listConnect;
    // End of variables declaration//GEN-END:variables

    //la fonction de thread pour le button "actualiser"
    @Override
    public void run() {
        try {
            //System.out.println(server.getListClientByName(nom+3).size());
            model.clear();
            listClients = server.getListClientByName(name);
            int i=0;
            while(i<listClients.size()){
                model.addElement(listClients.get(i));
                i++;
            }
            listConnect.setModel(model);
        } catch (RemoteException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}