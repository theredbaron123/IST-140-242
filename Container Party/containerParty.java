/**
 * containerParty
 */

 import java.util.ArrayList;

public class containerParty {

    private String date; 
    private ArrayList<person> people;
    private ArrayList<Container> containers; 
    private String address;  

    public containerParty(String date, ArrayList<person> people, ArrayList<Container> containers, String address)
    {
        this.date = date; 
        this.people = people; 
        this.containers = containers; 
        this.address = address; 
    }

    public String getInfo()
    {
        String personString = ""; 

        for(int i = 0; i<people.size(); i++)
        {
            personString += (people.get(i).getInfo() + "\n"); 
        }

        String containerString= ""; 

        for(int i = 0; i < containers.size(); i++)
        {
            containerString += (containers.get(i).getInfo() + "\n"); 
        }

        return "The date of the party is: " + this.date
        + "\n The people at the party are: " + personString
        + "\n The containers are: " + containerString
        + "\n The address of the party is: " + this.address; 
    }


}