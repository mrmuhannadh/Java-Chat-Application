package com.remote.client;

import com.remote.server.InterfaceServer;
import connection.conn;
import java.awt.Color;
import java.awt.Toolkit;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.stage.FileChooser;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojo.Chatgroups;
import pojo.Users;


public class LoginView extends javax.swing.JFrame {
    private InterfaceServer server;
    String newUser;
    String type="";
    String gpName="";
    int hostid;
    String userN;
    public LoginView() {
        
        initComponents();
        panelLogin.setVisible(true);
        panelSignup.setVisible(false);
        kButton3.setVisible(true);
        kButton6.setVisible(false);
        userDashPanel.setVisible(false);
        panelChangePW.setVisible(false);
        subpanel.setVisible(false);
        
        //assign color
        Color myGreen = new Color(1,168,3);
        //set border
        getRootPane().setBorder(BorderFactory.createMatteBorder(1, 1, 2, 2, Color.black));
        
        this.setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("log.png")));
        
        
       
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        subpanel = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        kButton10 = new com.k33ptoo.components.KButton();
        jLabel34 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        chatName = new javax.swing.JComboBox<>();
        hostID = new javax.swing.JSpinner();
        jLabel30 = new javax.swing.JLabel();
        userDashPanel = new javax.swing.JPanel();
        panelChangePW = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        lableuser = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jPasswordField3 = new javax.swing.JPasswordField();
        jPasswordField4 = new javax.swing.JPasswordField();
        kButton9 = new com.k33ptoo.components.KButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        panelUserData = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        kButton8 = new com.k33ptoo.components.KButton();
        jLabel15 = new javax.swing.JLabel();
        kButton7 = new com.k33ptoo.components.KButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        userType = new javax.swing.JLabel();
        userName = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        panelSignup = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        pwb2 = new javax.swing.JPasswordField();
        pwb1 = new javax.swing.JPasswordField();
        kButton4 = new com.k33ptoo.components.KButton();
        kButton5 = new com.k33ptoo.components.KButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        panelLogin = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        kButton2 = new com.k33ptoo.components.KButton();
        kButton1 = new com.k33ptoo.components.KButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        kButton6 = new com.k33ptoo.components.KButton();
        kButton3 = new com.k33ptoo.components.KButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Log in");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        subpanel.setBackground(new java.awt.Color(255, 255, 255));
        subpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/remote/client/images/icons8_Close_20px_1.png"))); // NOI18N
        jLabel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel31MouseClicked(evt);
            }
        });
        subpanel.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 20, 30));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/remote/client/images/icons8_rewind_24px_1.png"))); // NOI18N
        jLabel32.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel32FocusGained(evt);
            }
        });
        jLabel32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel32MouseClicked(evt);
            }
        });
        subpanel.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 60, -1));

        jLabel33.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel33.setText("CHOICE GROUP");
        subpanel.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

        kButton10.setText("SUBSCRIBE");
        kButton10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        kButton10.setkEndColor(new java.awt.Color(204, 0, 0));
        kButton10.setkHoverEndColor(new java.awt.Color(102, 102, 102));
        kButton10.setkHoverStartColor(new java.awt.Color(204, 0, 0));
        kButton10.setkStartColor(new java.awt.Color(51, 0, 0));
        kButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton10ActionPerformed(evt);
            }
        });
        subpanel.add(kButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, 130, 30));

        jLabel34.setText("Choice The Group And Subscribe");
        subpanel.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, 20));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setToolTipText("");
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        subpanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 300, 90));

        jLabel35.setText("CHAT NAME");
        subpanel.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        jLabel36.setText("HOST ID");
        subpanel.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        subpanel.add(chatName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 170, -1));
        subpanel.add(hostID, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 170, -1));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/remote/client/images/bg4.jpg"))); // NOI18N
        jLabel30.setPreferredSize(new java.awt.Dimension(370, 583));
        subpanel.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 550));

        getContentPane().add(subpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 560));

        userDashPanel.setBackground(new java.awt.Color(255, 255, 255));
        userDashPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelChangePW.setPreferredSize(new java.awt.Dimension(380, 633));
        panelChangePW.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Segoe UI Historic", 0, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 102, 51));
        jLabel19.setText("CHANGE PASSWORD");
        panelChangePW.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/remote/client/images/icons8_male_user_50px_4.png"))); // NOI18N
        panelChangePW.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 50, 50));

        lableuser.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        panelChangePW.add(lableuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 50, 20));

        jLabel21.setFont(new java.awt.Font("Segoe UI Historic", 0, 13)); // NOI18N
        jLabel21.setText("Re-Enter New Password");
        panelChangePW.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI Historic", 0, 13)); // NOI18N
        jLabel22.setText("Enter Current Password");
        panelChangePW.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI Historic", 0, 13)); // NOI18N
        jLabel23.setText("Enter New Password");
        panelChangePW.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        jPasswordField2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPasswordField2.setText("password");
        jPasswordField2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 51, 51)));
        jPasswordField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField2FocusLost(evt);
            }
        });
        jPasswordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField2ActionPerformed(evt);
            }
        });
        panelChangePW.add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 270, 40));

        jPasswordField3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPasswordField3.setText("password");
        jPasswordField3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 51, 51)));
        jPasswordField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField3FocusLost(evt);
            }
        });
        jPasswordField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField3ActionPerformed(evt);
            }
        });
        panelChangePW.add(jPasswordField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 270, 40));

        jPasswordField4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPasswordField4.setText("password");
        jPasswordField4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 51, 51)));
        jPasswordField4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField4FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField4FocusLost(evt);
            }
        });
        jPasswordField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField4ActionPerformed(evt);
            }
        });
        panelChangePW.add(jPasswordField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 270, 40));

        kButton9.setText("Change Password");
        kButton9.setkBorderRadius(30);
        kButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton9ActionPerformed(evt);
            }
        });
        panelChangePW.add(kButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, 160, 40));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/remote/client/images/icons8_rewind_24px_1.png"))); // NOI18N
        jLabel24.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel24FocusGained(evt);
            }
        });
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });
        panelChangePW.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 60, -1));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/remote/client/images/icons8_Close_20px_1.png"))); // NOI18N
        jLabel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel29MouseClicked(evt);
            }
        });
        panelChangePW.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 20, 20));

        jLabel39.setForeground(new java.awt.Color(255, 0, 0));
        panelChangePW.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 480, 150, 20));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/remote/client/images/bgUser.png"))); // NOI18N
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelChangePW.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 570));

        userDashPanel.add(panelChangePW, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 570));

        panelUserData.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Segoe UI Historic", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 51));
        jLabel11.setText("WELCOME TO CHAT");
        panelUserData.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/remote/client/images/icons8_male_user_100px_1.png"))); // NOI18N
        panelUserData.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, 100));

        kButton8.setText("UPDATE");
        kButton8.setkBorderRadius(30);
        kButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton8ActionPerformed(evt);
            }
        });
        panelUserData.add(kButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 70, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 102, 51));
        jLabel15.setText("CHANGE PASSWORD");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        panelUserData.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, -1, -1));

        kButton7.setForeground(new java.awt.Color(0, 0, 0));
        kButton7.setText("VIEW CHAT GROUPS");
        kButton7.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        kButton7.setkBorderRadius(30);
        kButton7.setkEndColor(new java.awt.Color(1, 161, 3));
        kButton7.setkStartColor(new java.awt.Color(161, 227, 67));
        kButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kButton7MouseClicked(evt);
            }
        });
        kButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton7ActionPerformed(evt);
            }
        });
        panelUserData.add(kButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel16.setText("Type");
        panelUserData.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel17.setText("User Name");
        panelUserData.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/remote/client/images/icons8_Close_20px_1.png"))); // NOI18N
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
        });
        panelUserData.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 20, 20));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/remote/client/images/icons8_Logout_30px.png"))); // NOI18N
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel26MouseClicked(evt);
            }
        });
        panelUserData.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 40, 50));

        userType.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        panelUserData.add(userType, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 80, 20));

        userName.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        panelUserData.add(userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 90, 30));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/remote/client/images/bgUser.png"))); // NOI18N
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelUserData.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 570));

        userDashPanel.add(panelUserData, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 560));

        getContentPane().add(userDashPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 370, 560));

        panelSignup.setBackground(new java.awt.Color(255, 255, 255));
        panelSignup.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 0));
        jLabel6.setText("SIGNUP");
        panelSignup.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 51));
        jLabel8.setText("RE-ENTER PASSWORD");
        panelSignup.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 51));
        jLabel9.setText("USER NAME");
        panelSignup.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 51));
        jLabel10.setText("NIC NAME");
        panelSignup.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panelSignup.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 40, -1));

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(153, 153, 153));
        jTextField2.setText("nickname");
        jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 102, 51)));
        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField2FocusLost(evt);
            }
        });
        panelSignup.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 260, 30));

        pwb2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pwb2.setForeground(new java.awt.Color(153, 153, 153));
        pwb2.setText("password");
        pwb2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 102, 51)));
        pwb2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pwb2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pwb2FocusLost(evt);
            }
        });
        pwb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwb2ActionPerformed(evt);
            }
        });
        panelSignup.add(pwb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 260, 20));

        pwb1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pwb1.setForeground(new java.awt.Color(153, 153, 153));
        pwb1.setText("password");
        pwb1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 102, 51)));
        pwb1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pwb1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pwb1FocusLost(evt);
            }
        });
        pwb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwb1ActionPerformed(evt);
            }
        });
        panelSignup.add(pwb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 260, 20));

        kButton4.setForeground(new java.awt.Color(255, 0, 0));
        kButton4.setText("CLEAR");
        kButton4.setkBackGroundColor(new java.awt.Color(0, 102, 51));
        kButton4.setkBorderRadius(30);
        kButton4.setkFillButton(false);
        kButton4.setkForeGround(new java.awt.Color(0, 0, 0));
        kButton4.setkHoverEndColor(new java.awt.Color(0, 51, 51));
        kButton4.setkHoverForeGround(new java.awt.Color(204, 0, 0));
        kButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton4ActionPerformed(evt);
            }
        });
        panelSignup.add(kButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 110, 30));

        kButton5.setText("SIGNUP");
        kButton5.setkBorderRadius(30);
        kButton5.setkFillButton(false);
        kButton5.setkForeGround(new java.awt.Color(0, 51, 51));
        kButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton5ActionPerformed(evt);
            }
        });
        panelSignup.add(kButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 110, 30));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/remote/client/images/icons8_Close_20px_1.png"))); // NOI18N
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
        });
        panelSignup.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 20, 20));

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(0, 102, 51));
        jLabel37.setText("PASSWORD");
        panelSignup.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(0, 102, 51));
        jLabel38.setText("EMAIL");
        panelSignup.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(153, 153, 153));
        jTextField3.setText("username");
        jTextField3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 102, 51)));
        jTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField3FocusLost(evt);
            }
        });
        panelSignup.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 260, 30));

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(153, 153, 153));
        jTextField4.setText("email");
        jTextField4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 102, 51)));
        jTextField4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField4FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField4FocusLost(evt);
            }
        });
        panelSignup.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 260, 30));
        panelSignup.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 60, -1));

        jLabel40.setForeground(new java.awt.Color(255, 0, 0));
        panelSignup.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 150, 20));

        getContentPane().add(panelSignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 340));

        panelLogin.setBackground(new java.awt.Color(255, 255, 255));
        panelLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/remote/client/images/icons8_male_user_50px_4.png"))); // NOI18N
        panelLogin.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 50, 50));

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(153, 153, 153));
        jTextField1.setText("username");
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 51, 51)));
        jTextField1.setCaretColor(new java.awt.Color(0, 102, 0));
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        panelLogin.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 260, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 0));
        jLabel1.setText("USER NAME");
        panelLogin.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 90, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 0));
        jLabel3.setText("LOGIN");
        panelLogin.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, -1, 39));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 0));
        jLabel4.setText("PASSWORD");
        jLabel4.setToolTipText("");
        panelLogin.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 90, -1));

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(153, 153, 153));
        jPasswordField1.setText("password");
        jPasswordField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 102, 0)));
        jPasswordField1.setPreferredSize(new java.awt.Dimension(90, 30));
        jPasswordField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusLost(evt);
            }
        });
        panelLogin.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 260, -1));
        panelLogin.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, -1));

        kButton2.setForeground(new java.awt.Color(255, 0, 0));
        kButton2.setText("CLEAR");
        kButton2.setkBackGroundColor(new java.awt.Color(0, 153, 153));
        kButton2.setkBorderRadius(30);
        kButton2.setkEndColor(new java.awt.Color(0, 102, 0));
        kButton2.setkFillButton(false);
        kButton2.setkForeGround(new java.awt.Color(0, 102, 0));
        kButton2.setkHoverColor(new java.awt.Color(153, 0, 0));
        kButton2.setkHoverForeGround(new java.awt.Color(153, 0, 51));
        kButton2.setkStartColor(new java.awt.Color(0, 102, 102));
        kButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton2ActionPerformed(evt);
            }
        });
        panelLogin.add(kButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 100, 30));

        kButton1.setForeground(new java.awt.Color(51, 204, 0));
        kButton1.setText("LOGIN");
        kButton1.setkBackGroundColor(new java.awt.Color(0, 153, 153));
        kButton1.setkBorderRadius(30);
        kButton1.setkEndColor(new java.awt.Color(0, 102, 0));
        kButton1.setkFillButton(false);
        kButton1.setkForeGround(new java.awt.Color(0, 102, 0));
        kButton1.setkHoverForeGround(new java.awt.Color(0, 204, 204));
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });
        panelLogin.add(kButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 100, 30));

        jLabel14.setForeground(new java.awt.Color(255, 0, 0));
        panelLogin.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 250, 10));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/remote/client/images/icons8_Close_20px_1.png"))); // NOI18N
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
            }
        });
        panelLogin.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 20, 20));

        getContentPane().add(panelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 330));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kButton6.setText("LOGIN");
        kButton6.setkBorderRadius(30);
        kButton6.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton6.setkHoverStartColor(new java.awt.Color(0, 51, 51));
        kButton6.setkPressedColor(new java.awt.Color(255, 255, 255));
        kButton6.setkSelectedColor(new java.awt.Color(0, 102, 102));
        kButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(kButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 90, 30));

        kButton3.setText("SIGNUP");
        kButton3.setkBorderRadius(30);
        kButton3.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton3.setkHoverStartColor(new java.awt.Color(0, 51, 51));
        kButton3.setkSelectedColor(new java.awt.Color(0, 102, 102));
        kButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(kButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 90, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/remote/client/images/istockphoto-1141628782-612x612.jpg"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 210));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 370, 210));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 5, 320, 170));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 190));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        String user=jTextField1.getText();
        String pass=jPasswordField1.getText();
        userN = user;
        String pw="";
        
        List val=checkUser(user);
          for (Iterator iterator = val.iterator(); iterator.hasNext();) {
            Users next = (Users) iterator.next();
            
            System.out.println("There is a user");
            
            type=next.getType();
            pw=next.getPassword();
        }
          System.out.println(""+type);
         if(pass.equals(pw)){
            
           //userdas
                if(!jTextField1.getText().equals("") && !jTextField1.getText().contains(" ")){
                    //new ChatView(jTextField1.getText(),type,server).setVisible(true);
                    //this.dispose();
                    userDashPanel.setVisible(true);
                    panelLogin.setVisible(false);
                    panelSignup.setVisible(false);
                    //lak
                    kButton3.setVisible(false);
                    userName.setText(user);
                    userType.setText(type);
                    lableuser.setText(user);
                    
                }
                
                
         }else{
             jLabel14.setText("User name and Password not match");
         }
         
        //System.out.println(""+ userN.getType());

    }//GEN-LAST:event_kButton1ActionPerformed
    
    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        jTextField1.setText("");
        jPasswordField1.setText("");
    }//GEN-LAST:event_kButton2ActionPerformed

    private void pwb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwb2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwb2ActionPerformed

    private void pwb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwb1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwb1ActionPerformed

    private void jTextField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusGained
        String userNameVal=jTextField2.getText().trim().toLowerCase();
        if(userNameVal.equals("nickname")){
            jTextField2.setText("");
            jTextField2.setForeground(Color.black);
        }
    }//GEN-LAST:event_jTextField2FocusGained

    private void jTextField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusLost
        String userNameVal=jTextField2.getText().trim().toLowerCase();
        if(userNameVal.equals("nickname") || userNameVal.equals("")){
            jTextField2.setText("nickname");
            jTextField2.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField2FocusLost

    private void pwb1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwb1FocusGained
        String userPW=String.valueOf(pwb1.getPassword()).trim().toLowerCase();
        if(userPW.equals("password") || userPW.equals("")){
            pwb1.setText("");
            
        }
    }//GEN-LAST:event_pwb1FocusGained

    private void pwb1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwb1FocusLost
        String userPW=String.valueOf(pwb1.getPassword()).trim().toLowerCase();
        if(userPW.equals("password") || userPW.equals("")){
            pwb1.setText("password");
            pwb1.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_pwb1FocusLost

    private void pwb2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwb2FocusGained
        String userPW=String.valueOf(pwb2.getPassword()).trim().toLowerCase();
        if(userPW.equals("password") || userPW.equals("")){
            pwb2.setText("");
            
        }
    }//GEN-LAST:event_pwb2FocusGained

    private void pwb2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwb2FocusLost
        String userPW=String.valueOf(pwb2.getPassword()).trim().toLowerCase();
        if(userPW.equals("password") || userPW.equals("")){
            pwb2.setText("password");
            pwb2.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_pwb2FocusLost

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        String userNameVal=jTextField1.getText().trim().toLowerCase();
        if(userNameVal.equals("username")){
            jTextField1.setText("");
            jTextField1.setForeground(Color.black);
        }
    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        String userNameVal=jTextField1.getText().trim().toLowerCase();
        if(userNameVal.equals("username") || userNameVal.equals("")){
            jTextField1.setText("username");
            jTextField1.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField1FocusLost

    private void jPasswordField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusGained
        String userPW=String.valueOf(jPasswordField1.getPassword()).trim().toLowerCase();
        if(userPW.equals("password") || userPW.equals("")){
            jPasswordField1.setText("");
            
        }
    }//GEN-LAST:event_jPasswordField1FocusGained

    private void jPasswordField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusLost
        String userPW=String.valueOf(jPasswordField1.getPassword()).trim().toLowerCase();
        if(userPW.equals("password") || userPW.equals("")){
            jPasswordField1.setText("password");
            jPasswordField1.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jPasswordField1FocusLost

    private void kButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton3ActionPerformed
        panelLogin.setVisible(false);
        panelSignup.setVisible(true);
        kButton3.setVisible(false);
        kButton6.setVisible(true);
    }//GEN-LAST:event_kButton3ActionPerformed

    private void kButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton6ActionPerformed
        panelLogin.setVisible(true);
        panelSignup.setVisible(false);
        kButton3.setVisible(true);
        kButton6.setVisible(false);
    }//GEN-LAST:event_kButton6ActionPerformed

    private void kButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton5ActionPerformed
        String nickName=jTextField2.getText();
        String userName=jTextField3.getText();
        String email=jTextField4.getText();
        String pro=jTextField5.getText();
        //profile picture
        byte[] profile = null;
        try {
            profile = pro.getBytes("UTF-8");
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(LoginView.class.getName()).log(Level.SEVERE, null, ex);
        }
        String pw1=pwb1.getText();
    String pw2=pwb2.getText();
    if(pw1.equals(pw2)){
        System.out.println("Pas ok");
            Session s = conn.getSessionFactory().openSession();
            Transaction t=s.beginTransaction();
            //Users userN=(Users) s.get(Users.class, 0);
            Users u = new Users();
            
            u.setUserName(userName);
            u.setPassword(pw2);
            u.setType("user");
            u.setProfile(profile);
            s.save(u);
            System.out.println("User Created");
            t.commit();
            s.close();
            
        }else{
            System.out.println("Password not match");
            jLabel40.setText("Password not match");
        }
    }//GEN-LAST:event_kButton5ActionPerformed

    private void kButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton7ActionPerformed
        subpanel.setVisible(true);
        panelUserData.setVisible(false);
        
        
        Session s = conn.getSessionFactory().openSession();
        Transaction t = s.beginTransaction();
        List cgs = s.createQuery("from Chatgroups").list();
        
        
        for (Iterator iterator = cgs.iterator(); iterator.hasNext();) {
            //Users next = (Users) iterator.next();
            Chatgroups next = (Chatgroups) iterator.next();
            System.out.println(next.getGroupName());
            System.out.println(next.getHostId());
            JTextField t1,t2;
              
            
            jTextArea1.append("CHAT: "+ next.getGroupName()+" HOST: "+next.getHostId()+"\n\n");
            //t1=new JTextField("CHAT: "+ next.getGroupName()+" HOST: "+next.getHostId());  
            //t1.setBounds(50,100, 200,30);
            //jTextArea1.add(t1);
            
            chatName.addItem(next.getGroupName());
        }
        //Chatgroups cgs = (Chatgroups) s.get(Chatgroups.class,1);
        //System.out.println("////////////////////"+cgs.getGroupName());
    }//GEN-LAST:event_kButton7ActionPerformed

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        panelChangePW.setVisible(true);
        panelUserData.setVisible(false);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField2ActionPerformed

    private void jPasswordField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField3ActionPerformed

    private void jPasswordField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField4ActionPerformed

    private void jPasswordField3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField3FocusGained
        String userPW=String.valueOf(jPasswordField3.getPassword()).trim().toLowerCase();
        if(userPW.equals("password") || userPW.equals("")){
            jPasswordField3.setText("");
            
        }
    }//GEN-LAST:event_jPasswordField3FocusGained

    private void jPasswordField3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField3FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField3FocusLost

    private void jPasswordField4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField4FocusGained
        String userPW=String.valueOf(jPasswordField4.getPassword()).trim().toLowerCase();
        if(userPW.equals("password") || userPW.equals("")){
            jPasswordField4.setText("");
            
        }
    }//GEN-LAST:event_jPasswordField4FocusGained

    private void jPasswordField4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField4FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField4FocusLost

    private void jPasswordField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField2FocusGained
        String userPW=String.valueOf(jPasswordField2.getPassword()).trim().toLowerCase();
        if(userPW.equals("password") || userPW.equals("")){
            jPasswordField2.setText("");
            
        }
    }//GEN-LAST:event_jPasswordField2FocusGained

    private void jPasswordField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField2FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField2FocusLost

    private void kButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton9ActionPerformed
        String cPass=jPasswordField3.getText();
        String newP=jPasswordField2.getText();
        String newPC=jPasswordField4.getText();
        jPasswordField3.setText("");
        jPasswordField2.setText("");
        jPasswordField4.setText("");
        String pw="";
        int ID = 0;
        Session s = conn.getSessionFactory().openSession();
        Transaction t=s.beginTransaction();
        
        String query="FROM Users where user_name='"+userN+"'";
        Query q=s.createQuery(query);
        List result=q.list();
        for (Iterator iterator = result.iterator(); iterator.hasNext();) {
            Users next = (Users) iterator.next();
            pw=next.getPassword();
            ID=next.getUserId();
        }
        System.out.println(""+pw);
        if(cPass.equals(pw)){
            System.out.println("Paass ok");
            if(newP.equals(newPC)){
                System.out.println("ok");
                Users user = (Users) s.get(Users.class, ID);
                user.setPassword(newP);
                s.update(user);
                System.out.println("Updated");
                t.commit();
            }else{
                jLabel39.setText("Password not match");
            }
        }else{
            System.out.println("Old Password is incorrect");
            jLabel39.setText("Old Password is incorrect");
        }
    }//GEN-LAST:event_kButton9ActionPerformed

    private void jLabel24FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel24FocusGained
        jLabel24.setBackground(Color.red);
    }//GEN-LAST:event_jLabel24FocusGained

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        panelChangePW.setVisible(false);
        
        panelUserData.setVisible(true);
    }//GEN-LAST:event_jLabel24MouseClicked

    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel28MouseClicked

    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel27MouseClicked

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel25MouseClicked

    private void jLabel29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseClicked
        this.dispose();
        panelUserData.setVisible(true);
    }//GEN-LAST:event_jLabel29MouseClicked

    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked
        if (JOptionPane.showConfirmDialog(new JFrame(),
            "Are you sure you want to close this chat ?", "Close chat?",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
        
            this.setVisible(false);
            new LoginView().setVisible(true);
            //server.removeClient(newUser);
            
            
            
        
        System.exit(0);
        }else{

        }
    }//GEN-LAST:event_jLabel26MouseClicked

    private void kButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kButton7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_kButton7MouseClicked

    private void jLabel31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel31MouseClicked

    private void jLabel32FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel32FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel32FocusGained

    private void jLabel32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseClicked
        subpanel.setVisible(false);
        
        panelUserData.setVisible(true);
        
    }//GEN-LAST:event_jLabel32MouseClicked

    private void kButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton10ActionPerformed
        String chat = (String) chatName.getSelectedItem();
        int host = (int) hostID.getValue();
        
        try {
            //rmiConn
            server = (InterfaceServer) Naming.lookup("rmi://localhost:"+host+"/"+chat+"");
        } catch (NotBoundException | MalformedURLException | RemoteException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        this.setVisible(false);
        new ChatView(jTextField1.getText(),type,server).setVisible(true);
    }//GEN-LAST:event_kButton10ActionPerformed

    private void jTextField3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusGained
        String userNameVal=jTextField3.getText().trim().toLowerCase();
        if(userNameVal.equals("username")){
            jTextField3.setText("");
            jTextField3.setForeground(Color.black);
        }
    }//GEN-LAST:event_jTextField3FocusGained

    private void jTextField3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusLost
        String userNameVal=jTextField3.getText().trim().toLowerCase();
        if(userNameVal.equals("nickname") || userNameVal.equals("")){
            jTextField3.setText("nickname");
            jTextField3.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField3FocusLost

    private void jTextField4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField4FocusGained
        String userNameVal=jTextField4.getText().trim().toLowerCase();
        if(userNameVal.equals("email")){
            jTextField4.setText("");
            jTextField4.setForeground(Color.black);
        }
    }//GEN-LAST:event_jTextField4FocusGained

    private void jTextField4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField4FocusLost
        String userNameVal=jTextField4.getText().trim().toLowerCase();
        if(userNameVal.equals("email") || userNameVal.equals("")){
            jTextField4.setText("email");
            jTextField4.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField4FocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //panelFile.setVisible(true);
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String filename=f.getAbsolutePath();
        
        jTextField5.setText(filename);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void kButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton4ActionPerformed
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        pwb1.setText("");
        pwb2.setText("");
    }//GEN-LAST:event_kButton4ActionPerformed

    private void kButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kButton8ActionPerformed
    public List checkUser(String userName){
        Session s = conn.getSessionFactory().openSession();
        Users userN=(Users) s.get(Users.class, 0);
        String query="FROM Users where user_name='"+userName+"'";
        Query q=s.createQuery(query);
        List result=q.list();
        
          return result;
    }
    //fucntion to list of chats
//    public void gChats(){
//        Session s = conn.getSessionFactory().openSession();
//        Chatgroups cgp = (Chatgroups) s.get(Chatgroups.class, 0);
//        String queryG="from chatgroups";
//        //Query q=s.createQuery(queryG);
//        //List result=q.list();
//        
//          //return result;
//          List chats = s.createQuery("from chatgroups").list();
//        
//        for (Iterator iterator = chats.iterator(); iterator.hasNext();) {
//            Chatgroups next = (Chatgroups) iterator.next();
//            
//            System.out.println(next.getGroupName());
//            System.out.println(next.getChatId());
//            System.out.println(next.getHostId());
//        
//        }
//    }
    //fonction main
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            new LoginView().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> chatName;
    private javax.swing.JSpinner hostID;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JPasswordField jPasswordField4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private com.k33ptoo.components.KButton kButton1;
    private com.k33ptoo.components.KButton kButton10;
    private com.k33ptoo.components.KButton kButton2;
    private com.k33ptoo.components.KButton kButton3;
    private com.k33ptoo.components.KButton kButton4;
    private com.k33ptoo.components.KButton kButton5;
    private com.k33ptoo.components.KButton kButton6;
    private com.k33ptoo.components.KButton kButton7;
    private com.k33ptoo.components.KButton kButton8;
    private com.k33ptoo.components.KButton kButton9;
    private javax.swing.JLabel lableuser;
    private javax.swing.JPanel panelChangePW;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JPanel panelSignup;
    private javax.swing.JPanel panelUserData;
    private javax.swing.JPasswordField pwb1;
    private javax.swing.JPasswordField pwb2;
    private javax.swing.JPanel subpanel;
    private javax.swing.JPanel userDashPanel;
    private javax.swing.JLabel userName;
    private javax.swing.JLabel userType;
    // End of variables declaration//GEN-END:variables
}
