/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataCollection.ui;

import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;

/**
 *
 * @author shubhangisrivastava
 */
public class DCDisability extends javax.swing.JPanel {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    PreparedStatement pst2 = null;
    ResultSet rs2 = null;
    public DCDisability() {
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
        String curr_client = rs.getString("client_id");
        lblClientID1.setText(curr_client);
        
//        int id = Integer.parseInt(lblClientID1.getText());
//                 String query2 ="select * from person where client_id=?";
//                 pst2 = con.prepareStatement(query2);
//                 pst2.setInt(1, id);
//                 rs2 = pst2.executeQuery();
//                 if(rs2.next()){
//                    String copy_client = rs2.getString("fname");
//                    lblFName1.setText(copy_client);}
        
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
        jPanel3 = new javax.swing.JPanel();
        lblClientID = new javax.swing.JLabel();
        lblDisType = new javax.swing.JLabel();
        comboDisabilityType = new javax.swing.JComboBox<>();
        lblDisStDt = new javax.swing.JLabel();
        DtDisStDt = new com.toedter.calendar.JDateChooser();
        lblVerify = new javax.swing.JLabel();
        comboVerify = new javax.swing.JComboBox<>();
        lblVerify1 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        lblBlindVerify = new javax.swing.JLabel();
        comboBlindVerify = new javax.swing.JComboBox<>();
        lblClientID1 = new javax.swing.JLabel();
        chkBlind = new java.awt.Checkbox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        jSplitPane1.setBackground(new java.awt.Color(102, 204, 255));
        jSplitPane1.setDividerSize(-20);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 642, Short.MAX_VALUE)
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(102, 204, 255));

        jPanel3.setBackground(new java.awt.Color(197, 221, 243));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        lblClientID.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        lblClientID.setText("Client ID:");

        lblDisType.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        lblDisType.setText("Disability Type:");

        comboDisabilityType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Not Applicable", "SSI", "SSA" }));

        lblDisStDt.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        lblDisStDt.setText("Disability Start Date:");

        lblVerify.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        lblVerify.setText("Verification:");

        comboVerify.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Not Applicable", "Hard Copy", "Pending" }));

        lblVerify1.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        lblVerify1.setText("Blind:");

        btnSave.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnNext.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        lblBlindVerify.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        lblBlindVerify.setText("Verification:");

        comboBlindVerify.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Not Applicable", "Hard Copy", "Pending" }));

        lblClientID1.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        lblClientID1.setText("Client ID:");

        chkBlind.setLabel("Check yes is applicable");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btnSave)
                        .addGap(45, 45, 45)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(219, 219, 219))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblVerify1)
                                    .addComponent(lblBlindVerify)
                                    .addComponent(lblClientID))
                                .addGap(251, 251, 251)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblClientID1)
                                    .addComponent(comboBlindVerify, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(chkBlind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(comboVerify, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(comboDisabilityType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(DtDisStDt, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(lblDisType)
                            .addComponent(lblDisStDt)
                            .addComponent(lblVerify))
                        .addGap(35, 35, 35))))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnNext, btnSave});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lblClientID)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblClientID1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDisType, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboDisabilityType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDisStDt)
                    .addComponent(DtDisStDt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVerify)
                    .addComponent(comboVerify, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblVerify1)
                    .addComponent(chkBlind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBlindVerify)
                    .addComponent(comboBlindVerify, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnNext))
                .addGap(56, 56, 56))
        );

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Data Collection - Disability");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        jLabel2.setText("Does the PI hold disability of any kind?");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(432, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(142, Short.MAX_VALUE))
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

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        
        
         try{
                SimpleDateFormat Date_Format = new SimpleDateFormat("yyyy-MM-dd");
                int id = Integer.parseInt(lblClientID1.getText());
                Boolean yes = chkBlind.getState();
                
                String query = "INSERT into disability " + " (client_id,disability_type,disability_start_date,verification1,is_blind,verification2)" + " values (?, ?, ?, ?, ?, ?)";
                con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/finalproject", "root", "Kidwainagar@1221");
                pst = con.prepareStatement(query);
                pst.setInt(1, id);      
                pst.setString(2, String.valueOf(comboDisabilityType.getSelectedItem()));
                pst.setString(3,Date_Format.format(DtDisStDt.getDate()));
                pst.setString(4, String.valueOf(comboVerify.getSelectedItem()));
                if(yes == true){
                     pst.setString(5, "Yes");
                }else{
                pst.setString(5, "No");
                }
                pst.setString(6, String.valueOf(comboBlindVerify.getSelectedItem()));
                pst.executeUpdate();
                 
        
            
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
       
        
         DcPregnancy dp = new DcPregnancy();
        jSplitPane1.setRightComponent(dp);
       
    }//GEN-LAST:event_btnNextActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
            final boolean enabled = jComboBox1.getSelectedIndex() == 0;
            lblClientID1.setEnabled(enabled);
            comboDisabilityType.setEnabled(enabled);
            DtDisStDt.isEnabled();


            
            comboVerify.setEnabled(enabled);
            chkBlind.setEnabled(enabled);
            comboBlindVerify.setEnabled(enabled);
            
            if(jComboBox1.getSelectedIndex()== 1){
                btnSave.setEnabled(false);
            } 
           
           
    }//GEN-LAST:event_jComboBox1ActionPerformed
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DtDisStDt;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnSave;
    private java.awt.Checkbox chkBlind;
    private javax.swing.JComboBox<String> comboBlindVerify;
    private javax.swing.JComboBox<String> comboDisabilityType;
    private javax.swing.JComboBox<String> comboVerify;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblBlindVerify;
    private javax.swing.JLabel lblClientID;
    private javax.swing.JLabel lblClientID1;
    private javax.swing.JLabel lblDisStDt;
    private javax.swing.JLabel lblDisType;
    private javax.swing.JLabel lblVerify;
    private javax.swing.JLabel lblVerify1;
    // End of variables declaration//GEN-END:variables
}
