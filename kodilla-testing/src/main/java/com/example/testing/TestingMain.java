package com.example.testing;

import com.example.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {

        Calculator result1 = new Calculator();
        Calculator result2 = new Calculator();

        if (result1.add(1, 2) == 3) {
            System.out.println("Add test: OK");
        } else {
            System.out.println("Add test: Error!");
        }

        if (result2.subtract(5, 3) == 2) {
            System.out.println("Subtract test: OK");
        } else {
            System.out.println("Subtract test: Error!");
        }
    }
}