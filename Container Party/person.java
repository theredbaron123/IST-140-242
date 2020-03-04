/**
 * person
 */
public class person {

    private String name; 
    private String gender; 
    private String foodBrought; 

    public person(String name, String gender, String foodBrought)
    {
        this.name = name; 
        this.gender = gender; 
        this.foodBrought = foodBrought; 
    }

    public String getName (String name)
    {
        return this.name; 
    }

    public String getGender (String gender)
    {
        return this.gender; 
    }

    public String getfoodBrought (String foodBrought)
    {
        return this.foodBrought; 
    }

    public String getInfo()
    {
        return "The person's name is: " + this.name 
        + "\n The person's gender is: " + this.gender
        + "\n The food the person brought is: " + this.foodBrought; 
    }

    // public void setName()
    // {
    //     this.name = name; 
    // }

    // public void setGender()
    // {
    //     this.gender = gender; 
    // }

    // public void setFoodBrought()
    // {
    //     this.foodBrought = foodBrought; 
    // }

    

}