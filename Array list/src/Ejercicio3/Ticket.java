package Ejercicio3;

public class Ticket {
    private Client client;
    private Trip trip;
    private Seat seat;

    public Ticket(Client client, Trip trip, Seat seat) {
        this.client = client;
        this.trip = trip;
        this.seat = seat;
        client.addPurchase(this);
    }

    public Client getClient() {
        return client;
    }

    public Trip getTrip() {
        return trip;
    }

    public Seat getSeat() {
        return seat;
    }
}


