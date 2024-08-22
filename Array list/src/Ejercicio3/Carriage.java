package Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Carriage {
    private String type;
    private int capacity;
    private List<Seat> seatList;

    public Carriage(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
        this.seatList = new ArrayList<>();
        for (int i = 1; i <= capacity; i++) {
            seatList.add(new Seat(i));
        }
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    public Seat getSeat(int number) {
        for (Seat seat : seatList) {
            if (seat.getNumber() == number) {
                return seat;
            }
        }
        return null;
    }
}


