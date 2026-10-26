package org.example;

public interface OperationStrategy {
    double execute(double a, double b);
    String name();
}