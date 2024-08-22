package Ejercicio5;
import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Boeing 737", 180);

        Flight flight1 = new Flight("IB1234", "Madrid - Barcelona", LocalDate.of(2024, 9, 10), LocalTime.of(9, 0), LocalTime.of(10, 30), airplane1);

        Passenger passenger1 = new Passenger("Juan Pérez", "123456789", "juan.perez@example.com");

        Seat selectedSeat = airplane1.getSeat(10);

        if (selectedSeat != null && selectedSeat.getStatus().equals("available")) {
            selectedSeat.reserve();
            Reservation reservation1 = new Reservation(passenger1, flight1, selectedSeat);

            System.out.println("Reservation made for: " + passenger1.getName());
            System.out.println("Flight: " + flight1.getNumber() + " - " + flight1.getRoute());
            System.out.println("Date: " + flight1.getDate());
            System.out.println("Departure time: " + flight1.getDepartureTime());
            System.out.println("Seat: " + selectedSeat.getNumber() + " - " + selectedSeat.getClassType());
            System.out.println("Seat status: " + selectedSeat.getStatus());
        } else {
            System.out.println("Could not reserve the seat.");
        }
    }
}


