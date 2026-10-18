/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sentinel.and.flag.controlled.pkgwhile.loops;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class SentinelAndFlagControlledWhileLoops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char letter='a';
        Scanner in = new Scanner(System.in);
        while (letter!='q'){
            letter=in.next().charAt(10);
        }
    }
    
}
