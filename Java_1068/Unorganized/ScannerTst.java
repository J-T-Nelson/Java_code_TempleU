import java.util.Scanner;
// java.util is a package, which includes the scanner class... I dont know if I have that package on my system.
public class ScannerTst {
  public static void main(String[] args) {


    Scanner in = new Scanner(System.in);
    // in this scanner variable/object "in" is the name of the instance
    // whcih is why we do in.next(); in order to ask for input.
    System.out.print("What's your name? ");
    String name = in.next();
    println("Hi '" + name + "', how are you?");
    in.nextLine();
    String answr = in.nextLine();
    //looks like for some reason the "nextLine()" method is broken for me
    // next() is working fine to prompt for more input... nextLine is not.
    //scanner saves its spot... so when I hit enter,
    // \n is the next thing it reads.
    //The pointer gets left right where it was after the initial scanner method
    println("Deyum " + name +" "+ answr + " really is some shit!");

  }
  public static String println(String n) {
    //this method takes string inputs and prints them then goes to a new line
    System.out.println(n);
    return n;
  }
  public static String print(String n) {
    //this method takes string inputs and prints them without going to a new line
    System.out.print(n);
    return n;
  }
  public static void strngXn(String s, int n) {
    //a nice shortcut method such that you can print any string as many times as you please.
    for (int i=1; i<=n; i++) {
      print(s);
    }
  }
}
