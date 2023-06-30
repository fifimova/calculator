package skypro.course2.calculator.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static skypro.course2.calculator.constants.CalculatorServiceImplTestConstants.*;

class CalculatorServiceImplTest {
    private CalculatorServiceImpl out = new CalculatorServiceImpl();

    @Test
    void doesMethodPlus() {
        Integer actual1 = out.plus(ZERO, POSITIVE_NUM);
        Integer expected1 = ZERO + POSITIVE_NUM;
        assertEquals(expected1, actual1);

        Integer actual2 = out.plus(NEGATIVE_NUM, POSITIVE_NUM);
        Integer expected2 = NEGATIVE_NUM + POSITIVE_NUM;
        assertEquals(expected2, actual2);
    }

    @Test
    void doesMethodMinus() {
        Integer actual1 = out.minus(ZERO, POSITIVE_NUM);
        Integer expected1 = ZERO - POSITIVE_NUM;
        assertEquals(expected1, actual1);

        Integer actual2 = out.minus(NEGATIVE_NUM, NEGATIVE_NUM);
        Integer expected2 = NEGATIVE_NUM - NEGATIVE_NUM;
        assertEquals(expected2, actual2);
    }

    @Test
    void doesMethodMultiply() {
        Integer actual1 = out.multiply(ZERO, POSITIVE_NUM);
        Integer expected1 = ZERO * POSITIVE_NUM;
        assertEquals(expected1, actual1);

        Integer actual2 = out.multiply(NEGATIVE_NUM, POSITIVE_NUM);
        Integer expected2 = NEGATIVE_NUM * POSITIVE_NUM;
        assertEquals(expected2, actual2);
    }

    @Test
    void doesMethodDivide() {
        Integer actual1 = out.divide(ZERO, POSITIVE_NUM);
        Integer expected1 = ZERO / POSITIVE_NUM;
        assertEquals(expected1, actual1);

        Integer actual2 = out.divide(POSITIVE_NUM, POSITIVE_NUM);
        Integer expected2 = POSITIVE_NUM / POSITIVE_NUM;
        assertEquals(expected2, actual2);
    }

    @Test
    void doesDivisionByZeroThrowException() {
        assertThrows(IllegalArgumentException.class, () -> out.divide(POSITIVE_NUM, ZERO));
    }
}