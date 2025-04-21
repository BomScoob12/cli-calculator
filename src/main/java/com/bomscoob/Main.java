package com.bomscoob;

import com.bomscoob.utils.ICalculatorOperations;
import com.bomscoob.utils.impl.CalculatorOperations;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ICalculatorOperations operations = new CalculatorOperations();
        System.out.println("How many number do you need to calculator? ");
        int n = scanner.nextInt();
        int sum = 0;
        int count = 2;

        System.out.print("first number is : ");
        int firstNum = scanner.nextInt();
        sum += firstNum;

        while (count <= n) {
            System.out.printf("%d number is : ", count++);
            int current = scanner.nextInt();
            scanner.nextLine();

            System.out.printf("Which operation for %d?", current);
            System.out.print("[ + (add), - (subtract), * (multiply), / (divider), %(mod) ] : ");
            String op = scanner.nextLine();

            switch (op) {
                case "+" -> sum = operations.add(sum, current);
                case "-" -> sum = operations.subtract(sum, current);
                case "*" -> sum = operations.multiply(sum, current);
                case "/" -> sum = operations.divider(sum, current);
                case "%" -> sum = operations.mod(sum, current);
                default -> throw new IllegalArgumentException("No operation match.");
            }

            System.out.printf("sum is %d\n", sum);
        }
    }
}