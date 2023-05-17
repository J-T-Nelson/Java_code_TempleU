public class AsciiArt {
// This program contains 2 primary methods which both print ascii art. 
  static int SIZE = 4;
  static int SIZE2 = 10;

  public static void main(String[] args) {

  parkinglot(SIZE);
  System.out.println("");
  pyramid(SIZE2);
  }

  public static void pyramid(int n) {
    //condenses two methods into one.
    print(pyramidTop(n));
    pyramidBody(n);
  }

  public static void parkinglot(int n) {
    //condenses two methods into one.
    parkingTop(n);
    parkingSpots(n);
  }
  //I put extra tabs between methods to break up code blocks for visual clarity...
  //it didnt really work
    public static String print(String n) {
      //this method takes string inputs and prints them
      System.out.println(n);
      return n;
    }

    public static void parkingTop(int scl) {
      //prints a parking lot top that scales
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
        //prints parking spots that scale
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

  public static String pyramidTop(int scl) {
  //returns a string which is a pyramid top that scales
  //I wanted to learn how to get my method to return a string instead of
  //simply printing, so I could count the string length within my code using STRING.length();
    String s = " ";

    for (int i = 1; i <= (scl*4-2); i++) {
        s += "_";
    }
    s += " ";
    return s;
  }

  public static void pyramidBody(int scl) {
    //This block prints a pyramid body that scales down to 2 before it loses all definition
    //its more of a hut at 2, but will scale indefinitely large
    int scaler = scl;
    for (int z = scl; z >= 1; z--) {
      System.out.print("|");
      for (int a = 1; a<= (z*2-2); a++) { System.out.print(" ");}
        // is the above for loops style valid? I feel like its neater for what it is in this context.
      System.out.print("_");

      for (int x = 1; x < ((scaler+1)-z); x++) {
          //taking the row we are in and using it to create the sides and insides of the pyramid
        for (int v = 1; v == x; v--) { System.out.print("/");}
            //^^conditional placement of the / symbol which is the side of the pyramid
        for( int wmod = 1; wmod == x; wmod--){
          for (int w = 1; w <= ((scaler-z)*2-1); w++) {
            System.out.print("~~");
          }
        }
      }
      for (int j = 1; j <= (scaler-z); j += 10000) { System.out.print("\\");}
      System.out.print("_");
      for (int a = 1; a<= (z*2-2); a++) { System.out.print(" ");}
      System.out.println("|");
    }
  }
}
