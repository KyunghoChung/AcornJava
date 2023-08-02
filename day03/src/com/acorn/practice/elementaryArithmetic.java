package com.acorn.practice;

import java.util.Scanner;
public class elementaryArithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            // Read two integers from the user
            System.out.print("첫 번째 정수: ");
            int num1 = sc.nextInt();

            System.out.print("두 번째 정수: ");
            int num2 = sc.nextInt();

            // Perform arithmetic operations
            int addition = num1 + num2;
            int subtraction = num1 - num2;
            int multiplication = num1 * num2;
            int division = num1 / num2; // Use double for more precise division

            // Display the results
            System.out.println("더하기 결과: " + addition);
            System.out.println("빼기 결과: " + subtraction);
            System.out.println("곱하기 결과: " + multiplication);
            System.out.println("나누기 몫 결과: " + division);

            // Ask the user if they want to continue
            System.out.print("계속하시겠습니까? (Y/N): ");
            String choice = sc.next();

            if (choice.equalsIgnoreCase("N")) {
                break; // Exit the loop if the user doesn't want to continue
            }
        }

        sc.close();
    }
}
