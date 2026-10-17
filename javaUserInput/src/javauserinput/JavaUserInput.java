/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javauserinput;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class JavaUserInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
             float n1 , n2 ;
                System.out.println("Pls enter num");
             n1=in.nextFloat();
             System.out.println("pls enter num");
             n2=in.nextFloat();
             System.out.printf("num1 = %.2f num2 = %f%n" ,n1,n2);
             System.out.println("entre a String");
             String s = in.nextLine();
             System.out.println("s= " + s);
                     
                
    }
    
}
