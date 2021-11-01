package Delivery;

import flowerstore.Item;

import order.Order;

public interface Delivery {
    String deliver(Order order);
}
