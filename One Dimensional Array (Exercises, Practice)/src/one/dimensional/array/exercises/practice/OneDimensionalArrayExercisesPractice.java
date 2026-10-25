package one.dimensional.array.exercises.practice;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class OneDimensionalArrayExercisesPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // FIXED: Added back the array size '[5]'
        int arr[] = new int[5];
        int sum = 0;
       
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element " + (i + 1) + " : "); 
            arr[i] = in.nextInt(); 
            sum += arr[i];
        }
        
        double avg = (double) sum / arr.length; 
        System.out.println("sum " + sum + " Average " + avg);
    }
}
