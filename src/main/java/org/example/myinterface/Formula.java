package org.example.myinterface;

public abstract class Formula {
    public abstract double calculate(int a);

    interface MyInterface {
        double calculate(int a);
        default double sqrt(int a) {
            return Math.sqrt(a);
        }
    }
}
