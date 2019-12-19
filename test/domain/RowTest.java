package domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RowTest {
    private Row row;

    @BeforeEach
    protected void setUp() {
        row = new Row(new NaturalNumber(3));
    }

    @Test
    public void startPositionWhenMinus() {
        try {
            row.drawLine(new NaturalNumber(0));
            fail("IllegalArgumentException 에러가 발생해야 한다.");
        } catch (IllegalArgumentException e){
            assertTrue(true);
        }
    }

    @Test
    public void startPositionWhenOverNoOfPersons() {
        try {
            row.drawLine(new NaturalNumber(3));
            fail("IllegalArgumentException 에러가 발생해야 한다.");
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }
    }

    @Test
    public void drawLineWhenAlreadyDrawingPoint() {
        try {
            row.drawLine(new NaturalNumber(1));
            row.drawLine(new NaturalNumber(2));
            fail("IllegalArgumentException 에러가 발생해야 한다.");
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }
    }
    @Test
    public void moveWhenNoLine() {
        NaturalNumber target = row.move(new Marker(1));
        assertEquals(1, target.getNumber());

        target = row.move(new Marker(2));
        assertEquals(2, target.getNumber());
    }

    @Test
    public void moveWhenLineLeft() {
        // 0 1 1
        row.drawLine(new NaturalNumber(2));
        NaturalNumber target = row.move(new Marker(3));
        assertEquals(2, target.getNumber());
    }

    @Test
    public void moveWhenLineRight() {
        // 0 1 1
        row.drawLine(new NaturalNumber(2));
        NaturalNumber target = row.move(new Marker(2));
        assertEquals(3, target.getNumber());
    }

}