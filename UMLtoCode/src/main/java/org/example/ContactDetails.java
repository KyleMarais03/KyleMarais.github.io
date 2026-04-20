package org.example;

public class ContactDetails {
    private String cellPhone;
    private String email;
    private String homeNumber;
    private Address address;
    private Addlty addlty;

    public ContactDetails(String cellPhone, String email, String homeNumber){
        this.cellPhone = cellPhone;
        this.email = email;
        this.homeNumber = homeNumber;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setAddlty(Addlty addlty) {
        this.addlty = addlty;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "ContactDetails{" +
                "cellPhone='" + cellPhone + '\'' +
                ", email='" + email + '\'' +
                ", homeNumber='" + homeNumber + '\'' +
                ", address=" + address +
                ", addlty=" + addlty +
                '}';
    }
}
