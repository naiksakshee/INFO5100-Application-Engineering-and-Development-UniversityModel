package patienthistory;

public class Address {
    String street;
    String community;
    int zipCode;
    String state;

    public Address() {}
    
    public Address(String street, String community, int zipCode, String state) {
        this.street = street;
        this.community = community;
        this.zipCode = zipCode;
        this.state = state;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    
    
}
