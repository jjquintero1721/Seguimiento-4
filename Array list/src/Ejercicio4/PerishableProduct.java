package Ejercicio4;

import java.time.LocalDate;

public class PerishableProduct extends Product {
    private LocalDate expirationDate;

    public PerishableProduct(String name, String description, double price, int stock, LocalDate expirationDate) {
        super(name, description, price, stock);
        this.expirationDate = expirationDate;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate newExpirationDate) {
        this.expirationDate = newExpirationDate;
    }
}

