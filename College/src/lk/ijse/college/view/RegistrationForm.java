/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.college.view;

import lk.ijse.college.controller.CourseController;
import lk.ijse.college.controller.RegisterStudentController;
import lk.ijse.college.dto.CourseDTO;
import lk.ijse.college.dto.RegisterDTO;
import lk.ijse.college.dto.StudentDTO;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import lk.ijse.college.entity.Student;

/**
 *
 * @author dell
 */
public class RegistrationForm extends javax.swing.JFrame {

    /**
     * Creates new form RegistrationForm
     * @throws java.lang.Exception
     */
    public RegistrationForm() throws Exception {
        initComponents();
        loadAllStudents();
        loadAllCourses();
        setDate();
        
        
    }
    /*
    private void genarateRegId() {
        try {
            String lastRegId = RegisterStudentController.getLastRegId();
            if (lastRegId != null) {
                
                lastRegId +=1;
                txtRegId.setText(lastRegId);
            } else {
                
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(RegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    */
    private void setDate() {
        String date = LocalDate.now().toString();
        txtDate.setText(date);
    }
   
    public void loadAllStudents() throws Exception{
        
        RegisterStudentController controller=new RegisterStudentController();
        ArrayList<Student> allStudents=controller.getAllStudents();
        for (Student s : allStudents) {
            cmbStID.addItem(s.getId());
        }
        
    }
    
    public void loadAllCourses() throws Exception{
        try {
            CourseController controller=new CourseController();
            ArrayList<CourseDTO> allcourses=controller.getAllCourses();
            for (CourseDTO c : allcourses) {
                cmbCode.addItem(c.getCode());
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(RegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
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
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        lblId3 = new javax.swing.JLabel();
        txtRegFee = new javax.swing.JTextField();
        txtRegId = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        lblId8 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        txtGender = new javax.swing.JTextField();
        txtDob = new javax.swing.JTextField();
        txtContact = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        lblId5 = new javax.swing.JLabel();
        lblId12 = new javax.swing.JLabel();
        lblId11 = new javax.swing.JLabel();
        lblId10 = new javax.swing.JLabel();
        lblId9 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblId7 = new javax.swing.JLabel();
        cmbStID = new javax.swing.JComboBox<>();
        lblId6 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();
        lblId4 = new javax.swing.JLabel();
        cmbCode = new javax.swing.JComboBox<>();
        lblId2 = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        btnAddCourse = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDetails = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 670, 30));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("   Kingsland College");
        jLabel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 210, 40));

        lblId.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lblId.setText("Reg_Date ");
        jPanel1.add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 90, 30));

        txtDate.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        txtDate.setEnabled(false);
        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });
        jPanel1.add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 130, 30));

        lblId3.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lblId3.setText("Reg Fee");
        jPanel1.add(lblId3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        txtRegFee.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        jPanel1.add(txtRegFee, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 100, 30));

        txtRegId.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        txtRegId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegIdActionPerformed(evt);
            }
        });
        jPanel1.add(txtRegId, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 100, 30));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 650, 670, 10));

        lblId8.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lblId8.setText("Reg Id");
        jPanel1.add(lblId8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtGender.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGenderActionPerformed(evt);
            }
        });
        jPanel5.add(txtGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 330, 40));

        txtDob.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtDob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDobActionPerformed(evt);
            }
        });
        jPanel5.add(txtDob, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 330, 40));

        txtContact.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactActionPerformed(evt);
            }
        });
        jPanel5.add(txtContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 330, 40));

        txtAddress.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });
        jPanel5.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 330, 40));

        lblId5.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lblId5.setText("Gender");
        jPanel5.add(lblId5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        lblId12.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lblId12.setText("DOB");
        jPanel5.add(lblId12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        lblId11.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lblId11.setText("Contact");
        jPanel5.add(lblId11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        lblId10.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lblId10.setText("Address");
        jPanel5.add(lblId10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        lblId9.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lblId9.setText("Name");
        jPanel5.add(lblId9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        txtName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        jPanel5.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 330, 40));

        lblId7.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lblId7.setText("Select Student Id");
        jPanel5.add(lblId7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        cmbStID.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cmbStID.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbStIDItemStateChanged(evt);
            }
        });
        jPanel5.add(cmbStID, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 100, 30));

        lblId6.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lblId6.setText("Student Id");
        jPanel5.add(lblId6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

        txtId.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        jPanel5.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 70, 30));

        btnAdd.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel5.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, -1, -1));

        btnRegister.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnRegister.setText("Register Student");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        jPanel5.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, -1, 60));

        lblId4.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lblId4.setText("Select Course Code");
        jPanel5.add(lblId4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 160, -1));

        cmbCode.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cmbCode.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCodeItemStateChanged(evt);
            }
        });
        jPanel5.add(cmbCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 100, 30));

        lblId2.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lblId2.setText("Course Code");
        jPanel5.add(lblId2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 110, -1));

        txtCode.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodeActionPerformed(evt);
            }
        });
        jPanel5.add(txtCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 70, 30));

        btnAddCourse.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnAddCourse.setText("Add Course");
        btnAddCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCourseActionPerformed(evt);
            }
        });
        jPanel5.add(btnAddCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 110, 50));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 470, 470));

        tblDetails.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tblDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "St_Id", "St_Name", "Address", "Course_Id"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblDetails.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tblDetails);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 670, 650, 130));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 820));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRegIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRegIdActionPerformed

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed

    private void cmbStIDItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbStIDItemStateChanged
        
        try {
         String id = cmbStID.getSelectedItem().toString();
            RegisterStudentController controller=new RegisterStudentController();
            Student student = controller.searchStudent(id);
        
            if(student!=null){
            txtId.setText(student.getId());
            txtName.setText(student.getStudentName());
            txtAddress.setText(student.getAddress());
            txtContact.setText(student.getContact());
            txtDob.setText(student.getDob());
            txtGender.setText(student.getGender());
            }else{
                JOptionPane.showMessageDialog(this, "Student not found");
            }
            
        } catch (Exception ex) {
        Logger.getLogger(RegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_cmbStIDItemStateChanged

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
      
       String id=txtId.getText();
       String name=txtName.getText();
       String address=txtAddress.getText();
       String contact=txtContact.getText();
       String dob=txtDob.getText();
       String gender=txtGender.getText();
       ArrayList<RegisterDTO> allRegisters;
        
       
       Student student=new Student(id, name, address, contact, dob, gender);
       
       int regNo=Integer.parseInt(txtRegId.getText());
       String regDate=txtDate.getText();
       double regFee=Double.parseDouble(txtRegFee.getText());
       
       DefaultTableModel dtm=(DefaultTableModel) tblDetails.getModel();
       
       ArrayList<RegisterDTO> registration=new ArrayList<>();
       
        for (int i = 0; i < dtm.getRowCount(); i++) {
           String courseCode=(String) dtm.getValueAt(i, 3); 
           RegisterDTO regi=new RegisterDTO(regNo, regDate, regFee, id, courseCode);
            registration.add(regi);
        }
                StudentDTO dto=new StudentDTO(id, name, address, contact, dob, gender, registration);

       RegisterStudentController ctrl = new RegisterStudentController();
        boolean isAdded=ctrl.registerStudent(dto);
        if(isAdded){
            JOptionPane.showMessageDialog(this, "Student Registered");
        }else{
            JOptionPane.showMessageDialog(this, "Student not Registered");

        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactActionPerformed

    private void txtDobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDobActionPerformed

    private void txtGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGenderActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
      String id=txtId.getText();
      String name=txtName.getText();
      String address=txtAddress.getText();
      String code=txtCode.getText();
     
      
      DefaultTableModel mode = (DefaultTableModel) tblDetails.getModel();
        
         Object[] rowData = {id, name, address, code};

            mode.addRow(rowData);
    }//GEN-LAST:event_btnAddActionPerformed

    private void cmbCodeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCodeItemStateChanged
        try {
            String code=cmbCode.getSelectedItem().toString();
            CourseController controller=new CourseController();
            CourseDTO dto=controller.searchCourse(code);
            if(dto!=null){
                txtCode.setText(dto.getCode());
                
            }else{
                JOptionPane.showMessageDialog(this, "Course not found");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(RegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(RegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmbCodeItemStateChanged

    private void txtCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodeActionPerformed

    private void btnAddCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCourseActionPerformed
        CourseForm form=new CourseForm();
        form.setVisible(true);
    }//GEN-LAST:event_btnAddCourseActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new RegistrationForm().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(RegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAddCourse;
    private javax.swing.JButton btnRegister;
    private javax.swing.JComboBox<String> cmbCode;
    private javax.swing.JComboBox<String> cmbStID;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblId10;
    private javax.swing.JLabel lblId11;
    private javax.swing.JLabel lblId12;
    private javax.swing.JLabel lblId2;
    private javax.swing.JLabel lblId3;
    private javax.swing.JLabel lblId4;
    private javax.swing.JLabel lblId5;
    private javax.swing.JLabel lblId6;
    private javax.swing.JLabel lblId7;
    private javax.swing.JLabel lblId8;
    private javax.swing.JLabel lblId9;
    private javax.swing.JTable tblDetails;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtDob;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtRegFee;
    private javax.swing.JTextField txtRegId;
    // End of variables declaration//GEN-END:variables

    
}
