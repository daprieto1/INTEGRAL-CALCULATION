package edu.libre.integral.method;

import edu.libre.integral.function.Function;

public class Rectanglecalculation implements IIntegrateCalculation {

    @Override
    public double calculate(Function function, double init, double end, int numInterval) {

        double x = init;
        double area = 0;
        double width = (end - init) / (double) numInterval;

        for (int i = 0; i < numInterval; i++) {
            area += function.evaluate(x) * width;
            x += width;
        }

        return area;

    }
}
