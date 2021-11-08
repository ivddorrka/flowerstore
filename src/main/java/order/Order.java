package order;
import Delivery.Delivery;
import flowerstore.Item;
import flowerstore.Flower;
import Payment.Payment;
import users.User;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private Payment payment;
    private Delivery delivery;
    public Flower flower;
    Order() {};
    Order(Flower flower) {
        this.flower = flower;
    }
    public List<Item> items = new ArrayList<>();
    public List<User> usersDB = new ArrayList<>();
    public static int usernamenum = 0;

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


    public void addUser(User user) {
        usersDB.add(user);
    }
    public void removeUser(User user) {
        usersDB.remove(user);
    }
    public void notifyUsers() {
        for (User user : usersDB) {
            user.update("UPDATE");
        }
    }
    public void order() {
        notifyUsers();
    }
}
