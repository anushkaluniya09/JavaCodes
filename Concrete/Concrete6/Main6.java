package com.Concrete.Concrete6;

public class Main6 {
    public static void main(String[] args){
        Calculator.add (100, 154);
        Calculator.subtract (154, 79);
        Calculator.multiply (7, 8);
        Calculator.divide (345, 5);

        System.out.print("Addition result: " + Calculator.add(100,154));
        System.out.print("Subtraction result: " + Calculator.subtract(154,79));
        System.out.print("Multiplication result: " + Calculator.multiply(7,8));
        System.out.print("Division result: " + Calculator.divide(345,5));
    }
}
