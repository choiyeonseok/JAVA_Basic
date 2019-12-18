package domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RowTest {

    @Test
    public void moveWhenNoLine() throws Exception {
        Row row = new Row(3);
        int target = row.moveRow(0);
        assertEquals(0, target);

        target = row.moveRow(2);
        assertEquals(2, target);
    }

    @Test
    public void moveWhenLineLeft() throws Exception {
        // 0 1 1
        Row row = new Row(3);
        row.drawLine(1);
        int target = row.moveRow(2);
        assertEquals(1, target);

        // 1 1 0
        row = new Row(3);
        row.drawLine(0);
        target = row.moveRow(1);
        assertEquals(0, target);
    }

    @Test
    public void moveWhenLineRight() throws Exception {
        // 0 1 1
        Row row = new Row(3);
        row.drawLine(1);
        int target = row.moveRow(1);
        assertEquals(2, target);

        // 1 1 0
        row = new Row(3);
        row.drawLine(0);
        target = row.moveRow(0);
        assertEquals(1, target);
    }

}