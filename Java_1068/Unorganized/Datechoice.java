import java.util.Scanner;

public class Datechoice {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    println("this is working!");
    questions(in);
  }
  public static void questions(Scanner in) {
        int score = 0;

    println("What color is your shirt?");
    String shirt = in.next();
    if (shirt.equals("red")){
      score += 1;
    } else { println("ew");}
    println(shirt);

    println("How much of that cash you stack?");
    Double cash = in.nextDouble();
    if(cash >= 100000){
      score += 2;
      println("damn thats sexy");
    } else { println("... Ok but what you got?");}
    if(cash >= 25000){
      score += 1;
    } else { println("...");}
    if(cash >= 10000){
      score += 1;
    } else { println("...");}

    println("Do you like to harm the innocent?");
    String harm = in.next();
    if (harm.equals("yes")){
      score -= 5;
    } else{ println("Nice, I like people who arent psychopaths :)");}
    println(harm);
    System.out.println(score);
    if (score >= 2) {
      println("You are a suitable mate");
    } else{ println("wow, like, bye.");}
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
}
