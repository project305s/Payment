// DataLayer.java
import java.util.ArrayList;
import java.util.List;
/**
* Data Layer for the Online Library System's Payment Use Case.
*
* This class simulates data storage by using an in-memory list to store
payment records.
* It provides methods to save and retrieve payments.
*/
public class DataLayer {
private final List<Payment> paymentDatabase = new ArrayList<>();
/**
* Saves a payment to the in-memory database.
*/
public void savePayment(Payment payment) {
paymentDatabase.add(payment); // Add payment to the in-memory list
System.out.println("Payment saved to database.");
}
/**
* Retrieves all stored payments.
*/
public List<Payment> getAllPayments() {
return paymentDatabase;
}
}
