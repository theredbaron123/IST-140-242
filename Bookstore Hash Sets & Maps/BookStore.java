/**
 * BookStore
 */

 import java.util.ArrayList;
import java.util.HashMap;
 import java.util.HashSet;
import java.util.Map;
import java.util.Iterator; 

public class BookStore {

    private String storeName; 
    protected HashSet<Book> books; 
    protected HashSet<Customer> customers; 
    protected HashMap<Customer, ArrayList<Book>> rented;

    public BookStore(String storeName) {
        this.storeName = storeName;
        this.books = new HashSet<Book>();
        this.customers = new HashSet<Customer>();
        this.rented = new HashMap<>();
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public HashSet<Book> getBooks() {
        return books;
    }

    public void setBooks(HashSet<Book> books) {
        this.books = books;
    }

    public HashSet<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(HashSet<Customer> customers) {
        this.customers = customers;
    }

    public HashMap<Customer, ArrayList<Book>> getRented()
    {
        return rented; 
    }

    public void setRented(HashMap<Customer, ArrayList<Book>> rented){
        this.rented = rented;
    }

    public boolean addBook(String title, int numCopies)
    { 
        boolean flag = false; 

        while(!flag)
        { 
            if(!title.equals("null"))
            { 
                Book b1 = new Book(title, numCopies);  
                this.books.add(b1); 
                flag = true;    
            }
            else
            {
                flag = false; 
            }
        }
        //this.books = bookAdd; 
        return flag; 
    }

    public void addCustomer(int customerID, String fName, String lName, double acctBalance)
    {
        //HashSet<Customer> customerAdd = this.customers; 
        // customerID = 0; 
        // fName = ""; 
        // lName = ""; 
        // acctBalance = 0.0; 
        boolean sentinel = false; 

        while(!sentinel)
        {
            if(customerID != 0)
            {
                Customer c1 = new Customer(customerID, fName, lName, acctBalance); 
                this.customers.add(c1); 
                sentinel = true; 
            }
            else
            {
                sentinel = false; 
            }
        }
    }

    public boolean updateBook(String title, int numCopies)
    {
       
        Book b1 = new Book(title, numCopies); 
        
        numCopies = b1.getCopiesRemaining();
        HashSet<Book> itrBook = this.books; 
        ArrayList<Book> bookDecrement = new ArrayList<>();  
       // Iterator itr = rental.keySet().iterator(); 
        boolean tOrF = false; 
        for(int i =0; i < itrBook.size(); i++)
        {
            if (itrBook.contains(b1))
             {
                itrBook.remove(b1);
            // rented.forEach((Customer, Book) ->
            // {
            //   findNumCopies = b1.this.numCopies - 1;
            // }); 

            //ArrayList<Book> decrementRent = new ArrayList(); 
            //decrementRent = books; 

                for(int j = 0; j < itrBook.size(); j++)
                 {
                    numCopies = b1.getCopiesRemaining() - 1; 
                    b1.setCopiesRemaining(numCopies);
                 }
                 itrBook.add(new Book(title, numCopies)); 

            //bookDecrement.set(title, findNumCopies);
                 //bookDecrement.add(b1); 
                // rental.get(c1).add(b1); 
                 tOrF = true; 
            }
            // else
            // {
            //     tOrF = false; 
            // }
        
        }

        return tOrF; 
    }

    public boolean updateCustomer (int customerID, String fName, String lName, double acctBalance)
    {
        // Scanner scnr = new Scanner (System.in); 
        // System.out.println("Please enter the customer ID of the customer you want to take out: ");

        boolean tOrF = false; 
       // int findCustID = scnr.nextInt(); 
        fName = ""; 
        lName = ""; 
        acctBalance = 0.0; 
        HashSet<Customer> customerSet = new HashSet(); 
        Customer c1 = new Customer(customerID, fName, lName, acctBalance); 

        for(int i =0; i < customerSet.size(); i++)
        {
            if (customerSet.contains(customerID))
            {
                customerSet.remove(c1); 

                // System.out.println("Please create a new customer ID: ");
                // findCustID = scnr.nextInt(); 
                // System.out.println("Please create a new first name for your customer: ");
                // fName = scnr.nextLine(); 
                // System.out.println("Please create a new last name for your customer: ");
                // lName = scnr.nextLine(); 
                // System.out.println("Please create a new account balance for your customer: ");
                // acctBalance = scnr.nextDouble(); 

                Customer c2 = new Customer(customerID, fName, lName, acctBalance); 

                customerSet.add(c2); 

                tOrF = true; 
            }
            else
            {
                tOrF = false; 
            }
        }
        return tOrF; 
    }
    
    private boolean checkCust (Integer customerID)
    {

        Iterator<Customer> itr = customers.iterator(); 
        boolean flag = false; 


        while(itr.hasNext())
        {
            if(itr.next().getCustomerID().equals(customerID))
            {
                flag = true; 
            }

        }
       // System.out.println(flag);
        return flag;
    }

    private boolean checkBook (String title)
    {
        Iterator<Book> itr = books.iterator();
        boolean flag = false; 

        while(itr.hasNext())
        {
            if(itr.next().getBookTitle().equals(title))
            {
                flag = true; 
            }
        }
       // System.out.println(flag);
        return flag; 
    }

    public Customer getCustomer(int customerID)
    {
        Iterator <Customer> itr = customers.iterator(); 
        Customer c1 = new Customer(customerID); 

        while(itr.hasNext())
        {
            Customer c2 = itr.next(); 
            if(c1.getCustomerID().equals(c2.getCustomerID()))
            {
                c1 = c2; 
            }
        }

        return c1;
    }

    public Book getBook(String bookTitle, Integer numCopies)
    {
        Iterator <Book> itr = books.iterator(); 
        Book b1 = new Book(bookTitle, numCopies); 
        while(itr.hasNext())
        {
            Book b2 = itr.next(); 
            if(b1.getBookTitle().equals(b2.getBookTitle()))
            {
                b1 = b2; 
            } 
        }
       // System.out.println(b1);
        return b1; 
    }


    // public HashMap<Customer, ArrayList<Book>> addRental (int customerID, String title)
    public boolean addRental (int customerID, String title)
    {
        //int numCopies = 0; 
       // HashSet <Book> updateBook = this.books;
        
        int numCopies = 0;  
        boolean rented = true; 

        Iterator<Book> itr = this.books.iterator(); 

        while(itr.hasNext())
        {
            if(itr.next().getBookTitle().equals(title))
            {
                numCopies = itr.next().getCopiesRemaining(); 
            }
        }

        if (checkBook(title) && checkCust(customerID))
        {
            updateBook(title, numCopies); 
             
           // HashMap<Customer, ArrayList<Book>> rental = new HashMap<Customer, ArrayList<Book>>();
             

            // this.rented.forEach((Customer, Book) ->
            // {
            //   this.rented.getNumCopies = numCopies - 1;
            // }); 

            Customer c1 = getCustomer(customerID); 
            c1.bookDecrement.add(getBook(title, numCopies));
            this.rented.put(c1, c1.bookDecrement); 
             
            rented = true;
            return rented; 
        }
        else
        {
            rented = false; 
            System.out.println("Please check to make sure that the book or customer exists, or that the book has more than 0 copies"); 
            return rented; 
        }
        
    }
    

    public void showAll()
    {
        //HashMap<Customer, ArrayList<Book>> rental = new HashMap<Customer, ArrayList<Book>>();
        Iterator <Customer> itr = this.customers.iterator(); 

        System.out.println("Store name: " + this.storeName);

        System.out.println();

        while(itr.hasNext())
        {
            System.out.println("Customer info: " + itr.next());
        }
        System.out.println();

        Iterator<Book> itr2 = this.books.iterator(); 

        while(itr2.hasNext())
        {
            System.out.println("Book info: " + itr2.next());
        }

        System.out.println();

        for(Map.Entry<Customer, ArrayList<Book>> entry : rented.entrySet())
        {
            String bookTitle = " "; 

            for(Book book: entry.getValue())
            {
                bookTitle += book.getBookTitle() + ". ";
            }

            System.out.println("Customer: " + entry.getKey() + " Book:" + bookTitle);
        }

    }

}