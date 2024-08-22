package Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Client extends Person {
    private List<Ticket> purchaseHistory;

    public Client(String name, String id, String address) {
        super(name, id, address);
        this.purchaseHistory = new ArrayList<>();
    }

    public List<Ticket> getPurchaseHistory() {
        return purchaseHistory;
    }

    public void addPurchase(Ticket ticket) {
        purchaseHistory.add(ticket);
    }
}

