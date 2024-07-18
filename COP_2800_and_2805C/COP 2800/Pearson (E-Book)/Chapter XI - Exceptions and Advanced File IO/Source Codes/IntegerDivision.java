import java.util.Scanner; 
 
/** 
   This program demonstrates performs integer division. 
*/ 
 
public class IntegerDivision 
{ 
   public static void main(String[] args) 
   { 
      int number1, number2, quotient; 
 
      // Create a Scanner object to read keyboard input. 
      Scanner keyboard = new Scanner(System.in); 
 
      // Get two numbers from the user. 
      System.out.print("Enter an integer: "); 
      number1 = keyboard.nextInt(); 
 
      System.out.print("Enter another integer: "); 
      number2 = keyboard.nextInt(); 
 
      // Perform integer division. 
      quotient = number1 / number2; 
      System.out.println("The quotient is " + quotient); 
   } 
} 