

import java.util.Scanner;

public class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator c = new Calculator();

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Addition: " + c.add(a, b));
        System.out.println("Subtraction: " + c.subtract(a, b));
        System.out.println("Multiplication: " + c.multiply(a, b));
        System.out.println("Division: " + c.divide(a, b));
    }
}

