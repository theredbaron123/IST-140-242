/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalpracticereal;
import java.util.ArrayList; 
import java.util.Scanner; 
import java.io.*; 
import java.util.Arrays; 
/**
 *
 * @author jjjbr
 */
public class Finalpracticereal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try
        {
            Scanner scnr = new Scanner (System.in); 
            System.out.println("How many tables are in the Restaurant? ");
            int tables = scnr.nextInt(); 
            System.out.println("How many reservations are there tonight? ");
            int reservations = scnr.nextInt(); 
            
            int [] reservationsArray = randomReservations(reservations, tables);
            ArrayList<Boolean>childList = childList(reservationsArray);
            double [] discount = discount(reservationsArray, childList); 
            ArrayList<Double> billsArrayList = calcBill(discount); 
            print(reservationsArray, childList, discount, billsArrayList); 
            
            int highestBill = maxTable(billsArrayList); 
            System.out.println("The table with the highest bill is Table: " + highestBill);
            
            String file = writeFile(billsArrayList); 
            ArrayList<Double>bill = readFile(file); 
            System.out.println(bill);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage()); 
        }
    }
    public static double randomNumber()
    {
        double ranNum = Math.random(); 
        return ranNum; 
    }
    public static int [] randomReservations(int reservations, int tables) throws Exception
    {
        if (reservations < 0 || reservations > tables)
        {
            throw new Exception("# of reservations will not fit in resteraunt. ");
        }
        else
        {
            int [] array = new int [reservations];
            for(int i =0; i < reservations; i++)
            {
                int n = (int) (Math.random()*(6-1+1)+1); 
                array[i] = n; 
            }
            return array; 
        }
    }
    public static ArrayList<Boolean> childList(int [] reservationsArray)
    {
        ArrayList<Boolean> list = new ArrayList<>(); 
        boolean hasChild=false; 
        
        for(int i=0; i < reservationsArray.length; i++)
        {
            double random = randomNumber(); 
            if(random < .5 )
            {
                hasChild = true; 
            }
            else
            {
                hasChild = false; 
            }
            list.add(hasChild); 
        }
        return list; 
    }
    public static double [] discount (int [] reservationsArray, ArrayList<Boolean>childList)
    {
        final int SIZE = reservationsArray.length;
        double [] discountArray = new double[SIZE]; 
        for (int i = 0; i < SIZE; i++)
        {
            double discount = 0; 
            if(reservationsArray[i] >= 5 && childList.get(i)== true)
            {
                discount = .25; 
            }
            else if (reservationsArray[i] == 5 && childList.get(i)== true)
            {
                discount = .25; 
            }
            else if (reservationsArray[i] == 4 && childList.get(i)== true)
            {
                discount = .1; 
            }
            else if (reservationsArray[i] == 3 && childList.get(i))
            {
                discount = .05; 
            }
            else
            {
                discount = 0; 
            }
            discountArray[i] = discount; 
        }
        return discountArray; 
    }
    public static ArrayList<Double>calcBill(double [] discounts)
    {
        ArrayList<Double> bills = new ArrayList<>(); 
        for (int i = 0; i < discounts.length; i++)
        {
            double subTotal = Math.random()* (100-30)+30; 
            double total = 0; 
            
            total = subTotal -(subTotal * discounts[i]); 
            bills.add(total); 
        }
        return bills; 
    }
  public static String writeFile(ArrayList<Double>bills)
  {
      String fileName = "pizzaTime.txt";
        PrintWriter out = null; 
        try
        {
            out = new PrintWriter(fileName);
            for (int i = 0; i < bills.size(); i++)
            {
                out.println(bills.get(i)); 
            }
        }
        catch(Exception e)
        {
            String errorString = e.getMessage(); 
            System.out.println(errorString);
        }
        finally
        {
          if (out != null)
            {
                out.close(); 
            }  
        }
        return fileName; 
  }
  
  public static void print (int [] reservations, ArrayList<Boolean> list, double [] discount, ArrayList<Double>bills)
  {
      System.out.println("Reservations ");
      for(int i = 0; i < list.size(); i++)
      {
          System.out.println("Table " + (i +1));
          System.out.print(reservations[i] + ", ");
          System.out.print(list.get(i) + ", ");
          System.out.print(discount[i]*100 + "%, ");
          System.out.printf("Total bill: $ %.2f", bills.get(i));
          System.out.println();
      }
  }
  public static int maxTable (ArrayList<Double>bills) //IMPORTANT ALSO KNOW MIN 
  {
      int maxTable = 1; 
      double highest = bills.get(0); 
      for (int i = 0; i < bills.size(); i++)
      {
          if(bills.get(i) > highest)
          {
              highest = bills.get(i); 
              maxTable = i + 1; 
          }
      }
      return maxTable; 
  }
  public static ArrayList readFile(String fileName)
  {
      Scanner scnr = null; 
      ArrayList<Double> prices = new ArrayList();
      
      File fileToRead = new File(fileName); 
      try
      {
          scnr = new Scanner(fileToRead);
          while (scnr.hasNextDouble())
          {
              prices.add(scnr.nextDouble());
          }
      }
      catch(FileNotFoundException fne)
      {
          System.out.println(fne.getMessage());
      }
      finally
      {
          if (scnr != null)
          {
              scnr.close(); 
          }
      }
      return prices; 
  }
}
