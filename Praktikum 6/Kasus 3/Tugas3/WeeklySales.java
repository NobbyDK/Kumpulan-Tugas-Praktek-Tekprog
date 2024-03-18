//------------------------------------------------------------------------------------------//
//  WeeklySales.java        Authors : Lewis/lostuf
//
//  This program sorts the sales staff in descending order by sales.
//  It first initializes an array of Salesperson objects with predefined data,
//  then prompts the user to input additional data for sales staff.
//  After adding new data, it resorts the array and displays the ranking of sales for the week.
//-----------------------------------------------------------------------------------------//

import java.util.Scanner;

public class WeeklySales 
{
    public static void main(String[] args)
    {
        // Initialize an array of Salesperson objects with predefined data
        Salesperson[] salesStaff = new Salesperson[10];

        salesStaff[0] = new Salesperson("Jane", "Jones", 3000);
        salesStaff[1] = new Salesperson("Daffy", "Duck", 4935);
        salesStaff[2] = new Salesperson("James", "Jones", 3000);
        salesStaff[3] = new Salesperson("Dick", "Walter", 2800);
        salesStaff[4] = new Salesperson("Don", "Trump", 1570);
        salesStaff[5] = new Salesperson("Jane", "Black", 3000);
        salesStaff[6] = new Salesperson("Harry", "Taylor", 7300);
        salesStaff[7] = new Salesperson("Andy", "Adams", 5000);
        salesStaff[8] = new Salesperson("Jim", "Doe", 2850);
        salesStaff[9] = new Salesperson("Wait", "Smith", 3000);

        // Sort the array using insertion sort
        Sorting.insertionSort(salesStaff);

        // Display the initial ranking of sales for the week
        System.out.println("\nRanking of Sales for the week\n");
        for(Salesperson s : salesStaff)
        {
            System.out.println(s);
        }
        
        // Prompt the user to input additional data for sales staff
        int size;
        Scanner scan = new Scanner(System.in);
        System.out.print("\nHow many data staff do you want to add? ");
        size = Integer.parseInt(scan.nextLine());
        salesStaff = new Salesperson[size];

        System.out.println ("Enter the data staff...");
        for (int i = 0; i < size; i++)
        {
            System.out.println("\nEnter Staff " + i + " first name: ");
            String first = scan.nextLine();
            System.out.println("\nEnter staff " + i + " last name: ");
            String last = scan.nextLine();
            System.out.println("\nEnter total sales staff " + i + ": ");
            int totalSales = Integer.parseInt(scan.nextLine());
            salesStaff[i] = new Salesperson (first, last, totalSales);
        }

        // Sort the array again after adding new data
        Sorting.insertionSort(salesStaff);

        // Display the updated ranking of sales for the week
        System.out.println("\nRanking of sales for the week\n");
        for (Salesperson s : salesStaff)
        {
            System.out.println(s);
        }
    }    
}
