
package Login;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Vector;
import javax.swing.JOptionPane;

public class Login_Application extends javax.swing.JFrame {

      private static final String username = "root" ;
    private static final String password = "1234" ;
    private static final String dataConn = "jdbc:mysql://localhost:3306/stacy_supermarket" ;
 
    Connection sqlConn = null;
    PreparedStatement pst = null;
    ResultSet rs =null;
    
    
   
    public Login_Application() {
        initComponents();
       
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtuser = new javax.swing.JTextField();
        blogin = new javax.swing.JButton();
        bclose = new javax.swing.JButton();
        jpassword = new javax.swing.JPasswordField();
        jcshow_password = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 102));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LOGIN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 80, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 80, -1));
        getContentPane().add(jtuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 169, -1));

        blogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        blogin.setText("Login");
        blogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloginActionPerformed(evt);
            }
        });
        getContentPane().add(blogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 80, 30));

        bclose.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bclose.setText("Close");
        bclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcloseActionPerformed(evt);
            }
        });
        getContentPane().add(bclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 80, 30));
        getContentPane().add(jpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 169, -1));

        jcshow_password.setBackground(new java.awt.Color(19, 175, 131));
        jcshow_password.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jcshow_password.setForeground(new java.awt.Color(255, 255, 255));
        jcshow_password.setText("Show Password");
        jcshow_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcshow_passwordActionPerformed(evt);
            }
        });
        getContentPane().add(jcshow_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 169, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/Screenshot (558).png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 290, 330));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Stacy Supermarket Management System ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/shopping_Cart2.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 390, 340));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setForeground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 820, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 460));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloginActionPerformed
        if(jtuser.getText().equals("")){
            
            JOptionPane.showMessageDialog(null, "Please fill out username");
        }
        else if(jpassword.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please fill out password");
        }
        
        //If the user is an employee
        else if(jtuser.getText().contains("Thari")&& jpassword.getText().contains("12345678")){       
            JOptionPane.showMessageDialog(null, "Login Successfull !!");
            
            setVisible(false);
            new Dashboard_Employee().setVisible(true);
        
        }
        //If the user is a customer
        else{
            String CustomerID = validateCustomerLogin(jtuser.getText(), jpassword.getText());
            if (CustomerID != null) {
                JOptionPane.showMessageDialog(null, "Login Successful !!");
                setVisible(false);
                new Dashboard_Customer(CustomerID).setVisible(true);
            }
            else{
             JOptionPane.showMessageDialog(null, "Wrong username or password !!", "Message", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_bloginActionPerformed

    private void jcshow_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcshow_passwordActionPerformed
             if (jcshow_password.isSelected()){
                 jpassword.setEchoChar((char)0);
             }
             else{
                 jpassword.setEchoChar('*');
             }
    }//GEN-LAST:event_jcshow_passwordActionPerformed

    private void bcloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcloseActionPerformed
             System.exit(0);
    }//GEN-LAST:event_bcloseActionPerformed

    
    private String validateCustomerLogin(String username, String password) {
        String CustomerID=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlConn= DriverManager.getConnection(dataConn,this.username,this.password);
            pst= sqlConn.prepareStatement("SELECT CustomerID from customer where CustomerName=? and Password=?");
            pst.setString(1, username);
            pst.setString(2, password);
            rs=pst.executeQuery();
            
            if(rs.next()){
                CustomerID=rs.getString("CustomerID");
            }
        }
        catch(ClassNotFoundException | SQLException ex){
            java.util.logging.Logger.getLogger(Login_Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            
        }
        finally{
               
        try{
            if(rs!=null)rs.close();
            if(pst!=null)pst.close();
            if (sqlConn != null) sqlConn.close();
        }
        catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Login_Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        }
         return CustomerID;
        
        
    }
    
    
    
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_Application().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bclose;
    private javax.swing.JButton blogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JCheckBox jcshow_password;
    private javax.swing.JPasswordField jpassword;
    private javax.swing.JTextField jtuser;
    // End of variables declaration//GEN-END:variables
}
