package domain;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

class NodeTest {

    @Test
    public void createCenter() {
        Node node = Node.createCenterNode();
        assertEquals(Node.createCenterNode(), node);
    }

    @Test
    public void changeLeft() {
        Node node = Node.createCenterNode();
        node.changeLeft();
        assertEquals(Node.createLeftNode(), node);
    }

    @Test
    public void changeLeftWhenAlreadyLeft() {
        try {
            Node node = Node.createLeftNode();
            node.changeLeft();
            assertEquals(Node.createLeftNode(), node);
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }
    }

    @Test
    public void changeRight() {
        Node node = Node.createLeftNode();
        node.changeRight();
        assertEquals(Node.createRightNode(), node);
    }

    @Test
    public void moveRight() {
        Node node = Node.createRightNode();
        Marker marker = node.move(new Marker(3));
        assertEquals(new Marker(4), marker);
    }

    @Test
    public void moveLeft() {
        Node node = Node.createLeftNode();
        Marker marker = node.move(new Marker(3));
        assertEquals(new Marker(2), marker);
    }

}