package order;

import flowerstore.FlowerType;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import flowerstore.Flower;


class QuickOrderTest {
    Flower flower = new Flower(FlowerType.CHAMOMILE);

    @Test
    void createOrder() {
        Order order = QuickOrder.createOrder(flower);
        assertEquals(order.flower, flower);
    }
}