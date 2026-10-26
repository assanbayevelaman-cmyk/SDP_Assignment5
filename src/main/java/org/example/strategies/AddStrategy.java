package org.example.strategies;

import org.example.OperationStrategy;

public class AddStrategy implements OperationStrategy {
    public double execute(double a, double b) {
        return a + b;
    }
    public String name() {
        return "Add";
    }
}
