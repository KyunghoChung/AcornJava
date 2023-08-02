package com.acorn.practice;

import java.util.Scanner;

public class subStringPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the input string from the user
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();

        // Check if the input string has at least three characters
        if (inputString.length() >= 3) {
            // Extract the first three characters using substring
            String firstCharacter = inputString.substring(0, 1);
            String secondCharacter = inputString.substring(1, 2);
            String thirdCharacter = inputString.substring(2, 3);

            // Display the extracted characters
            System.out.println("First character: " + firstCharacter);
            System.out.println("Second character: " + secondCharacter);
            System.out.println("Third character: " + thirdCharacter);
        } else {
            // Handle the case when the input string has less than three characters
            System.out.println("The input string should have at least three characters.");
        }

        sc.close();
    }
}
