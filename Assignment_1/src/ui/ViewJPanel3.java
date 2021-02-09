/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import model.SavingsAccountInfo;

/**
 *
 * @author lenovo
 */


public class ViewJPanel3 extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel3
     */
    SavingsAccountInfo savingsaccountinfo;
    
    public ViewJPanel3(SavingsAccountInfo savingsaccountinfo) {
        initComponents();
        this.savingsaccountinfo = savingsaccountinfo;
        
        displaySavingsAccountInfo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblaccountType = new javax.swing.JLabel();
        txtaccountType = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lblsavingsInfo = new javax.swing.JLabel();
        lblbankName = new javax.swing.JLabel();
        txtbankName = new javax.swing.JTextField();
        lblbankRoutingInfo = new javax.swing.JLabel();
        txtbankRoutingInfo = new javax.swing.JTextField();
        lblbankAccountNum = new javax.swing.JLabel();
        txtbankAccountNum = new javax.swing.JTextField();
        lblaccountBalance = new javax.swing.JLabel();
        txtaccountBalance = new javax.swing.JTextField();
        lblaccountType1 = new javax.swing.JLabel();
        txtaccountType1 = new javax.swing.JTextField();

        lblaccountType.setText("Account Type:");

        txtaccountType.setEditable(false);
        txtaccountType.setForeground(new java.awt.Color(102, 102, 102));
        txtaccountType.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtaccountType.setText("SAVINGS");

        lblsavingsInfo.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        lblsavingsInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblsavingsInfo.setText("Savings Account Information");

        lblbankName.setText("Bank Name:");

        txtbankName.setEditable(false);

        lblbankRoutingInfo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblbankRoutingInfo.setText("Bank Routing Information:");

        txtbankRoutingInfo.setEditable(false);

        lblbankAccountNum.setText("Bank Account Number:");

        txtbankAccountNum.setEditable(false);

        lblaccountBalance.setText("Account Balance:");

        txtaccountBalance.setEditable(false);

        lblaccountType1.setText("Account Type:");

        txtaccountType1.setEditable(false);
        txtaccountType1.setForeground(new java.awt.Color(102, 102, 102));
        txtaccountType1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtaccountType1.setText("SAVINGS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblsavingsInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblaccountBalance)
                                .addComponent(lblbankAccountNum)
                                .addComponent(lblbankName)
                                .addComponent(lblbankRoutingInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(lblaccountType1)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtaccountType1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtaccountBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtbankName)
                                .addComponent(txtbankRoutingInfo)
                                .addComponent(txtbankAccountNum, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 60, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblsavingsInfo)
                .addGap(28, 28, 28)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblaccountType1)
                    .addComponent(txtaccountType1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblaccountBalance;
    private javax.swing.JLabel lblaccountType;
    private javax.swing.JLabel lblaccountType1;
    private javax.swing.JLabel lblbankAccountNum;
    private javax.swing.JLabel lblbankName;
    private javax.swing.JLabel lblbankRoutingInfo;
    private javax.swing.JLabel lblsavingsInfo;
    private javax.swing.JTextField txtaccountBalance;
    private javax.swing.JTextField txtaccountType;
    private javax.swing.JTextField txtaccountType1;
    private javax.swing.JTextField txtbankAccountNum;
    private javax.swing.JTextField txtbankName;
    private javax.swing.JTextField txtbankRoutingInfo;
    // End of variables declaration//GEN-END:variables

    private void displaySavingsAccountInfo() {
        
         txtbankName.setText(savingsaccountinfo.getBankName());
         txtbankRoutingInfo.setText(savingsaccountinfo.getBankRoutingInfo());
         txtbankAccountNum.setText(savingsaccountinfo.getBankAccountNum());
         txtaccountBalance.setText(savingsaccountinfo.getAccountBalance());

        
    }
}
