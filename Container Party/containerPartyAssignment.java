import java.util.ArrayList;

/**
 * containerPartyAssignment
 */
public class containerPartyAssignment {

    public static void main(String[] args) {
        
        person p1p1 = new person("Daphne Moon", "Female", "Pasta"); 
        person p2p1 = new person("Niles Crane", "Male", "Tacos"); 
        person p3p1 = new person("Frasier Crane", "Male", "Sandwiches"); 
        ArrayList<person> party1 = new ArrayList(); 
        party1.add(p1p1); 
        party1.add(p2p1); 
        party1.add(p3p1); 

        person p1p2 = new person("Victoria Lee", "Female", "Nachos"); 
        person p2p2 = new person("Suzanne Somner", "Female", "Veggie Wraps"); 
        person p3p2 = new person("Martin Wall", "Male", "Perogies"); 
        ArrayList<person> party2 = new ArrayList(); 
        party2.add(p1p2); 
        party2.add(p2p2); 
        party2.add(p3p2); 

        circularContainer c1p1 = new circularContainer("Hefty", 10, "red", 20); 
        circularContainer c2p1 = new circularContainer("Ball's Jars", 20, "blue", 10);
        rectangularContainer r1p1 = new rectangularContainer("Fuller", 12, "green", 10, 30);
        rectangularContainer r2p1 = new rectangularContainer("Coleman", 6, "yellow", 30, 15); 
        ArrayList<Container>party1cons = new ArrayList(); 
        party1cons.add(c1p1); 
        party1cons.add(c2p1); 
        party1cons.add(r1p1); 
        party1cons.add(r2p1); 
        
        circularContainer c1p2 = new circularContainer("Gelert", 4, "purple", 12); 
        circularContainer c2p2 = new circularContainer("MSR", 13, "orange", 14);
        rectangularContainer r1p2 = new rectangularContainer("GSI Outdoors", 20, "brown", 25, 30); 
        rectangularContainer r2p2 = new rectangularContainer("Sea to Summit", 16, "black", 19, 35);
        ArrayList<Container>party2cons = new ArrayList(); 
        party2cons.add(c1p2); 
        party2cons.add(c2p2);
        party2cons.add(r1p2); 
        party2cons.add(r2p2);  

       containerParty cp1 = new containerParty("April 21st, 2020", party1, party1cons, "34 Route 9a, Chesterfield, NH");
       containerParty cp2 = new containerParty("September 13th, 2020", party2, party2cons, "1208 W Pine Grove Rd, Pennsylvania Furnace, PA");
       System.out.println(cp1.getInfo());  
       System.out.println();
       System.out.println(cp2.getInfo());

    }
}