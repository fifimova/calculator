package skypro.course2.calculator.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static skypro.course2.calculator.constants.CalculatorServiceImplTestConstants.*;

public class CalculatorServiceImplParameterizedTest {
    private CalculatorServiceImpl out = new CalculatorServiceImpl();

    public static Stream<Arguments> provideParamsForTests() {
        return Stream.of(
                Arguments.of(ZERO, POSITIVE_NUM),
                Arguments.of(NEGATIVE_NUM, POSITIVE_NUM),
                Arguments.of(NEGATIVE_NUM, NEGATIVE_NUM)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    void doesMethodPlus(Integer num1, Integer num2) {
        Integer actual = out.plus(num1, num2);
        Integer expected = num1 + num2;
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    void doesMethodMinus(Integer num1, Integer num2) {
        Integer actual = out.minus(num1, num2);
        Integer expected = num1 - num2;
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    void doesMethodMultiply(Integer num1, Integer num2) {
        Integer actual = out.multiply(num1, num2);
        Integer expected = num1 * num2;
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    void doesMethodDivide(Integer num1, Integer num2) {
        Integer actual = out.divide(num1, num2);
        Integer expected = num1 / num2;
        assertEquals(expected, actual);
    }
}
