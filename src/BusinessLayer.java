/**
* This Business Layer for the Online Library System's Payment Use Case.

* This class is responsible for handling the business logic of payment
processing.
* It validates the payment details and, if valid, stores them in the data
layer.
*/
public class BusinessLayer {
    private final DataLayer DataLayer;
    /**
    * Constructs a BusinessLayer with a specified repository.
    * The repository to manage payment data.
    */
    public BusinessLayer(DataLayer DataLayer) 
    {
    this.DataLayer = DataLayer;
    }
    /**
    * Processes a payment by validating it and saving it to the
    repository if valid.

*/
    public void processPayment(Payment payment) {
    // Validate payment details before saving
    if (validatePayment(payment)) { DataLayer.savePayment(payment); // Save to repository if valid
    System.out.println("Payment processed successfully.");
    } else {
    System.out.println("Payment validation failed.");
    }
    }
    /**
    * Validates the payment details to ensure they are correct.
    * Basic checks include non-zero payment amount and non-null payment
    method.
    * The payment to be validated.
    * true if the payment is valid; false otherwise.
    */
    private boolean validatePayment(Payment payment) {
    // Basic validation checks
    return payment.getAmount() > 0 && payment.getMethod() != null;
    }
    }