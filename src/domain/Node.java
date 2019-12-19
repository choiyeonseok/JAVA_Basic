package domain;

import java.util.Objects;

public class Node {
    private enum Direction {
        LEFT, RIGHT, CENTER;
    }

    private Direction direction;

    public Node(Direction direction) {
        this.direction = direction;
    }

    void changeRight() {
        this.direction = Direction.RIGHT;
    }

    void changeLeft() {
        if (this.direction == Direction.LEFT) {
            throw new IllegalArgumentException("선을 그을 수 없는 위치 입니다. ");
        }
        this.direction = Direction.LEFT;
    }

    Marker move(Marker marker) {
        if (this.direction == Direction.RIGHT) {
            return marker.moveRight();
        }
        if (this.direction == Direction.LEFT) {
            return marker.moveLeft();
        }
        return marker;
    }

    static Node createCenterNode() {
        return new Node(Direction.CENTER);
    }

    static Node createRightNode() {
        return new Node(Direction.RIGHT);
    }

    static Node createLeftNode() {
        return new Node(Direction.LEFT);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return direction == node.direction;
    }

    @Override
    public int hashCode() {
        return Objects.hash(direction);
    }
}
