/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import javax.swing.JOptionPane;
import model.CheckingAccountInfo;

/**
 *
 * @author lenovo
 */
public class CreateJPanel4 extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel4
     */
    
    CheckingAccountInfo checkingaccountinfo;
    
    public CreateJPanel4(CheckingAccountInfo checkingaccountinfo) {
        initComponents();
        
        this.checkingaccountinfo = checkingaccountinfo;
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
        lblbankName = new javax.swing.JLabel();
        lblbankRoutingInfo = new javax.swing.JLabel();
        lblbankAccountNum = new javax.swing.JLabel();
        lblaccountBalance = new javax.swing.JLabel();
        lblaccountType = new javax.swing.JLabel();
        txtbankName = new javax.swing.JTextField();
        txtbankAccountNum = new javax.swing.JTextField();
        txtbankRoutingInfo = new javax.swing.JTextField();
        txtaccountBalance = new javax.swing.JTextField();
        txtaccountType = new javax.swing.JTextField();
        lblcheckingInfo = new javax.swing.JLabel();
        btnsave = new javax.swing.JButton();

        lblbankName.setText("Bank Name:");

        lblbankRoutingInfo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblbankRoutingInfo.setText("Bank Routing Information:");

        lblbankAccountNum.setText("Bank Account Number:");

        lblaccountBalance.setText("Account Balance:");

        lblaccountType.setText("Account Type:");

        txtaccountType.setEditable(false);
        txtaccountType.setForeground(new java.awt.Color(102, 102, 102));
        txtaccountType.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtaccountType.setText("CHECKING");

        lblcheckingInfo.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        lblcheckingInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcheckingInfo.setText("Checking Account Information");

        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblaccountBalance)
                            .addComponent(lblbankName)
                            .addComponent(lblbankRoutingInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblbankAccountNum))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtbankName, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbankRoutingInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbankAccountNum, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(txtaccountBalance)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblaccountType)
                        .addGap(18, 18, 18)
                        .addComponent(txtaccountType, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnsave)))
                .addGap(850, 850, 850))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblcheckingInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtaccountBalance, txtbankAccountNum, txtbankName, txtbankRoutingInfo});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblcheckingInfo)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblbankName)
                    .addComponent(txtbankName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblbankRoutingInfo)
                    .addComponent(txtbankRoutingInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblbankAccountNum)
                    .addComponent(txtbankAccountNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblaccountBalance)
                    .addComponent(txtaccountBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblaccountType)
                    .addComponent(txtaccountType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsave))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtaccountBalance, txtbankAccountNum, txtbankName, txtbankRoutingInfo});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // TODO add your handling code here:

        checkingaccountinfo.setBankName(txtbankName.getText());
        checkingaccountinfo.setBankRoutingInfo(txtbankRoutingInfo.getText());
        checkingaccountinfo.setBankAccountNum(txtbankAccountNum.getText());
        checkingaccountinfo.setAccountBalance(txtaccountBalance.getText());

        JOptionPane.showMessageDialog(this, "Checking Account Information saved successfully");

    }//GEN-LAST:event_btnsaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsave;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblaccountBalance;
    private javax.swing.JLabel lblaccountType;
    private javax.swing.JLabel lblbankAccountNum;
    private javax.swing.JLabel lblbankName;
    private javax.swing.JLabel lblbankRoutingInfo;
    private javax.swing.JLabel lblcheckingInfo;
    private javax.swing.JTextField txtaccountBalance;
    private javax.swing.JTextField txtaccountType;
    private javax.swing.JTextField txtbankAccountNum;
    private javax.swing.JTextField txtbankName;
    private javax.swing.JTextField txtbankRoutingInfo;
    // End of variables declaration//GEN-END:variables
}