/**
 * rectangularContainer
 */

 import java.lang.Math;
 import java.util.*;  

public class rectangularContainer extends Container{

    private double width; 
    private double length; 

    public rectangularContainer(String brand, int height, String color, double width, double length)
    {
        super(brand, height, color); 
        this.width = width; 
        this.length = length; 
    }

    public double getWidth()
    {
        return this.width; 
    }

    public double getLength()
    {
        return this.length; 
    }

    // public void setWidth()
    // {
    //     Scanner scnr = new Scanner (System.in); 
    //     this.width = scnr.nextDouble(); 
    // }

    // public void setLength()
    // {
    //     Scanner scnr = new Scanner (System.in); 
    //     this.length = scnr.nextDouble(); 
    // }

    @Override
    public double calculateVolume()
    {
        double calculateVolume = length*width*height;
        return calculateVolume; 
    }
    
    @Override
    public String getInfo()
    {
        return super.getInfo() +
        "\n The width of the rectangular container is: " + this.width
        + "\n The length of the rectangular container is: " + this.length 
        + "\n The volume of the rectangualr container is: " + calculateVolume();
    }

}