// PresentationLayer.java


/**
 * Main Class for Payment Use Case in the Online Library System.
 *
 * This class provides the user interface for payment operations. It processes multiple
 * payments, retrieves specific transaction details, and displays all stored transactions.
 */
import java.util.List;

public class PresentationLayer {
    private final BusinessLayer BusinessLayer;

    /**
     * Constructs the PresentationLayer and initializes the business layer.
     */
    public PresentationLayer() {
        // Initialize data and business layers
        DataLayer DataLayer = new DataLayer();
        this.BusinessLayer = new BusinessLayer(DataLayer);
    }

    /**
     * Simulates user interactions for processing payments and managing transactions.
     */
    public void start() {
        // Process some payments
        BusinessLayer.processPayment(new Payment("TXN001", "user001", 50.00, "Membership Fee"));
        BusinessLayer.processPayment(new Payment("TXN002", "user002", 30.00, "Overdue Fine"));
        BusinessLayer.processPayment(new Payment("TXN003", "user003", 20.00, "E-Book Purchase"));

        // Attempt to add a duplicate transaction
        BusinessLayer.processPayment(new Payment("TXN001", "user004", 40.00, "Duplicate Transaction"));

        // Retrieve and display a specific payment
        Payment retrievedPayment = BusinessLayer.getPaymentDetails("TXN002");
        if (retrievedPayment != null) {
            System.out.println("Retrieved Payment: " + retrievedPayment);
        } else {
            System.out.println("Transaction not found.");
        }

        // Display all stored payments
        System.out.println("\nAll Payments:");
        List<Payment> allPayments = BusinessLayer.getAllPayments();
        for (Payment payment : allPayments) {
            System.out.println(payment);
        }
    }

    /**
     * Main method to start the application.
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        PresentationLayer app = new PresentationLayer();
        app.start();
    }
}
