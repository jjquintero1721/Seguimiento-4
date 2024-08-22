package Ejercicio1;

import java.util.ArrayList;

public class Client extends Person {
    private ArrayList<String> creditHistory;
    private double income;

    public Client(String name, String id, String address, double income) {
        super(name, id, address);
        this.creditHistory = new ArrayList<>();
        this.income = income;
    }

    public ArrayList<String> getCreditHistory() {
        return creditHistory;
    }

    public void setCreditHistory(ArrayList<String> creditHistory) {
        this.creditHistory = creditHistory;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public void addCreditHistory(String entry) {
        creditHistory.add(entry);
    }
}


