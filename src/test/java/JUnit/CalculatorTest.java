package JUnit;

import Test.Junit.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    public Calculator calculator;

    @BeforeEach
    public void init() {
        calculator = new Calculator();
    }

    @Test
    public void add() {
        assertEquals(10, calculator.add(5, 5));
    }

    @Test
    public void sub() {
        assertEquals(14, calculator.sub(21, 7));
    }

    @Test
    public void mul() {
        assertEquals(25, calculator.mul(5, 5));
    }

    @Test
    @Disabled
    @Timeout(value = 1, unit = TimeUnit.SECONDS)
    public void div() {
        assertEquals(10, calculator.div(100, 10));
    }
}
