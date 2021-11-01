package Payment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardPaymentStrategyTest {

    double price;
    CreditCardPaymentStrategy ccreditstrategy;
    @Test
    void pay() {
        price = 500;
        ccreditstrategy = new CreditCardPaymentStrategy();
        assertEquals("Credit card and price = 500", ccreditstrategy.pay(price));
    }
}