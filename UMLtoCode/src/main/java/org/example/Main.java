package org.example;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("9 Wessel Cresent Montana", "PO Box 456");
        Addlty addlty= new Addlty("Emergency Details", "Kyle Marais");

        ContactDetails contact = new ContactDetails("0711505292", "Kyle.marais@gemail.com", "0211245789");
        contact.setAddress(address);
        contact.setAddlty(addlty);

        Employee employee = new Employee("Emp1", "Kyle", "Full-Time", "South African");
        employee.setContactDetails(contact);

        Position position = new Position("Dev1", "Active");
        Identity identity = new Identity("ID", "0304285351");
        identity.setPosition(position);
        identity.setAddlty(addlty);

        Job job = new Job("Software Developer");
        job.setIdentity(identity);

        System.out.println(employee);
        System.out.println(job);
    }
}




