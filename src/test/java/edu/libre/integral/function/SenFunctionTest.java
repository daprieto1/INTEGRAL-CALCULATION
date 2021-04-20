package edu.libre.integral.function;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SenFunctionTest {

    private static Function senFunction;

    @BeforeEach
    public void setup() {
        senFunction = new SenFunction();
    }

    @Test
    public void shouldEvaluateFunction() {
        double y4 = senFunction.evaluate(5.9);
        //assertEquals(Double.compare(1.0, senFunction.evaluate(0)), 0);
    }


}
