package Ejercicio1;

import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a client
        Client client = new Client("John Doe", "123456789", "123 Evergreen Terrace", 50000);

        // Input data for a personal credit request
        System.out.println("Enter the data for the personal credit request:");
        System.out.print("Credit amount: ");
        double amount = scanner.nextDouble();
        System.out.print("Term in months: ");
        int term = scanner.nextInt();
        System.out.print("Interest rate (%): ");
        double interestRate = scanner.nextDouble();

        CreditRequest personalCreditRequest = new CreditRequest(client, "personal", amount, term, interestRate);
        Credit personalCredit = new Credit(personalCreditRequest);

        // Evaluate the request (simple approval logic)
        if (client.getIncome() > amount * 0.3) {
            personalCredit.approve();
            client.addCreditHistory("Personal credit approved for amount: " + amount);
        } else {
            personalCredit.reject();
            client.addCreditHistory("Personal credit rejected for amount: " + amount);
        }

        System.out.println("Personal credit status: " + personalCredit.getStatus());

        // Input data for a mortgage credit request
        System.out.println("\nEnter the data for the mortgage credit request:");
        System.out.print("Credit amount: ");
        amount = scanner.nextDouble();
        System.out.print("Term in months: ");
        term = scanner.nextInt();
        System.out.print("Interest rate (%): ");
        interestRate = scanner.nextDouble();
        scanner.nextLine(); // Clear buffer
        System.out.print("Property address: ");
        String propertyAddress = scanner.nextLine();
        System.out.print("Property value: ");
        double propertyValue = scanner.nextDouble();

        Property property = new Property(propertyAddress, propertyValue);
        CreditRequest mortgageCreditRequest = new CreditRequest(client, "mortgage", amount, term, interestRate);
        MortgageCredit mortgageCredit = new MortgageCredit(mortgageCreditRequest, property);

        // Evaluate the request (simple approval logic)
        if (client.getIncome() > amount * 0.3 && property.getValue() > amount) {
            mortgageCredit.approve();
            client.addCreditHistory("Mortgage credit approved for amount: " + amount);
        } else {
            mortgageCredit.reject();
            client.addCreditHistory("Mortgage credit rejected for amount: " + amount);
        }

        System.out.println("Mortgage credit status: " + mortgageCredit.getStatus());

        // Display client's credit history
        System.out.println("\nClient's credit history:");
        for (String entry : client.getCreditHistory()) {
            System.out.println(entry);
        }

        scanner.close();
    }
}


