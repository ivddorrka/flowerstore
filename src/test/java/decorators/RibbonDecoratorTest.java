package decorators;

import org.junit.jupiter.api.Test;
import flowerstore.FlowerBucket;
import flowerstore.Item;
import static org.junit.jupiter.api.Assertions.*;

class RibbonDecoratorTest {

    @Test
    void getPrice() {
        Item bucket = new FlowerBucket();
        assertEquals(40, bucket.getPrice());
    }
}