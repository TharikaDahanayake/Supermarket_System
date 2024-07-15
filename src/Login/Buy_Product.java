
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



public class Buy_Product extends javax.swing.JFrame {

    private String CustomerID;

    
    public Buy_Product(String CustomerID) {
        this.CustomerID = CustomerID;
        
        initComponents();
        upDateDB();
        upDateDB1();
        
        addWindowListener(new java.awt.event.WindowAdapter() {
        @Override
        public void windowClosing(java.awt.event.WindowEvent windowEvent) {
            clearCart();
            System.exit(0);
        }
    });
       
    }
    
        
                     


private static final String username = "root" ;
    private static final String password = "1234" ;
    private static final String dataConn = "jdbc:mysql://localhost:3306/stacy_supermarket" ;
 
    Connection sqlConn = null;
    PreparedStatement pst = null;
    ResultSet rs =null;
    int q, i, id, deleteItem;
   
    public Buy_Product() {
        initComponents();
        upDateDB();
        upDateDB1();
        
        
        addWindowListener(new java.awt.event.WindowAdapter() {
        @Override
        public void windowClosing(java.awt.event.WindowEvent windowEvent) {
            clearCart();
            System.exit(0);
        }
    });
    }
 
          
       
       
    public  void upDateDB()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlConn = DriverManager.getConnection(dataConn,username,password);
            pst = sqlConn.prepareStatement("select * from Product");
            
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
 
    
    
    
    
    
    
    
    public  void upDateDB1()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlConn = DriverManager.getConnection(dataConn,username,password);
            pst = sqlConn.prepareStatement("select * from cart");
            
            rs = pst.executeQuery();
            ResultSetMetaData stData = rs.getMetaData();
            
            q = stData.getColumnCount();
            
            DefaultTableModel RecordTable = (DefaultTableModel)jTable2.getModel();
            RecordTable.setRowCount(0);
            
            while(rs.next()){
                    Vector columnData = new Vector();
                    
                    for(i=1;i<=q; i++){
                        
                        
                        columnData.add(rs.getString("ProductName"));
                        columnData.add(rs.getString("UnitPrice"));
                        columnData.add(rs.getString("Quantity"));
                        columnData.add(rs.getString("Total"));
                        
                    }
                    RecordTable.addRow(columnData);
            }
                                                    
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    
    
    
     private void clearCart() {
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        sqlConn = DriverManager.getConnection(dataConn, username, password);
        pst = sqlConn.prepareStatement("DELETE FROM cart");
        pst.executeUpdate();
    } catch (ClassNotFoundException | SQLException ex) {
        java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
}
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jbtnExit = new javax.swing.JButton();
        jbtnPay = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtxtProductID = new javax.swing.JTextField();
        jtxtProductName = new javax.swing.JTextField();
        jtxtPrice = new javax.swing.JTextField();
        jtxtQuantity = new javax.swing.JTextField();
        jbtnCart = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jtxtTotalPrice = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Buy Product");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(306, 306, 306)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(344, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 10, 880, 80));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 6));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Product ID", "Product Name", "Price", "Description"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 480, 230));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 6));

        jbtnExit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnExit.setText("Exit");
        jbtnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnExitMouseClicked(evt);
            }
        });

        jbtnPay.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnPay.setText("Pay");
        jbtnPay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnPayMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jbtnPay, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jbtnPay, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jbtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 400, 380, 90));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel2.setText("Product ID :");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 90, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel3.setText("Product Name :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 100, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel4.setText("Unit Price :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 80, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel5.setText("Quantity :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 80, -1));
        jPanel2.add(jtxtProductID, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 200, -1));
        jPanel2.add(jtxtProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 200, -1));
        jPanel2.add(jtxtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 200, -1));
        jPanel2.add(jtxtQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 200, -1));

        jbtnCart.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jbtnCart.setText("Add to Cart");
        jbtnCart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnCartMouseClicked(evt);
            }
        });
        jPanel2.add(jbtnCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 130, 50));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Unit Price", "Quantity", "Amount"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 97, 380, 180));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton1.setText("Delete Item");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 130, 50));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Total Price :");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 330, 90, 20));
        jPanel2.add(jtxtTotalPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 330, 230, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 490));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        
    }//GEN-LAST:event_formComponentShown

    
    
    
    
    private JFrame frame;
    private void jbtnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnExitMouseClicked
        
        frame = new JFrame("Exit"); 
             if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit","MySQL Connector",
                     JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
             {
                 clearCart();
                 this.dispose();
             }
    }//GEN-LAST:event_jbtnExitMouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel();
             int SelectedRows = jTable1.getSelectedRow();
             
             
             
             jtxtProductID.setText(RecordTable.getValueAt(SelectedRows, 1).toString());
             jtxtProductName.setText(RecordTable.getValueAt(SelectedRows, 2).toString());
             jtxtPrice.setText(RecordTable.getValueAt(SelectedRows, 3).toString());
             
    }//GEN-LAST:event_jTable1MouseClicked

    
    
    
    
 private double calculateTotalPrice() {
    double totalPrice = 0.0;
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        sqlConn = DriverManager.getConnection(dataConn, username, password);
        pst = sqlConn.prepareStatement("SELECT SUM(Total) FROM cart");
        rs = pst.executeQuery();
        
        if (rs.next()) {
            totalPrice = rs.getDouble(1);
        }
    } catch (ClassNotFoundException | SQLException ex) {
        java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    return totalPrice;
}
    
    
    
    
    
    
    
    private void jbtnCartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnCartMouseClicked
        
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlConn = DriverManager.getConnection(dataConn,username,password);
            
            String unitPriceStr = jtxtPrice.getText();
            String quantityStr = jtxtQuantity.getText();
            
           
            
            double unitPrice = Double.parseDouble(unitPriceStr);
            double quantity = Double.parseDouble(quantityStr);            
            double Amount = unitPrice * quantity;
            
        
                     
            pst = sqlConn.prepareStatement("insert into cart(ProductName,"+"UnitPrice,Quantity,Total) value (?,?,?,?)");
            
            
            pst.setString(1, jtxtProductName.getText());
            pst.setString(2, jtxtPrice.getText());
            pst.setString(3, jtxtQuantity.getText());
            pst.setDouble(4, Amount);
                              
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Item Added");
            upDateDB1();
            
            
            double totalPrice = calculateTotalPrice();
            jtxtTotalPrice.setText(String.format("%.2f", totalPrice));
            
               jtxtProductID.setText("");
               jtxtProductName.setText("");
               jtxtPrice.setText("");
               jtxtQuantity.setText("");
                                              
        }
        catch(ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
            
        }
        catch(SQLException ex)
        {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
            
        }
        
    }//GEN-LAST:event_jbtnCartMouseClicked

    
    
    
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        
        DefaultTableModel RecordTable =(DefaultTableModel)jTable2.getModel();
        int SelectedRows = jTable2.getSelectedRow();
       
       try{
           String productName = RecordTable.getValueAt(SelectedRows, 0).toString();
           
           deleteItem= JOptionPane.showConfirmDialog(null,"Confirm if you want to delete item","Warning",JOptionPane.YES_NO_OPTION);
           
           if (deleteItem==JOptionPane.YES_OPTION){
               Class.forName("com.mysql.cj.jdbc.Driver");
               sqlConn = DriverManager.getConnection(dataConn,username,password);
               pst = sqlConn.prepareStatement("delete from cart where ProductName=?");
                
               pst.setString(1, productName);
               pst.executeUpdate();
               
               JOptionPane.showMessageDialog(this, "Item Deleted");
               upDateDB1();
               
               double totalPrice = calculateTotalPrice();
               jtxtTotalPrice.setText(String.format("%.2f", totalPrice));
               
               jtxtProductID.setText("");
               jtxtProductName.setText("");
               jtxtPrice.setText("");
               jtxtQuantity.setText("");
               
            }
       }
       catch(ClassNotFoundException ex)
       {
                java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE,null, ex);
                
       }catch(SQLException ex)
       {
           System.err.println(ex);
       }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jbtnPayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnPayMouseClicked
        
        
        
        
      try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        sqlConn = DriverManager.getConnection(dataConn, username, password);
        
        // Calculate Total Price
        
        pst = sqlConn.prepareStatement("SELECT SUM(Total) FROM cart");
        rs = pst.executeQuery();
        double totalPrice = 0;
        
        if (rs.next()) {
            totalPrice = rs.getDouble(1);
        }
        
        // Calculate Discount and Net Total
        double discount = totalPrice * 0.5; // 10% discount
        double netTotal = totalPrice - discount;
        
        // Insert into sales table
        pst = sqlConn.prepareStatement("INSERT INTO sales (CustomerID, "+"TotalPrice, Discount, NetTotal) VALUES (?, ?, ?, ?)");
        pst.setString(1, CustomerID);
        pst.setDouble(2, totalPrice);
        pst.setDouble(3, discount);
        pst.setDouble(4, netTotal);
        pst.executeUpdate();
        
        JOptionPane.showMessageDialog(this, "Payment Successful.");
        
        // Clear the cart
        clearCart();
        
        // Update the UI
        upDateDB1();
        jtxtTotalPrice.setText("");
        
        
        
    } catch (ClassNotFoundException | SQLException ex) {
        java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(this, "Payment Failed. Please try again.");
    }
      
      
      new Payment_Method().setVisible(true);
        
    }//GEN-LAST:event_jbtnPayMouseClicked

    
    
    
   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Buy_Product().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton jbtnCart;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnPay;
    private javax.swing.JTextField jtxtPrice;
    private javax.swing.JTextField jtxtProductID;
    private javax.swing.JTextField jtxtProductName;
    private javax.swing.JTextField jtxtQuantity;
    private javax.swing.JTextField jtxtTotalPrice;
    // End of variables declaration//GEN-END:variables
}
