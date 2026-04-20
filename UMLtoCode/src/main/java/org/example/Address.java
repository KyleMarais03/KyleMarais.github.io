package org.example;

public class Address {
    private String streetAddress;
    private String postalAddress;

    public Address(String streetAddress, String postalAddress) {
            this.streetAddress = streetAddress;
            this.postalAddress = postalAddress;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetAddress='" + streetAddress + '\'' +
                ", postalAddress='" + postalAddress + '\'' +
                '}';
    }
}
