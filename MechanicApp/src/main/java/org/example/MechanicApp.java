package org.example;

import java.util.*;

public class MechanicApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ServiceCatalogue catalog = new ServiceCatalogue();

        // Step 1: Get vehicle details
        System.out.println("Enter vehicle make: ");
        String make = scanner.nextLine();

        System.out.println("Enter vehicle model: ");
        String model = scanner.nextLine();

        System.out.println("Enter vehicle year: ");
        int year = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter vehicle color: ");
        String color = scanner.nextLine();

        Vehicle vehicle = new Vehicle(make, model, year); // adjust if you add color

        // Step 2: Show routine service parts
        List<ServicePart> parts = catalog.getPartsForVehicle(vehicle);
        System.out.println("\nRoutine service parts for " + vehicle + ":");
        for (ServicePart part : parts) {
            System.out.println("- " + part);
        }

        // Step 3: Allow mechanic to add issues
        while (true) {
            System.out.println("\nDo you want to add an issue? (yes/no)");
            String response = scanner.nextLine();
            if (!response.equalsIgnoreCase("yes")) break;

            System.out.println("Enter issue name: ");
            String issueName = scanner.nextLine();

            List<ServicePart> issueParts = new ArrayList<>();
            while (true) {
                System.out.println("Enter part needed (or type 'done' to finish): ");
                String partName = scanner.nextLine();
                if (partName.equalsIgnoreCase("done")) break;
                issueParts.add(new ServicePart(partName));
            }

            catalog.addIssue(issueName, issueParts);

            // Step 4: Show parts for the issue
            System.out.println("\nParts for issue '" + issueName + "':");
            for (ServicePart part : catalog.getPartsForIssue(issueName)) {
                System.out.println("- " + part);
            }
        }

        System.out.println("\nThank you! Service record completed.");
        scanner.close();
    }
}
