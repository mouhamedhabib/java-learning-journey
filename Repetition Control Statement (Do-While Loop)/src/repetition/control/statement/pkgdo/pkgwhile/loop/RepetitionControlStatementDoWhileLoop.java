/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repetition.control.statement.pkgdo.pkgwhile.loop;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class RepetitionControlStatementDoWhileLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
            char letter;
                int c=0;

                    do {
                        letter=in.next().charAt(0);
                        c++;
         }while (letter != 'q');

        System. out.println ("count = " +c);


    }
    
}
