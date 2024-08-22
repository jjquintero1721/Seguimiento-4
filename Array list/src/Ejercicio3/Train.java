package Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Train {
    private int number;
    private String route;
    private List<Carriage> carriageList;

    public Train(int number, String route) {
        this.number = number;
        this.route = route;
        this.carriageList = new ArrayList<>();
    }

    public void addCarriage(Carriage carriage) {
        carriageList.add(carriage);
    }

    public int getNumber() {
        return number;
    }

    public String getRoute() {
        return route;
    }

    public Carriage getCarriage(String type) {
        for (Carriage carriage : carriageList) {
            if (carriage.getType().equals(type)) {
                return carriage;
            }
        }
        return null;
    }
}

