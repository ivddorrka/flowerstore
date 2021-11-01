package Delivery;

import flowerstore.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class PostDeliveryStrategyTest {

    PostDeliveryStrategy postdelivery;
    List<Item> list = new LinkedList<>();

    @BeforeEach
    void setUp() {
        postdelivery = new PostDeliveryStrategy();
    }

    @Test
    void deliver() {
        assertEquals("Post Delivery strategy", postdelivery.deliver(list));
    }
}