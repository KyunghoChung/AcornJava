package com.acorn;

import java.util.Scanner;
public class Study02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("No.1 Enter\nNo.2 Edit\nNo.3 Search\nNo.4 Delete\nNo.5 Exit");
            System.out.print("Enter the menu number: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.println("You selected: Enter");
                    // Add your Enter logic here
                    break;
                case 2:
                    System.out.println("You selected: Edit");
                    // Add your Edit logic here
                    break;
                case 3:
                    System.out.println("You selected: Search");
                    // Add your Search logic here
                    break;
                case 4:
                    System.out.println("You selected: Delete");
                    // Add your Delete logic here
                    break;
                case 5:
                    System.out.println("Program terminates.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid menu number. Please try again.");
            }
        }

    }
}

