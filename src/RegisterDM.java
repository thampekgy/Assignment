
import java.awt.*;
import java.sql.*;
import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author Student
 */
public class RegisterDM extends javax.swing.JFrame {

    private Connection conn;
    private PreparedStatement stmt;
    private String host = "jdbc:derby://localhost:1527/FastestDeliveryman";
    private String user = "nbuser";
    private String password = "nbuser";
    private String tableName = "DELIVERYMAN";

    public RegisterDM() {
        initComponents();
        setTitle("Create Delivery Man");
        setSize(580, 480);
        setLocationRelativeTo(null);
        createConnection();

    }

    private void createConnection() {
        try {
            conn = DriverManager.getConnection(host, user, password);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    public ResultSet selectRecord(String did) {
        String queryStr = "SELECT * FROM " + tableName + " WHERE D_ID = ?";
        ResultSet rs = null;
        try {
            stmt = conn.prepareStatement(queryStr);
            stmt.setString(1, did);
            rs = stmt.executeQuery();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return rs;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jbtadd = new javax.swing.JButton();
        jbtcancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jtfname = new javax.swing.JTextField();
        jtfCon = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtfID = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jtfIC = new javax.swing.JTextField();
        jtReset = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Working", "Retired", "Resigned" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel4.setFont(new java.awt.Font("Courier New", 0, 15)); // NOI18N
        jLabel4.setText("Contact No");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 210, 200, 18);

        jbtadd.setText("ADD");
        jbtadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtaddActionPerformed(evt);
            }
        });
        getContentPane().add(jbtadd);
        jbtadd.setBounds(220, 300, 80, 25);

        jbtcancel.setText("CANCEL");
        jbtcancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtcancelActionPerformed(evt);
            }
        });
        getContentPane().add(jbtcancel);
        jbtcancel.setBounds(310, 300, 80, 25);

        jLabel1.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Register DeliveryMan ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 10, 354, 26);

        jtfname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfnameActionPerformed(evt);
            }
        });
        getContentPane().add(jtfname);
        jtfname.setBounds(200, 90, 180, 30);
        getContentPane().add(jtfCon);
        jtfCon.setBounds(200, 210, 180, 30);

        jLabel2.setFont(new java.awt.Font("Courier New", 0, 15)); // NOI18N
        jLabel2.setText("Username");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 100, 190, 18);

        jLabel6.setFont(new java.awt.Font("Courier New", 0, 15)); // NOI18N
        jLabel6.setText("User ID");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(9, 47, 200, 18);

        jtfID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfIDActionPerformed(evt);
            }
        });
        getContentPane().add(jtfID);
        jtfID.setBounds(200, 50, 180, 30);

        jLabel10.setFont(new java.awt.Font("Courier New", 0, 15)); // NOI18N
        jLabel10.setText("IC Number");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(10, 140, 190, 18);

        jtfIC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfICActionPerformed(evt);
            }
        });
        getContentPane().add(jtfIC);
        jtfIC.setBounds(200, 130, 180, 30);

        jtReset.setText("Reset");
        jtReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtResetActionPerformed(evt);
            }
        });
        getContentPane().add(jtReset);
        jtReset.setBounds(150, 300, 65, 25);

        jLabel5.setFont(new java.awt.Font("Courier New", 0, 15)); // NOI18N
        jLabel5.setText("Status");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 170, 200, 18);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(200, 170, 180, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtaddActionPerformed
        String add = jtfID.getText();
        ResultSet rs = selectRecord(add);
        if (jtfname.getText().length() <= 100) {
            try {
                if (add.equals("")) {
                    JOptionPane.showMessageDialog(null, "Empoyee ID field cannot be empty");
                } else if (jtfname.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Empoyee Name field cannot be empty");
                } else if (jtfIC.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Empoyee IC field cannot be empty");
                } else if (jtfCon.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Employee contact number field cannot be empty");
                } else {
                    if (rs.next()) {
                        JOptionPane.showMessageDialog(null, "This employee ID already exists.", "DUPLICATE RECORD", JOptionPane.ERROR_MESSAGE);
                    } else {

                        String insertStr = "INSERT INTO " + tableName + " VALUES(?,?,?,?)";
                        stmt = conn.prepareStatement(insertStr);
                        stmt.setString(1, add);
                        stmt.setString(2, jtfname.getText());
                        stmt.setString(3, jtfIC.getText());
                        //stmt.setString(4, jtfstatus.getText());
                        stmt.setString(5, jtfCon.getText());

                        stmt.executeUpdate();
                        JOptionPane.showMessageDialog(null, "New Delivery Man '" + jtfname.getText() + "' is added", "Successfully added", JOptionPane.INFORMATION_MESSAGE);
                        clear();
                    }
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_jbtaddActionPerformed

    private void jbtcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtcancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbtcancelActionPerformed

    private void jtfnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfnameActionPerformed

    private void jtfIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfIDActionPerformed

    private void jtfICActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfICActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfICActionPerformed

    private void jtResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtResetActionPerformed
        clear();
    }//GEN-LAST:event_jtResetActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterDM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterDM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterDM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterDM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //RegisterCust cruEmployee = new RegisterCust();
                new RegisterDM().setVisible(true);
                //cruEmployee.setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jbtadd;
    private javax.swing.JButton jbtcancel;
    private javax.swing.JButton jtReset;
    private javax.swing.JTextField jtfCon;
    private javax.swing.JTextField jtfIC;
    private javax.swing.JTextField jtfID;
    private javax.swing.JTextField jtfname;
    // End of variables declaration//GEN-END:variables
    public void clear() {
        jtfID.setText("");
        jtfname.setText("");
        jtfIC.setText("");
        jtfCon.setText("");
        //jtfstatus.setText("");
        

    }

}
