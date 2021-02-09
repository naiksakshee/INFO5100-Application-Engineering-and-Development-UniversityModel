/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author lenovo
 */
public class CheckingAccountInfo {
    
    private String bankName;
    private String bankRoutingInfo;
    private String bankAccountNum;
    private String accountBalance;

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankRoutingInfo() {
        return bankRoutingInfo;
    }

    public void setBankRoutingInfo(String bankRoutingInfo) {
        this.bankRoutingInfo = bankRoutingInfo;
    }

    public String getBankAccountNum() {
        return bankAccountNum;
    }

    public void setBankAccountNum(String bankAccountNum) {
        this.bankAccountNum = bankAccountNum;
    }

    public String getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(String accountBalance) {
        this.accountBalance = accountBalance;
    }
    
    
    
    
}
