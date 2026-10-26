package org.example;

import org.example.strategies.AddStrategy;
import org.example.strategies.DivideStrategy;
import org.example.strategies.MultiplyStrategy;
import org.example.strategies.SubtractStrategy;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator(new AddStrategy());
        System.out.println(calc.compute(5, 3));
        calc.setStrategy(new MultiplyStrategy());
        System.out.println(calc.compute(5, 3));
        calc.setStrategy(new DivideStrategy());
        System.out.println(calc.compute(6, 3));
        calc.setStrategy(new SubtractStrategy());
        System.out.println(calc.compute(5, 3));
    }
}
