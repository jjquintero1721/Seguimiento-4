package Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Client extends Person {
    private List<Reservation> reservationHistory;

    public Client(String name, String id, String address) {
        super(name, id, address);
        this.reservationHistory = new ArrayList<>();
    }

    public List<Reservation> getReservationHistory() {
        return reservationHistory;
    }

    public void addReservation(Reservation reservation) {
        reservationHistory.add(reservation);
    }
}
