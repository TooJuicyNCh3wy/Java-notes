import java.util.Scanner;        // For the Scanner class
import java.io.*;                // For file I/O classes

/**
   This program opens a file containing the sales
   amounts for 30 days. It calculates and displays
   the total sales and average daily sales.
*/

public class SalesReport
{
   public static void main(String[] args) throws IOException
   {
      final int NUM_DAYS = 30; // Number of days of sales
      
      String filename;         // The name of the file
      double totalSales;       // Total sales for period
      double averageSales;     // Average daily sales
      
      // Get the name of the file.
      filename = getFileName();
      
      // Get the total sales from the file.
      totalSales = getTotalSales(filename);
      
      // Calculate the average.
      averageSales = totalSales / NUM_DAYS;
      
      // Display the total and average.
      displayResults(totalSales, averageSales);
   }

   /**
      The getFileName method prompts the user to enter
      the name of the file to open.
      @return A reference to a String object containing
              the name of the file.
   */
   
   public static String getFileName()
   {
      String filename;   // To hold the file name
      
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Prompt the user to enter a file name.
      System.out.print("Enter the name of the file: ");
      filename = keyboard.nextLine();

      // Return the file name.
      return filename;
   }     
      
   /**
      The getTotalSales method reads the daily sales amounts
      from a file, accumulating the total. The total is returned.
      @param filename The name of the file to open.
      @return The total of the sales amounts.
   */
   
   public static double getTotalSales(String filename) throws IOException
   {
      double total = 0.0;  // Accumulator
      double sales;        // A daily sales amount

      // Check for the file's existence.
      try (Scanner inputFile = new Scanner(new File(filename)))
      {
         // Step through the file.
         while (inputFile.hasNext())
         {
            // Read a double from the file.
            sales = inputFile.nextDouble();
               
            // Add sales to the value already in total.
            total += sales;
         }
      }
     
      // Return the total sales.
      return total;
   }
   
   /**
      The displayResults method displays the total and
      average daily sales.
      @param total The total sales.
      @param avg The average daily sales.
   */
   
   public static void displayResults(double total, double avg)
   {
      // Display the formatted total and average sales.
      System.out.printf("Total sales: $%,.2f\n", total);
      System.out.printf("Average daily sales: $%,.2f\n", avg);
   }
}
