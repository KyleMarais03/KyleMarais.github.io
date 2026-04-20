package org.example;
public class Position {
    private String positionCode;
    private String status;

    public Position(String positionCode, String status) {
        this.positionCode = positionCode;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Position{" +
                "positionCode='" + positionCode + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
