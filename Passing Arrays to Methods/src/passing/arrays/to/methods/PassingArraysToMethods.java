/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package passing.arrays.to.methods;

/**
 *
 * @author user
 */
public class PassingArraysToMethods {

    static void print(int x[]){
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
    }
    static int [] getArray()
    {
        int ar[]={4,5,6};
        return ar;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        print(arr );
        
        int arr1[]=getArray();
        System.out.println(arr1[0]);
    }
    
}
