package Ejercicio5;

public class Reservation {
    private Passenger passenger;
    private Flight flight;
    private Seat seat;

    public Reservation(Passenger passenger, Flight flight, Seat seat) {
        this.passenger = passenger;
        this.flight = flight;
        this.seat = seat;
        passenger.addReservation(this);
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public Flight getFlight() {
        return flight;
    }

    public Seat getSeat() {
        return seat;
    }
}
