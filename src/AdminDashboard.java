
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AdminDashboard extends javax.swing.JFrame {
Connection con;
    /**
     * Creates new form AdminDashboard
     */
    public AdminDashboard() {
        initComponents();
        setTitle("Student Dashboard");
        setLocationRelativeTo(null);
        String url="Jdbc:mysql://localhost:3306/CMS";
        String user="root";
        String pass="";
        try{
            con=DriverManager.getConnection(url,user,pass);
        }catch(Exception ex){
            System.out.println("Error: "+ex.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbStudMarks = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        removelBtn7 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        pass = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        name = new javax.swing.JTextField();
        btnView = new javax.swing.JButton();
        removelBtn8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbStudMarks.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        tbStudMarks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Age", "Password"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbStudMarks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbStudMarksMouseClicked(evt);
            }
        });
        tbStudMarks.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbStudMarksKeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(tbStudMarks);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 390, 300));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("ID:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 30, 30));

        removelBtn7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        removelBtn7.setText("Back");
        removelBtn7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        removelBtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removelBtn7ActionPerformed(evt);
            }
        });
        jPanel1.add(removelBtn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 80, 20));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("Student's Data");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Student's Dashboard");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(518, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 20));

        ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDActionPerformed(evt);
            }
        });
        jPanel1.add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 130, -1));
        jPanel1.add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 130, -1));
        jPanel1.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 130, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setText("Name:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 70, 30));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setText("Age:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 70, 30));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Password:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 70, 30));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("Insert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 80, 30));

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 130, -1));

        btnView.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        jPanel1.add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, 70, -1));

        removelBtn8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        removelBtn8.setText("Remove");
        removelBtn8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        removelBtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removelBtn8ActionPerformed(evt);
            }
        });
        jPanel1.add(removelBtn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 90, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbStudMarksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbStudMarksMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbStudMarksMouseClicked

    private void tbStudMarksKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbStudMarksKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbStudMarksKeyPressed

    private void removelBtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removelBtn7ActionPerformed
        // TODO add your handling code here:
        AdminInterface ai2=new AdminInterface();
        ai2.show();
        dispose();
    }//GEN-LAST:event_removelBtn7ActionPerformed

    private void IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String id = ID.getText();
        String Name=name.getText();
        String Age=age.getText();
        String passw=pass.getText();

        Connection con1;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con1 = DriverManager.getConnection("Jdbc:mysql://localhost:3306/CMS","root","");
            Statement st = con.createStatement();
            st.execute("INSERT INTO student Values('"+id+"','"+Name+"','"+Age+"','"+passw+"')");
            JOptionPane.showMessageDialog(null,"Inserted successfull");
        }
        catch(SQLException | ClassNotFoundException e)
        {
            System.out.println(e);
        }
        String sql="select * from student";
        try{
            PreparedStatement pst= con.prepareStatement(sql);
            ResultSet rs= pst.executeQuery();
            DefaultTableModel model=(DefaultTableModel)tbStudMarks.getModel();
            model.setRowCount(0);
            while(rs.next()){
                model.addRow(new String[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)});
            }
        }catch(Exception ex){
            System.out.println("Eroor: "+ex.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        String sql="select * from student";
        try{
            PreparedStatement pst= con.prepareStatement(sql);
            ResultSet rs= pst.executeQuery();
            DefaultTableModel model=(DefaultTableModel)tbStudMarks.getModel();
            model.setRowCount(0);
            while(rs.next()){
                model.addRow(new String[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)});
            }
        }catch(Exception ex){
            System.out.println("Eroor: "+ex.getMessage());
        }
    }//GEN-LAST:event_btnViewActionPerformed

    private void removelBtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removelBtn8ActionPerformed
        // TODO add your handling code here:
        //        String id = ID.getText();
        //        String Name=name.getText();
        //        String Age=age.getText();
        //        String passw=pass.getText();
        //
        //        Connection con1;
        //       try
        //       {
            //           Class.forName("com.mysql.cj.jdbc.Driver");
            //           con1 = DriverManager.getConnection("Jdbc:mysql://localhost:3306/CMS","root","");
            //                Statement st = con.createStatement();
            //                st.execute("Delete from teacher where id=ID.getText()");
            //                //st.execute("INSERT INTO teacher Values('"+id+"','"+name.getText()+"','"+Age+"','"+passw+"')");
            //       }
        //       catch(SQLException | ClassNotFoundException e)
        //       {
            //           System.out.println(e);
            //       }

        int row=tbStudMarks.getSelectedRow();
        String cell=tbStudMarks.getModel().getValueAt(row,0).toString();
        String sql="Delete From student where id = "+cell;
        try{
            var pst= con.prepareStatement(sql);
            pst=con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Deleted successfull");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_removelBtn8ActionPerformed

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
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ID;
    private javax.swing.JTextField age;
    private javax.swing.JButton btnView;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField name;
    private javax.swing.JTextField pass;
    private javax.swing.JButton removelBtn7;
    private javax.swing.JButton removelBtn8;
    public static javax.swing.JTable tbStudMarks;
    // End of variables declaration//GEN-END:variables
}
