import java.util.*;
public class Receipt2 {
public static void main(String[] args) {
Scanner console = new Scanner(System.in);
double subtotal = meals(console);
results(subtotal);
}
// Prompts for number of people and returns total meal subtotal.
public static double meals(Scanner console) {
System.out.print("How many people ate? ");
int people = console.nextInt();
double subtotal = 0.0; // cumulative sum
for (int i = 1; i <= people; i++) {
System.out.print("Person #" + i +
": How much did your dinner cost? ");
double personCost = console.nextDouble();
subtotal = subtotal + personCost; // add to sum
}
return subtotal;
}
public static void results(double subtotal) {
double tax = subtotal * .08;
double tip = subtotal * .15;
double total = subtotal + tax + tip;
System.out.println("Subtotal: $" + subtotal);
System.out.println("Tax: $" + tax);
System.out.println("Tip: $" + tip);
System.out.println("Total: $" + total);
}
}
