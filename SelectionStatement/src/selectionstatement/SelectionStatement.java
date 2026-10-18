/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package selectionstatement;

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
        int mark;
        Scanner in = new Scanner(System.in);
         System.out.println("enter a number ");
        mark = in.nextInt();
        if (mark >= 1 && mark <= 100) {
        
        if (mark>=90){
            System.out.println("A");
        }else if (mark>=80){
            System.out.println("B");
        }else if (mark>=70){
            System.out.println("C");
        } 
        else if (mark>=60) {
            System.out.println("D");
        } 
        }else {
            System.out.println("check u input ");
        }
        
        
    }
    
}
