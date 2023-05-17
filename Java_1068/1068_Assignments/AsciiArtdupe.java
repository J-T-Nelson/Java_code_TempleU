public class AsciiArt {

  static int bigness = 4;
  static String space = " ";
  static String line1 = "_";

  public static void main(String[] args) {

  parkingTop();
  parkingSpots();
  System.out.println("");
  stadiumTop();

  String lencheck1 = stadiumToplen();
  System.out.println(lencheck1.length());
  System.out.print(lencheck1);
  //interestingly here I can print the output of the String producing method directly without embedding it into a variable
  //which means I probably can make a method that takes other String methods as arguments and prints them
  //it would look like [pront(stadiumtoplen());]
  // so how do I take a string as an argument for a method that prints the string from the argument?
  System.out.println(stadiumToplen());
  printstring(stadiumToplen());
  }

    public static String printstring(String n) {
      System.out.println(n);
      return n;
    }
    public static void parkingTop() {
      //prints a size adjustable top parking lot line.
      System.out.print(" ");

      for (int i = 1; i <= (bigness*2); i++) {
        System.out.print(line1);
      }
      System.out.print("_");

      for (int i = 1; i <= (bigness*2); i++) {
        System.out.print(line1);
      }
      System.out.println(" ");
    }

      public static void parkingSpots() {
      //extra tabs to break up code blocks
        for (int h = 1; h <= (bigness * 4); h++) {

          System.out.print("|");

          for (int i = 1; i <= (bigness*2); i++) {
            System.out.print(line1);
          }
          System.out.print("|");

          for (int i = 1; i <= (bigness*2); i++) {
            System.out.print(line1);
          }
          System.out.println("|");
        }
      }

  public static void stadiumTop() {
    //prints a size adjustable top stadium lot line.
    //I would like to be able to do this without a whole new static method by
    //having some argument which relates to the multiplier of SIZE,
    //but do not yet know how to do so
    System.out.print(" ");

    for (int i = 1; i <= (bigness*9-2); i++) {
    System.out.print(line1);
    }
    System.out.println(" ");
  }

  public static String stadiumToplen() {
    //Fiore modifed stadiumTop for me to output a string that is exactly what stadiumTop would print
    //noteably this sort of method may be an alternative solution overall, as it does have a cleaner look,
    //less print statements, and serves multiple functions.
    String s = " ";

    for (int i = 1; i <= (bigness*9-2); i++) {
        s += line1;
    }
    s += " ";
    return s;
  }

}
