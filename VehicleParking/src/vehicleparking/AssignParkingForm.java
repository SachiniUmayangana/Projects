/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicleparking;

import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class AssignParkingForm extends javax.swing.JFrame {

    private String arrivalDate;

    /**
     * Creates new form AssignParkingForm
     */
    public AssignParkingForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        cancelText1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        noText = new javax.swing.JTextField();
        dateText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        arrivalText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        comboOne = new javax.swing.JComboBox<>();
        comboBtn = new javax.swing.JButton();
        typeText = new javax.swing.JTextField();
        slotText = new javax.swing.JButton();
        saveText = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Parchment", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 255));
        jLabel3.setText("SunRise Shopping Complex");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        jPanel1.setBackground(new java.awt.Color(102, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cancelText1.setBackground(new java.awt.Color(204, 204, 204));
        cancelText1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cancelText1.setForeground(new java.awt.Color(153, 0, 51));
        cancelText1.setText("Cancel");
        cancelText1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cancelText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelText1ActionPerformed(evt);
            }
        });
        jPanel1.add(cancelText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 360, 50, 30));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 0));
        jLabel2.setText("Vehicle Number");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, 20));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 0));
        jLabel5.setText("Arrival Date");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, 20));

        noText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noTextActionPerformed(evt);
            }
        });
        jPanel3.add(noText, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 380, 30));
        jPanel3.add(dateText, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 380, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 0));
        jLabel6.setText("Arrival Time");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, -1, 20));
        jPanel3.add(arrivalText, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 380, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 0));
        jLabel4.setText("Vehicle Type");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, 20));

        comboOne.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        comboOne.setForeground(new java.awt.Color(102, 0, 0));
        comboOne.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Car", "Van", " Bus ", "Lorry" }));
        comboOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboOneActionPerformed(evt);
            }
        });
        jPanel3.add(comboOne, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, -1, -1));

        comboBtn.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        comboBtn.setForeground(new java.awt.Color(102, 0, 0));
        comboBtn.setText("Save");
        comboBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBtnActionPerformed(evt);
            }
        });
        jPanel3.add(comboBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, -1, -1));

        typeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeTextActionPerformed(evt);
            }
        });
        jPanel3.add(typeText, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 240, 30));

        slotText.setBackground(new java.awt.Color(204, 204, 204));
        slotText.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        slotText.setForeground(new java.awt.Color(153, 0, 51));
        slotText.setText("View Slot Availability");
        slotText.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        slotText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slotTextActionPerformed(evt);
            }
        });
        jPanel3.add(slotText, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 150, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 760, 230));

        saveText.setBackground(new java.awt.Color(204, 204, 204));
        saveText.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        saveText.setForeground(new java.awt.Color(153, 0, 51));
        saveText.setText("Save Parking");
        saveText.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        saveText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveTextActionPerformed(evt);
            }
        });
        jPanel1.add(saveText, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 150, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveTextActionPerformed
       String vNo = noText.getText();
       String vType = typeText.getText();
       double arrivalTime = Double.parseDouble(arrivalText.getText());     
       String arrivalDate = dateText.getText();
         
        try {
          
            boolean isAdded = VehicleController.addParking(vNo, vType, arrivalTime, arrivalDate);
            if (isAdded) {
                JOptionPane.showMessageDialog(this, "Parking assigned successfully");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Driver not found");
        }
    }//GEN-LAST:event_saveTextActionPerformed

    private void noTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noTextActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_noTextActionPerformed

    private void cancelText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelText1ActionPerformed
        // TODO add your handling code here:V001
         dispose();
    }//GEN-LAST:event_cancelText1ActionPerformed

    private void comboOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboOneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboOneActionPerformed

    private void comboBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBtnActionPerformed
        String item=(String)comboOne.getSelectedItem();

        typeText.setText(item);
    }//GEN-LAST:event_comboBtnActionPerformed

    private void typeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeTextActionPerformed

    private void slotTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slotTextActionPerformed
        

    }//GEN-LAST:event_slotTextActionPerformed

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
            java.util.logging.Logger.getLogger(AssignParkingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AssignParkingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AssignParkingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AssignParkingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AssignParkingForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField arrivalText;
    private javax.swing.JButton cancelText1;
    private javax.swing.JButton comboBtn;
    private javax.swing.JComboBox<String> comboOne;
    private javax.swing.JTextField dateText;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField noText;
    private javax.swing.JButton saveText;
    private javax.swing.JButton slotText;
    private javax.swing.JTextField typeText;
    // End of variables declaration//GEN-END:variables
}
