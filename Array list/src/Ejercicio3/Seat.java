package Ejercicio3;

public class Seat {
    private int number;
    private String status;

    public Seat(int number) {
        this.number = number;
        this.status = "available";
    }

    public int getNumber() {
        return number;
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


