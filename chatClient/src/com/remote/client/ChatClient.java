package com.remote.client;

import com.remote.server.InterfaceServer;
import connection.conn;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Blob;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import org.hibernate.Query;
import org.hibernate.Session;
import pojo.Users;


public class ChatClient extends UnicastRemoteObject implements InterfaceClient{
    private final InterfaceServer server;
    private final String name;
    private final JTextField input;
    private final JTextArea output;

    

    public ChatClient(String name , InterfaceServer server,JTextField jtext1,JTextArea jtext2) throws RemoteException{
        this.name = name;
        this.server = server;
        this.input = jtext1;
        this.output = jtext2;
        System.out.println("***********************"+name);
        System.out.println("*************************"+server);
        server.addClient(this);
    }
    

    @Override
    public void retrieveMessage(String message) throws RemoteException {
        output.setText(output.getText() + "\n" + message);
    }
    

    @Override
    public void retrieveMessage(String filename, ArrayList<Integer> inc) throws RemoteException {
        JLabel label = new JLabel("<HTML><U><font size=\"4\" color=\"#365899\">" + filename + "</font></U></HTML>");
        label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        label.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    FileOutputStream out;
                    String separator;
                    if(System.getProperty("os.name").startsWith("Linux") || System.getProperty("os.name").startsWith("MacOS")) separator = "/";
                    else separator = "\\";
                    out = new FileOutputStream(System.getProperty("user.home") + separator + filename);
                    String[] extension = filename.split("\\.");
                    for (int i = 0; i<inc.size(); i++) {
                        int cc = inc.get(i);
                        if(extension[extension.length - 1].equals("txt")||
                                extension[extension.length - 1].equals("java")||
                                extension[extension.length - 1].equals("php")||
                                extension[extension.length - 1].equals("c")||
                                extension[extension.length - 1].equals("cpp")||
                                extension[extension.length - 1].equals("xml")
                                )
                        out.write((char)cc);
                        else{
                            out.write((byte)cc);
                        }
                    }
                    out.flush();
                    out.close();
                    JOptionPane.showMessageDialog(new JFrame(),"your file saved at " + System.getProperty("user.home") + separator + filename,"File Saved",JOptionPane.INFORMATION_MESSAGE);
                } catch (FileNotFoundException ex) {
                    System.out.println("Error: " + ex.getMessage());
                } catch (IOException ex) {
                    System.out.println("Error: " + ex.getMessage());
                }             
            }

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {}

            @Override
            public void mouseExited(MouseEvent e) {}
        });

    }
    
    //sending a message
    @Override
    public void sendMessage(List<String> list) {
        Session s = conn.getSessionFactory().openSession();
        Users userN=(Users) s.get(Users.class, 0);
        //to get the user details from server
        String query="FROM Users where user_name='n'";
        Query q=s.createQuery(query);
        byte[] blobI = null;
        //converting blob file into image file
        ImageIcon newImage = null;
        List result=q.list();
         for (Iterator iterator = result.iterator(); iterator.hasNext();) {
            Users next = (Users) iterator.next();
            
            //System.out.println("There is a user");

            blobI= next.getProfile();
            
            ImageIcon ik = new ImageIcon(blobI);
            Image im = ik.getImage();
             System.out.println(""+ik);
            Image img = ik.getImage();
            Image myImg = img.getScaledInstance(50, 50, im.SCALE_SMOOTH);
            newImage = new ImageIcon(myImg);
        }
        try {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");  
            LocalDateTime now = LocalDateTime.now();  
            //broadcasting the messages via server
            server.broadcastMessage(newImage+"Image "+name + " : " + input.getText()+"   "+dtf.format(now),list  );
            
        } catch (RemoteException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    //cette fonction pour recupere le nom d'un client connectées
    @Override
    public String getName() {
        return name;
    }

    //closing the chat
    @Override
    public void closeChat(String message) throws RemoteException {
        input.setEditable(false);
        input.setEnabled(false);
        JOptionPane.showMessageDialog(new JFrame(),message,"Alert",JOptionPane.WARNING_MESSAGE); 
    }

    
    @Override
    public void openChat() throws RemoteException {
        input.setEditable(true);
        input.setEnabled(true);    
    }
}