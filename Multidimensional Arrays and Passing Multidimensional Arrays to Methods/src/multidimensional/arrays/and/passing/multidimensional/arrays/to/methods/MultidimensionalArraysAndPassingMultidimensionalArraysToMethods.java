/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multidimensional.arrays.and.passing.multidimensional.arrays.to.methods;

/**
 *
 * @author user
 */
public class MultidimensionalArraysAndPassingMultidimensionalArraysToMethods {

    // Returns a new 2D array of size 2x3 (all values default to 0)
    static int[][] get2dArray() {
        int ar[][] = new int[2][3];
        return ar;
    }

    // Prints the elements of the passed 2D array
    static void print(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(); // Moves to the next line after each row
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
            {1, 3, 5},
            {2, 4, 6}
        };
        
        // Calls the print method and passes the multidimensional array
        print(arr); 
    }
}
