package domain;

public class Marker extends NaturalNumber{
    Marker(int number) {
        super(number);
    }

    public Marker moveLeft() {
        return new Marker(getNumber() - 1);
    }

    public Marker moveRight() {
        return new Marker(getNumber() + 1);
    }
}
