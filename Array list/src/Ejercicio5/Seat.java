package Ejercicio5;

public class Seat {
    private int number;
    private String classType;
    private String status;

    public Seat(int number, String classType) {
        this.number = number;
        this.classType = classType;
        this.status = "available";
    }

    public int getNumber() {
        return number;
    }

    public String getClassType() {
        return classType;
    }

    public String getStatus() {
        return status;
    }

    public void reserve() {
        if (status.equals("available")) {
            status = "reserved";
        }
    }

    public void occupy() {
        if (status.equals("reserved")) {
            status = "occupied";
        }
    }
}


