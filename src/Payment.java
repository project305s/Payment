// Payment.java

/**
 * Model class representing a payment in the Online Library System.
 */
public class Payment {
    private final String transactionId;
    private final String userId;
    private final double amount;
    private final String description;

    public Payment(String transactionId, String userId, double amount, String description) {
        this.transactionId = transactionId;
        this.userId = userId;
        this.amount = amount;
        this.description = description;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public String getUserId() {
        return userId;
    }

    public double getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Payment{transactionId='" + transactionId + "', userId='" + userId +
                "', amount=" + amount + ", description='" + description + "'}";
    }
}
