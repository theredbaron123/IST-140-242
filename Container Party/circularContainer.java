/**
 * circularContainer
 */

 import java.lang.Math; 
 import java.util.*; 

public class circularContainer extends Container {

    private double radius; 

    public circularContainer(String brand, int height, String color, double radius)
    {
        super(brand, height, color); 
        this.radius = radius; 
    }

    public double getRadius()
    {
        return this.radius;
    }

    // public void setRadius(double radius) 
    // {
    //     Scanner scnr = new Scanner (System.in); 
    //     this.radius = scnr.nextDouble();
    // }

    // public void setSuperBrand(String brand)
    // {
    //     Scanner scnr = new Scanner (System.in); 
    //     System.out.println("Please enter the brand of the circular container: ");
    //     super.brand = scnr.nextLine(); 
    //     brand = super.brand; 
    // }

    // public void setSuperHeight(int height)
    // {
    //     Scanner scnr = new Scanner (System.in); 
    //     System.out.println("Please enter the height of the circular container: ");
    //     super.height = scnr.nextInt(); 
    //     height = super.height; 
    // }

    // public void setSuperColor(String color)
    // {
    //     Scanner scnr = new Scanner (System.in); 
    //     System.out.println("Please enter the color of the circular container: ");
    //     super.color = scnr.nextLine(); 
    //     color = super.color; 
    // }

    // COME BACK TO THIS LATER IT'S IMPORTANT
    @Override
    public String getInfo()
    {
        return super.getInfo()
        + "\n The radius of the circular contianer is: " + this.radius
        + "\n The volume of the circular container is: " + calculateVolume(); 
    }

    @Override
    public double calculateVolume()
    {
        double calculatedVolume = 0; 
        calculatedVolume = Math.PI * (Math.pow(radius, 2)) * super.height; 
        return calculatedVolume; 
    }
    
}