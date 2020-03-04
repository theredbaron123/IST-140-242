/**
 * main2
 */

 import java.util.Scanner; 
 import java.util.ArrayList; 

public class partnerLab1 {

    public static void main(String[] args) {
        
        int lbsLimit = 0; 
        int totalLbs = 0; 
        ArrayList<person> person = new ArrayList(); 
        BouncyHouse bh1 = new BouncyHouse(lbsLimit, totalLbs, person); 
        //bh1.addPeople(); 
        bh1.setLbsLimit(lbsLimit); 
        Scanner scnr = new Scanner (System.in); 
        Scanner integers = new Scanner (System.in);
        boolean isDone = false; 

        String sentinel = "";
        
        while(!isDone)
        {
            System.out.println("Please enter a name, or q to quit: ");
            sentinel = scnr.nextLine(); 
            if (sentinel.equals("q"))
            {
                isDone = true; 
            }
            else
            {
                System.out.println("PLease enter the corresponding weight: ");
                int weight = integers.nextInt(); 
                person p1 = new person (sentinel, weight); 
                if(bh1.addPerson(p1))
                {
                    System.out.println(p1.getInfo());
                    System.out.println("Person added. ");
                }
                else
                {
                    System.out.println("Could not be added. ");
                }
            }
        }
        

        int lbsLimit2 = 0; 
        int totalLbs2 = 0; 
        String sentinel2 = ""; 
        ArrayList<person> p2 = new ArrayList(); 
        BouncyHouse bh2 = new BouncyHouse(lbsLimit, totalLbs, p2);
        boolean isDone2 = false; 
        bh2.setLbsLimit(lbsLimit); 

        while (!isDone2)
        {
            System.out.println("Please enter a name for bounce house 2, or q to quit: ");
            sentinel2 = scnr.nextLine(); 
            if(sentinel2.equals("q"))
            {
                isDone2 = true; 
            }
            else
            {
                System.out.println("Please enter the corresponding weight for bounce house 2: ");
                int weight2 = integers.nextInt(); 
                person person2 = new person(sentinel2, weight2); 
                if (bh2.addPerson(person2))
                {
                    System.out.println(person2.getInfo());
                    System.out.println("Person added to bounce house 2. ");
                }
                else
                {
                    System.out.println("Could not be added to bounce house 2. ");
                }
            }
        }
        System.out.println("Bounce House 1: " + bh1.getInfo());
        System.out.println("Bounce House 2: " + bh2.getInfo());
    }
}