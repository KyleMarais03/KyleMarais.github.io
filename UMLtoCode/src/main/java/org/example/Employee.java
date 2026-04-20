package org.example;

public class Employee {
    private String employeeNumber;
    private String name;
    private String employmentType;
    private String nationality;
    private ContactDetails contactDetails;

    public Employee(String employeeNumber, String name, String employmentType, String nationaity){
        this.employeeNumber = employeeNumber;
        this.name = name;
        this.employmentType = employmentType;
        this.nationality = nationaity;
    }

    public void setContactDetails(ContactDetails contactDetails) {
        this.contactDetails = contactDetails;
    }

    public ContactDetails getContactDetails() {
        return contactDetails;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeNumber='" + employeeNumber + '\'' +
                ", name='" + name + '\'' +
                ", employmentType='" + employmentType + '\'' +
                ", nationality='" + nationality + '\'' +
                ", contactDetails=" + contactDetails +
                '}';
    }
}
