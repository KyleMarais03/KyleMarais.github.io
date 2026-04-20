package org.example;

public class ServicePart {
    private String name;

    public ServicePart(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return name;
    }
}
