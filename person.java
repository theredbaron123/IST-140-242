/**
 * people
 */
public class person {

    private String name; 
    private int weight; 

    public person (String name, int weight)
    {
        this.name = name; 
        this.weight = weight; 
    }

    public String getName ()
    {
        return this.name; 
    }

    public int getWeight ()
    {
        return this.weight; 
    }

    public void setName (String name)
    {
        this.name = name;  
    }

    public void setWeight (int weight)
    {
        this.weight = weight; 
    }

    public String getInfo()
    {
        return "The name of the person is: " + this.name + "\n" + "The weight of this person is: " + this.weight; 
    }

}