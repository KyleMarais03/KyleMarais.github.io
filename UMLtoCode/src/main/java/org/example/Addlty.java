package org.example;

public class Addlty {
    private String type;
    private String value;

    public Addlty(String type, String value){
            this.type = type;
            this.value = value;
    }

    @Override
    public String toString() {
        return "org.example.Addlty{" +
                "type='" + type + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
