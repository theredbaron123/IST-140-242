/**
 * Container
 */

import java.util.*; 

public abstract class Container {

    protected String brand; 
    protected int height; 
    protected String color; 
    
    public Container(String brand, int height, String color)
    { 
        this.brand = brand;  
        this.height = height; 
        this.color = color; 
    }

    public abstract double calculateVolume(); 
    

    /* THIS IS IMPORTANT DO NOT FORGET LATER*/
    
    public String getInfo()
    {
        return "The brand is: " + this.brand
        + "\n The height is: " + this.height
        + "\n The color is: " + this.color; //Pass attributes and everything else
    }

}