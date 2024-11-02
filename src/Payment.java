// Payment.java
/**
* Model class representing a payment entity in the Online Library System.
*
* This class encapsulates the details of a payment transaction, including
* the user making the payment, the amount, and the payment method.
*/
public class Payment {
private final String userId;
private final double amount;
private final String method;
/**
* Constructs a Payment instance with specified user ID, amount, and
method.
*   The ID of the user making the payment.
* @param amount The amount to be paid.
* @param method The method of payment (e.g., credit card, PayPal).
*/
public Payment(String userId, double amount, String method) {
this.userId = userId;
this.amount = amount;
this.method = method;
}
// Getters for Payment properties
public String getUserId() {
return userId;
}
public double getAmount() {
return amount;
}
public String getMethod() {
return method;
}
@Override
public String toString() {
return "Payment{userId='" + userId + "', amount=" + amount + ", method='" + method + "'}";
}
}