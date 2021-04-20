package edu.libre.integral.method;

import edu.libre.integral.function.Function;

public interface IIntegrateCalculation {

    public double calculate(Function function, double init, double end, int numInterval);

}
