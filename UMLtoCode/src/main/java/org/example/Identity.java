package org.example;
public class Identity {
    private String type;
    private String value;
    private Position position;
    private Addlty addlty;

    public Identity(String type, String value){
        this.type = type;
        this.value = value;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public void setAddlty(Addlty addlty) {
        this.addlty = addlty;
    }

    @Override
    public String toString() {
        return "Identity{" +
                "type='" + type + '\'' +
                ", value='" + value + '\'' +
                ", position=" + position +
                ", addlty=" + addlty +
                '}';
    }
}
