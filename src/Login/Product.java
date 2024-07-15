
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


public class Product extends javax.swing.JFrame {
    private static final String username = "root" ;
    private static final String password = "1234" ;
    private static final String dataConn = "jdbc:mysql://localhost:3306/stacy_supermarket" ;
 
    Connection sqlConn = null;
    PreparedStatement pst = null;
    ResultSet rs =null;
    int q, i, id, deleteItem;
    
    public Product() {
        initComponents();
        upDateDB();
    }

    
    //==============================================Function=========================
    
    
    
    
    
    
    
    
    
    public  void upDateDB()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlConn = DriverManager.getConnection(dataConn,username,password);
            pst = sqlConn.prepareStatement("select * from product");
            
            rs = pst.executeQuery();
            ResultSetMetaData stData = rs.getMetaData();
            
            q = stData.getColumnCount();
            
            DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel();
            RecordTable.setRowCount(0);
            
            while(rs.next()){
                    Vector columnData = new Vector();
                    
                    for(i=1;i<=q; i++){
                        columnData.add(rs.getString("id"));
                        columnData.add(rs.getString("ProductID"));
                        columnData.add(rs.getString("ProductName"));
                        columnData.add(rs.getString("Price"));
                        columnData.add(rs.getString("Description"));
                        columnData.add(rs.getString("SupplierID"));
                    }
                    RecordTable.addRow(columnData);
            }
                                                    
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
     //==============================================End Function=========================
    
    
    
    
    
   
    
    
    
    
    @SuppressWarnings("unchecked")        
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtxtProductID = new javax.swing.JTextField();
        jtxtProductName = new javax.swing.JTextField();
        jtxtPrice = new javax.swing.JTextField();
        jtxtDescription = new javax.swing.JTextField();
        jtxtSupplierID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jbtnSave = new javax.swing.JButton();
        jbtnUpdate = new javax.swing.JButton();
        jbtnReset = new javax.swing.JButton();
        jbtnDelete = new javax.swing.JButton();
        jbtnPrint = new javax.swing.JButton();
        jbtnExit = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 6));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 6));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 6));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Product ID :");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 90, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Product Name :");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Price :");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 50, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Description :");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 100, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Supplier ID :");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 90, -1));
        jPanel3.add(jtxtProductID, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 260, -1));
        jPanel3.add(jtxtProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 260, -1));
        jPanel3.add(jtxtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 260, -1));
        jPanel3.add(jtxtDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 260, -1));
        jPanel3.add(jtxtSupplierID, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 260, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Product ID", "Product Name", "Price", "Description", "Supplier ID"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 640, 200));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 6));

        jbtnSave.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnSave.setText("Save");
        jbtnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSaveActionPerformed(evt);
            }
        });

        jbtnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnUpdate.setText("Update");
        jbtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnUpdateActionPerformed(evt);
            }
        });

        jbtnReset.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnReset.setText("Reset");
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });

        jbtnDelete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnDelete.setText("Delete");
        jbtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeleteActionPerformed(evt);
            }
        });

        jbtnPrint.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnPrint.setText("Print");
        jbtnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPrintActionPerformed(evt);
            }
        });

        jbtnExit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnExit.setText("Exit");
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbtnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbtnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnPrint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("PRODUCT");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(329, 329, 329)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 490));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 490));

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
        jtxtProductID.setText("");
        jtxtProductName.setText("");
        jtxtPrice.setText("");
        jtxtDescription.setText("");
        jtxtSupplierID.setText("");
    }//GEN-LAST:event_jbtnResetActionPerformed


  
    
    
    
    
    private void jbtnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSaveActionPerformed
        
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlConn = DriverManager.getConnection(dataConn,username,password);
            pst = sqlConn.prepareStatement("insert into product(ProductID,ProductName,"+"Price,Description,SupplierID) value (?,?,?,?,?)");
            
            pst.setString(1, jtxtProductID.getText());
            pst.setString(2, jtxtProductName.getText());
            pst.setString(3, jtxtPrice.getText());
            pst.setString(4, jtxtDescription.getText());
            pst.setString(5, jtxtSupplierID.getText());
            
                    
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
        
    }//GEN-LAST:event_jbtnSaveActionPerformed

    
 
    
    
    
    private void jbtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnUpdateActionPerformed
            
    Connection sqlConn = null;
    PreparedStatement pst = null;

    
    if (jtxtProductID.getText().isEmpty() || 
        jtxtProductName.getText().isEmpty() || 
        jtxtPrice.getText().isEmpty() || 
        jtxtDescription.getText().isEmpty() || 
        jtxtSupplierID.getText().isEmpty()) {

        JOptionPane.showMessageDialog(this, "Please fill all fields", "Error", JOptionPane.ERROR_MESSAGE);
        return; 
    }

    try {
        
        Class.forName("com.mysql.cj.jdbc.Driver");

        
        sqlConn = DriverManager.getConnection(dataConn, username, password);

        
        pst = sqlConn.prepareStatement(
            "UPDATE product SET ProductName=?, Price=?, Description=?, SupplierID=? WHERE ProductID=?"
        );

        
        pst.setString(1, jtxtProductName.getText());
        pst.setString(2, jtxtPrice.getText());
        pst.setString(3, jtxtDescription.getText());
        pst.setString(4, jtxtSupplierID.getText());
        pst.setString(5, jtxtProductID.getText()); // Use ProductID in the WHERE clause

        
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

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
             DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel();
             int SelectedRows = jTable1.getSelectedRow();
             
             
             
             jtxtProductID.setText(RecordTable.getValueAt(SelectedRows, 1).toString());
             jtxtProductName.setText(RecordTable.getValueAt(SelectedRows, 2).toString());
             jtxtPrice.setText(RecordTable.getValueAt(SelectedRows, 3).toString());
             jtxtDescription.setText(RecordTable.getValueAt(SelectedRows, 4).toString());
             jtxtSupplierID.setText(RecordTable.getValueAt(SelectedRows, 5).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    
    
    private void jbtnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPrintActionPerformed
        MessageFormat header = new MessageFormat("Printing in progress");
        MessageFormat footer = new MessageFormat("Page {0, number, integer}");
        
        try
        {
            jTable1.print(JTable.PrintMode.NORMAL,header,footer);
        }
        catch(java.awt.print.PrinterException e)
        {
            System.err.format("No Printer found", e.getMessage());
        }
    }//GEN-LAST:event_jbtnPrintActionPerformed

    
    
    private void jbtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeleteActionPerformed
       DefaultTableModel RecordTable =(DefaultTableModel)jTable1.getModel();
       int SelectedRows = jTable1.getSelectedRow();
       
       try{
           id = Integer.parseInt(RecordTable.getValueAt(SelectedRows, 0).toString());
           
           deleteItem= JOptionPane.showConfirmDialog(null,"Confirm if you want to delete item","Warning",JOptionPane.YES_NO_OPTION);
           
           if (deleteItem==JOptionPane.YES_OPTION){
               Class.forName("com.mysql.jdbc.Driver");
               sqlConn = DriverManager.getConnection(dataConn,username,password);
               pst = sqlConn.prepareStatement("delete from product where id=?");
                
               pst.setInt(1, id);
               pst.executeUpdate();
               
               JOptionPane.showMessageDialog(this, "Record Deleted");
               upDateDB();
               
               jtxtProductID.setText("");
               jtxtProductName.setText("");
               jtxtPrice.setText("");
               jtxtDescription.setText("");
               jtxtSupplierID.setText("");
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
                new Product().setVisible(true);
            }
        });
        
                       
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbtnDelete;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnPrint;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JButton jbtnSave;
    private javax.swing.JButton jbtnUpdate;
    private javax.swing.JTextField jtxtDescription;
    private javax.swing.JTextField jtxtPrice;
    private javax.swing.JTextField jtxtProductID;
    private javax.swing.JTextField jtxtProductName;
    private javax.swing.JTextField jtxtSupplierID;
    // End of variables declaration//GEN-END:variables
}
