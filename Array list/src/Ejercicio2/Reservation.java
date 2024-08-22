package Ejercicio2;

import java.util.List;

public class Reservation {
    private Client client;
    private Function function;
    private List<Seat> seatList;

    public Reservation(Client client, Function function, List<Seat> seatList) {
        this.client = client;
        this.function = function;
        this.seatList = seatList;

        client.addReservation(this);
    }

    public Client getClient() {
        return client;
    }

    public Function getFunction() {
        return function;
    }

    public List<Seat> getSeatList() {
        return seatList;
    }
}


