package edu.libre.integral.function;

public class LnFunction extends Function {
    @Override
    public double evaluate(double x) {
        return Math.log(x);
    }
}
