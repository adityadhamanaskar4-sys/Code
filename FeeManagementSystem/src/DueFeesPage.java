
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author dell pc
 */
    /**
     * @param args the command line arguments
     */
public class DueFeesPage extends JFrame implements ActionListener,WindowListener{
    Connection con;
    Statement stmt;
    String username;
    ResultSet rs;
    JButton b1;
    /**
     * Creates new form DueFeesPage
     */
    public DueFeesPage(Connection con,Statement stmt,String username) {
        super("Fees due Page");
        this.con=con;
        this.stmt=stmt;
        this.username=username;
        String result[][]=new String[100][10];
        String columnnames[]={"ID","Name","Mobile no.","Email","Java","DS","AOA","Python","Fees","Balance Fees"};
        boolean flag=true;
        try{
            int i=0;
            rs=stmt.executeQuery("SELECT ID,Name,`Mobile no.`,Email,Java,DS,AOA,Python,Fees,`Balance Fees` FROM StudentData WHERE `Balance Fees`!='null'");
            if(!rs.next()){
                JOptionPane.showMessageDialog(null,"No Records!","Fees due Page",JOptionPane.WARNING_MESSAGE);
                flag=false;
            }
            if(flag){
                setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                setLocation(400,50);
                setSize(1020,620);
                setLayout(null);
                setResizable(false);
                setIconImage(new ImageIcon("Screenshot 2025-06-24 195725.png").getImage());
                b1=new JButton("Back");
                b1.setBounds(450,520,100,60);
                b1.setBackground(new Color(0,51,255));
                b1.setForeground(Color.white);
                b1.setFont(new Font("SansSerif",Font.BOLD, 24));
                add(b1);
                do{
                    result[i][0]=rs.getString(1);
                    result[i][1]=rs.getString(2);
                    result[i][2]=rs.getString(3);
                    result[i][3]=rs.getString(4);
                    result[i][4]=rs.getString(5);
                    result[i][5]=rs.getString(6);
                    result[i][6]=rs.getString(7);
                    result[i][7]=rs.getString(8);
                    result[i][8]=rs.getString(9);
                    result[i][9]=rs.getString(10);
                    i++;
                }
                while(rs.next());
                JTable jt1=new JTable(result,columnnames);
                JScrollPane jsp1=new JScrollPane(jt1);
                jsp1.setBounds(0,0,1000,500);
                add(jsp1);
                b1.addActionListener(this);
                addWindowListener(this);
                setVisible(true);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error finding records\nTry Again!","Fees due Page",JOptionPane.WARNING_MESSAGE);
        }
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DueFeesPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DueFeesPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DueFeesPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DueFeesPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    public void actionPerformed(ActionEvent e){
        new HomePage(username,con,stmt);
        dispose();
    }
    @Override
    public void windowClosing(WindowEvent e) {
        new HomePage(username,con,stmt);
        dispose();
    }
    @Override
    public void windowOpened(WindowEvent e) {}
    @Override
    public void windowClosed(WindowEvent e) {}
    @Override
    public void windowIconified(WindowEvent e) {}
    @Override
    public void windowDeiconified(WindowEvent e) {}
    @Override
    public void windowActivated(WindowEvent e) {}
    @Override
    public void windowDeactivated(WindowEvent e) {}
}