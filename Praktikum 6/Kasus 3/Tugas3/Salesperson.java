//------------------------------------------------------------------------------------------//
//  Salesperson.java        Authors : Lewis/lostuf
//
//  Represents a sales person who has a first name, last name, and total number of sales
//-----------------------------------------------------------------------------------------//

public class Salesperson implements Comparable {
    private String firstName, lastName;
    private int totalSales;

    //------------------------------------------------------------------------------//
    //  Constructors : Sets up the sales person object with 
    //                 The given data.
    //------------------------------------------------------------------------------//
    public Salesperson (String first, String last, int sales)
    {
        firstName = first;
        lastName = last;
        totalSales = sales;
    }

    
    //------------------------------------------------------------------------------//
    //  Returns the sales person as a string.
    //------------------------------------------------------------------------------//
    public String toString()
    {
        return lastName + ", " + firstName + ". \t" + totalSales;
    }

    //------------------------------------------------------------------------------//
    //  Returns true if the sales people have
    //  the same name.
    //------------------------------------------------------------------------------//
    public boolean equals (Object other)
    {
        return (lastName.equals(((Salesperson)other).getLastName())) &&
                firstName.equals(((Salesperson)other).getFirstName());
    }

    //------------------------------------------------------------------------------//
    //  Order is based on total sales with the name
    //  (last, then first) breaking a tie.
    //------------------------------------------------------------------------------//
    public int compareTo(Object other)
    {
        Salesperson otherSalesperson = (Salesperson) other;

        int salesComparison = Integer.compare(totalSales, otherSalesperson.totalSales);
        
        if (salesComparison != 0)
        {
            return salesComparison;
        }
        else 
        {
            int lastNameComparison = lastName.compareTo(otherSalesperson.lastName);
            if(lastNameComparison != 0)
            {
                return lastNameComparison;
            }
            else
            {
                return firstName.compareTo(otherSalesperson.firstName);
            }
        }
    }

    //------------------------------------------------------------------------------//
    //  First name accessor.
    //------------------------------------------------------------------------------//
    public String getFirstName()
    {
        return firstName;
    }

    //------------------------------------------------------------------------------//
    //  Last name accessor
    //------------------------------------------------------------------------------//
    public String getLastName()
    {
        return lastName;
    }

    //------------------------------------------------------------------------------//
    //  Total sales accessor.
    //------------------------------------------------------------------------------//
    public int getSales()
    {
        return totalSales;
    }
}
