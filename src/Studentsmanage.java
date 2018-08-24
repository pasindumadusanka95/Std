
import java.awt.Desktop;
import java.awt.Dimension;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hp
 */
public class Studentsmanage extends javax.swing.JFrame {

    /**
     * Creates new form Staffdash
     */
    public Studentsmanage() {
        initComponents();
        this.setPreferredSize(new Dimension(900, 650));
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelHomeback = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Assignment = new javax.swing.JButton();
        Semester = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        subject = new javax.swing.JButton();
        Timetable2 = new javax.swing.JButton();
        Payments1 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        Payments2 = new javax.swing.JButton();
        Payments3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jLabel3.setText("Student DashBoard");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabelHomeback, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(197, 197, 197)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelHomeback)
                    .addComponent(jLabel3))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, -1));

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));

        Assignment.setBackground(new java.awt.Color(0, 102, 153));
        Assignment.setText("View Assignment Grades");
        Assignment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AssignmentActionPerformed(evt);
            }
        });

        Semester.setBackground(new java.awt.Color(0, 102, 153));
        Semester.setText("View Semester Grades");
        Semester.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SemesterActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(0, 102, 153));
        jButton6.setText("Add/Update/Delete Marks");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        subject.setBackground(new java.awt.Color(0, 102, 153));
        subject.setText("Subject Selection");
        subject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectActionPerformed(evt);
            }
        });

        Timetable2.setBackground(new java.awt.Color(0, 102, 153));
        Timetable2.setText("Lecture Time Table");
        Timetable2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Timetable2ActionPerformed(evt);
            }
        });

        Payments1.setBackground(new java.awt.Color(0, 102, 153));
        Payments1.setText("Check GPA & Credits");
        Payments1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Payments1ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(0, 102, 153));
        jButton7.setText("View Students");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        Payments2.setBackground(new java.awt.Color(0, 102, 153));
        Payments2.setText("Delete/Update Student ");
        Payments2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Payments2ActionPerformed(evt);
            }
        });

        Payments3.setBackground(new java.awt.Color(0, 102, 153));
        Payments3.setText(" Payments");
        Payments3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Payments3ActionPerformed(evt);
            }
        });

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
                        .addGap(40, 40, 40)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(62, 62, 62)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                    .addComponent(Timetable2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(subject, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Assignment, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 212, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Semester, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Payments1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(162, 162, 162))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(Payments3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(151, 151, 151))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(352, 352, 352)
                .addComponent(Payments2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(366, 420, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(360, 360, 360))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Assignment, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Semester, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(82, 82, 82)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subject, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(94, 94, 94)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Timetable2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Payments1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Payments3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(Payments2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 59, -1, 780));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void openFile() throws IOException, ClassNotFoundException {

        JFileChooser fc = new JFileChooser();
        fc.setDialogTitle("Open your file");
        fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        fc.setCurrentDirectory(new File("."));

        int result = fc.showOpenDialog(this);
        if (result == JFileChooser.CANCEL_OPTION) {
            //cancel action
        } else if (result == JFileChooser.APPROVE_OPTION) {

            //open file using 
            File selectedFile = fc.getSelectedFile();
            String path = selectedFile.getAbsolutePath();

            File myFile = new File(path);
            Desktop.getDesktop().open(myFile);

        }
    }

    private void jLabelHomebackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHomebackMouseClicked
        Homef hm = new Homef();
        hm.setVisible(true);
        hm.pack();
        hm.setLocationRelativeTo(null);
        hm.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.dispose();  // TODO add your handling code here:
    }//GEN-LAST:event_jLabelHomebackMouseClicked

    private void AssignmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AssignmentActionPerformed
        Assignmentmarks acc = new Assignmentmarks();
        acc.setVisible(true);
        acc.pack();
        acc.setLocationRelativeTo(null);
        acc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_AssignmentActionPerformed

    private void SemesterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SemesterActionPerformed
        Semesterresults_1 acc = new Semesterresults_1();
        acc.setVisible(true);
        acc.pack();
        acc.setLocationRelativeTo(null);
        acc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();   
    }//GEN-LAST:event_SemesterActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Addingmarks acc = new Addingmarks();
        acc.setVisible(true);
        acc.pack();
        acc.setLocationRelativeTo(null);
        acc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();   
    }//GEN-LAST:event_jButton6ActionPerformed

    private void subjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectActionPerformed
        SubjectSelection acc = new SubjectSelection();
        acc.setVisible(true);
        acc.pack();
        acc.setLocationRelativeTo(null);
        acc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_subjectActionPerformed

    private void Timetable2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Timetable2ActionPerformed
        try {
            
            openFile();
        } catch (IOException ex) {
            Logger.getLogger(Studentsmanage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Studentsmanage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Timetable2ActionPerformed

    private void Payments1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Payments1ActionPerformed
        GPA acc = new GPA();
        acc.setVisible(true);
        acc.pack();
        acc.setLocationRelativeTo(null);
        acc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();  
    }//GEN-LAST:event_Payments1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        ViewStudentDetails acc = new ViewStudentDetails();
        acc.setVisible(true);
        acc.pack();
        acc.setLocationRelativeTo(null);
        acc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();  
    }//GEN-LAST:event_jButton7ActionPerformed

    private void Payments2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Payments2ActionPerformed
        DelUpdStudent acc1 = new DelUpdStudent();
        acc1.setVisible(true);
        acc1.pack();
        acc1.setLocationRelativeTo(null);
        acc1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_Payments2ActionPerformed

    private void Payments3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Payments3ActionPerformed
        SemPayments acc = new SemPayments();
        acc.setVisible(true);
        acc.pack();
        acc.setLocationRelativeTo(null);
        acc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();  // TODO add your handling code here:
    }//GEN-LAST:event_Payments3ActionPerformed

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
            java.util.logging.Logger.getLogger(Studentsmanage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Studentsmanage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Studentsmanage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Studentsmanage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Studentsmanage().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Assignment;
    private javax.swing.JButton Payments1;
    private javax.swing.JButton Payments2;
    private javax.swing.JButton Payments3;
    private javax.swing.JButton Semester;
    private javax.swing.JButton Timetable2;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelHomeback;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton subject;
    // End of variables declaration//GEN-END:variables
}
