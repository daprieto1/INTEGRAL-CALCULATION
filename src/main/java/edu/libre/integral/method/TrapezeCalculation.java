package edu.libre.integral.method;

import edu.libre.integral.function.Function;

public class TrapezeCalculation implements IIntegrateCalculation {

    @Override
    public double calculate(Function function, double init, double end, int numInterval) {

        double area = 0;
        double width = (end - init) / (double) numInterval;

        double x1 = init;
        double x2 = x1 + width;

        for (int i = 0; i < numInterval; i++) {
            double y1 = function.evaluate(x1);
            double y2 = function.evaluate(x2);

            area += (y2 * width) + ((width * Math.abs(y1 - y2)) / 2);
        }

        return area;
    }
}
