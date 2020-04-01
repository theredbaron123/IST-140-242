/**
 * Customer
 */

import java.util.ArrayList; 

public class Customer {

    private Integer customerID; 
    private String fName; 
    private String lName; 
    private double acctBalance;
    protected ArrayList<Book> bookDecrement;

    public Customer(int customerID, String fName, String lName, double acctBalance) {
        this.customerID = customerID;
        this.fName = fName;
        this.lName = lName;
        this.acctBalance = acctBalance;
        this.bookDecrement = new ArrayList<>(); 
    }

    public Customer (int customerID)
    {
        this.customerID = customerID; 
        this.fName = "";
        this.lName = "";
        this.acctBalance = 0.0;
        this.bookDecrement = new ArrayList<>(); 
    }

    public ArrayList<Book> getBookDecrement(){
        return bookDecrement; 
    }

    public Integer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public double getAcctBalance() {
        return acctBalance;
    }

    public void setAcctBalance(double acctBalance) {
        this.acctBalance = acctBalance;
    }

    @Override
    public String toString() {
        return "Customer [acctBalance=" + acctBalance + ", customerID=" + customerID + ", fName=" + fName + ", lName="
                + lName + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(acctBalance);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + customerID;
        result = prime * result + ((fName == null) ? 0 : fName.hashCode());
        result = prime * result + ((lName == null) ? 0 : lName.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Customer other = (Customer) obj;
        if (Double.doubleToLongBits(acctBalance) != Double.doubleToLongBits(other.acctBalance))
            return false;
        if (customerID != other.customerID)
            return false;
        if (fName == null) {
            if (other.fName != null)
                return false;
        } else if (!fName.equals(other.fName))
            return false;
        if (lName == null) {
            if (other.lName != null)
                return false;
        } else if (!lName.equals(other.lName))
            return false;
        return true;
    }


}