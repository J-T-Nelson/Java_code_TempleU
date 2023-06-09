// This program prompts for information about a loan and
// computes the monthly mortgage payment.

import java.util.*; // for Scanner

public class Mortgage {
public static void main(String[] args) {
Scanner console = new Scanner(System.in);

// obtain values
 System.out.println("This program computes monthly mortgage payments.");
 System.out.print("loan amount : ");
 double loan = console.nextDouble();
 System.out.print("number of years : ");
 int years = console.nextInt();
 System.out.print("interest rate : ");
 double rate = console.nextDouble();
 System.out.println();

 // compute result and report
 int n = 12 * years;
 double c = rate / 12.0 / 100.0;

double payment = loan * c * Math.pow(1 + c, n) /
 (Math.pow(1 + c, n) – 1);
 /* The above lines 24,25 are a bit confusing to me as I am unfamiliar with the syntax of .pow
 I also am not totally sure about the expression that is being made which makes it a little had wavey.
 Where c = monthly interest rate...
 [payment = loan * (c(1 + c)^n)/(1 + c)^n - 1]   */
 System.out.println("payment = $" + (int) payment);
 }
}
