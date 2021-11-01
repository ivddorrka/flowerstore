package Delivery;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import flowerstore.Item;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DHLDeliveryStrategyTest {

    DHLDeliveryStrategy dhldelivery;
    List<Item> list = new LinkedList<>();

    @BeforeEach
    void setUp() {
        dhldelivery = new DHLDeliveryStrategy();
    }

    @Test
    void deliver() {
        assertEquals("DHL Strategy", dhldelivery.deliver(list));
    }
}