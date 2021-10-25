package flowerstore;

import static org.junit.jupiter.api.Assertions.*;

class FlowerTest {
    private FlowerBucket flowerBucket1;
    private FlowerBucket flowerBucket2;
    private FlowerStore store1;
    private FlowerStore store2;
    private Flower flower1;
    private Flower flower2;
    private Flower flower3;
    private FlowerPack flowerPack1;
    private FlowerPack flowerPack2;
    private FlowerPack flowerPack3;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        flower1 = new Flower(FlowerType.CHAMOMILE);
        flower1.setColor("yellow");
        flower1.setPrice(50);
        flower1.setSepalLength(15);

        flower2 = new Flower(FlowerType.ROSE);
        flower2.setColor("red");
        flower2.setPrice(40);
        flower2.setSepalLength(25);

        flower3 = new Flower(FlowerType.TULIP);
        flower3.setColor("pink");
        flower3.setPrice(30);
        flower3.setSepalLength(35);

        flowerPack1 = new FlowerPack();
        flowerPack1.setFlower(flower1);
        flowerPack1.setAmount(5);


        flowerPack2 = new FlowerPack();
        flowerPack2.setFlower(flower2);
        flowerPack2.setAmount(7);

        flowerPack3 = new FlowerPack();
        flowerPack3.setFlower(flower3);
        flowerPack3.setAmount(9);

        flowerBucket1 = new FlowerBucket();
        flowerBucket1.addPack(flowerPack1);
        flowerBucket1.addPack(flowerPack2);

        flowerBucket2 = new FlowerBucket();
        flowerBucket2.addPack(flowerPack3);
        flowerBucket2.addPack(flowerPack2);

        store1 = new FlowerStore();
        store1.addBucket(flowerBucket1);

        store2 = new FlowerStore();
        store2.addBucket(flowerBucket2);

    }
    @org.junit.jupiter.api.Test
    void getPrice() {
        assertEquals(50, flower1.getPrice());
        assertEquals(40, flower2.getPrice());
        assertEquals(30, flower3.getPrice());
    }

    @org.junit.jupiter.api.Test
    void getColor() {
        assertEquals("yellow", flower1.getColor());
        assertEquals("red", flower2.getColor());
        assertEquals("pink", flower3.getColor());
    }

    @org.junit.jupiter.api.Test
    void getPackPrice() {
        assertEquals(250, flowerPack1.getPrice());
        assertEquals(280, flowerPack2.getPrice());
        assertEquals(270, flowerPack3.getPrice());
    }

    @org.junit.jupiter.api.Test
    void getBucketPrice() {
        assertEquals(530, flowerBucket1.getPrice());
        assertEquals(550, flowerBucket2.getPrice());
    }
    @org.junit.jupiter.api.Test
    void testSearch() {
        assertEquals(0, store1.search(FlowerType.ROSE));
        assertEquals(1, store2.search(FlowerType.CHAMOMILE));
    }

}