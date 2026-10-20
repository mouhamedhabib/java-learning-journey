package branching.statementsbreakcontinue;

import java.util.Scanner;

/**
 * @author user
 */
public class BranchingStatementsBreakContinue {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Test u self");
        System.out.println("What is 5+10/2*10= ? ");
        
        float userAnswer = 0; // Initialized to fix scope issues
        float theCorrectAnswer = 55;
        boolean questionAnswer = false;
        
        // Loop allows up to 10 attempts
        for (int i = 1; i <= 10; i++) {
            userAnswer = in.nextFloat();
            
            if (userAnswer == theCorrectAnswer) {
                questionAnswer = true;
                break; // Exit loop immediately if correct
            } else {
                // Let the user know which attempt they just missed
                System.out.println("Wrong! That was attempt " + i + " of 10. Try again:");
            }
        }
        
        // Final results after loop ends
        if (questionAnswer) {
            System.out.println("Correct Answer!");
        } else {
            System.out.println("You ran out of chances. Game over!");
        }
        
        in.close(); // Good practice to close the scanner
    }
}
