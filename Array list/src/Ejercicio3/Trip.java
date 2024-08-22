package Ejercicio3;

public class Trip {
    private String date;
    private String departureTime;
    private String arrivalTime;
    private Train train;

    public Trip(String date, String departureTime, String arrivalTime, Train train) {
        this.date = date;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.train = train;
    }

    public String getDate() {
        return date;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public Train getTrain() {
        return train;
    }
}


