package Ejercicio4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProductManagementSystem {
    private List<Product> productList;

    public ProductManagementSystem() {
        this.productList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void removeProduct(String name) {
        productList.removeIf(product -> product.getName().equals(name));
    }

    public Product findProduct(String name) {
        for (Product product : productList) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    public void updateProduct(String name, double newPrice, int newStock) {
        Product product = findProduct(name);
        if (product != null) {
            product.setPrice(newPrice);
            product.setStock(newStock);
        }
    }

    public void showProducts() {
        for (Product product : productList) {
            System.out.println("Name: " + product.getName());
            System.out.println("Description: " + product.getDescription());
            System.out.println("Price: $" + product.getPrice());
            System.out.println("Stock: " + product.getStock());
            if (product instanceof PerishableProduct) {
                System.out.println("Expiration Date: " + ((PerishableProduct) product).getExpirationDate());
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ProductManagementSystem system = new ProductManagementSystem();

        Product product1 = new Product("Laptop", "15-inch laptop", 1000.0, 10);
        PerishableProduct product2 = new PerishableProduct("Milk", "Whole milk", 1.50, 100, LocalDate.of(2024, 10, 1));

        system.addProduct(product1);
        system.addProduct(product2);

        system.showProducts();

        system.updateProduct("Laptop", 950.0, 8);
        system.removeProduct("Milk");

        system.showProducts();
    }
}
