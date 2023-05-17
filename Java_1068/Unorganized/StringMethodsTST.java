public class StringMethodsTST {
  public static void main(String[] args) {
    String s1 = "Dog eat that gud, n he be gettin it too; fork on dis you dink.";
    int s1Len = s1.length();
    printINT(s1Len);
    iftst();
  }
  public static void iftst(){
    //just using this method to verify that i can do what I did on line 14 without going to my
    //else statement
    int score = 0;
    String shirt = "red";

    if (shirt == "red"){
      score += 1;
    } else { println("ew");}
    println(shirt);
    printINT(score);
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
  public static int printINT(int n) {
    //this method takes string inputs and prints them then goes to a new line
    //is there a way to make my other print functions also take ints as arugments?
    //like a way to make javas type declaration less cumbersome?
    System.out.println(n);
    return n;
  }
}
