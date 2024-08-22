package Ejercicio5;

import java.time.LocalDate;
import java.time.LocalTime;

public class Flight {
    private String number;
    private String route;
    private LocalDate date;
    private LocalTime departureTime;
    private LocalTime arrivalTime;
    private Airplane airplane;

    public Flight(String number, String route, LocalDate date, LocalTime departureTime, LocalTime arrivalTime, Airplane airplane) {
        this.number = number;
        this.route = route;
        this.date = date;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.airplane = airplane;
    }

    public String getNumber() {
        return number;
    }

    public String getRoute() {
        return route;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public LocalTime getArrivalTime() {
        return arrivalTime;
    }

    public Airplane getAirplane() {
        return airplane;
    }
}
