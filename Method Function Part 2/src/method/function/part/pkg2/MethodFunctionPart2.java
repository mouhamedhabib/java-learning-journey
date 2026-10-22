/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package method.function.part.pkg2;

/**
 *
 * @author user
 */
public class MethodFunctionPart2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Example: Calling the min method to test it
        int result = min(15, 8, 23);
        System.out.println("The smallest number is: " + result);
    }
    
    // The min method must be declared here, outside the main method
    public static int min(int n1, int n2, int n3) {
        int minNumber = n1;
        
        if (minNumber > n2) {
            minNumber = n2;
        }
        
        if (minNumber > n3) {
            minNumber = n3;
        }
        
        return minNumber;
    }
    
}
