package order;

import flowerstore.Flower;

public class QuickOrder {
    public static Order createOrder(Flower flower) {
        Order ord =  new Order(flower);
        return ord;
    }
}