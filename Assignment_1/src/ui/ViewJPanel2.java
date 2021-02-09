/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import model.AddressInfo;

/**
 *
 * @author lenovo
 */
public class ViewJPanel2 extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel2
     */
    AddressInfo addressinfo;
    
    public ViewJPanel2(AddressInfo addressinfo) {
        initComponents();
        this.addressinfo = addressinfo;
        
        displayAddressInfo();
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
        txtzipCode = new javax.swing.JTextField();
        lblzipCode = new javax.swing.JLabel();
        lblstate = new javax.swing.JLabel();
        txtstate = new javax.swing.JTextField();
        txtcity = new javax.swing.JTextField();
        lblcity = new javax.swing.JLabel();
        txtstreetAddress = new javax.swing.JTextField();
        lblstreetAddress = new javax.swing.JLabel();
        lblAddressInfo = new javax.swing.JLabel();

        txtzipCode.setEditable(false);

        lblzipCode.setText("Zip Code:");

        lblstate.setText("State:");

        txtstate.setEditable(false);

        txtcity.setEditable(false);
        txtcity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcityActionPerformed(evt);
            }
        });

        lblcity.setText("City:");

        txtstreetAddress.setEditable(false);
        txtstreetAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstreetAddressActionPerformed(evt);
            }
        });

        lblstreetAddress.setText("Street Address:");

        lblAddressInfo.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        lblAddressInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddressInfo.setText("Address Information");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAddressInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblstreetAddress)
                        .addGap(18, 18, 18)
                        .addComponent(txtstreetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblcity, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblstate, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblzipCode, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtstate, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcity, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtzipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblAddressInfo)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblstreetAddress)
                    .addComponent(txtstreetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcity)
                    .addComponent(txtcity, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtstate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblstate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtzipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblzipCode))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtcityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcityActionPerformed

    private void txtstreetAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstreetAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstreetAddressActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAddressInfo;
    private javax.swing.JLabel lblcity;
    private javax.swing.JLabel lblstate;
    private javax.swing.JLabel lblstreetAddress;
    private javax.swing.JLabel lblzipCode;
    private javax.swing.JTextField txtcity;
    private javax.swing.JTextField txtstate;
    private javax.swing.JTextField txtstreetAddress;
    private javax.swing.JTextField txtzipCode;
    // End of variables declaration//GEN-END:variables

    private void displayAddressInfo() {
        txtstreetAddress.setText(addressinfo.getStreetAddress());
        txtcity.setText(addressinfo.getCity());
        txtstate.setText(addressinfo.getState());
        txtzipCode.setText(addressinfo.getZipcode());
    }
}