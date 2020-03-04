/**
 * bounceHouse
 */

import java.util.Scanner;
import java.util.Spliterator;
import java.util.ArrayList;
import java.util.Arrays; 

public class BouncyHouse {

    private int lbsLimit; 
    private int totalLbs; 
    private ArrayList<person> person; 

    public BouncyHouse (int lbsLimit, int totalLbs, ArrayList<person> person)
    {
        this.lbsLimit = 0; 
        this.totalLbs = 0; 
        this.person = person; 
    }

    public BouncyHouse()
    {
        this.totalLbs = 0; 
        this.lbsLimit = 0; 
        this.person = new ArrayList(); 
    }

    public int getLbsLimit()
    {
        return this.lbsLimit; 
    }

    public int getTotalLbs()
    {
        return this.totalLbs; 
    }

    public ArrayList<person> getPeople()
    {
        return this.person; 
    }

    // public void setLbsLimit(int lbsLimit)
    // {
    //     this.lbsLimit = lbsLimit; 
    // }

    public void setTotalLbs(int totalLbs)
    {
        this.totalLbs = totalLbs; 
    }

    public void setPeople(ArrayList<person> person)
    {
        this.person = person; 
    }

    public int setLbsLimit (int lbsLimit)
    {
        Scanner scnr = new Scanner (System.in); 
        System.out.println("Please enter a weight limit for the bouncy house: ");
        lbsLimit = scnr.nextInt(); 
        this.lbsLimit = lbsLimit; 

        return lbsLimit; 
    }


    public String getInfo()
    {
        // System.out.println("The weight limit is: " + this.lbsLimit);
        // System.out.println("The total weight is: " + this.totalLbs);
        // System.out.println("The people in the bounce house are: " + this.people);
        String personString = ""; 
        for(int i = 0; i < person.size(); i++)
        {
            //System.out.println(people.get(i));
            personString += (person.get(i).getInfo() + "\n"); 
             
        }

        return "The weight limit is: " + this.lbsLimit + "\n" + "The total weight is: " + this.totalLbs +"\n" + "The people in the bounce house are: "  + personString;
        //this.people.get(0).getName(); 
    }

    public boolean addPerson(person p1)
    {


        if (totalLbs + p1.getWeight() < lbsLimit)
        {
            person.add(p1); 
            totalLbs += p1.getWeight();  
            return true; 
        }
        else
        {
            return false; 
        }

    }
}


