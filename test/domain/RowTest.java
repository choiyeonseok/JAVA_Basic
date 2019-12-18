package domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RowTest {
    private Row row;

    @BeforeEach
    protected void setUp() throws Exception {
        row = new Row(new NaturalNumber(3));
    }

    @Test
    public void startPositionWhenMinus() throws Exception {
        try {
            row.drawLine(new NaturalNumber(0));
            fail("IllegalArgumentException 에러가 발생해야 한다.");
        } catch (IllegalArgumentException e){
            assertTrue(true);
        }
    }

    @Test
    public void startPositionWhenOverNoOfPersons() throws Exception {
        try {
            row.drawLine(new NaturalNumber(3));
            fail("IllegalArgumentException 에러가 발생해야 한다.");
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }
    }

    @Test
    public void drawLineWhenAlreadyDrawingPoint() throws Exception {
        try {
            row.drawLine(new NaturalNumber(1));
            row.drawLine(new NaturalNumber(2));
            fail("IllegalArgumentException 에러가 발생해야 한다.");
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }
    }
    @Test
    public void moveWhenNoLine() throws Exception {
        int target = row.move(0);
        assertEquals(0, target);

        target = row.move(2);
        assertEquals(2, target);
    }

    @Test
    public void moveWhenLineLeft() throws Exception {
        // 0 1 1
        row.drawLine(new NaturalNumber(2));
        int target = row.move(2);
        assertEquals(1, target);

        // 1 1 0
        row.drawLine(new NaturalNumber(1));
        target = row.move(1);
        assertEquals(0, target);
    }

    @Test
    public void moveWhenLineRight() throws Exception {
        // 0 1 1
        row.drawLine(new NaturalNumber(2));
        int target = row.move(1);
        assertEquals(2, target);

        // 1 1 0
        row.drawLine(new NaturalNumber(1));
        target = row.move(0);
        assertEquals(1, target);
    }

}