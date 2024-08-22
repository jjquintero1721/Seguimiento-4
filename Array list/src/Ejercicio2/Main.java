package Ejercicio2;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Room room1 = new Room(1, 50); // 50 seats in the room
        Function function1 = new Function("Inception", "20:00", room1, 7.50);

        Client client1 = new Client("Juan Pérez", "123456789", "Calle Falsa 123");

        List<Seat> selectedSeats = new ArrayList<>();
        Seat seat1 = room1.getSeat(1, 1);
        Seat seat2 = room1.getSeat(1, 2);

        if (seat1 != null && seat2 != null) {
            seat1.reserve();
            seat2.reserve();
            selectedSeats.add(seat1);
            selectedSeats.add(seat2);

            Reservation reservation1 = new Reservation(client1, function1, selectedSeats);
            System.out.println("Reservation made for: " + client1.getName());
            System.out.println("Movie: " + function1.getMovie());
            System.out.println("Time: " + function1.getStartTime());
            System.out.println("Seats: ");
            for (Seat seat : reservation1.getSeatList()) {
                System.out.println("Row " + seat.getRow() + " Column " + seat.getColumn());
            }
        } else {
            System.out.println("Could not reserve the selected seats.");
        }
    }
}


