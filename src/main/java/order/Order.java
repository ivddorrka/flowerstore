package order;
import Delivery.Delivery;
import flowerstore.Item;
import Payment.Payment;

import java.util.ArrayList;
import java.util.List;

public class Order {
    public List<Item> items = new ArrayList<>();
    private Payment payment;
    private Delivery delivery;

    public void setPaymentStrategy(Payment payment){
        this.payment = payment;
    }

    public void SetDeliveryStrategy(Delivery delivery){
        this.delivery = delivery;
    }

    public double calculateTotalPrice(){
        double result = 0;
        for(Item item: items){
            result +=item.getPrice();
        }
        return result;
    }

    public int processOrder(){
        System.out.println("In process");
        return 0;
    }

    public void addItem(Item item){
        items.add(item);
    }

    public void removeItem(Item item){
        items.remove(item);
    }
}
