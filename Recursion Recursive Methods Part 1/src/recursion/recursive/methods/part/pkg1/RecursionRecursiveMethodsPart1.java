/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursion.recursive.methods.part.pkg1;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class RecursionRecursiveMethodsPart1 {

    // Recursive method to calculate factorial
    public static long calculateFactorial(int n) {
        // Base case: factorial of 0 or 1 is 1
        if (n == 0 || n == 1) {
            return 1;
        }
        // Recursive case: n! = n * (n - 1)!
        return n * calculateFactorial(n - 1);
    }

    public static void main(String[] args) {
        // Create a Scanner object to read console input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        
        // Check if the input is an integer to prevent runtime errors
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();

            if (number < 0) {
                System.out.println("Error: Please enter a non-negative integer.");
            } else {
                // Calculate and display the result
                long result = calculateFactorial(number);
                System.out.println("The factorial of " + number + " is: " + result);
            }
        } else {
            System.out.println("Error: Invalid input. Please enter an integer.");
        }

        // Close the scanner resource
        scanner.close();
    }
}
