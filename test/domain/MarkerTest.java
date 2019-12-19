package domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MarkerTest {

    @Test
    public void testMoveLeft() throws Exception {
        Marker marker = new Marker(3);
        assertEquals(new Marker(2), marker.moveLeft());
    }

    @Test
    public void testMoveRight() throws Exception {
        Marker marker = new Marker(3);
        assertEquals(new Marker(4), marker.moveRight());
    }

}