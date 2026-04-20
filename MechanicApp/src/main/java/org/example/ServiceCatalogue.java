package org.example;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;



public class ServiceCatalogue {
    private Map<String, List<ServicePart>> catalogue = new HashMap<>();
    private Map<String, List<ServicePart>> issues = new HashMap<>();

public ServiceCatalogue(){
    catalogue.put("Toyota Corolla", Arrays.asList(new  ServicePart("Oil Filter"),
            new ServicePart("Spark Plugs"),
            new ServicePart("Air filter"),
            new ServicePart("Brake Pads")
            ));

    catalogue.put("Ford Ranger", Arrays.asList(new ServicePart("Oil Filter"),
            new ServicePart("Timing Belt"),
            new ServicePart("Diesel Filter"),
            new ServicePart("Serpentine Belt")
));
}
public List<ServicePart> getPartsForVehicle(Vehicle vehicle){
    String key = vehicle.getMake() + " " + vehicle.getModel().toLowerCase();
    return  catalogue.getOrDefault(key, List.of(new ServicePart("General Inspection Kit")));
}

public void addIssue(String issueName, List<ServicePart> parts){
    issues.put(issueName, parts);
}

public List<ServicePart> getPartsForIssue(String issueName){
    return issues.getOrDefault(issueName, List.of(new ServicePart("No specific parts listed")));
}
}
