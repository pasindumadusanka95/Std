
import Connection.DbHandler;
import java.awt.Dimension;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hp
 */
public class CourseSelection extends javax.swing.JFrame {

    /**
     * Creates new form CourseSelection
     */
    public CourseSelection() {
        initComponents();
        this.setPreferredSize(new Dimension(900, 650));
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
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
        jLabelHomeback = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ConfirmCourseButton = new javax.swing.JButton();
        UPselect = new javax.swing.JComboBox();
        jRadioButtonBUS = new javax.swing.JRadioButton();
        jRadioButtonEng = new javax.swing.JRadioButton();
        jRadioButtonCom = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        courseList = new javax.swing.JList();
        jButton5 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        selectedCourse = new javax.swing.JList();
        jLabel13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 0, 255));

        jLabelHomeback.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelHomeback.setForeground(new java.awt.Color(255, 255, 255));
        jLabelHomeback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Go_Back_30px.png"))); // NOI18N
        jLabelHomeback.setText("Back");
        jLabelHomeback.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelHomeback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelHomebackMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Course Selection");

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));

        ConfirmCourseButton.setBackground(new java.awt.Color(0, 204, 255));
        ConfirmCourseButton.setFont(new java.awt.Font("Reem Kufi Regular", 1, 14)); // NOI18N
        ConfirmCourseButton.setText("Confirm");
        ConfirmCourseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmCourseButtonActionPerformed(evt);
            }
        });

        UPselect.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Undergraduate", "Postgraduate" }));
        UPselect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPselectActionPerformed(evt);
            }
        });

        jRadioButtonBUS.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButtonBUS.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonBUS.setText("School of Computing");
        jRadioButtonBUS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonBUSActionPerformed(evt);
            }
        });

        jRadioButtonEng.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButtonEng.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonEng.setText("School of Engineering");
        jRadioButtonEng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonEngActionPerformed(evt);
            }
        });

        jRadioButtonCom.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButtonCom.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonCom.setText("School of Business");
        jRadioButtonCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonComActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Search_30px_1.png"))); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Student ID");

        courseList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jScrollPane2.setViewportView(courseList);

        jButton5.setText("<<Select");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        selectedCourse.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        selectedCourse.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jScrollPane3.setViewportView(selectedCourse);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Course Name :");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Select the Course from the given list");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UPselect, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButtonBUS, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jRadioButtonEng)
                                        .addGap(37, 37, 37)
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(10, 10, 10)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jRadioButtonCom, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(236, 236, 236)
                                .addComponent(ConfirmCourseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(71, 71, 71))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UPselect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButtonEng)
                    .addComponent(jButton1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButtonBUS))
                .addGap(18, 18, 18)
                .addComponent(jRadioButtonCom)
                .addGap(70, 70, 70)
                .addComponent(jLabel4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(10, 10, 10)
                .addComponent(ConfirmCourseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(302, 302, 302))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabelHomeback, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(199, 199, 199)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 20, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addComponent(jLabelHomeback))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelHomebackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHomebackMouseClicked
        Studentsmanage hm = new Studentsmanage();
        hm.setVisible(true);
        hm.pack();
        hm.setLocationRelativeTo(null);
        hm.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.dispose();  // TODO add your handling code here:
    }//GEN-LAST:event_jLabelHomebackMouseClicked

    private void ConfirmCourseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmCourseButtonActionPerformed
        // TODO add your handling code here:

        DefaultListModel dlm3 = new DefaultListModel();
        selectedCourse.setModel(dlm3);
        String electiveCourse = null;
        String studentid = jTextField1.getText();
        String type = UPselect.getSelectedItem().toString();
        String faculty = "soc";
        if (jRadioButtonEng.isSelected()) {
            faculty = "soe";
        } else if (jRadioButtonBUS.isSelected()) {
            faculty = "sob";

        }

        if (UPselect.getSelectedItem().toString().isEmpty()) {
            JOptionPane.showMessageDialog(null, "All the fiels should be filled");

        } else {
            if (courseList.getSelectedIndices().length == 1) {
                int[] selectedIndices = courseList.getSelectedIndices();
                //a SelectedListppend selected to list2
                for (int i = 0; i < selectedIndices.length; i++) {
                    electiveCourse = courseList.getModel().getElementAt(selectedIndices[0]).toString();

                }

                try {
                    DbHandler.setData("INSERT INTO grup_project.course_selection(stdid,type,facultyname,coursename) values('" + studentid + "','" + type + "','" + faculty + "','" + electiveCourse + "')");

                    JOptionPane.showMessageDialog(null, "Values successfuly Inserted");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, e.getMessage());
                }
            } else if (courseList.getSelectedIndices().length > 1) {
                JOptionPane.showMessageDialog(null, "Course can not be more than one");
            }
        }
        Studentsmanage hm = new Studentsmanage();
        hm.setVisible(true);
        hm.pack();
        hm.setLocationRelativeTo(null);
        hm.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_ConfirmCourseButtonActionPerformed

    private void UPselectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPselectActionPerformed

    }//GEN-LAST:event_UPselectActionPerformed

    private void jRadioButtonBUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonBUSActionPerformed
        // TODO add your handling code here:
        if (jRadioButtonBUS.isSelected() == true) // if check box is checked
        {
            jRadioButtonCom.setSelected(false);
            jRadioButtonEng.setSelected(false);// button will enable
            //btnOne.setText("Hi im enabled");// button text will change into parameter msg..
        }
    }//GEN-LAST:event_jRadioButtonBUSActionPerformed

    private void jRadioButtonEngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonEngActionPerformed
        // TODO add your handling code here:
        if (jRadioButtonEng.isSelected() == true) // if check box is checked
        {
            jRadioButtonCom.setSelected(false);
            jRadioButtonBUS.setSelected(false);// button will enable
            //btnOne.setText("Hi im enabled");// button text will change into parameter msg..
        }
    }//GEN-LAST:event_jRadioButtonEngActionPerformed

    private void jRadioButtonComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonComActionPerformed
        // TODO add your handling code here:
        if (jRadioButtonCom.isSelected() == true) // if check box is checked
        {
            jRadioButtonBUS.setSelected(false);
            jRadioButtonEng.setSelected(false);// button will enable
            //btnOne.setText("Hi im enabled");// button text will change into parameter msg..
        }
    }//GEN-LAST:event_jRadioButtonComActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        // String studentid=jTextField1.getText();
        String studentType = UPselect.getSelectedItem().toString();
        String Faculty = "soe";
        if (jRadioButtonCom.isSelected() == true) {
            Faculty = "sob";
        } else if (jRadioButtonBUS.isSelected() == true) {
            Faculty = "soc";
        }
        // String Faculty=Faculty.getSelectedItem().toString();

        try {

            if (UPselect.getSelectedItem().toString().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please select dropdown values");

                UPselect.setSelectedItem(null);
                //  Faculty.setSelectedItem(null);

            } else {
                ResultSet rs = DbHandler.getData("select coursename from grup_project.course where facultyid= '" + Faculty + "'");

                DefaultListModel listModelcourse = new DefaultListModel();

                while (rs.next()) {

                    String course = rs.getString("coursename");
                    //  String facultycombo=rs.getString("facultyName");
                    //  Faculty.addItem(facultycombo);
                    //  Faculty.setVisible(true);

                    listModelcourse.addElement(course);

                }

                courseList.setModel(listModelcourse);
                courseList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);

            }

        } catch (SQLException ex) {
            Logger.getLogger(CourseSelection.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CourseSelection.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        DefaultListModel dlm4 = new DefaultListModel();
        selectedCourse.setModel(dlm4);
        if (courseList.getSelectedIndices().length > 0) {
            int[] selectedIndices = courseList.getSelectedIndices();
            //a SelectedListppend selected to list2
            for (int i = 0; i < selectedIndices.length; i++) {
                dlm4.addElement(courseList.getModel().getElementAt(selectedIndices[i]));
            }
            //  SelectedList.setVisibleRowCount(4);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(CourseSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CourseSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CourseSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CourseSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CourseSelection().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConfirmCourseButton;
    private javax.swing.JComboBox UPselect;
    private javax.swing.JList courseList;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelHomeback;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButtonBUS;
    private javax.swing.JRadioButton jRadioButtonCom;
    private javax.swing.JRadioButton jRadioButtonEng;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JList selectedCourse;
    // End of variables declaration//GEN-END:variables
}
