/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fooddelivery;
import java.awt.Image;
import java.io.File;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
/**
 *
 * @author Ruzz
 */
public class JTabel_Restaurant extends javax.swing.JFrame {

    /**
     * Creates new form JTabel_Restaurant
     */
    public JTabel_Restaurant() {
        initComponents();
        getImagesName();
    }
    
    JFrame_Display_Images jsi = new JFrame_Display_Images();
    
            
    public void getImagesName(){
        File file = new File(getClass().getResource("/Images/").getFile());
        Object[] files = file.list();
        DefaultTableModel model =(DefaultTableModel)jTable_List_Images.getModel();
        model.setColumnIdentifiers(new String[]{"Images Names"});
        Object [] row = new Object[1];
        for(int i = 0 ; i < files.length; i++){
            row[0] = files[i];
            model.addRow(row);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_List_Images = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable_List_Images.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable_List_Images.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_List_ImagesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_List_Images);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable_List_ImagesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_List_ImagesMouseClicked
       
        int index = jTable_List_Images.getSelectedRow();
        TableModel model = jTable_List_Images.getModel();
        String imageName = model.getValueAt(index, 0).toString();
        jsi.setVisible(true);
        jsi.pack();
        jsi.setLocationRelativeTo(null);
        jsi.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        ImageIcon icon = new ImageIcon(getClass().getResource("/Images/" + imageName));
        Image img = icon.getImage().getScaledInstance(jsi.jLabel_Show_Images.getWidth(), jsi.jLabel_Show_Images.getHeight(),
        Image.SCALE_SMOOTH);
        jsi.jLabel_Show_Images.setIcon(new ImageIcon(img));
    }//GEN-LAST:event_jTable_List_ImagesMouseClicked

  
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
            java.util.logging.Logger.getLogger(JTabel_Restaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JTabel_Restaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JTabel_Restaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JTabel_Restaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JTabel_Restaurant().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_List_Images;
    // End of variables declaration//GEN-END:variables
}
