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



public class Report {
    
    private Person reportperson;
    private AddressInfo reportaddressinfo;
    private SavingsAccountInfo reportsavingsaccountinfo;
    private CheckingAccountInfo reportcheckingaccountinfo;
    private LicenseInfo reportlicenseinfo;
    private MedicalInfo reportmedicalinfo;
    private String setFilePath;

    public String getSetFilePath() {
        return setFilePath;
    }

    public void setSetFilePath(String setFilePath) {
        this.setFilePath = setFilePath;
    }

    
    
    
    public Person getreportperson() {
        return reportperson;
    }

    public void setreportperson(Person reportperson) {
        this.reportperson = reportperson;
    }

    public AddressInfo getReportaddressinfo() {
        return reportaddressinfo;
    }

    public void setReportaddressinfo(AddressInfo reportaddressinfo) {
        this.reportaddressinfo = reportaddressinfo;
    }

    public SavingsAccountInfo getReportsavingsaccountinfo() {
        return reportsavingsaccountinfo;
    }

    public void setReportsavingsaccountinfo(SavingsAccountInfo reportsavingsaccountinfo) {
        this.reportsavingsaccountinfo = reportsavingsaccountinfo;
    }

    public CheckingAccountInfo getReportcheckingaccountinfo() {
        return reportcheckingaccountinfo;
    }

    public void setReportcheckingaccountinfo(CheckingAccountInfo reportcheckingaccountinfo) {
        this.reportcheckingaccountinfo = reportcheckingaccountinfo;
    }

    public LicenseInfo getReportlicenseinfo() {
        return reportlicenseinfo;
    }

    public void setReportlicenseinfo(LicenseInfo reportlicenseinfo) {
        this.reportlicenseinfo = reportlicenseinfo;
    }

    public MedicalInfo getReportmedicalinfo() {
        return reportmedicalinfo;
    }

    public void setReportmedicalinfo(MedicalInfo reportmedicalinfo) {
        this.reportmedicalinfo = reportmedicalinfo;
    }
    
    
    
   // private String firstName;
    /*private String lastName;
    private String phoneNum;
    private String birthDate;
    private String age;
    private String height;
    private String weight;
    private String ssn;
    
    private String streetAddress;
    private String city;
    private String state;
    private String zipcode;
    
    private String bankName1;
    private String bankRoutingInfo1;
    private String bankAccountNum1;
    private String accountBalance1;
    
    private String bankName2;
    private String bankRoutingInfo2;
    private String bankAccountNum2;
    private String accountBalance2;
    
    private String licenseNum;
    private String dateOfIssue;
    private String dateOfExpiry;
    private String bloodType;
    
    private String medicalRecordNum;
    private String doctorName;
    private String allergy1;*/

  /*  public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

   /* public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getBankName1() {
        return bankName1;
    }

    public void setBankName1(String bankName1) {
        this.bankName1 = bankName1;
    }

    public String getBankRoutingInfo1() {
        return bankRoutingInfo1;
    }

    public void setBankRoutingInfo1(String bankRoutingInfo1) {
        this.bankRoutingInfo1 = bankRoutingInfo1;
    }

    public String getBankAccountNum1() {
        return bankAccountNum1;
    }

    public void setBankAccountNum1(String bankAccountNum1) {
        this.bankAccountNum1 = bankAccountNum1;
    }

    public String getAccountBalance1() {
        return accountBalance1;
    }

    public void setAccountBalance1(String accountBalance1) {
        this.accountBalance1 = accountBalance1;
    }

    public String getBankName2() {
        return bankName2;
    }

    public void setBankName2(String bankName2) {
        this.bankName2 = bankName2;
    }

    public String getBankRoutingInfo2() {
        return bankRoutingInfo2;
    }

    public void setBankRoutingInfo2(String bankRoutingInfo2) {
        this.bankRoutingInfo2 = bankRoutingInfo2;
    }

    public String getBankAccountNum2() {
        return bankAccountNum2;
    }

    public void setBankAccountNum2(String bankAccountNum2) {
        this.bankAccountNum2 = bankAccountNum2;
    }

    public String getAccountBalance2() {
        return accountBalance2;
    }

    public void setAccountBalance2(String accountBalance2) {
        this.accountBalance2 = accountBalance2;
    }

    public String getLicenseNum() {
        return licenseNum;
    }

    public void setLicenseNum(String licenseNum) {
        this.licenseNum = licenseNum;
    }

    public String getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(String dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public String getDateOfExpiry() {
        return dateOfExpiry;
    }

    public void setDateOfExpiry(String dateOfExpiry) {
        this.dateOfExpiry = dateOfExpiry;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getMedicalRecordNum() {
        return medicalRecordNum;
    }

    public void setMedicalRecordNum(String medicalRecordNum) {
        this.medicalRecordNum = medicalRecordNum;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getAllergy1() {
        return allergy1;
    }

    public void setAllergy1(String allergy1) {
        this.allergy1 = allergy1;
    }*/
    
    
    
    
}
