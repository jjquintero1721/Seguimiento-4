package Ejercicio3;

public class Main {
    public static void main(String[] args) {
        Train train1 = new Train(101, "Madrid - Barcelona");
        Carriage carriage1 = new Carriage("Economy Class", 50);
        Carriage carriage2 = new Carriage("Tourist Class", 30);

        train1.addCarriage(carriage1);
        train1.addCarriage(carriage2);

        Trip trip1 = new Trip("2024-09-01", "08:00", "12:00", train1);

        Client client1 = new Client("Carlos Sánchez", "987654321", "Avenida Siempre Viva 456");

        Carriage selectedCarriage = train1.getCarriage("Economy Class");
        Seat selectedSeat = selectedCarriage.getSeat(1);

        if (selectedSeat != null) {
            selectedSeat.reserve();
            Ticket ticket1 = new Ticket(client1, trip1, selectedSeat);

            System.out.println("Ticket purchased by: " + client1.getName());
            System.out.println("Trip: " + trip1.getTrain().getRoute());
            System.out.println("Date: " + trip1.getDate() + " Departure time: " + trip1.getDepartureTime());
            System.out.println("Seat: " + selectedSeat.getNumber() + " Status: " + selectedSeat.getStatus());
        } else {
            System.out.println("Could not reserve the selected seat.");
        }
    }
}

