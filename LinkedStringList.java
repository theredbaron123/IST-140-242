/**
 * LinkedStringList
 */

 import java.util.NoSuchElementException;

public class LinkedStringList {

    private Node first;  
    private Node currentNode;
    private int length;
    
    
    class Node
    {
        private String data;
        private Node next;
        
        public void printNodeData()
        {
            System.out.println("Node data: " + this.data);
        }
        
        public Node getNext()
        {
            return next;
        }
    }

    public void addFirst(String value)
    {
        //Create the node & set its value
        Node newNode = new Node();
        newNode.data = value;
        
        //if newNode is the first node, this will be null
        //otherwise it will point to the former "first" now
        newNode.next = first;
        
        //update our "first" pointer to the node we just created
        first = newNode;
        
        currentNode = newNode;
        length++;
    }
    
    public void setFirstValue(String value)
    {
        first.data = value;
    }
    
    public void setCurrentValue(String value)
    {
        currentNode.data = value;
    }
    
    public void moveNext()
    {
        if (currentNode.next == null)
        {
            throw new NoSuchElementException();
        }
        else
        {
            currentNode = currentNode.next;
        }
        
    }
    
    public void moveFirst()
    {
        currentNode = first;
    }
    
    public boolean isEmpty()
    {
        return(first==null);
    }
    
    public int getLength()
    {
        return length;
    }
    
    public String getFirstValue()
    {
        if (first == null)
        {
            throw new NoSuchElementException();
        }
        else
        {
            return(first.data);
        }
    }
    
    public String getCurrentValue()
    {
        if (currentNode == null)
        {
            throw new NoSuchElementException();
        }
        else
        {
            return(currentNode.data);
        }
    }
    
    public void displayList()
    {
        Node tempNode = first;
        System.out.println("List contents:");
        while(tempNode != null)
        {
            tempNode.printNodeData();
            tempNode = tempNode.getNext();
        }
    }

    public void add (String value)
    { 
        if (first != null) //currentNode.next != null? 
        {
            Node addNode = new Node();
            addNode.data = value; 
            addNode.next = currentNode.next; 
            currentNode.next = addNode;
            currentNode = currentNode.next; 
            length++; 
        }
        else
        {
            addFirst(value); 
        }
         
    }

    public void removeFirst()
    {
        if(first != null)
        {
            currentNode = first.next; 
            first = currentNode; 
        } 
        else
        {
            currentNode = first.next; 
        }     
    }

    public void removeNode()
    {
        if(currentNode != first)
        {
            //currentNode = first;     //lines 182-184 delete first element
            //first = currentNode.next;
            //currentNode = first; 
; 
            // if (currentNode != first && currentNode.next == null)
            // {
            //     first.next = currentNode.next; 
            //     first = currentNode; 
            // }
            //else
            //{
            // first.next.next = currentNode.next; //FINALLY DELETED MIDDLE NODE
            // first.next = currentNode;
            Node marker = new Node(); //Node to delete 
            marker = currentNode; 
            currentNode = first; 
            while(currentNode.next != null) 
            {
                if (currentNode.next != marker)
                {
                    currentNode = currentNode.next; 
                }
                else
                {
                    currentNode.next = marker.next; 
                    length--; 
                }
            }
            
        } 
        else
        {
            removeFirst();
        }
        
    }

    public int indexOf (String value)
    {
        int index = 0; 
        currentNode = first; 
        // if(currentNode.data.equals(value))
        // {
        //     while(currentNode != null)
        //     {

        //     }
        // }
        while (currentNode != null)
        {
            if (currentNode.data.equals(value))
            {
                return index;  
            }

            currentNode = currentNode.next; 
            index++; 
        }

        return -1;
    }

    // public void sortAscending(String value)
    // {
        
    // }

    // public void swap (String a, String b)
    // {
    //     String tempSwap = first.data;
    //     first.data = first.next.data;
    //     first.next.data = tempSwap; 
    // }

    // public String getAscending (String startPos)
    // {
    //     String min = first.data; 
    //     String minPos = startPos; 

    //     while (first.next.data != null)
    //     {
    //         if (!first.next.data.equals(min)) //first.next.data.compareTo(first.next.data)???
    //         {
    //             min = first.next.data;
    //             minPos = first.data;  
    //         }
    //         length = length - 1; 
    //     }
    //     return minPos; 
    // }

    // public void performSelectSort()
    // {
    //     while (first.next.data != null)
    //     {
    //         String min = getAscending(first.data);
    //         //min.compareTo(first.next.data);
    //         int compare = min.compareTo(getAscending(first.next.data)); 
    //         if(compare != 0)
    //         {
    //             swap(min, getAscending(first.next.data));
    //         }}
    // }

    public void swapAgain(Node a, Node b) //index is node itself
    {
        //placeholder is data, String object = a.data
        String tempSwap = a.data; 
        a.data = b.data; 
        b.data = tempSwap; 
    }
   
    public Node getMin(Node startNode)
    {
        //set index to var
        //set min value and index
        Node minNode = startNode; 
        String min = startNode.data;

        for(Node i = startNode.next; i != null; i = i.next)
            //use condition to compare values
            if(i.data.compareTo(min) < 0)
            {
                // set new min position
                min = i.data; 
                minNode = i; 
                // set new min value
            }
            //loop through to end
        //return node;
        return minNode; 
    }

    public void sortAscendingTwo()
    {
        for(Node i = first; i.next != null; i = i.next)
        {
            //set min pos, Node min = getMin(pass i)
            Node min = getMin(i); 
            if(min.data.compareTo(i.data) < 0)
            {
                swapAgain(min, i);
            }    
        }
    }

    {


    // public void trySwap(String [] arr, int a, int b)
    // {
    //     String tempSwap = arr[a];
    //     arr[a] = arr[b]; 
    //     arr[b] = tempSwap;  
    // }

    // public String getZ(String [] arr, String startPos)
    // {
    //     String a = arr[0];

    // }
    }

}

