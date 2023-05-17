public class AsciiArt {

  static int SIZE = 4;
  static int SIZE2 = 10;

  public static void main(String[] args) {

  parkingTop(SIZE);
  parkingSpots(SIZE);
  System.out.println("");
  printstring(stadiumTop(SIZE2));
  stadiumTM(SIZE2);

  String lencheck1 = stadiumTop(SIZE);
  System.out.println(lencheck1.length());

  //how to have 2 arguments in a method? can they be of different types?
      //(use commas for 2 args... idk if they can have 2 types but probably)
//how do I get these methods to be internally adjustable? such that I can change size on a per call basis?
// by taking out the global variable and replacing it with a local parameter
  }
  //extra tabs between methods to break up code blocks

    public static String printstring(String n) {
      //this method takes string inputs and prints them
      System.out.println(n);
      return n;
    }

    public static void parkingTop(int scl) {
      //prints a size adjustable top parking lot line.
      System.out.print(" ");
      for (int i = 1; i <= (scl*2); i++) {
        System.out.print("_");
      }
      System.out.print("_");
      for (int i = 1; i <= (scl*2); i++) {
        System.out.print("_");
      }
      System.out.println(" ");
    }

      public static void parkingSpots(int scl) {
        for (int h = 1; h <= (scl * 4); h++) {
          System.out.print("|");
          for (int i = 1; i <= (scl*2); i++) {
            System.out.print("_");
          }
          System.out.print("|");
          for (int i = 1; i <= (scl*2); i++) {
            System.out.print("_");
          }
          System.out.println("|");
        }
      }

  public static String stadiumTop(int scl) {
  //prints a size adjustable top stadium lot line.
    String s = " ";

    for (int i = 1; i <= (scl*4-2); i++) {
        s += "_";
    }
    s += " ";
    return s;
  }
//how to print one thing and than change to printing another based on a value output by a for loop?
//by having their conditional elements be intertwined. thus the value of for(a) will affect the loop count of for(b)

  public static void stadiumTM(int scl) {
    int scaler = scl;
    for (int z = scl; z >= 1; z--) {
      System.out.print("|");
      for (int a = 1; a<= (z*2-2); a++) { System.out.print(" ");}
        // is the above for loops style valid? I feel like its neater for what it is in this context.
      System.out.print("_");

      for (int x = 1; x < ((scaler+1)-z); x++) {
          //taking the row we are in and using it to print the appropriate aspects of the stadium
        for (int v = 1; v == x; v--) { System.out.print("/");}
            //^^conditional placement of the / symbol which is the start of seats
        for( int wmod = 1; wmod == x; wmod--){
          for (int w = 1; w <= ((scaler-z)*2-1); w++) {
            System.out.print("..");
          }
        }
      }
      for (int j = 1; j <= (scaler-z); j += 10000) { System.out.print("\\");}
      System.out.print("_");
      for (int a = 1; a<= (z*2-2); a++) { System.out.print(" ");}
      System.out.println("|");
    }

  }
  //ok this soulution is obviously too complicated... I must have interpreted the means of solving this incorrectly.
  //I want to press on, but also fear how long it would take me to produce any results.
  //Ok I am certain now after thinking about the scaling aspect of the challenge that I messed up because I included
  //the top of the structure in my middle-top portion which has messed with so many aspects of the algorithm that it man
  // be unfixable.
}
