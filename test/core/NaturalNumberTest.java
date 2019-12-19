package core;

import core.NaturalNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NaturalNumberTest {
    @Test
    public void create() throws Exception {
        NaturalNumber number = new NaturalNumber(1);
        assertEquals(1, number.getNumber());
    }

    @Test
    public void createWhenUnderZero() {
        try {
            new NaturalNumber(0);
            fail("IllegalArgumentException 이 발생해야 합니다.");
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }
    }

    @Test
    public void toArrayIndex() {
        NaturalNumber number = new NaturalNumber(3);
        assertEquals(2, number.toArrayIndex());
    }



}