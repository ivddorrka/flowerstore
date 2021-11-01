package decorators;

import flowerstore.FlowerBucket;
import flowerstore.Item;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasketDecoratorTest {

    Item bucket = new FlowerBucket();

    @Test
    void getPrice() {
        bucket = new BasketDecorator(bucket);
        assertEquals(4, bucket.getPrice());
    }
}