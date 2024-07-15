
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


public class Customer extends javax.swing.JFrame {
    private static final String username = "root" ;
    private static final String password = "1234" ;
    private static final String dataConn = "jdbc:mysql://localhost:3306/stacy_supermarket" ;
 
    Connection sqlConn = null;
    PreparedStatement pst = null;
    ResultSet rs =null;
    int q, i, id, deleteItem;
    
    public Customer() {
        initComponents();
        upDateDB();
    }

    
    public  void upDateDB()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlConn = DriverManager.getConnection(dataConn,username,password);
            pst = sqlConn.prepareStatement("select * from customer");
            
            rs = pst.executeQuery();
            ResultSetMetaData stData = rs.getMetaData();
            
            q = stData.getColumnCount();
            
            DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel();
            RecordTable.setRowCount(0);
            
            while(rs.next()){
                    Vector columnData = new Vector();
                    
                    for(i=1;i<=q; i++){
                        columnData.add(rs.getString("id"));
                        columnData.add(rs.getString("CustomerID"));
                        columnData.add(rs.getString("CustomerName"));
                        columnData.add(rs.getString("ContactNumber"));
                        columnData.add(rs.getString("Password"));
                        
                    }
                    RecordTable.addRow(columnData);
            }
                                                    
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jpanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtxtCustomerID = new javax.swing.JTextField();
        jtxtCustomerName = new javax.swing.JTextField();
        jtxtContactNumber = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jtxtPassword = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jbtnCreate = new javax.swing.JButton();
        jbtnDelete = new javax.swing.JButton();
        jbtnReset = new javax.swing.JButton();
        jbtnUpdate = new javax.swing.JButton();
        jbtnExit = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 6));

        jpanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 6));
        jpanel.setForeground(new java.awt.Color(0, 102, 102));
        jpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Customer ID :");
        jpanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 100, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Customer Name :");
        jpanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 130, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Contact Number :");
        jpanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 130, -1));
        jpanel.add(jtxtCustomerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 250, -1));
        jpanel.add(jtxtCustomerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 250, -1));
        jpanel.add(jtxtContactNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 250, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Customer ID", "Customer Name", "Contact Number", "Password"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jpanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 610, 210));
        jpanel.add(jtxtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 250, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Password :");
        jpanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 100, 20));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 6));
        jPanel3.setForeground(new java.awt.Color(0, 102, 102));

        jbtnCreate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnCreate.setText("Create");
        jbtnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCreateActionPerformed(evt);
            }
        });

        jbtnDelete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnDelete.setText("Delete");
        jbtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeleteActionPerformed(evt);
            }
        });

        jbtnReset.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnReset.setText("Reset");
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });

        jbtnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnUpdate.setText("Update");
        jbtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnUpdateActionPerformed(evt);
            }
        });

        jbtnExit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnExit.setText("Exit");
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbtnCreate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jbtnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jbtnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jbtnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
            .addComponent(jbtnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jbtnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("CUSTOMER");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(309, 309, 309)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jpanel, javax.swing.GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 492, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
private JFrame frame;
    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        frame = new JFrame("Exit"); 
             if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit","MySQL Connector",
                     JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
             {
                  
                 this.dispose();
             }
    }//GEN-LAST:event_jbtnExitActionPerformed

    
    
    
    
    
    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
        jtxtCustomerID.setText("");
        jtxtCustomerName.setText("");
        jtxtContactNumber.setText("");
        jtxtPassword.setText("");
        
    }//GEN-LAST:event_jbtnResetActionPerformed

    
    
    
    
    
    
  
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
             DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel();
             int SelectedRows = jTable1.getSelectedRow();
             
             
             jtxtCustomerID.setText(RecordTable.getValueAt(SelectedRows, 1).toString());
             jtxtCustomerName.setText(RecordTable.getValueAt(SelectedRows, 2).toString());
             jtxtContactNumber.setText(RecordTable.getValueAt(SelectedRows, 3).toString());
             jtxtPassword.setText(RecordTable.getValueAt(SelectedRows, 4).toString());
             
    }//GEN-LAST:event_jTable1MouseClicked

    
    
    
    
    
    
    private void jbtnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCreateActionPerformed
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlConn = DriverManager.getConnection(dataConn,username,password);
            pst = sqlConn.prepareStatement("insert into customer(CustomerID,CustomerName,"+"ContactNumber,Password) value (?,?,?,?)");
            
            pst.setString(1, jtxtCustomerID.getText());
            pst.setString(2, jtxtCustomerName.getText());
            pst.setString(3, jtxtContactNumber.getText());
            pst.setString(4, jtxtPassword.getText());
            
            
                    
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Record Added");
            upDateDB();
                                              
        }
        catch(ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
            
        }
        catch(SQLException ex)
        {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
            
        }
        
    }//GEN-LAST:event_jbtnCreateActionPerformed

    
    
    
    
    
    
    
    private void jbtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnUpdateActionPerformed
    Connection sqlConn = null;
    PreparedStatement pst = null;

    
    if (jtxtCustomerID.getText().isEmpty() || 
        jtxtCustomerName.getText().isEmpty() || 
        jtxtContactNumber.getText().isEmpty() || 
        jtxtPassword.getText().isEmpty()) {

        JOptionPane.showMessageDialog(this, "Please fill all fields", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
   
        Class.forName("com.mysql.cj.jdbc.Driver");

        
        sqlConn = DriverManager.getConnection(dataConn, username, password);

        
        pst = sqlConn.prepareStatement(
            "UPDATE customer SET CustomerID=?, CustomerName=?, ContactNumber=?, Password=? WHERE CustomerID=?"
        );

      
        pst.setString(1, jtxtCustomerID.getText());
        pst.setString(2, jtxtCustomerName.getText());
        pst.setString(3, jtxtContactNumber.getText());
        pst.setString(4, jtxtPassword.getText());
        pst.setString(5, jtxtCustomerID.getText()); 

        pst.executeUpdate();


        JOptionPane.showMessageDialog(this, "Record Updated");

        upDateDB();
    } catch (ClassNotFoundException ex) {
        java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } finally {

        try {
            if (pst != null) pst.close();
            if (sqlConn != null) sqlConn.close();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    
    }//GEN-LAST:event_jbtnUpdateActionPerformed

    
    
    
    
    
    
    
    private void jbtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeleteActionPerformed
        DefaultTableModel RecordTable =(DefaultTableModel)jTable1.getModel();
       int SelectedRows = jTable1.getSelectedRow();
       
       try{
           id = Integer.parseInt(RecordTable.getValueAt(SelectedRows, 0).toString());
           
           deleteItem= JOptionPane.showConfirmDialog(null,"Confirm if you want to delete item","Warning",JOptionPane.YES_NO_OPTION);
           
           if (deleteItem==JOptionPane.YES_OPTION){
               Class.forName("com.mysql.jdbc.Driver");
               sqlConn = DriverManager.getConnection(dataConn,username,password);
               pst = sqlConn.prepareStatement("delete from customer where id=?");
                
               pst.setInt(1, id);
               pst.executeUpdate();
               
               JOptionPane.showMessageDialog(this, "Record Deleted");
               upDateDB();
               
               jtxtCustomerID.setText("");
               jtxtCustomerName.setText("");
               jtxtContactNumber.setText("");
              
            }
       }
       catch(ClassNotFoundException ex)
       {
                java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE,null, ex);
                
       }catch(SQLException ex)
       {
           System.err.println(ex);
       }
    }//GEN-LAST:event_jbtnDeleteActionPerformed










   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbtnCreate;
    private javax.swing.JButton jbtnDelete;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JButton jbtnUpdate;
    private javax.swing.JPanel jpanel;
    private javax.swing.JTextField jtxtContactNumber;
    private javax.swing.JTextField jtxtCustomerID;
    private javax.swing.JTextField jtxtCustomerName;
    private javax.swing.JTextField jtxtPassword;
    // End of variables declaration//GEN-END:variables
}
