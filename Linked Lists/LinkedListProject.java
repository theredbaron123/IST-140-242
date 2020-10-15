/**
 * LinkedListProject
 */
public class LinkedListProject {

    public static void main(String[] args) {
        LinkedStringList list = new LinkedStringList();
        list.add("First"); 
        list.add("Second");
        list.add("Third");
        list.moveFirst();
        
        list.setCurrentValue("Red");
        list.moveNext();
        list.setCurrentValue("Green");
        list.moveNext();
        list.setCurrentValue("Blue");
        // list.setCurrentValue("Green");
        // list.setCurrentValue("Blue");
        list.indexOf("Green");
        list.displayList();
        list.sortAscendingTwo();
        list.displayList();
        list.removeNode();
        list.removeNode();
        list.displayList();
    }
}