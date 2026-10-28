/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.and.objects;

/**
 *
 * @author user
 */
public class Main {
    
    public static void main(String args[]){
        //Car obj;
        //obj = new Car(); or 
       Car c1 = new Car();
       //c1.Name = "Audi";
       c1.setName("Audi");
       c1.setModel(2025);
        System.out.println(c1.getName());
        System.out.println(c1.getModel());
//        c1.MaxSpeed = 210;
          
           
        
//        Car c2 = new Car();
//        c2.Name = "Android";
//        System.out.println(c1.Name + " " + "\n" + c1.MaxSpeed + "\n" + " " + c2.Name);
    }
}
