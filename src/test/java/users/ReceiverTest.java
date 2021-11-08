package users;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReceiverTest {
    @Test
    void getID() {
        Receiver aperson = new Receiver();
        Receiver bperson = new Receiver();
        assertEquals(aperson.getnumbercard(), 2);
        assertEquals(bperson.getnumbercard(), 3);
    }

}