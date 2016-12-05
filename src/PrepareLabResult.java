/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package result_processing_system;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static result_processing_system.sign_up_head.isNumeric;

/**
 *
 * @author RUKUNUJJAMAN MIAJI N
 */
public class PrepareLabResult extends javax.swing.JFrame {

    /**
     * Creates new form PrepareResult
     */
    static Connection con;
    static Statement st;

    DefaultTableModel table_model;
    ResultSet result_set, result_set1, result_set2, result_set3, result_set5;
    ResultSetMetaData result_set_meta_data, result_set_meta_data1;
    
    double gpa, tii;

    public PrepareLabResult() {
        initComponent();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        result_p = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        registration_type = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Chittagong University of Engineering & Technology");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Department of Computer Science & Engineering");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("Prepare Results");

        result_p.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        result_p.setText("Prepare");
        result_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    result_pActionPerformed(evt);
                } catch (SQLException ex) {
                    Logger.getLogger(PrepareResult.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Batch:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Rgistration Type No:");

        registration_type.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"1", "2", "3", "4"}));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addGap(324, 324, 324)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(99, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(101, 101, 101))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(186, 186, 186))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(result_p, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(77, 77, 77))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(67, 67, 67)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                                                .addComponent(registration_type, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(142, 142, 142))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                                .addComponent(registration_type))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
                        .addComponent(result_p, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void result_pActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {
        String batch = jTextField1.getText();
        String register = registration_type.getSelectedItem().toString();
        String credit = "";
        boolean a = isNumeric(batch);
        boolean b = isNumeric(register);
        if (batch.equals("")) {
            JOptionPane.showMessageDialog(this, "Please Insert Student Id and sub no", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (a == false) {
            JOptionPane.showMessageDialog(this, "Please check Student id and confirm it is integer", "Error", JOptionPane.ERROR_MESSAGE);
        }

        int rn = Integer.parseInt(register);
        int p = Integer.parseInt(batch);
        int r = p / 10;
        int t = p % 10;
        int s = (r * 1000000) + (t * 100000) + 4001;
        
        //System.out.println(s);
        for (int k = 1; k <= 70; k++) {
            credit="";
            String query1 = ("SELECT TOTAL_HOUR FROM SUBJECT where SUBJECT_NO= " + k + "");
            result_set1 = st.executeQuery(query1);
            System.out.println(query1);

            st = con.createStatement();

            try {
                while (result_set1.next()) {
                    credit = result_set1.getString("TOTAL_HOUR");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Sign_in_Operator.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (credit.equals("")) {
                tii = 0;
            } else {
                tii = Double.parseDouble(credit);
            }
            //int w=1104028;
            System.out.println(tii);

            String student_ids = "";
            int w = s;
            for (int j = 1; j <= 120; j++) {

                String performances = "";
                String report = "";
                String quizs = "";
                String vivas = "";
                String attendences = "";
                String Level_s = "";
                String Term_t = "";
                String student_idn = "";
                int ti;

                String query12 = ("SELECT STUDENT_ID FROM REGISTRATION_TYPE where STUDENT_ID= " + w + " and SUBJECT_NO=" + k + " and REGISTRATION_TYPE_NO=" + rn + "");

                result_set5 = st.executeQuery(query12);
                System.out.println(query12);

                while (result_set5.next()) {
                    student_idn = result_set5.getString("STUDENT_ID");
                }
                System.out.println(student_idn);
                if (student_idn.equals("")) {
                    ti = 0;
                } else {
                    ti = Integer.parseInt(student_idn);
                }
                System.out.println(ti);

                if ((w == ti) && (tii == 1.5)) {

                    String Query = ("select a.STUDENT_ID,b.COURSE_NO,a.REGISTRATION_TYPE_NO,b.COURSE_NAME,a.NO_OF_TOTAL_CLASS,a.NO_OF_ATTENDED_CLASS,(a.PERFORMANCE + a.REPORT),a.QUIZ,a.VIVA,\n"
                            + "                                    (CASE \n"
                            + "                                      WHEN (round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)>=90)  THEN 15\n"
                            + "                                     WHEN (round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)<90 and round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)>=85)  THEN 13.5\n"
                            + "                                      WHEN (round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)<85 and round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)>=80)  THEN 12\n"
                            + "                                     WHEN (round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)<80 and round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)>=75)  THEN 10.5\n"
                            + "                                      WHEN (round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)<75 and round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)>=70)  THEN 9\n"
                            + "                                      WHEN (round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)<70 and round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)>=65)  THEN 7.5\n"
                            + "                                      WHEN (round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)<65 and round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)>=60)  THEN 6\n"
                            + "                                      ELSE 0 \n"
                            + "                                      END)as student_attendence_marks from LAB_MARKS a \n"
                            + "                                      join SUBJECT b on a.SUBJECT_NO=b.SUBJECT_NO\n"
                            + "                                      where a.STUDENT_ID=" + w + " and a.SUBJECT_NO=" + k + "");
                    System.out.println(Query);
                    result_set = st.executeQuery(Query);

                    try {
                        while (result_set.next()) {
                            student_ids = result_set.getString("STUDENT_ID");
                            performances = result_set.getString("(A.PERFORMANCE+A.REPORT)");
                            quizs = result_set.getString("QUIZ");
                            vivas = result_set.getString("VIVA");
                            attendences = result_set.getString("STUDENT_ATTENDENCE_MARKS");
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(Sign_in_Operator.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    System.out.println(student_ids );
                    System.out.println(performances);
                    System.out.println(vivas);
                    System.out.println(attendences);
                    try {

                        String query2 = ("SELECT a.LEVEL_C,a.TERM FROM SUBJECT a join REGISTRATION_TYPE b on a.SUBJECT_NO =b.SUBJECT_NO\n"
                                + " where b.STUDENT_ID= " + w + " and a.SUBJECT_NO=" + k + " and b.REGISTRATION_TYPE_NO=" + 1 + "");
                        System.out.println(query2);
                        result_set3 = st.executeQuery(query2);

                    } catch (SQLException ex) {
                        Logger.getLogger(Sign_in_Operator.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    try {
                        while (result_set3.next()) {
                            Level_s = result_set3.getString("LEVEL_C");
                            Term_t = result_set3.getString("TERM");

                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(Sign_in_Operator.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    float quizf = Float.parseFloat(quizs);
                    float performancef = Float.parseFloat(performances);
                    float vivaf = Float.parseFloat(vivas);
                    float attendencef = Float.parseFloat(attendences);
                    double result = (double) (quizf + performancef + vivaf + attendencef);

                    if (result >= 120) {
                        gpa = 4.00;
                    } else if (result < 120 && result >= 112.5) {
                        gpa = 3.75;
                    } else if (result < 112.5 && result >= 105) {
                        gpa = 3.50;
                    } else if (result < 105 && result >= 97.5) {
                        gpa = 3.25;
                    } else if (result < 97.5 && result >= 90) {
                        gpa = 3.00;
                    } else if (result < 90 && result >= 82.5) {
                        gpa = 2.75;
                    } else if (result < 82.5 && result >= 75) {
                        gpa = 2.50;
                    } else if (result < 75 && result >= 67.5) {
                        gpa = 2.25;
                    } else if (result < 67.5 && result >= 0) {
                        gpa = 0.00;
                    }

                    System.out.println(gpa);
                    String rq = "insert into FINAL_LAB_RESULT values(" + w + "," + rn + "," + performancef + "," + quizf + "," + vivaf + "," + attendencef + ","+ gpa +"," + Level_s + "," + Term_t + "," + credit + ","+ k +")";
                    System.out.println(rq);

                    st.executeQuery(rq);
                    w++;
                } else if ((w == ti) && (tii == 0.75)) {
                   String Query = ("select a.STUDENT_ID,b.COURSE_NO,a.REGISTRATION_TYPE_NO,b.COURSE_NAME,a.NO_OF_TOTAL_CLASS,a.NO_OF_ATTENDED_CLASS,a.PERFORMANCE + a.REPORT,a.QUIZ,a.VIVA,\n"
                            + "                                    (CASE \n"
                            + "                                      WHEN (round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)>=90)  THEN 7.5\n"
                            + "                                     WHEN (round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)<90 and round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)>=85)  THEN 6.75\n"
                            + "                                      WHEN (round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)<85 and round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)>=80)  THEN 5.00\n"
                            + "                                     WHEN (round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)<80 and round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)>=75)  THEN 4.25\n"
                            + "                                      WHEN (round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)<75 and round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)>=70)  THEN 3.50\n"
                            + "                                      WHEN (round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)<70 and round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)>=65)  THEN 2.75\n"
                            + "                                      WHEN (round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)<65 and round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)>=60)  THEN 2.00\n"
                            + "                                      ELSE 0 \n"
                            + "                                      END)as student_attendence_marks from LAB_MARKS a \n"
                            + "                                      join SUBJECT b on a.SUBJECT_NO=b.SUBJECT_NO\n"
                            + "                                      where a.STUDENT_ID=" + w + " and a.SUBJECT_NO=" + k + "");
                    System.out.println(Query);
                    result_set = st.executeQuery(Query);

                    try {
                        while (result_set.next()) {
                            student_ids = result_set.getString("STUDENT_ID");
                            performances = result_set.getString("a.PERFORMANCE + a.REPORT");
                            quizs = result_set.getString("QUIZ");
                            vivas = result_set.getString("VIVA");
                            attendences = result_set.getString("STUDENT_ATTENDENCE_MARKS");
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(Sign_in_Operator.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    try {

                        String query2 = ("SELECT a.LEVEL_C,a.TERM FROM SUBJECT a join REGISTRATION_TYPE b on a.SUBJECT_NO =b.SUBJECT_NO\n"
                                + " where b.STUDENT_ID= " + w + " and a.SUBJECT_NO=" + k + " and b.REGISTRATION_TYPE_NO=" + rn + "");
                        System.out.println(query2);
                        result_set3 = st.executeQuery(query2);

                    } catch (SQLException ex) {
                        Logger.getLogger(Sign_in_Operator.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    try {
                        while (result_set3.next()) {
                            Level_s = result_set3.getString("LEVEL_C");
                            Term_t = result_set3.getString("TERM");

                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(Sign_in_Operator.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    float quizf = Float.parseFloat(quizs);
                    float performancef = Float.parseFloat(performances);
                    float vivaf = Float.parseFloat(vivas);
                    float attendencef = Float.parseFloat(attendences);
                    double result = (double) (quizf + performancef + vivaf + attendencef);

                    if (result >= 60) {
                        gpa = 4.00;
                    } else if (result < 60 && result >=56.25) {
                        gpa = 3.75;
                    } else if (result < 56.25 && result >= 52.5) {
                        gpa = 3.50;
                    } else if (result < 52.5 && result >= 48.75) {
                        gpa = 3.25;
                    } else if (result < 48.75 && result >= 45) {
                        gpa = 3.00;
                    } else if (result < 45 && result >= 41.25) {
                        gpa = 2.75;
                    } else if (result < 41.25 && result >= 37.5) {
                        gpa = 2.50;
                    } else if (result < 37.5 && result >= 33.75) {
                        gpa = 2.25;
                    } else if (result < 33.75 && result >= 0) {
                        gpa = 0.00;
                    }

                    System.out.println(gpa);
                    String rq = "insert into FINAL_LAB_RESULT values(" + w + "," + k + "," + performancef + "," + quizf + "," + vivaf + "," + attendencef + ", "+ gpa +" ," + Level_s + "," + Term_t + "," + credit + ")";
                    System.out.println(rq);

                    st.executeQuery(rq);
                    w++;
                }
                else
                    w++;

            }
        }
    }

    public void initComponent() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        try {
            con = MakeConnection.getDatabaseConnection();
        } catch (Exception e) {
            System.out.println(e.toString());
        } finally {
            System.out.println("Database Connected");
        }
        try {
            st = con.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(sign_up_head.class.getName()).log(Level.SEVERE, null, ex);
        }
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
            java.util.logging.Logger.getLogger(PrepareLabResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrepareLabResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrepareLabResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrepareLabResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrepareLabResult().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox registration_type;
    private javax.swing.JButton result_p;
    // End of variables declaration                   
}
