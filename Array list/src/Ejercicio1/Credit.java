package Ejercicio1;
public class Credit {
    private CreditRequest creditRequest;
    private String status; // "approved", "rejected", "pending"

    public Credit(CreditRequest creditRequest) {
        this.creditRequest = creditRequest;
        this.status = "pending";
    }

    public CreditRequest getCreditRequest() {
        return creditRequest;
    }

    public void setCreditRequest(CreditRequest creditRequest) {
        this.creditRequest = creditRequest;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void approve() {
        status = "approved";
    }

    public void reject() {
        status = "rejected";
    }
}
