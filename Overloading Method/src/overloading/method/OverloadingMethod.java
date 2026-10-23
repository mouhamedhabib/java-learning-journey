/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package overloading.method;

/**
 *
 * @author user
 */
public class OverloadingMethod {

   static int sum(int n1 , int n2){
       return n1+n2;
   }
   static float sum(float n1 , float n2){
        return n1+n2;
   }
   static float sum(int n1 , float n2){
        return n1+n2;
   }
    public static void main(String[] args) {
        System.out.println("sum=" + sum(10.5f ,50));
    }
    
}
