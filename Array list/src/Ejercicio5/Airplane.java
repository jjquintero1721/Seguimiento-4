package Ejercicio5;
import java.util.ArrayList;
import java.util.List;

public class Airplane {
    private String model;
    private int capacity;
    private List<Seat> seatList;

    public Airplane(String model, int capacity) {
        this.model = model;
        this.capacity = capacity;
        this.seatList = new ArrayList<>();
        for (int i = 1; i <= capacity; i++) {
            seatList.add(new Seat(i, "Economy"));
        }
    }

    public String getModel() {
        return model;
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
