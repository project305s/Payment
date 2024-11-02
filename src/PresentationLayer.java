
/**
* This Presentation Layer for the Online Library System's Payment Use Case.

* This class serves as the main entry point for initiating a payment
transaction.
* It creates instances of the data and business layers and simulates a
user payment.
*/
public class PresentationLayer {
    public static void main(String[] args) {
    // Initialize data and business layers
    DataLayer DataLayer = new DataLayer();
    BusinessLayer BusinessLayer = new BusinessLayer(DataLayer);
    // Simulate a user making a payment
    Payment payment = new Payment("user123", 25.0, "credit card");
    BusinessLayer.processPayment(payment); // Process the payment through the business layer
    }
    }
    