/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package result_processing_system;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RUKUNUJJAMAN MIAJI N
 */

public class View_Data extends javax.swing.JFrame {

    /**
     * Creates new form Insert_data
     */
    public View_Data() {
        
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        registration = new javax.swing.JButton();
        lab = new javax.swing.JButton();
        final_exam = new javax.swing.JButton();
        attendence = new javax.swing.JButton();
        resultbyid = new javax.swing.JButton();
        resultbylevelandterm = new javax.swing.JButton();
        ct = new javax.swing.JButton();
        resultforall = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Chittagong University of Engineering & Technology");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 61;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(26, 159, 0, 87);
        getContentPane().add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Department of Computer Science & Engineering");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 31;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 260, 0, 0);
        getContentPane().add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("View Data");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 28;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 405, 0, 0);
        getContentPane().add(jLabel3, gridBagConstraints);

        registration.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        registration.setText("Registration");
        registration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrationActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 552;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(40, 100, 0, 0);
        getContentPane().add(registration, gridBagConstraints);

        lab.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lab.setText("Lab Marks");
        lab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 570;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 100, 0, 0);
        getContentPane().add(lab, gridBagConstraints);

        final_exam.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        final_exam.setText("Final Exam Marks");
        final_exam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                final_examActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 504;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 100, 0, 0);
        getContentPane().add(final_exam, gridBagConstraints);

        attendence.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        attendence.setText("Attendence Marks");
        attendence.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attendenceActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 498;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 100, 0, 0);
        getContentPane().add(attendence, gridBagConstraints);

        resultbyid.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        resultbyid.setText("StudentsResultById");
        resultbyid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultbyidActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 484;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 100, 0, 0);
        getContentPane().add(resultbyid, gridBagConstraints);

        resultbylevelandterm.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        resultbylevelandterm.setText("FinalResultByLevelandTerm");
        resultbylevelandterm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultbylevelandtermActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 412;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 100, 48, 0);
        getContentPane().add(resultbylevelandterm, gridBagConstraints);

        ct.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ct.setText("Class Test Marks");
        ct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 514;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 100, 0, 0);
        getContentPane().add(ct, gridBagConstraints);

        resultforall.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        resultforall.setText("FinalResultforAllStudents");
        resultforall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    resultforallActionPerformed(evt);
                } catch (SQLException ex) {
                    Logger.getLogger(View_Data.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 434;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 100, 0, 0);
        getContentPane().add(resultforall, gridBagConstraints);

        pack();
    }// </editor-fold>                        

    private void registrationActionPerformed(java.awt.event.ActionEvent evt) {                                             
        ViewRegistration a = new ViewRegistration();
        a.setVisible(true);
    }                                            

    private void ctActionPerformed(java.awt.event.ActionEvent evt) {                                   
        ViewClassTestMarks a = new ViewClassTestMarks();
        a.setVisible(true);
    }                                  

    private void labActionPerformed(java.awt.event.ActionEvent evt) {                                    
        ViewLabMarks a = new ViewLabMarks();
        a.setVisible(true);
    }                                   

    private void final_examActionPerformed(java.awt.event.ActionEvent evt) {                                           
        ViewFinalExamMarks a = new ViewFinalExamMarks();
        a.setVisible(true);
    }                                          

    private void attendenceActionPerformed(java.awt.event.ActionEvent evt) {                                           
        ViewAttendenceMarks a = new ViewAttendenceMarks();
        a.setVisible(true);
    }                                          

    private void resultbyidActionPerformed(java.awt.event.ActionEvent evt) {                                           
        StudentsResultById a = new StudentsResultById();
        a.setVisible(true);
    }                                          

    private void resultforallActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {                                             
        FinalResultforAllStudents a = new FinalResultforAllStudents();
        a.setVisible(true);
    }                                            

    private void resultbylevelandtermActionPerformed(java.awt.event.ActionEvent evt) {                                                     
       FinalResultByLevelandTerm a = new FinalResultByLevelandTerm();
        a.setVisible(true);
    }                                                    

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
            java.util.logging.Logger.getLogger(View_Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_Data().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton attendence;
    private javax.swing.JButton ct;
    private javax.swing.JButton final_exam;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton lab;
    private javax.swing.JButton registration;
    private javax.swing.JButton resultbyid;
    private javax.swing.JButton resultbylevelandterm;
    private javax.swing.JButton resultforall;
    // End of variables declaration                   
}
