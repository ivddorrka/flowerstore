package users;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SenderTest {


    @Test
    void getnumbercard() {
        Sender aper = new Sender();
        Sender bper = new Sender();
        assertEquals(aper.getnumbercard(), 0);
        assertEquals(bper.getnumbercard(), 1);
    }
}