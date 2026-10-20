/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repetition.control.statement.nested.loops;

/**
 *
 * @author user
 */
public class RepetitionControlStatementNestedLoops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("outer loop i " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.println("Nested loop j " + j);
                for (int k = 0; k <= 50; k++) {
                    System.out.println("Nested loop k " + k);
                    
                }
            }
            
        }
    }
    
}
