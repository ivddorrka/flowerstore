package decorators;

import org.junit.jupiter.api.Test;
import flowerstore.FlowerBucket;
import flowerstore.Item;
import static org.junit.jupiter.api.Assertions.*;

class PaperDecoratorTest {

    @Test
    void getPrice() {
        Item bucket = new FlowerBucket();
        bucket = new PaperDecorator(bucket);
        assertEquals(13, bucket.getPrice());
    }
}