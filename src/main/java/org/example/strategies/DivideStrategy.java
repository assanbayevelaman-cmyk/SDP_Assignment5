package org.example.strategies;

import org.example.OperationStrategy;

public class DivideStrategy implements OperationStrategy {
    public double execute(double a, double b) {
        if (b == 0)
            throw new ArithmeticException("Division by zero");
        return a / b;
    }
    public String name() {
        return "Divide";
    }
}
