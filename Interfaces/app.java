/**
 * app
 */

 import java.util.ArrayList;
 import java.util.Collections; 

public class app {

    public static void main(String[] args) {
        
        ArrayList<MusicStore> stores= new ArrayList(); 
        MusicStore ms1 = new MusicStore("Strings and Things ", 20, 10, 500, 1000);
        stores.add(ms1); 
        MusicStore ms2 = new MusicStore("The Music Buereau ", 15, 12, 300, 780); 
        stores.add(ms2); 
        MusicStore ms3 = new MusicStore("Guys, Gals and Guitars ", 30, 15, 680, 1480);
        stores.add(ms3); 
        MusicStore ms4 = new MusicStore("Drums and Nothing Else ", 25, 0, 480, 710);
        stores.add(ms4); 
        MusicStore ms5 = new MusicStore("Rock-On Vinyl ", 10, 20, 1000, 2500); 
        stores.add(ms5); 

        for(MusicStore musicStore: stores)
        {
            System.out.println("The name of the store is: " + musicStore.getStoreName()); 
            System.out.println("The price of a lesson is: " + musicStore.getLessonCostPerHour()); 
            System.out.println("The number of violins in the inventory is: "
            + musicStore.getViolinsInInventory());
            System.out.println("The costs of the music store are: " + musicStore.getCosts());  
            System.out.println("The revenue of the music store is: " + musicStore.getRevenue());
            System.out.println();
        }
        System.out.println();
        Collections.sort(stores);
        // System.out.println();
        System.out.println(stores);
        System.out.println();

        for(MusicStore musicStore: stores)
        {
            System.out.println("The name of the store is: " + musicStore.getStoreName()); 
            System.out.println("The price of a lesson is: " + musicStore.getLessonCostPerHour()); 
            System.out.println("The number of violins in the inventory is: "
            + musicStore.getViolinsInInventory() );
            System.out.println("The costs of the music store are: " + musicStore.getCosts());  
            System.out.println("The revenue of the music store is: " + musicStore.getRevenue());
            System.out.println();
        }

        // for(MusicStore musicStore : stores)
        // {
        //     System.out.println(stores.toString()); 
        // }
        
    }
}