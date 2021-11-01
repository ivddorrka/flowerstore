package Payment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PayPalPaymentStrategyTest {
    double price;
    PayPalPaymentStrategy paypalstrategy;
    @Test
    void pay() {
        price = 500;
        paypalstrategy = new PayPalPaymentStrategy();
        assertEquals("PayPal and price = 500.0", paypalstrategy.pay(price));
    }
}