// DataLayer.java

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Data Layer for the Payment Use Case in the Online Library System.
 */
public class DataLayer {
    private final Map<String, Payment> paymentDatabase = new HashMap<>();

    public boolean savePayment(Payment payment) {
        if (paymentDatabase.containsKey(payment.getTransactionId())) {
            return false; // Transaction ID already exists
        }
        paymentDatabase.put(payment.getTransactionId(), payment);
        return true;
    }

    public Payment getPaymentById(String transactionId) {
        return paymentDatabase.get(transactionId);
    }

    /**
     * Retrieves all stored payments.
     * @return A list of all payments in the repository.
     */
    public List<Payment> getAllPayments() {
        return new ArrayList<>(paymentDatabase.values());
    }
}
