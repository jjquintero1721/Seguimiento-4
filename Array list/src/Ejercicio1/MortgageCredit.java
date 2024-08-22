package Ejercicio1;

public class MortgageCredit extends Credit {
    private Property property;

    public MortgageCredit(CreditRequest creditRequest, Property property) {
        super(creditRequest);
        this.property = property;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }
}

