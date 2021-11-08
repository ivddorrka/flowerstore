package users;

import order.Order;

public class Sender implements User{
    public int number_card;
    public Sender() {
        setnumbercard(Order.usernamenum);
        Order.usernamenum ++;
    }
    public void setnumbercard(int number_card) {
        this.number_card = number_card;
    }
    public int getnumbercard() {
        return number_card;
    }
    @Override
    public void update(String status) {
        System.out.println("Status: " + status);
    }
}