package Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private int number;
    private int capacity;
    private List<Seat> seatList;

    public Room(int number, int capacity) {
        this.number = number;
        this.capacity = capacity;
        this.seatList = new ArrayList<>();

        for (int row = 1; row <= capacity / 10; row++) { // Example: 10 seats per row
            for (int column = 1; column <= 10; column++) {
                seatList.add(new Seat(row, column));
            }
        }
    }

    public int getNumber() {
        return number;
    }

    public int getCapacity() {
        return capacity;
    }

    public Seat getSeat(int row, int column) {
        for (Seat seat : seatList) {
            if (seat.getRow() == row && seat.getColumn() == column) {
                return seat;
            }
        }
        return null;
    }
}
