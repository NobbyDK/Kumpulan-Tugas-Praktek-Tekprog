import java.util.Scanner;

//--------------------------------------------------------------------
//  <Kasus 3: Polimorphic sorting>
//  Author  : Nobby Dharma Khaulid
//  NIM     : 231524020
//  Tanggal : 18 Maret 2023
//  File    : Strings.java
//--------------------------------------------------------------------

public class Strings {
    
    public static void main (String[] args)
    {
        // Initialize variables
        String[] strList;
        int size;

        // Create a Scanner object for user input
        Scanner scan = new Scanner(System.in);

        // Prompt the user to input the number of strings to sort
        System.out.println("\nHow Many Strings do you want to sort? ");
        size = scan.nextInt();
        strList = new String[size];

        // Prompt the user to input the strings
        System.out.println("\nEnter the strings...");
        for (int i = 0; i < size; i++)
        {
            strList[i] = scan.next();
        }

        // Sort the array of strings using insertion sort
        Sorting.insertionSort(strList);

        // Display the sorted strings
        System.out.println("\nYour Strings in sorted order...");
        for (int i = 0; i < size; i++)
        {
             System.out.println(strList[i] + " ");
        }
        System.out.println();

        // Close the Scanner object to prevent resource leaks
        scan.close();

    }
}
