import java.util.Scanner;

/**
   This program demonstrates the GradedActivity class.
*/

public class GradeDemo
{
   public static void main(String[] args)
   {
      double testScore;
      
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Create a GradedActivity object.
      GradedActivity grade = new GradedActivity();

      // Get a test score.
      System.out.print("Enter a numeric test score: ");
      testScore = keyboard.nextDouble();

      // Store the score in the grade object.
      grade.setScore(testScore);
      
      // Display the letter grade for the score.
      System.out.println("The grade for that test is " +
                         grade.getGrade());
   }
}