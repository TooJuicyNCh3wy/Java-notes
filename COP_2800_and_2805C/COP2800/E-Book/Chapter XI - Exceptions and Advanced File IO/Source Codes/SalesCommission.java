import java.util.Scanner; 
 
/** 
   This program calculates sales commission. 
*/ 
 
public class SalesCommission {
  public static void main(String[] args) 
     { 
        final double COMMISSION_RATE = 0.1; 
        double sales, commission; 
   
        // Create a Scanner object to read keyboard input. 
        Scanner keyboard = new Scanner(System.in); 
   
        // Get the amount of sales. 
        System.out.print("Enter your sales: "); 
        sales = keyboard.nextDouble(); 
   
        // Calculate the commission. 
        commission = sales * COMMISSION_RATE; 
   
        // Display the commission. 
        System.out.printf("Your commission: $%,.2f\n", commission); 
     } 
}
