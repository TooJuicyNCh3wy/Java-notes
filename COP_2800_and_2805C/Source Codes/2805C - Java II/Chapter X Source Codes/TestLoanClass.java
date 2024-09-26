import java.util.Scanner;

public class TestLoanClass {
  public static void main(String[] args){    // Main Method
    Scanner input = new Scanner(System.in);  // Creates a scanner

    System.out.print(
      "Enter your annual interest rate: "
    );                                       // Lines 7 - 10: Enter annual interest rate
    double annualInterestRate = input.nextDouble();

    System.out.print(
      "Enter the number of years AS A WHOLE NUMBER (Integer): "
    );                                      // Lines 12 - 15: Enter number of years
    int numberOfYears = input.nextInt();

    System.out.print(
      "How much would you like for the loan:"
      );                                   // Lines 17 - 20: Enter Loan Amount
      double loanAmount = input.nextDouble();

    Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount); // Create a loan object

    System.out.printf("The loan was created on %s\n" + "The monthly payment is %.2f\nThe total payment is %.2f\n", loan.getLoanDate().toString(), loan.getMonthlyPayment(), loan.getTotalPayment());
  }
}
