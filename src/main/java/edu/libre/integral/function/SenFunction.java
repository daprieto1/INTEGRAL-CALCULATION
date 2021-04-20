package edu.libre.integral.function;

public class SenFunction extends Function {

    @Override
    public double evaluate(double x) {

        x = Math.toDegrees(x);
        x = Math.toRadians(x);
        return Math.sin(x);

    }

}
