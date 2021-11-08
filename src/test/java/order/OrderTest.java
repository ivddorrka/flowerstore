package order;

import users.Receiver;
import users.User;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {
    Order order = new Order();
    Receiver user = new Receiver();

    @BeforeEach
    public void setUp() {
        order.addUser(user);
        order.notifyUsers();
    }
    @Test
    void addUser() {
        order.addUser(user);
        order.addUser(user);
        assertEquals(order.usersDB.size(), 3);
    }

    @Test
    void removeUser() {
        order.removeUser(user);
        assertEquals(order.usersDB.size(), 0);
    }

}