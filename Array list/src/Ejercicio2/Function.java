package Ejercicio2;

public class Function {
    private String movie;
    private String startTime;
    private Room room;
    private double ticketPrice;

    public Function(String movie, String startTime, Room room, double ticketPrice) {
        this.movie = movie;
        this.startTime = startTime;
        this.room = room;
        this.ticketPrice = ticketPrice;
    }

    public String getMovie() {
        return movie;
    }

    public String getStartTime() {
        return startTime;
    }

    public Room getRoom() {
        return room;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }
}


