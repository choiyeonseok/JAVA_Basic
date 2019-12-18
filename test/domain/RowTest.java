package domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RowTest {
    @Test
    public void noOfPersons() throws Exception {
        try {
            new Row(0);
            fail("IllegalArgumentException 에러가 발생해야 한다.");
        } catch (IllegalArgumentException e){
            assertTrue(true);
        }
    }

    @Test
    public void startPositionWhenMinus() throws Exception {
        try {
            Row row = new Row(3);
            row.drawLine(-1);
            fail("IllegalArgumentException 에러가 발생해야 한다.");
        } catch (IllegalArgumentException e){
            assertTrue(true);
        }
    }

    @Test
    public void startPositionWhenOverNoOfPersons() throws Exception {
        try {
            Row row = new Row(3);
            row.drawLine(2);
            fail("IllegalArgumentException 에러가 발생해야 한다.");
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }
    }

    @Test
    public void drawLineWhenAlreadyDrawingPoint() throws Exception {
        try {
            Row row = new Row(3);
            row.drawLine(0);
            row.drawLine(1);
            fail("IllegalArgumentException 에러가 발생해야 한다.");
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }
    }
    @Test
    public void moveWhenNoLine() throws Exception {
        Row row = new Row(3);
        int target = row.move(0);
        assertEquals(0, target);

        target = row.move(2);
        assertEquals(2, target);
    }

    @Test
    public void moveWhenLineLeft() throws Exception {
        // 0 1 1
        Row row = new Row(3);
        row.drawLine(1);
        int target = row.move(2);
        assertEquals(1, target);

        // 1 1 0
        row = new Row(3);
        row.drawLine(0);
        target = row.move(1);
        assertEquals(0, target);
    }

    @Test
    public void moveWhenLineRight() throws Exception {
        // 0 1 1
        Row row = new Row(3);
        row.drawLine(1);
        int target = row.move(1);
        assertEquals(2, target);

        // 1 1 0
        row = new Row(3);
        row.drawLine(0);
        target = row.move(0);
        assertEquals(1, target);
    }

}