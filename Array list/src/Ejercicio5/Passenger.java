package Ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Passenger extends Person {
    private List<Reservation> reservationHistory;

    public Passenger(String name, String id, String contact) {
        super(name, id, contact);
        this.reservationHistory = new ArrayList<>();
    }

    public List<Reservation> getReservationHistory() {
        return reservationHistory;
    }

    public void addReservation(Reservation reservation) {
        reservationHistory.add(reservation);
    }
}

