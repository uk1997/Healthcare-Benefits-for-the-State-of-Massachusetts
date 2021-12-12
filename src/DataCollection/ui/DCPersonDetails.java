/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataCollection.ui;

import ApplicationRegistration.ui.SearchClient;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author shubhangisrivastava
 */
public class DCPersonDetails extends javax.swing.JPanel {

   
 
    Connection con = null;
    PreparedStatement pst = null;
    PreparedStatement pst2 = null;
    ResultSet rs = null;
    ResultSet rs2 = null;
    public DCPersonDetails() {
        initComponents();
       fetch();
    }
     public void fetch(){
    try{
        String query = "select * from searchclient order by id desc limit 1;";
        con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/finalproject", "root", "Kidwainagar@1221");
        pst = con.prepareStatement(query);
        rs = pst.executeQuery();
        if(rs.next()){
        String curr_client_id = rs.getString("client_id");
        lblClient1.setText(curr_client_id);
        }
       // JOptionPane.showMessageDialog(this, "h1");
       
       String query2 = "select * from person p inner join searchclient sc where p.client_id=?";
        //JOptionPane.showMessageDialog(this, "h2");
        pst2 = con.prepareStatement(query2);
       //  JOptionPane.showMessageDialog(this, "h3");
        pst2.setString(1, lblClient1.getText());
        // JOptionPane.showMessageDialog(this, "h4");
        rs2 = pst2.executeQuery();
        // JOptionPane.showMessageDialog(this, "h5");
        if(rs2.next()){
         //    JOptionPane.showMessageDialog(this, "h6");
        String fname= rs2.getString("p.fname");
        txtFName.setText(fname);
        String mname = rs2.getString("p.mname");
        txtMName.setText(mname);
        String lname = rs2.getString("p.lname");
        txtLName.setText(lname);
        String DOB = rs2.getString("p.dob");
        txtDob.setText(DOB);
        String maritalstatus = rs2.getString("p.marital_status");
        txtMarital.setText(maritalstatus);
        String race = rs2.getString("p.race");
        txtRace.setText(race);
        String eth = rs2.getString("p.ethnicity");
        txtEthnicity.setText(eth);
        String gender = rs2.getString("p.gender");
        txtGender.setText(gender);
        String ph_num = rs2.getString("p.phone");
        txtPhone.setText(ph_num);
        String ssn = rs2.getString("p.ssn");
        txtSSN.setText(ssn);
        }
    }catch(Exception ex){
    JOptionPane.showMessageDialog(this, ex.getMessage());
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

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lblFName = new javax.swing.JLabel();
        txtFName = new javax.swing.JTextField();
        lblMName = new javax.swing.JLabel();
        txtMName = new javax.swing.JTextField();
        lblLName = new javax.swing.JLabel();
        lblDob = new javax.swing.JLabel();
        txtLName = new javax.swing.JTextField();
        lblMarital = new javax.swing.JLabel();
        lblRace = new javax.swing.JLabel();
        lblEth = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        txtMarital = new javax.swing.JTextField();
        lblPhone = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        btnNext = new javax.swing.JButton();
        lblSSN = new javax.swing.JLabel();
        txtSSN = new javax.swing.JTextField();
        lblClient = new javax.swing.JLabel();
        lblClient1 = new javax.swing.JLabel();
        txtDob = new javax.swing.JTextField();
        txtRace = new javax.swing.JTextField();
        txtEthnicity = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();

        setBackground(new java.awt.Color(102, 204, 255));

        jSplitPane1.setBackground(new java.awt.Color(102, 204, 255));
        jSplitPane1.setDividerLocation(150);
        jSplitPane1.setDividerSize(0);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(0, 642));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 652, Short.MAX_VALUE)
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(102, 204, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(1022, 646));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Data Collection - Person Details");

        jPanel5.setBackground(new java.awt.Color(204, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        lblFName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblFName.setText("First Name:");

        txtFName.setEnabled(false);
        txtFName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFNameActionPerformed(evt);
            }
        });

        lblMName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblMName.setText("Middle Name:");

        txtMName.setEnabled(false);

        lblLName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblLName.setText("Last Name:");

        lblDob.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblDob.setText("Date of Birth:");

        txtLName.setEnabled(false);

        lblMarital.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblMarital.setText("Marital Status:");

        lblRace.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblRace.setText("Race:");

        lblEth.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblEth.setText("Ethnicity:");

        lblGender.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblGender.setText("Gender:");

        txtMarital.setEnabled(false);

        lblPhone.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblPhone.setText("Phone Number:");

        txtPhone.setEnabled(false);

        btnNext.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        lblSSN.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblSSN.setText("SSN:");

        txtSSN.setEnabled(false);

        lblClient.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblClient.setText("Client ID:");

        lblClient1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblClient1.setText("Client ID:");

        txtDob.setEnabled(false);

        txtRace.setEnabled(false);

        txtEthnicity.setEnabled(false);

        txtGender.setEnabled(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(303, 303, 303)
                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblGender)
                                .addComponent(lblEth))
                            .addGap(49, 49, 49))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblDob)
                                .addComponent(lblLName))
                            .addGap(19, 19, 19))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblMName)
                                .addComponent(lblFName)
                                .addComponent(lblClient))
                            .addGap(15, 15, 15)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPhone, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSSN, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMarital, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRace, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(6, 6, 6)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMarital, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(txtPhone, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtRace)
                            .addComponent(txtGender)
                            .addComponent(txtEthnicity)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtLName, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                .addComponent(txtDob))
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblClient1)
                                .addComponent(txtMName, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtFName, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(txtSSN)))
                .addContainerGap(278, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblClient)
                    .addComponent(lblClient1))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFName)
                    .addComponent(txtFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMName)
                    .addComponent(txtMName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lblLName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblDob))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(txtLName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMarital)
                    .addComponent(txtMarital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRace)
                    .addComponent(txtRace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEth)
                    .addComponent(txtEthnicity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGender)
                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhone)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSSN)
                    .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(btnNext)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 808, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 50, Short.MAX_VALUE))
        );

        jSplitPane1.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtFNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFNameActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        DCRelationship dr = new DCRelationship();
        jSplitPane1.setRightComponent(dr);
    }//GEN-LAST:event_btnNextActionPerformed
//public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(DCPersonDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(DCPersonDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(DCPersonDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(DCPersonDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new DCPersonDetails().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblClient;
    private javax.swing.JLabel lblClient1;
    private javax.swing.JLabel lblDob;
    private javax.swing.JLabel lblEth;
    private javax.swing.JLabel lblFName;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblLName;
    private javax.swing.JLabel lblMName;
    private javax.swing.JLabel lblMarital;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblRace;
    private javax.swing.JLabel lblSSN;
    private javax.swing.JTextField txtDob;
    private javax.swing.JTextField txtEthnicity;
    private javax.swing.JTextField txtFName;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtLName;
    private javax.swing.JTextField txtMName;
    private javax.swing.JTextField txtMarital;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtRace;
    private javax.swing.JTextField txtSSN;
    // End of variables declaration//GEN-END:variables
}
