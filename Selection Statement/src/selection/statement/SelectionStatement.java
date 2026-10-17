/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package selection.statement;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class SelectionStatement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a scanner to read user input
        Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.println("--- Welcome to the Pizza Parlor ---");
        System.out.println("Enter pizza size (Small, Medium, Large): ");
        String size = scanner.nextLine();

        double price = 0.0;

        // Using if, else if, and else to set the price based on size
        if (size.equalsIgnoreCase("Small")) {
            price = 8.99;
            System.out.println("You selected a Small Pizza.");
        } 
        else if (size.equalsIgnoreCase("Medium")) {
            price = 11.99;
            System.out.println("You selected a Medium Pizza.");
        } 
        else if (size.equalsIgnoreCase("Large")) {
            price = 14.99;
            System.out.println("You selected a Large Pizza.");
        } 
        else {
            // This runs if the user types something else entirely
            System.out.println("Invalid size entered! Defaulting to Small Pizza.");
            price = 8.99;
        }

        // Output the final total
        System.out.println("Your total price is: $" + price);
        
        scanner.close();
    }
}