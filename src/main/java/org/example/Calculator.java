package org.example;

public class Calculator {
    private OperationStrategy strategy;
    public Calculator(OperationStrategy strategy) {
        this.strategy = strategy;
    }
    public void setStrategy(OperationStrategy strategy) {
        this.strategy = strategy;
    }
    public double compute(double a, double b) {
        return strategy.execute(a, b);
    }
}
