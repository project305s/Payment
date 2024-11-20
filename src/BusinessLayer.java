// BusinessLayer.java

import java.util.List;

/*
* This Business Layer for the Online Library System's Payment Use Case.

* This class is responsible for handling the business logic of payment
processing.
* It validates the payment details and, if valid, stores them in the data
layer.
*/
public class BusinessLayer {
    private final DataLayer DataLayer;

    public BusinessLayer(DataLayer DataLayer) {
        this.DataLayer = DataLayer;
    }

    public void processPayment(Payment payment) {
        if (DataLayer.savePayment(payment)) {
            System.out.println("Payment processed successfully: " + payment.getTransactionId());
        } else {
            System.out.println("Failed to process payment. Transaction ID already exists: " + payment.getTransactionId());
        }
    }

    public Payment getPaymentDetails(String transactionId) {
        return DataLayer.getPaymentById(transactionId);
    }

    /**
     * Retrieves all stored payments.
     * @return A list of all payments.
     */
    public List<Payment> getAllPayments() {
        return DataLayer.getAllPayments();
    }
}
