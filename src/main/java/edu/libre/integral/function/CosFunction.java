package edu.libre.integral.function;

public class CosFunction extends Function {

    @Override
    public double evaluate(double x) {
        return Math.cos(x) + 2;
    }
}
