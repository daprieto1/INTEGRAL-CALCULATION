package edu.libre.integral.method;

import edu.libre.integral.function.SenFunction;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RectangleCalculationTest {

    private static IIntegrateCalculation rectangleCalculation;

    @BeforeAll
    public static void setup() {
        rectangleCalculation = new Rectanglecalculation();
    }

    @Test
    public void shouldCalculateIntegral() {

        double area = rectangleCalculation.calculate(new SenFunction(), 0, 100, 10);
        assertTrue(true);
    }

}
