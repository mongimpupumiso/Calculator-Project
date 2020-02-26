import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        assertEquals(4,Calculator.add(2,2));


    }

    @Test
    void testAdd() {
        assertEquals(6,Calculator.add(2,2,2));

    }

    @Test
    void multiply() {
        assertEquals(4,Calculator.multiply(2,2));

    }

    @Test
    void testMultiply() {
        assertEquals(8,Calculator.multiply(2,2,2));

    }
}