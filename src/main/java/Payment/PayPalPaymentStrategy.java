package Payment;


public class PayPalPaymentStrategy implements Payment {
    public String pay(double price) {
        return "PayPal and price = " + price;
    }
}