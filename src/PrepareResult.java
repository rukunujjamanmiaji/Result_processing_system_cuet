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
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RUKUNUJJAMAN MIAJI N
 */
public class PrepareResult extends javax.swing.JFrame {

    /**
     * Creates new form PrepareResult
     */
    static Connection con;
    static Statement st;

    DefaultTableModel table_model;
    ResultSet result_set, result_set1, result_set2, result_set3, result_set5;
    ResultSetMetaData result_set_meta_data, result_set_meta_data1;
    double gpa, tii;

    public PrepareResult() {
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

        int rn = Integer.parseInt(register);
        int p = Integer.parseInt(batch);
        int r = p / 10;
        int t = p % 10;
        int s = (r * 1000000) + (t * 100000) + 4001;
        //System.out.println(s);
        if (rn == 1) {
            for (int k = 1; k <= 70; k++) {
                int w = s;
                credit = "";
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
                for (int j = 1; j <= 120; j++) {

                    String ct1 = "";
                    String ct2 = "";
                    String ct3 = "";
                    String ct4 = "";
                    String attendence_maks_total = "";

                    String FinalMarks = "";
                    String Registration = "";

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
                    if ((w == ti) && (tii == 3.00)) {
                        //class Test
                        try {

                            String query = ("SELECT * FROM CLASS_TEST where STUDENT_ID= " + w + " and SUBJECT_NO=" + k + " and REGISTRATION_TYPE_NO=" + rn + "");
                            System.out.println(query);
                            result_set = st.executeQuery(query);

                        } catch (SQLException ex) {
                            Logger.getLogger(Sign_in_Operator.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        try {
                            while (result_set.next()) {
                                ct1 = result_set.getString("CLASS_TEST_1");
                                ct2 = result_set.getString("CLASS_TEST_2");
                                ct3 = result_set.getString("CLASS_TEST_3");
                                ct4 = result_set.getString("CLASS_TEST_4");
                            }
                        } catch (SQLException ex) {
                            Logger.getLogger(Sign_in_Operator.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        int ct1in = Integer.parseInt(ct1);
                        int ct2in = Integer.parseInt(ct2);
                        int ct3in = Integer.parseInt(ct3);
                        int ct4in = Integer.parseInt(ct4);

                        int CT_Num[] = new int[]{ct1in, ct2in, ct3in, ct4in};
                        int Total_Best = 0;
                        Arrays.sort(CT_Num);
                        for (int i = 1; i < CT_Num.length; i++) {
                            Total_Best += CT_Num[i];
                        }

                        //attendence
                        String attendence = "select round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2) as marks,\n"
                                + "(CASE \n"
                                + "  WHEN (round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)>=90)  THEN 30\n"
                                + "  WHEN (round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)<90 and round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)>=85)  THEN 27\n"
                                + "  WHEN (round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)<85 and round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)>=80)  THEN 24\n"
                                + "  WHEN (round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)<80 and round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)>=75)  THEN 21\n"
                                + "  WHEN (round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)<75 and round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)>=70)  THEN 18\n"
                                + "  WHEN (round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)<70 and round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)>=65)  THEN 15\n"
                                + "  WHEN (round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)<65 and round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)>=60)  THEN 12\n"
                                + "  ELSE 0 \n"
                                + "  END)as student_attendence_marks from ATTENDENCE_MARKS a \n"
                                + "  where STUDENT_ID= " + w + " and SUBJECT_NO=" + k + " and REGISTRATION_TYPE_NO=" + rn + "";

                        System.out.println(attendence);
                        result_set1 = st.executeQuery(attendence);

                        try {
                            while (result_set1.next()) {
                                attendence_maks_total = result_set1.getString("student_attendence_marks");
                            }
                        } catch (SQLException ex) {
                            Logger.getLogger(Sign_in_Operator.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        System.out.println(attendence_maks_total);

                        //final exam
                        try {

                            String query4 = ("SELECT (SECTION_A + SECTION_B)as final_total,REGISTRATION_TYPE_NO FROM FINAL_EXAM where STUDENT_ID= " + w + " and SUBJECT_NO=" + k + " and REGISTRATION_TYPE_NO=" + rn + "");
                            System.out.println(query4);
                            result_set2 = st.executeQuery(query4);

                        } catch (SQLException ex) {
                            Logger.getLogger(Sign_in_Operator.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        try {
                            while (result_set2.next()) {
                                FinalMarks = result_set2.getString("final_total");

                            }
                        } catch (SQLException ex) {
                            Logger.getLogger(Sign_in_Operator.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        System.out.println(FinalMarks);

                        //level and term
                        try {

                            String query2 = ("SELECT a.LEVEL_C,a.TERM FROM SUBJECT a"
                                    + " join ATTENDENCE_MARKS b on a.SUBJECT_NO=b.SUBJECT_NO\n"
                                    + " where b.STUDENT_ID= " + w + " and b.SUBJECT_NO=" + k + " and REGISTRATION_TYPE_NO=" + rn + "");
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
                         int att = Integer.parseInt(attendence_maks_total);
                        int finalmar = Integer.parseInt(FinalMarks);
                        double result = (double) (Total_Best + finalmar + att);

                        if (result >= 240.0) {
                            gpa = 4.00;
                        } else if (result < 240 && result >= 225) {
                            gpa = 3.75;
                        } else if (result < 225 && result >= 210) {
                            gpa = 3.50;
                        } else if (result < 210 && result >= 195) {
                            gpa = 3.25;
                        } else if (result < 195&& result >= 180) {
                            gpa = 3.00;
                        } else if (result < 180 && result >= 165) {
                            gpa = 2.75;
                        } else if (result < 165 && result >= 150) {
                            gpa = 2.50;
                        } else if (result < 150 && result >= 135) {
                            gpa = 2.25;
                        } else if (result < 135 && result >= 120) {
                            gpa = 2.00;
                        } else if (result < 120) {
                            gpa = 0.0;
                        }

                        System.out.println(gpa);
                        String rq = "insert into FINAL_RESULT values(" + w + "," + k + "," + Total_Best + "," + FinalMarks + "," + attendence_maks_total + "," + rn + "," + Level_s + "," + Term_t + ","+ tii+ ","+gpa +")";
                        System.out.println(rq);

                        st.executeQuery(rq);

                        w++;
                    } else if ((w == ti) && (tii == 2.00)) {
                        try {
                            String query = ("SELECT * FROM CLASS_TEST where STUDENT_ID= " + w + " and SUBJECT_NO=" + k + " and REGISTRATION_TYPE_NO=" + rn + "");
                            System.out.println(query);
                            result_set = st.executeQuery(query);

                        } catch (SQLException ex) {
                            Logger.getLogger(Sign_in_Operator.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        try {
                            while (result_set.next()) {
                                ct1 = result_set.getString("CLASS_TEST_1");
                                ct2 = result_set.getString("CLASS_TEST_2");
                                ct3 = result_set.getString("CLASS_TEST_3");
                                ct4 = result_set.getString("CLASS_TEST_4");
                            }
                        } catch (SQLException ex) {
                            Logger.getLogger(Sign_in_Operator.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        int ct1in = Integer.parseInt(ct1);
                        int ct2in = Integer.parseInt(ct2);
                        int ct3in = Integer.parseInt(ct3);
                        int ct4in = Integer.parseInt(ct4);

                        int CT_Num[] = new int[]{ct1in, ct2in, ct3in, ct4in};
                        int Total_Best = 0;
                        Arrays.sort(CT_Num);
                        for (int i = 1; i < CT_Num.length-1; i++) {
                            Total_Best += CT_Num[i];
                        }

                        //attendence
                        String attendence = "select round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2) as marks,\n"
                                + "(CASE \n"
                                + "  WHEN (round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)>=90)  THEN 20\n"
                                + "  WHEN (round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)<90 and round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)>=85)  THEN 18\n"
                                + "  WHEN (round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)<85 and round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)>=80)  THEN 16\n"
                                + "  WHEN (round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)<80 and round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)>=75)  THEN 14\n"
                                + "  WHEN (round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)<75 and round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)>=70)  THEN 12\n"
                                + "  WHEN (round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)<70 and round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)>=65)  THEN 10\n"
                                + "  WHEN (round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)<65 and round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)>=60)  THEN 8\n"
                                + "  ELSE 0 \n"
                                + "  END)as student_attendence_marks from ATTENDENCE_MARKS a \n"
                                + "  where STUDENT_ID= " + w + " and SUBJECT_NO=" + k + " and REGISTRATION_TYPE_NO=" + rn + "";

                        System.out.println(attendence);
                        result_set1 = st.executeQuery(attendence);

                        try {
                            while (result_set1.next()) {
                                attendence_maks_total = result_set1.getString("student_attendence_marks");
                            }
                        } catch (SQLException ex) {
                            Logger.getLogger(Sign_in_Operator.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        System.out.println(attendence_maks_total);

                        //final exam
                        try {

                            String query4 = ("SELECT (SECTION_A + SECTION_B)as final_total,REGISTRATION_TYPE_NO FROM FINAL_EXAM where STUDENT_ID= " + w + " and SUBJECT_NO=" + k + " and REGISTRATION_TYPE_NO=" + rn + "");
                            System.out.println(query4);
                            result_set2 = st.executeQuery(query4);

                        } catch (SQLException ex) {
                            Logger.getLogger(Sign_in_Operator.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        try {
                            while (result_set2.next()) {
                                FinalMarks = result_set2.getString("final_total");

                            }
                        } catch (SQLException ex) {
                            Logger.getLogger(Sign_in_Operator.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        System.out.println(FinalMarks);

                        //level and term
                        try {

                            String query2 = ("SELECT a.LEVEL_C,a.TERM FROM SUBJECT a"
                                    + " join ATTENDENCE_MARKS b on a.SUBJECT_NO=b.SUBJECT_NO\n"
                                    + " where b.STUDENT_ID= " + w + " and b.SUBJECT_NO=" + k + " and REGISTRATION_TYPE_NO=" + rn + "");
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
                        int att = Integer.parseInt(attendence_maks_total);
                        int finalmar = Integer.parseInt(FinalMarks);
                        double result = (double) (Total_Best + finalmar + att);

                        if (result >= 160.0) {
                            gpa = 4.00;
                        } else if (result < 160 && result >= 150) {
                            gpa = 3.75;
                        } else if (result < 150 && result >= 140) {
                            gpa = 3.50;
                        } else if (result < 140 && result >= 130) {
                            gpa = 3.25;
                        } else if (result < 130 && result >= 120) {
                            gpa = 3.00;
                        } else if (result < 120 && result >= 110) {
                            gpa = 2.75;
                        } else if (result < 110 && result >= 100) {
                            gpa = 2.50;
                        } else if (result < 100 && result >= 90) {
                            gpa = 2.25;
                        } else if (result < 90 && result >= 80) {
                            gpa = 2.00;
                        } else if (result < 80) {
                            gpa = 0.0;
                        }

                        System.out.println(gpa);
                        String rq = "insert into FINAL_RESULT values(" + w + "," + k + "," + Total_Best + "," + FinalMarks + "," + attendence_maks_total + "," + rn + "," + Level_s + "," + Term_t + "," + tii + "," + gpa + ")";
                        System.out.println(rq);

                        st.executeQuery(rq);

                        w++;
                    } else if ((w == ti) && (tii == 4.00)) {
                        try {
                            String query = ("SELECT * FROM CLASS_TEST where STUDENT_ID= " + w + " and SUBJECT_NO=" + k + " and REGISTRATION_TYPE_NO=" + rn + "");
                            System.out.println(query);
                            result_set = st.executeQuery(query);

                        } catch (SQLException ex) {
                            Logger.getLogger(Sign_in_Operator.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        try {
                            while (result_set.next()) {
                                ct1 = result_set.getString("CLASS_TEST_1");
                                ct2 = result_set.getString("CLASS_TEST_2");
                                ct3 = result_set.getString("CLASS_TEST_3");
                                ct4 = result_set.getString("CLASS_TEST_4");
                            }
                        } catch (SQLException ex) {
                            Logger.getLogger(Sign_in_Operator.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        int ct1in = Integer.parseInt(ct1);
                        int ct2in = Integer.parseInt(ct2);
                        int ct3in = Integer.parseInt(ct3);
                        int ct4in = Integer.parseInt(ct4);

                        int CT_Num[] = new int[]{ct1in, ct2in, ct3in, ct4in};
                        int Total_Best = 0;
                        Arrays.sort(CT_Num);
                        for (int i = 1; i < CT_Num.length; i++) {
                            Total_Best += CT_Num[i];
                        }

                        //attendence
                        String attendence = "select round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2) as marks,\n"
                                + "(CASE \n"
                                + "  WHEN (round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)>=90)  THEN 20\n"
                                + "  WHEN (round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)<90 and round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)>=85)  THEN 18\n"
                                + "  WHEN (round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)<85 and round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)>=80)  THEN 16\n"
                                + "  WHEN (round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)<80 and round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)>=75)  THEN 14\n"
                                + "  WHEN (round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)<75 and round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)>=70)  THEN 12\n"
                                + "  WHEN (round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)<70 and round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)>=65)  THEN 10\n"
                                + "  WHEN (round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)<65 and round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)>=60)  THEN 8\n"
                                + "  ELSE 0 \n"
                                + "  END)as student_attendence_marks from ATTENDENCE_MARKS a \n"
                                + "  where STUDENT_ID= " + w + " and SUBJECT_NO=" + k + " and REGISTRATION_TYPE_NO=" + rn + "";

                        System.out.println(attendence);
                        result_set1 = st.executeQuery(attendence);

                        try {
                            while (result_set1.next()) {
                                attendence_maks_total = result_set1.getString("student_attendence_marks");
                            }
                        } catch (SQLException ex) {
                            Logger.getLogger(Sign_in_Operator.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        System.out.println(attendence_maks_total);

                        //final exam
                        try {

                            String query4 = ("SELECT (SECTION_A + SECTION_B)as final_total,REGISTRATION_TYPE_NO FROM FINAL_EXAM where STUDENT_ID= " + w + " and SUBJECT_NO=" + k + " and REGISTRATION_TYPE_NO=" + rn + "");
                            System.out.println(query4);
                            result_set2 = st.executeQuery(query4);

                        } catch (SQLException ex) {
                            Logger.getLogger(Sign_in_Operator.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        try {
                            while (result_set2.next()) {
                                FinalMarks = result_set2.getString("final_total");

                            }
                        } catch (SQLException ex) {
                            Logger.getLogger(Sign_in_Operator.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        System.out.println(FinalMarks);

                        //level and term
                        try {

                            String query2 = ("SELECT a.LEVEL_C,a.TERM FROM SUBJECT a"
                                    + " join ATTENDENCE_MARKS b on a.SUBJECT_NO=b.SUBJECT_NO\n"
                                    + " where b.STUDENT_ID= " + w + " and b.SUBJECT_NO=" + k + " and REGISTRATION_TYPE_NO=" + rn + "");
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
                        int att = Integer.parseInt(attendence_maks_total);
                        int finalmar = Integer.parseInt(FinalMarks);
                        double result = (double) (Total_Best + finalmar + att);

                        if (result >= 320) {
                            gpa = 4.00;
                        } else if (result < 320 && result >= 300) {
                            gpa = 3.75;
                        } else if (result < 300 && result >= 280) {
                            gpa = 3.50;
                        } else if (result < 280 && result >= 260) {
                            gpa = 3.25;
                        } else if (result < 260 && result >= 240) {
                            gpa = 3.00;
                        } else if (result < 240 && result >= 220) {
                            gpa = 2.75;
                        } else if (result < 220 && result >= 200) {
                            gpa = 2.50;
                        } else if (result < 200 && result >= 180) {
                            gpa = 2.25;
                        } else if (result < 180 && result >= 160) {
                            gpa = 2.00;
                        } else if (result < 160) {
                            gpa = 0.0;
                        }

                        System.out.println(gpa);
                        String rq = "insert into FINAL_RESULT values(" + w + "," + k + "," + Total_Best + "," + FinalMarks + "," + attendence_maks_total + "," + rn + "," + Level_s + "," + Term_t + "," + tii + "," + gpa + ")";
                        System.out.println(rq);

                        st.executeQuery(rq);

                        w++;
                    } else {
                        w++;
                    }
                }
            }
        } else if (rn == 2) {
            for (int k = 1; k <= 70; k++) {
                int w = s;
                credit = "";
                String query1 = ("SELECT TOTAL_HOUR FROM SUBJECT where SUBJECT_NO= " + k + "");
                result_set1 = st.executeQuery(query1);
                System.out.println(query1);

                

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
                for (int j = 1; j <= 120; j++) {

                    String ct1 = "";
                    String ct2 = "";
                    String ct3 = "";
                    String ct4 = "";
                    String attendence_maks_total = "";

                    String FinalMarks = "";
                    String Registration = "";

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
                    if ((w == ti) && (tii == 3.00)) {
                        //class Test
                        try {
                            String query = ("SELECT * FROM CLASS_TEST where STUDENT_ID= " + w + " and SUBJECT_NO=" + k + " and REGISTRATION_TYPE_NO=" + 1 + "");
                            System.out.println(query);
                            result_set = st.executeQuery(query);
                        } catch (SQLException ex) {
                            Logger.getLogger(Sign_in_Operator.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        try {
                            while (result_set.next()) {
                                ct1 = result_set.getString("CLASS_TEST_1");
                                ct2 = result_set.getString("CLASS_TEST_2");
                                ct3 = result_set.getString("CLASS_TEST_3");
                                ct4 = result_set.getString("CLASS_TEST_4");
                            }
                        } catch (SQLException ex) {
                            Logger.getLogger(Sign_in_Operator.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    
                        int ct1in = Integer.parseInt(ct1);
                        int ct2in = Integer.parseInt(ct2);
                        int ct3in = Integer.parseInt(ct3);
                        int ct4in = Integer.parseInt(ct4);

                        int CT_Num[] = new int[]{ct1in, ct2in, ct3in, ct4in};
                        int Total_Best = 0;
                        Arrays.sort(CT_Num);
                        for (int i = 1; i < CT_Num.length; i++) {
                            Total_Best += CT_Num[i];
                        }

                        //attendence
                        String attendence = "select round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2) as marks,\n"
                                + "(CASE \n"
                                + "  WHEN (round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)>=90)  THEN 30\n"
                                + "  WHEN (round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)<90 and round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)>=85)  THEN 27\n"
                                + "  WHEN (round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)<85 and round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)>=80)  THEN 24\n"
                                + "  WHEN (round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)<80 and round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)>=75)  THEN 21\n"
                                + "  WHEN (round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)<75 and round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)>=70)  THEN 18\n"
                                + "  WHEN (round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)<70 and round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)>=65)  THEN 15\n"
                                + "  WHEN (round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)<65 and round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)>=60)  THEN 12\n"
                                + "  ELSE 0 \n"
                                + "  END)as student_attendence_marks from ATTENDENCE_MARKS a \n"
                                + "  where STUDENT_ID= " + w + " and SUBJECT_NO=" + k + " and REGISTRATION_TYPE_NO=" + 1 + "";

                        System.out.println(attendence);
                        result_set1 = st.executeQuery(attendence);

                        try {
                            while (result_set1.next()) {
                                attendence_maks_total = result_set1.getString("student_attendence_marks");
                            }
                        } catch (SQLException ex) {
                            Logger.getLogger(Sign_in_Operator.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        System.out.println(attendence_maks_total);

                        //final exam
                        try {

                            String query4 = ("SELECT (SECTION_A + SECTION_B)as final_total,REGISTRATION_TYPE_NO FROM FINAL_EXAM where STUDENT_ID= " + w + " and SUBJECT_NO=" + k + " and REGISTRATION_TYPE_NO=" + rn + "");
                            System.out.println(query4);
                            result_set2 = st.executeQuery(query4);

                        } catch (SQLException ex) {
                            Logger.getLogger(Sign_in_Operator.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        try {
                            while (result_set2.next()) {
                                FinalMarks = result_set2.getString("final_total");

                            }
                        } catch (SQLException ex) {
                            Logger.getLogger(Sign_in_Operator.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        System.out.println(FinalMarks);

                        //level and term
                        try {

                            String query2 = ("SELECT a.LEVEL_C,a.TERM FROM SUBJECT a"
                                    + " join ATTENDENCE_MARKS b on a.SUBJECT_NO=b.SUBJECT_NO\n"
                                    + " where b.STUDENT_ID= " + w + " and b.SUBJECT_NO=" + k + " and REGISTRATION_TYPE_NO=" + 1 + "");
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
                        int att = Integer.parseInt(attendence_maks_total);
                        int finalmar = Integer.parseInt(FinalMarks);
                        double result = (double) (Total_Best + finalmar + att);

                        if (result >= 240.0) {
                            gpa = 3.00;
                        } else if (result < 240 && result >= 225) {
                            gpa = 3.00;
                        } else if (result < 225 && result >= 210) {
                            gpa = 3.00;
                        } else if (result < 210 && result >= 195) {
                            gpa = 3.00;
                        } else if (result < 195&& result >= 180) {
                            gpa = 3.00;
                        } else if (result < 180 && result >= 165) {
                            gpa = 2.75;
                        } else if (result < 165 && result >= 150) {
                            gpa = 2.50;
                        } else if (result < 150 && result >= 135) {
                            gpa = 2.25;
                        } else if (result < 135 && result >= 120) {
                            gpa = 2.00;
                        } else if (result < 120) {
                            gpa = 0.0;
                        }

                      String rq = "insert into FINAL_RESULT values(" + w + "," + k + "," + Total_Best + "," + FinalMarks + "," + attendence_maks_total + "," + rn + "," + Level_s + "," + Term_t + ","+ tii+ ","+ gpa +")";
                        System.out.println(rq);

                        st.executeQuery(rq);

                        w++;
                    } else if ((w == ti) && (tii == 2.00)) {
                        try {
                            String query = ("SELECT * FROM CLASS_TEST where STUDENT_ID= " + w + " and SUBJECT_NO=" + k + " and REGISTRATION_TYPE_NO=" + 1 + "");
                            System.out.println(query);
                            result_set = st.executeQuery(query);

                        } catch (SQLException ex) {
                            Logger.getLogger(Sign_in_Operator.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        try {
                            while (result_set.next()) {
                                ct1 = result_set.getString("CLASS_TEST_1");
                                ct2 = result_set.getString("CLASS_TEST_2");
                                ct3 = result_set.getString("CLASS_TEST_3");
                                ct4 = result_set.getString("CLASS_TEST_4");
                            }
                        } catch (SQLException ex) {
                            Logger.getLogger(Sign_in_Operator.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        int ct1in = Integer.parseInt(ct1);
                        int ct2in = Integer.parseInt(ct2);
                        int ct3in = Integer.parseInt(ct3);
                        int ct4in = Integer.parseInt(ct4);

                        int CT_Num[] = new int[]{ct1in, ct2in, ct3in, ct4in};
                        int Total_Best = 0;
                        Arrays.sort(CT_Num);
                        for (int i = 1; i < CT_Num.length-1; i++) {
                            Total_Best += CT_Num[i];
                        }

                        //attendence
                        String attendence = "select round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2) as marks,\n"
                                + "(CASE \n"
                                + "  WHEN (round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)>=90)  THEN 20\n"
                                + "  WHEN (round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)<90 and round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)>=85)  THEN 18\n"
                                + "  WHEN (round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)<85 and round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)>=80)  THEN 16\n"
                                + "  WHEN (round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)<80 and round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)>=75)  THEN 14\n"
                                + "  WHEN (round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)<75 and round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)>=70)  THEN 12\n"
                                + "  WHEN (round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)<70 and round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)>=65)  THEN 10\n"
                                + "  WHEN (round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)<65 and round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)>=60)  THEN 8\n"
                                + "  ELSE 0 \n"
                                + "  END)as student_attendence_marks from ATTENDENCE_MARKS a \n"
                                + "  where STUDENT_ID= " + w + " and SUBJECT_NO=" + k + " and REGISTRATION_TYPE_NO=" + 1 + "";

                        System.out.println(attendence);
                        result_set1 = st.executeQuery(attendence);

                        try {
                            while (result_set1.next()) {
                                attendence_maks_total = result_set1.getString("student_attendence_marks");
                            }
                        } catch (SQLException ex) {
                            Logger.getLogger(Sign_in_Operator.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        System.out.println(attendence_maks_total);

                        //final exam
                        try {

                            String query4 = ("SELECT (SECTION_A + SECTION_B)as final_total,REGISTRATION_TYPE_NO FROM FINAL_EXAM where STUDENT_ID= " + w + " and SUBJECT_NO=" + k + " and REGISTRATION_TYPE_NO=" + rn + "");
                            System.out.println(query4);
                            result_set2 = st.executeQuery(query4);

                        } catch (SQLException ex) {
                            Logger.getLogger(Sign_in_Operator.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        try {
                            while (result_set2.next()) {
                                FinalMarks = result_set2.getString("final_total");

                            }
                        } catch (SQLException ex) {
                            Logger.getLogger(Sign_in_Operator.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        System.out.println(FinalMarks);

                        //level and term
                        try {

                            String query2 = ("SELECT a.LEVEL_C,a.TERM FROM SUBJECT a"
                                    + " join ATTENDENCE_MARKS b on a.SUBJECT_NO=b.SUBJECT_NO\n"
                                    + " where b.STUDENT_ID= " + w + " and b.SUBJECT_NO=" + k + " and REGISTRATION_TYPE_NO=" + 1 + "");
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
                        int att = Integer.parseInt(attendence_maks_total);
                        int finalmar = Integer.parseInt(FinalMarks);
                        double result = (double) (Total_Best + finalmar + att);

                        if (result >= 160.0) {
                            gpa = 3.00;
                        } else if (result < 160 && result >= 150) {
                            gpa = 3.00;
                        } else if (result < 150 && result >= 140) {
                            gpa = 3.00;
                        } else if (result < 140 && result >= 130) {
                            gpa = 3.00;
                        } else if (result < 130 && result >= 120) {
                            gpa = 3.00;
                        } else if (result < 120 && result >= 110) {
                            gpa = 2.75;
                        } else if (result < 110 && result >= 100) {
                            gpa = 2.50;
                        } else if (result < 100 && result >= 90) {
                            gpa = 2.25;
                        } else if (result < 90 && result >= 80) {
                            gpa = 2.00;
                        } else if (result < 80) {
                            gpa = 0.0;
                        }

                        System.out.println(gpa);
                        String rq = "insert into FINAL_RESULT values(" + w + "," + k + "," + Total_Best + "," + FinalMarks + "," + attendence_maks_total + "," + rn + "," + Level_s + "," + Term_t + "," + tii + "," + gpa + ")";
                        System.out.println(rq);

                        st.executeQuery(rq);

                        w++;
                    } else if ((w == ti) && (tii == 4.00)) {
                        try {
                            String query = ("SELECT * FROM CLASS_TEST where STUDENT_ID= " + w + " and SUBJECT_NO=" + k + " and REGISTRATION_TYPE_NO=" + 1 + "");
                            System.out.println(query);
                            result_set = st.executeQuery(query);

                        } catch (SQLException ex) {
                            Logger.getLogger(Sign_in_Operator.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        try {
                            while (result_set.next()) {
                                ct1 = result_set.getString("CLASS_TEST_1");
                                ct2 = result_set.getString("CLASS_TEST_2");
                                ct3 = result_set.getString("CLASS_TEST_3");
                                ct4 = result_set.getString("CLASS_TEST_4");
                            }
                        } catch (SQLException ex) {
                            Logger.getLogger(Sign_in_Operator.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        int ct1in = Integer.parseInt(ct1);
                        int ct2in = Integer.parseInt(ct2);
                        int ct3in = Integer.parseInt(ct3);
                        int ct4in = Integer.parseInt(ct4);

                        int CT_Num[] = new int[]{ct1in, ct2in, ct3in, ct4in};
                        int Total_Best = 0;
                        Arrays.sort(CT_Num);
                        for (int i = 1; i <= CT_Num.length; i++) {
                            Total_Best += CT_Num[i];
                        }

                        //attendence
                        String attendence = "select round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2) as marks,\n"
                                + "(CASE \n"
                                + "  WHEN (round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)>=90)  THEN 20\n"
                                + "  WHEN (round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)<90 and round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)>=85)  THEN 18\n"
                                + "  WHEN (round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)<85 and round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)>=80)  THEN 16\n"
                                + "  WHEN (round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)<80 and round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)>=75)  THEN 14\n"
                                + "  WHEN (round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)<75 and round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)>=70)  THEN 12\n"
                                + "  WHEN (round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)<70 and round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)>=65)  THEN 10\n"
                                + "  WHEN (round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)<65 and round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)>=60)  THEN 8\n"
                                + "  ELSE 0 \n"
                                + "  END)as student_attendence_marks from ATTENDENCE_MARKS a \n"
                                + "  where STUDENT_ID= " + w + " and SUBJECT_NO=" + k + " and REGISTRATION_TYPE_NO=" + 1 + "";

                        System.out.println(attendence);
                        result_set1 = st.executeQuery(attendence);

                        try {
                            while (result_set1.next()) {
                                attendence_maks_total = result_set1.getString("student_attendence_marks");
                            }
                        } catch (SQLException ex) {
                            Logger.getLogger(Sign_in_Operator.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        System.out.println(attendence_maks_total);

                        //final exam
                        try {

                            String query4 = ("SELECT (SECTION_A + SECTION_B)as final_total,REGISTRATION_TYPE_NO FROM FINAL_EXAM where STUDENT_ID= " + w + " and SUBJECT_NO=" + k + " and REGISTRATION_TYPE_NO=" + rn + "");
                            System.out.println(query4);
                            result_set2 = st.executeQuery(query4);

                        } catch (SQLException ex) {
                            Logger.getLogger(Sign_in_Operator.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        try {
                            while (result_set2.next()) {
                                FinalMarks = result_set2.getString("final_total");

                            }
                        } catch (SQLException ex) {
                            Logger.getLogger(Sign_in_Operator.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        System.out.println(FinalMarks);

                        //level and term
                        try {

                            String query2 = ("SELECT a.LEVEL_C,a.TERM FROM SUBJECT a"
                                    + " join ATTENDENCE_MARKS b on a.SUBJECT_NO=b.SUBJECT_NO\n"
                                    + " where b.STUDENT_ID= " + w + " and b.SUBJECT_NO=" + k + " and REGISTRATION_TYPE_NO=" + 1 + "");
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
                        int att = Integer.parseInt(attendence_maks_total);
                        int finalmar = Integer.parseInt(FinalMarks);
                        double result = (double) (Total_Best + finalmar + att);

                        if (result >= 320) {
                            gpa = 3.00;
                        } else if (result < 320 && result >= 300) {
                            gpa = 3.0;
                        } else if (result < 300 && result >= 280) {
                            gpa = 3.0;
                        } else if (result < 280 && result >= 260) {
                            gpa = 3.0;
                        } else if (result < 260 && result >= 240) {
                            gpa = 3.00;
                        } else if (result < 240 && result >= 220) {
                            gpa = 2.75;
                        } else if (result < 220 && result >= 200) {
                            gpa = 2.50;
                        } else if (result < 200 && result >= 180) {
                            gpa = 2.25;
                        } else if (result < 180 && result >= 160) {
                            gpa = 2.00;
                        } else if (result < 160) {
                            gpa = 0.0;
                        }

                        System.out.println(gpa);
                        String rq = "insert into FINAL_RESULT values(" + w + "," + k + "," + Total_Best + "," + FinalMarks + "," + attendence_maks_total + "," + rn + "," + Level_s + "," + Term_t + "," + tii + "," + gpa + ")";
                        System.out.println(rq);

                        st.executeQuery(rq);

                        w++;
                    } else {
                        w++;
                    }
                }
            }
        } else if (rn == 3) {
            for (int k = 1; k <= 70; k++) {
                int w = s;
                credit = "";
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
                for (int j = 1; j <= 120; j++) {

                    String ct1 = "";
                    String ct2 = "";
                    String ct3 = "";
                    String ct4 = "";
                    String attendence_maks_total = "";

                    String FinalMarks = "";
                    String Registration = "";

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
                    if ((w == ti) && (tii == 3.00)) {
                      
                        //final exam
                        try {

                            String query4 = ("SELECT (SECTION_A + SECTION_B)as final_total,REGISTRATION_TYPE_NO FROM FINAL_EXAM where STUDENT_ID= " + w + " and SUBJECT_NO=" + k + " and REGISTRATION_TYPE_NO=" + rn + "");
                            System.out.println(query4);
                            result_set2 = st.executeQuery(query4);

                        } catch (SQLException ex) {
                            Logger.getLogger(Sign_in_Operator.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        try {
                            while (result_set2.next()) {
                                FinalMarks = result_set2.getString("final_total");

                            }
                        } catch (SQLException ex) {
                            Logger.getLogger(Sign_in_Operator.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        System.out.println(FinalMarks);

                        //level and term
                        try {

                            String query2 = ("SELECT a.LEVEL_C,a.TERM FROM SUBJECT a"
                                    + " join ATTENDENCE_MARKS b on a.SUBJECT_NO=b.SUBJECT_NO\n"
                                    + " where b.STUDENT_ID= " + w + " and b.SUBJECT_NO=" + k + " and REGISTRATION_TYPE_NO=" + 1 + "");
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
                        int att = Integer.parseInt(attendence_maks_total);
                        int finalmar = Integer.parseInt(FinalMarks);
                        double result = (double) (0 + finalmar + 0);

                        if (result >= 240.0) {
                            gpa = 3.00;
                        } else if (result < 240 && result >= 225) {
                            gpa = 3.00;
                        } else if (result < 225 && result >= 210) {
                            gpa = 3.00;
                        } else if (result < 210 && result >= 195) {
                            gpa = 3.00;
                        } else if (result < 195&& result >= 180) {
                            gpa = 3.00;
                        } else if (result < 180 && result >= 165) {
                            gpa = 2.75;
                        } else if (result < 165 && result >= 150) {
                            gpa = 2.50;
                        } else if (result < 150 && result >= 135) {
                            gpa = 2.25;
                        } else if (result < 135 && result >= 120) {
                            gpa = 2.00;
                        } else if (result < 120) {
                            gpa = 0.0;
                        }

                        System.out.println(gpa);
                       String rq = "insert into FINAL_RESULT values(" + w + "," + k + "," + 0 + "," + FinalMarks + "," + 0 + "," + rn + "," + Level_s + "," + Term_t + ","+ tii+ ","+gpa +")";
                        System.out.println(rq);

                        st.executeQuery(rq);

                        w++;
                    } else if ((w == ti) && (tii == 2.00)) {
                       

                        //final exam
                        try {

                            String query4 = ("SELECT (SECTION_A + SECTION_B)as final_total,REGISTRATION_TYPE_NO FROM FINAL_EXAM where STUDENT_ID= " + w + " and SUBJECT_NO=" + k + " and REGISTRATION_TYPE_NO=" + rn + "");
                            System.out.println(query4);
                            result_set2 = st.executeQuery(query4);

                        } catch (SQLException ex) {
                            Logger.getLogger(Sign_in_Operator.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        try {
                            while (result_set2.next()) {
                                FinalMarks = result_set2.getString("final_total");

                            }
                        } catch (SQLException ex) {
                            Logger.getLogger(Sign_in_Operator.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        System.out.println(FinalMarks);

                        //level and term
                        try {

                            String query2 = ("SELECT a.LEVEL_C,a.TERM FROM SUBJECT a"
                                    + " join ATTENDENCE_MARKS b on a.SUBJECT_NO=b.SUBJECT_NO\n"
                                    + " where b.STUDENT_ID= " + w + " and b.SUBJECT_NO=" + k + " and REGISTRATION_TYPE_NO=" + 1 + "");
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
                        int att = Integer.parseInt(attendence_maks_total);
                        int finalmar = Integer.parseInt(FinalMarks);
                        double result = (double) (0 + finalmar + 0);

                        if (result >= 160.0) {
                            gpa = 3.00;
                        } else if (result < 160 && result >= 150) {
                            gpa = 3.00;
                        } else if (result < 150 && result >= 140) {
                            gpa = 3.00;
                        } else if (result < 140 && result >= 130) {
                            gpa = 3.00;
                        } else if (result < 130 && result >= 120) {
                            gpa = 3.00;
                        } else if (result < 120 && result >= 110) {
                            gpa = 2.75;
                        } else if (result < 110 && result >= 100) {
                            gpa = 2.50;
                        } else if (result < 100 && result >= 90) {
                            gpa = 2.25;
                        } else if (result < 90 && result >= 80) {
                            gpa = 2.00;
                        } else if (result < 80) {
                            gpa = 0.0;
                        }

                        System.out.println(gpa);
                        String rq = "insert into FINAL_RESULT values(" + w + "," + k + "," + 0 + "," + FinalMarks + "," + 0 + "," + rn + "," + Level_s + "," + Term_t + "," + tii + "," + gpa + ")";
                        System.out.println(rq);

                        st.executeQuery(rq);

                        w++;
                    } else if ((w == ti) && (tii == 4.00)) {

                        //final exam
                        try {

                            String query4 = ("SELECT (SECTION_A + SECTION_B)as final_total,REGISTRATION_TYPE_NO FROM FINAL_EXAM where STUDENT_ID= " + w + " and SUBJECT_NO=" + k + " and REGISTRATION_TYPE_NO=" + rn + "");
                            System.out.println(query4);
                            result_set2 = st.executeQuery(query4);

                        } catch (SQLException ex) {
                            Logger.getLogger(Sign_in_Operator.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        try {
                            while (result_set2.next()) {
                                FinalMarks = result_set2.getString("final_total");

                            }
                        } catch (SQLException ex) {
                            Logger.getLogger(Sign_in_Operator.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        System.out.println(FinalMarks);

                        //level and term
                        try {

                            String query2 = ("SELECT a.LEVEL_C,a.TERM FROM SUBJECT a"
                                    + " join ATTENDENCE_MARKS b on a.SUBJECT_NO=b.SUBJECT_NO\n"
                                    + " where b.STUDENT_ID= " + w + " and b.SUBJECT_NO=" + k + " and REGISTRATION_TYPE_NO=" + 1 + "");
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
                        int att = Integer.parseInt(attendence_maks_total);
                        int finalmar = Integer.parseInt(FinalMarks);
                        double result = (double) (0 + finalmar + att);

                        if (result >= 320) {
                            gpa = 3.00;
                        } else if (result < 320 && result >= 300) {
                            gpa = 3.00;
                        } else if (result < 300 && result >= 280) {
                            gpa = 3.00;
                        } else if (result < 280 && result >= 260) {
                            gpa = 3.00;
                        } else if (result < 260 && result >= 240) {
                            gpa = 3.00;
                        } else if (result < 240 && result >= 220) {
                            gpa = 2.75;
                        } else if (result < 220 && result >= 200) {
                            gpa = 2.50;
                        } else if (result < 200 && result >= 180) {
                            gpa = 2.25;
                        } else if (result < 180 && result >= 160) {
                            gpa = 2.00;
                        } else if (result < 160) {
                            gpa = 0.0;
                        }

                        System.out.println(gpa);
                        String rq = "insert into FINAL_RESULT values(" + w + "," + k + "," + 0 + "," + FinalMarks + "," + 0 + "," + rn + "," + Level_s + "," + Term_t + "," + tii + "," + gpa + ")";
                        System.out.println(rq);

                        st.executeQuery(rq);

                        w++;
                    } else {
                        w++;
                    }
                }
            }
        } else if (rn == 4) {
           for (int k = 1; k <= 70; k++) {
                int w = s;
                credit = "";
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
                for (int j = 1; j <= 120; j++) {

                    String ct1 = "";
                    String ct2 = "";
                    String ct3 = "";
                    String ct4 = "";
                    String attendence_maks_total = "";

                    String FinalMarks = "";
                    String Registration = "";

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
                    if ((w == ti) && (tii == 3.00)) {
                        //class Test
                        try {

                            String query = ("SELECT * FROM CLASS_TEST where STUDENT_ID= " + w + " and SUBJECT_NO=" + k + " and REGISTRATION_TYPE_NO=" + rn + "");
                            System.out.println(query);
                            result_set = st.executeQuery(query);

                        } catch (SQLException ex) {
                            Logger.getLogger(Sign_in_Operator.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        try {
                            while (result_set.next()) {
                                ct1 = result_set.getString("CLASS_TEST_1");
                                ct2 = result_set.getString("CLASS_TEST_2");
                                ct3 = result_set.getString("CLASS_TEST_3");
                                ct4 = result_set.getString("CLASS_TEST_4");
                            }
                        } catch (SQLException ex) {
                            Logger.getLogger(Sign_in_Operator.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        int ct1in;
                        int ct2in ;
                        int ct3in ;
                        int ct4in;

                        
                        if(ct1.equals(""))
                        {
                         ct1in=0;
                        }
                        else
                          ct1in = Integer.parseInt(ct1);  
                        
                         if(ct2.equals(""))
                        {
                         ct2in=0;
                        }
                        else
                          ct2in = Integer.parseInt(ct2); 
                         
                          if(ct3.equals(""))
                        {
                         ct3in=0;
                        }
                        else
                          ct3in = Integer.parseInt(ct3); 
                          
                           if(ct4.equals(""))
                        {
                         ct4in=0;
                        }
                        else
                          ct4in = Integer.parseInt(ct4); 
                        
                        int CT_Num[] = new int[]{ct1in, ct2in, ct3in, ct4in};
                        int Total_Best = 0;
                        Arrays.sort(CT_Num);
                        for (int i = 1; i < CT_Num.length; i++) {
                            Total_Best += CT_Num[i];
                        }

                        //attendence
                        String attendence = "select round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2) as marks,\n"
                                + "(CASE \n"
                                + "  WHEN (round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)>=90)  THEN 30\n"
                                + "  WHEN (round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)<90 and round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)>=85)  THEN 27\n"
                                + "  WHEN (round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)<85 and round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)>=80)  THEN 24\n"
                                + "  WHEN (round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)<80 and round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)>=75)  THEN 21\n"
                                + "  WHEN (round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)<75 and round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)>=70)  THEN 18\n"
                                + "  WHEN (round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)<70 and round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)>=65)  THEN 15\n"
                                + "  WHEN (round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)<65 and round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)>=60)  THEN 12\n"
                                + "  ELSE 0 \n"
                                + "  END)as student_attendence_marks from ATTENDENCE_MARKS a \n"
                                + "  where STUDENT_ID= " + w + " and SUBJECT_NO=" + k + " and REGISTRATION_TYPE_NO=" + rn + "";

                        System.out.println(attendence);
                        result_set1 = st.executeQuery(attendence);

                        try {
                            while (result_set1.next()) {
                                attendence_maks_total = result_set1.getString("student_attendence_marks");
                            }
                        } catch (SQLException ex) {
                            Logger.getLogger(Sign_in_Operator.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        int att;
                        if(attendence_maks_total.equals(""))
                        {
                         att=0;
                        }
                        else
                        {
                         att=Integer.parseInt(attendence_maks_total);
                        }
                        System.out.println(attendence_maks_total);

                        //final exam
                        try {

                            String query4 = ("SELECT (SECTION_A + SECTION_B)as final_total,REGISTRATION_TYPE_NO FROM FINAL_EXAM where STUDENT_ID= " + w + " and SUBJECT_NO=" + k + " and REGISTRATION_TYPE_NO=" + rn + "");
                            System.out.println(query4);
                            result_set2 = st.executeQuery(query4);

                        } catch (SQLException ex) {
                            Logger.getLogger(Sign_in_Operator.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        try {
                            while (result_set2.next()) {
                                FinalMarks = result_set2.getString("final_total");

                            }
                        } catch (SQLException ex) {
                            Logger.getLogger(Sign_in_Operator.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        System.out.println(FinalMarks);

                        //level and term
                        try {

                            String query2 = ("SELECT a.LEVEL_C,a.TERM FROM SUBJECT a"
                                    + " join ATTENDENCE_MARKS b on a.SUBJECT_NO=b.SUBJECT_NO\n"
                                    + " where b.STUDENT_ID= " + w + " and b.SUBJECT_NO=" + k + " and REGISTRATION_TYPE_NO=" + 1 + "");
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
                        int finalmar;
                       if(FinalMarks.equals(""))
                           finalmar=0;
                       else  
                        finalmar = Integer.parseInt(FinalMarks);
                        double result = (double) (Total_Best + finalmar + att);

                        if (result >= 240.0) {
                            gpa = 3.00;
                        } else if (result < 240 && result >= 225) {
                            gpa = 3.00;
                        } else if (result < 225 && result >= 210) {
                            gpa = 3.00;
                        } else if (result < 210 && result >= 195) {
                            gpa = 3.00;
                        } else if (result < 195&& result >= 180) {
                            gpa = 3.00;
                        } else if (result < 180 && result >= 165) {
                            gpa = 2.75;
                        } else if (result < 165 && result >= 150) {
                            gpa = 2.50;
                        } else if (result < 150 && result >= 135) {
                            gpa = 2.25;
                        } else if (result < 135 && result >= 120) {
                            gpa = 2.00;
                        } else if (result < 120) {
                            gpa = 0.0;
                        }

                        System.out.println(gpa);
                        String rq = "insert into FINAL_RESULT values(" + w + "," + k + "," + Total_Best + "," + FinalMarks + "," + attendence_maks_total + "," + rn + "," + Level_s + "," + Term_t + ","+ tii+ ","+gpa +")";
                        System.out.println(rq);

                        st.executeQuery(rq);

                        w++;
                    } else if ((w == ti) && (tii == 2.00)) {
                        try {
                            String query = ("SELECT * FROM CLASS_TEST where STUDENT_ID= " + w + " and SUBJECT_NO=" + k + " and REGISTRATION_TYPE_NO=" + rn + "");
                            System.out.println(query);
                            result_set = st.executeQuery(query);

                        } catch (SQLException ex) {
                            Logger.getLogger(Sign_in_Operator.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        try {
                            while (result_set.next()) {
                                ct1 = result_set.getString("CLASS_TEST_1");
                                ct2 = result_set.getString("CLASS_TEST_2");
                                ct3 = result_set.getString("CLASS_TEST_3");
                                ct4 = result_set.getString("CLASS_TEST_4");
                            }
                        } catch (SQLException ex) {
                            Logger.getLogger(Sign_in_Operator.class.getName()).log(Level.SEVERE, null, ex);
                        }
                       int ct1in;
                        int ct2in ;
                        int ct3in ;
                        int ct4in;

                        
                        if(ct1.equals(""))
                        {
                         ct1in=0;
                        }
                        else
                          ct1in = Integer.parseInt(ct1);  
                        
                         if(ct2.equals(""))
                        {
                         ct2in=0;
                        }
                        else
                          ct2in = Integer.parseInt(ct2); 
                         
                          if(ct3.equals(""))
                        {
                         ct3in=0;
                        }
                        else
                          ct3in = Integer.parseInt(ct3); 
                          
                           if(ct4.equals(""))
                        {
                         ct4in=0;
                        }
                        else
                          ct4in = Integer.parseInt(ct4); 
                        
                        int CT_Num[] = new int[]{ct1in, ct2in, ct3in, ct4in};
                        int Total_Best = 0;
                        Arrays.sort(CT_Num);
                        for (int i = 1; i < CT_Num.length; i++) {
                            Total_Best += CT_Num[i];
                        }

                        //attendence
                        String attendence = "select round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2) as marks,\n"
                                + "(CASE \n"
                                + "  WHEN (round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)>=90)  THEN 30\n"
                                + "  WHEN (round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)<90 and round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)>=85)  THEN 27\n"
                                + "  WHEN (round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)<85 and round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)>=80)  THEN 24\n"
                                + "  WHEN (round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)<80 and round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)>=75)  THEN 21\n"
                                + "  WHEN (round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)<75 and round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)>=70)  THEN 18\n"
                                + "  WHEN (round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)<70 and round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)>=65)  THEN 15\n"
                                + "  WHEN (round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)<65 and round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)>=60)  THEN 12\n"
                                + "  ELSE 0 \n"
                                + "  END)as student_attendence_marks from ATTENDENCE_MARKS a \n"
                                + "  where STUDENT_ID= " + w + " and SUBJECT_NO=" + k + " and REGISTRATION_TYPE_NO=" + rn + "";

                        System.out.println(attendence);
                        result_set1 = st.executeQuery(attendence);

                        try {
                            while (result_set1.next()) {
                                attendence_maks_total = result_set1.getString("student_attendence_marks");
                            }
                        } catch (SQLException ex) {
                            Logger.getLogger(Sign_in_Operator.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        int att;
                        if(attendence_maks_total.equals(""))
                        {
                         att=0;
                        }
                        else
                        {
                         att=Integer.parseInt(attendence_maks_total);
                        }
                        System.out.println(attendence_maks_total);


                        //final exam
                        try {

                            String query4 = ("SELECT (SECTION_A + SECTION_B)as final_total,REGISTRATION_TYPE_NO FROM FINAL_EXAM where STUDENT_ID= " + w + " and SUBJECT_NO=" + k + " and REGISTRATION_TYPE_NO=" + rn + "");
                            System.out.println(query4);
                            result_set2 = st.executeQuery(query4);

                        } catch (SQLException ex) {
                            Logger.getLogger(Sign_in_Operator.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        try {
                            while (result_set2.next()) {
                                FinalMarks = result_set2.getString("final_total");

                            }
                        } catch (SQLException ex) {
                            Logger.getLogger(Sign_in_Operator.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        System.out.println(FinalMarks);

                        //level and term
                        try {

                            String query2 = ("SELECT a.LEVEL_C,a.TERM FROM SUBJECT a"
                                    + " join ATTENDENCE_MARKS b on a.SUBJECT_NO=b.SUBJECT_NO\n"
                                    + " where b.STUDENT_ID= " + w + " and b.SUBJECT_NO=" + k + " and REGISTRATION_TYPE_NO=" + 1 + "");
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
                        
                        int finalmar;
                       if(FinalMarks.equals(""))
                           finalmar=0;
                       else  
                        finalmar = Integer.parseInt(FinalMarks);
                        double result = (double) (Total_Best + finalmar + att);

                        if (result >= 160.0) {
                            gpa = 4.00;
                        } else if (result < 160 && result >= 150) {
                            gpa = 3.75;
                        } else if (result < 150 && result >= 140) {
                            gpa = 3.50;
                        } else if (result < 140 && result >= 130) {
                            gpa = 3.25;
                        } else if (result < 130 && result >= 120) {
                            gpa = 3.00;
                        } else if (result < 120 && result >= 110) {
                            gpa = 2.75;
                        } else if (result < 110 && result >= 100) {
                            gpa = 2.50;
                        } else if (result < 100 && result >= 90) {
                            gpa = 2.25;
                        } else if (result < 90 && result >= 80) {
                            gpa = 2.00;
                        } else if (result < 80) {
                            gpa = 0.0;
                        }

                        System.out.println(gpa);
                        String rq = "insert into FINAL_RESULT values(" + w + "," + k + "," + Total_Best + "," + FinalMarks + "," + attendence_maks_total + "," + rn + "," + Level_s + "," + Term_t + "," + tii + "," + gpa + ")";
                        System.out.println(rq);

                        st.executeQuery(rq);

                        w++;
                    } else if ((w == ti) && (tii == 4.00)) {
                        try {
                            String query = ("SELECT * FROM CLASS_TEST where STUDENT_ID= " + w + " and SUBJECT_NO=" + k + " and REGISTRATION_TYPE_NO=" + rn + "");
                            System.out.println(query);
                            result_set = st.executeQuery(query);

                        } catch (SQLException ex) {
                            Logger.getLogger(Sign_in_Operator.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        try {
                            while (result_set.next()) {
                                ct1 = result_set.getString("CLASS_TEST_1");
                                ct2 = result_set.getString("CLASS_TEST_2");
                                ct3 = result_set.getString("CLASS_TEST_3");
                                ct4 = result_set.getString("CLASS_TEST_4");
                            }
                        } catch (SQLException ex) {
                            Logger.getLogger(Sign_in_Operator.class.getName()).log(Level.SEVERE, null, ex);
                        }
                         int ct1in;
                        int ct2in ;
                        int ct3in ;
                        int ct4in;

                        
                        if(ct1.equals(""))
                        {
                         ct1in=0;
                        }
                        else
                          ct1in = Integer.parseInt(ct1);  
                        
                         if(ct2.equals(""))
                        {
                         ct2in=0;
                        }
                        else
                          ct2in = Integer.parseInt(ct2); 
                         
                          if(ct3.equals(""))
                        {
                         ct3in=0;
                        }
                        else
                          ct3in = Integer.parseInt(ct3); 
                          
                           if(ct4.equals(""))
                        {
                         ct4in=0;
                        }
                        else
                          ct4in = Integer.parseInt(ct4); 
                        
                        int CT_Num[] = new int[]{ct1in, ct2in, ct3in, ct4in};
                        int Total_Best = 0;
                        Arrays.sort(CT_Num);
                        for (int i = 1; i < CT_Num.length; i++) {
                            Total_Best += CT_Num[i];
                        }

                        //attendence
                        String attendence = "select round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2) as marks,\n"
                                + "(CASE \n"
                                + "  WHEN (round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)>=90)  THEN 30\n"
                                + "  WHEN (round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)<90 and round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)>=85)  THEN 27\n"
                                + "  WHEN (round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)<85 and round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)>=80)  THEN 24\n"
                                + "  WHEN (round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)<80 and round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)>=75)  THEN 21\n"
                                + "  WHEN (round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)<75 and round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)>=70)  THEN 18\n"
                                + "  WHEN (round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)<70 and round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)>=65)  THEN 15\n"
                                + "  WHEN (round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)<65 and round((a.NO_OF_ATTENDED_CLASS/a.NO_OF_TOTAL_CLASS)*100,2)>=60)  THEN 12\n"
                                + "  ELSE 0 \n"
                                + "  END)as student_attendence_marks from ATTENDENCE_MARKS a \n"
                                + "  where STUDENT_ID= " + w + " and SUBJECT_NO=" + k + " and REGISTRATION_TYPE_NO=" + rn + "";

                        System.out.println(attendence);
                        result_set1 = st.executeQuery(attendence);

                        try {
                            while (result_set1.next()) {
                                attendence_maks_total = result_set1.getString("student_attendence_marks");
                            }
                        } catch (SQLException ex) {
                            Logger.getLogger(Sign_in_Operator.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        int att;
                        if(attendence_maks_total.equals(""))
                        {
                         att=0;
                        }
                        else
                        {
                         att=Integer.parseInt(attendence_maks_total);
                        }
                        System.out.println(attendence_maks_total);

                        //final exam
                        try {

                            String query4 = ("SELECT (SECTION_A + SECTION_B)as final_total,REGISTRATION_TYPE_NO FROM FINAL_EXAM where STUDENT_ID= " + w + " and SUBJECT_NO=" + k + " and REGISTRATION_TYPE_NO=" + rn + "");
                            System.out.println(query4);
                            result_set2 = st.executeQuery(query4);

                        } catch (SQLException ex) {
                            Logger.getLogger(Sign_in_Operator.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        try {
                            while (result_set2.next()) {
                                FinalMarks = result_set2.getString("final_total");

                            }
                        } catch (SQLException ex) {
                            Logger.getLogger(Sign_in_Operator.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        System.out.println(FinalMarks);

                        //level and term
                        try {

                            String query2 = ("SELECT a.LEVEL_C,a.TERM FROM SUBJECT a"
                                    + " join ATTENDENCE_MARKS b on a.SUBJECT_NO=b.SUBJECT_NO\n"
                                    + " where b.STUDENT_ID= " + w + " and b.SUBJECT_NO=" + k + " and REGISTRATION_TYPE_NO=" + 1 + "");
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
                      
                        int finalmar;
                       if(FinalMarks.equals(""))
                           finalmar=0;
                       else  
                        finalmar = Integer.parseInt(FinalMarks);
                        double result = (double) (Total_Best + finalmar + att);

                        if (result >= 320) {
                            gpa = 4.00;
                        } else if (result < 320 && result >= 300) {
                            gpa = 3.75;
                        } else if (result < 300 && result >= 280) {
                            gpa = 3.50;
                        } else if (result < 280 && result >= 260) {
                            gpa = 3.25;
                        } else if (result < 260 && result >= 240) {
                            gpa = 3.00;
                        } else if (result < 240 && result >= 220) {
                            gpa = 2.75;
                        } else if (result < 220 && result >= 200) {
                            gpa = 2.50;
                        } else if (result < 200 && result >= 180) {
                            gpa = 2.25;
                        } else if (result < 180 && result >= 160) {
                            gpa = 2.00;
                        } else if (result < 160) {
                            gpa = 0.0;
                        }

                        System.out.println(gpa);
                        String rq = "insert into FINAL_RESULT values(" + w + "," + k + "," + Total_Best + "," + FinalMarks + "," + attendence_maks_total + "," + rn + "," + Level_s + "," + Term_t + "," + tii + "," + gpa + ")";
                        System.out.println(rq);

                        st.executeQuery(rq);

                        w++;
                    } else {
                        w++;
                    }
                }
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
            java.util.logging.Logger.getLogger(PrepareResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrepareResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrepareResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrepareResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrepareResult().setVisible(true);
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
