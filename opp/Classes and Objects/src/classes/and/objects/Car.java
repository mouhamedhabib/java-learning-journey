/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.and.objects;

/**
 *
 * @author user
 */
public class Car {
    private String Name;
    private int MaxSpeed;
    private float Price;
    private int Model ;
    
    public void setName(String n){
    Name = n;
    }
    String getName(){
    return Name;
    }
    
    public void setModel(int m){
        if (m>=2015)
        Model = m;
        else
            System.out.println("Sorry we dont accept this model ");
    }
    
    public int getModel(){
        return Model ;
    }
    
}
