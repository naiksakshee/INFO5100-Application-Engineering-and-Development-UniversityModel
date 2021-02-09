/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import javax.swing.JOptionPane;
import model.LicenseInfo;

/**
 *
 * @author lenovo
 */
public class CreateJPanel5 extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel5
     */
    
    LicenseInfo licenseinfo;
    
    public CreateJPanel5(LicenseInfo licenseinfo) {
        initComponents();
        
       this.licenseinfo = licenseinfo;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lbllicenseInfo = new javax.swing.JLabel();
        lbllicenseNum = new javax.swing.JLabel();
        txtlicenseNum = new javax.swing.JTextField();
        lbldateOfIssue = new javax.swing.JLabel();
        txtdateOfIssue = new javax.swing.JTextField();
        lbldateOfExpiry = new javax.swing.JLabel();
        txtdateOfExpiry = new javax.swing.JTextField();
        lblbloodType = new javax.swing.JLabel();
        txtbloodType = new javax.swing.JTextField();
        btnsave = new javax.swing.JButton();

        jPanel2.setPreferredSize(new java.awt.Dimension(402, 305));

        lbllicenseInfo.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        lbllicenseInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbllicenseInfo.setText("License Information");

        lbllicenseNum.setText("License Number:");

        lbldateOfIssue.setText("Date of Issue:");

        lbldateOfExpiry.setText("Date of Expiry:");

        lblbloodType.setText("Blood Type:");

        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbllicenseNum)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtlicenseNum, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbldateOfIssue)
                            .addComponent(lbldateOfExpiry)
                            .addComponent(lblbloodType))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdateOfExpiry)
                            .addComponent(txtbloodType)
                            .addComponent(btnsave)
                            .addComponent(txtdateOfIssue, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(59, Short.MAX_VALUE))
            .addComponent(lbllicenseInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtbloodType, txtdateOfExpiry, txtdateOfIssue, txtlicenseNum});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lbllicenseInfo)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbllicenseNum)
                    .addComponent(txtlicenseNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbldateOfIssue)
                    .addComponent(txtdateOfIssue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbldateOfExpiry)
                    .addComponent(txtdateOfExpiry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblbloodType)
                    .addComponent(txtbloodType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnsave)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtbloodType, txtdateOfExpiry, txtdateOfIssue, txtlicenseNum});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // TODO add your handling code here:
        
        licenseinfo.setLicenseNum(txtlicenseNum.getText());
        licenseinfo.setDateOfIssue(txtdateOfIssue.getText());
        licenseinfo.setDateOfExpiry(txtdateOfExpiry.getText());
        licenseinfo.setBloodType(txtbloodType.getText());
        
        
        
        /*licenseinfo.setLicenseNum(txtlicenseNum.getText());
        licenseinfo.setDateOfIssue(txtdateOfIssue.getText());
        licenseinfo.setDateOfExpiry(txtdateOfExpiry.getText());
        licenseinfo.setBloodType(txtbloodType.getText());*/
   
        JOptionPane.showMessageDialog(this, "License Information saved successfully");
        
        
    }//GEN-LAST:event_btnsaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsave;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblbloodType;
    private javax.swing.JLabel lbldateOfExpiry;
    private javax.swing.JLabel lbldateOfIssue;
    private javax.swing.JLabel lbllicenseInfo;
    private javax.swing.JLabel lbllicenseNum;
    private javax.swing.JTextField txtbloodType;
    private javax.swing.JTextField txtdateOfExpiry;
    private javax.swing.JTextField txtdateOfIssue;
    private javax.swing.JTextField txtlicenseNum;
    // End of variables declaration//GEN-END:variables
}