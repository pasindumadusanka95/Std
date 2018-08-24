
import Connection.DbHandler;
import java.awt.Dimension;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.Properties;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

 */
/**
 *
 * @author hp
 */
public class Semesterresults_1 extends javax.swing.JFrame {

    /**
     * Creates new form Semesterresults
     */
    public Semesterresults_1() {
        initComponents();
        this.setPreferredSize(new Dimension(900, 650));
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public void sendEmail() {
        String userid = jTextField1.getText();
        String usermail = "null";

        try {
            ResultSet rs = DbHandler.getData("select email from grup_project.student where sid='" + userid + "'");
            while (rs.next()) {
                usermail = rs.getString("email");

            }

            String code = "null";
            String grade = "null";
            String semester = "null";
            String sid = "null";
            String year = yearbox.getSelectedItem().toString();
            String sem = yearbox1.getSelectedItem().toString();
            String studentid = jTextField1.getText();

            ResultSet rs2 = DbHandler.getData("Select sid,subcode,grade,semester from grup_project.finalsemmarks where subcode like 'CS" + year + "0%' and sid='" + studentid + "' and semester='" + sem + "'");

            String host = "smtp.gmail.com";
            String user = "useristesting56@gmail.com";
            String pass = "pasindu123";
            String to = usermail;
            String title = "Results Summary";
            String from = "useristesting56@gmail.com";
            String subject = "Results Summary";
            // String messageText = "Your Is Test Email :Subject Code "+code+ "grade is:" +grade;
            String html = "<html><head>"
                    + "<title><h2>Results Summary<h2></title>"
                    + "<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">"
                    + " <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>"
                    + "<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>"
                    + "</head>"
                    + "<body>"
                    + "<table class=\"table table-striped\" border='0'>"
                    + "<tr><td class ='text12' ><br>Here is the results summary of your semester</td></tr><tr>"
                    + "<td ></td></tr>"
                    + "<tr><td></td></tr>"
                    + "<tr><td ></td></tr>"
                    + "<tr><td><table border='1'       >"
                    + "<tr  class='centerheading' >"
                    + "<td  ><b>Student ID</b></td>"
                    + "<td  ><b>Grade</b></td>"
                    + "<td ><b>Code</b></td>"
                    + "<td  ><b>Semester</b></td>"
                    + "</tr>";
            while (rs2.next()) {

                sid = rs2.getString(1);
                code = rs2.getString(3);
                grade = rs2.getString(2);
                semester = rs2.getString(4);

                html = html + "<tr>"
                        + "<td  >" + sid + "</b></td>"
                        + "<td  >" + code + "</b></td>"
                        + "<td  >" + grade + "</b></td>"
                        + "<td  >" + semester + "</b></td>"
                        + "</tr>";

            }
            html = html + "</table>"
                    + "</td>"
                    + "</tr>"
                    + "<tr>"
                    + "<td ></td>"
                    + "</tr>"
                    + "<tr>"
                    + "<td ></td>"
                    + "</tr>"
                    + "<tr><td  class ='text12' >" + "Regards" + "</td></tr>"
                    + "</table>"
                    + "</body></html>";
            boolean sessionDebug = false;

            Properties props = System.getProperties();

            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", host);
            props.put("mail.smtp.port", "587");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.required", "true");

            java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
            Session mailSession = Session.getDefaultInstance(props, null);
            mailSession.setDebug(sessionDebug);
            Message msg = new MimeMessage(mailSession);
            msg.setFrom(new InternetAddress(from));
            InternetAddress[] address = {new InternetAddress(to)};
            msg.setRecipients(Message.RecipientType.TO, address);
            msg.setSubject(subject);
            msg.setSentDate(new Date());
            // msg.setText(messageText);
            msg.setContent(html, "text/html");

            Transport transport = mailSession.getTransport("smtp");
            transport.connect(host, user, pass);
            transport.sendMessage(msg, msg.getAllRecipients());
            transport.close();
            JOptionPane.showMessageDialog(null, "message send successfully");
            /////////////

            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
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

        jFileChooser1 = new javax.swing.JFileChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        yearbox = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableview = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabelHomeback = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        yearbox1 = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(null);

        yearbox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        yearbox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4" }));
        yearbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearboxActionPerformed(evt);
            }
        });
        jPanel1.add(yearbox);
        yearbox.setBounds(105, 72, 50, 23);

        jTableview.setBackground(new java.awt.Color(0, 153, 153));
        jTableview.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "Subject Code", "Grade", "Semester"
            }
        ));
        jScrollPane2.setViewportView(jTableview);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(10, 114, 880, 470);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Year");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 75, 37, 17);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_View_Details_30px_2.png"))); // NOI18N
        jButton1.setText("View");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(690, 60, 150, 30);

        jLabelHomeback.setBackground(new java.awt.Color(153, 153, 153));
        jLabelHomeback.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabelHomeback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Back_Arrow_30px.png"))); // NOI18N
        jLabelHomeback.setText("Back");
        jLabelHomeback.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelHomeback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelHomebackMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelHomeback);
        jLabelHomeback.setBounds(10, 11, 77, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Student ID");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(416, 75, 77, 17);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(511, 65, 150, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 153));
        jLabel2.setText("Semester Results");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(336, 14, 169, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Semester");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(203, 75, 71, 17);

        yearbox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        yearbox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4" }));
        yearbox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearbox1ActionPerformed(evt);
            }
        });
        jPanel1.add(yearbox1);
        yearbox1.setBounds(284, 72, 60, 23);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Gmail_30px.png"))); // NOI18N
        jButton2.setText("Send Email");
        jButton2.setActionCommand("");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(690, 20, 150, 30);

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void yearboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearboxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String year = yearbox.getSelectedItem().toString();
        String sem = yearbox1.getSelectedItem().toString();
        String studentid = jTextField1.getText();
        String code = "null";
        String grade = "null";

        try {
            ResultSet rs = DbHandler.getData("Select sid,subcode,grade,semester from grup_project.finalsemmarks where subcode like 'CS" + year + "0%' and sid='" + studentid + "' and semester='" + sem + "'");
            DefaultTableModel dt = (DefaultTableModel) jTableview.getModel();
            int row = dt.getRowCount();
            Vector data = new Vector();

            for (int i = 0; i < row; i++) {
                dt.removeRow(i);
            }

            while (rs.next()) {

                Object pq[] = {rs.getString(1), code = rs.getString(2), grade = rs.getString(3)};
                dt.addRow(pq);
            }
            //  Get row data
            while (rs.next()) {
                Vector row1 = new Vector(row);
                for (int i = 1; i <= row; i++) {
                    row1.addElement(rs.getObject(i));
                }
                data.addElement(row1);
            }
            rs.close();

        } catch (SQLException ex) {
            Logger.getLogger(Assignmentmarks.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Assignmentmarks.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ArrayIndexOutOfBoundsException ex) {
            Logger.getLogger(Assignmentmarks.class.getName()).log(Level.SEVERE, null, ex);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabelHomebackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHomebackMouseClicked

        Studentsmanage rfg2 = new Studentsmanage();
        rfg2.setVisible(true);
        rfg2.pack();
        rfg2.setLocationRelativeTo(null);
        rfg2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();  // TODO add your handling code here:
    }//GEN-LAST:event_jLabelHomebackMouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void yearbox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearbox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearbox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        sendEmail();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Semesterresults_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Semesterresults_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Semesterresults_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Semesterresults_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Semesterresults_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelHomeback;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableview;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox yearbox;
    private javax.swing.JComboBox yearbox1;
    // End of variables declaration//GEN-END:variables
}
