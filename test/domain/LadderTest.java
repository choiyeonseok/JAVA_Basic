package domain;

import core.NaturalNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LadderTest {
    @Test
    public void moveWhenMultiRows() {
        // 1 1 0 0
        // 0 1 1 0
        // 0 0 1 1
        Ladder ladder = new Ladder(new NaturalNumber(3), new NaturalNumber(4));
        ladder.drawLine(new NaturalNumber(1), new NaturalNumber(1));
        ladder.drawLine(new NaturalNumber(2), new NaturalNumber(2));
        ladder.drawLine(new NaturalNumber(3), new NaturalNumber(3));

        assertEquals(new Marker(4), ladder.run(new Marker(1)));
        assertEquals(new Marker(1), ladder.run(new Marker(2)));
        assertEquals(new Marker(2), ladder.run(new Marker(3)));
        assertEquals(new Marker(3), ladder.run(new Marker(4)));
    }

    @Test
    public void generateWithNoLine() {
        Row[] rows = new Row[3];
        for (int i = 0; i < rows.length; i++) {
            rows[i] = new Row(new NaturalNumber(3));
        }
        String result = Ladder.generate(rows, new NaturalNumber(1), new NaturalNumber(1));
        assertEquals("0* 0 0 \n0 0 0 \n0 0 0 \n", result);
    }

    @Test
    public void generateWithLines() {
        Row[] rows = new Row[3];
        for (int i = 0; i < rows.length; i++) {
            rows[i] = new Row(new NaturalNumber(3));
        }
        rows[0].drawLine(new NaturalNumber(1));
        String result = Ladder.generate(rows, new NaturalNumber(1), new NaturalNumber(1));
        assertEquals("1* -1 0 \n0 0 0 \n0 0 0 \n", result);
    }

}