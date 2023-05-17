?? ????//public class JornJorn {
  public static void main(String[] args) {

    starsAlt(5, "^");
    stars(5);
    starbox3(5,5);
    starbox3(10,10);
    starbox3th(10,10);
    strngXn("fork     FARNK\n",10);
    iftst();
    castTST();
    alphabetprint();
  }
    public static void starsAlt(int n, String s) {
      for (int i=1; i <=n; i++) {
        print("*");
        print(s);
      }
      println("");
    }
    public static void stars(int n) {
      for (int i=1; i <=n; i++) {
        print("*");

      }
      println("");
    }
    public static void starbox3(int w, int h) {
      stars(w*3);
      for (int j = 1; j<=h; j++){
        print("*");
        for (int i=1; i<=(w*3-2); i++) {
        print(" ");
        }
        println("*");
      }
      stars(w*3);
    }
    public static void starbox3th(int w, int h) {
      stars(w*3);
      for (int j = 1; j<=h; j++){
        print("*");
        strngXn(" ", w*3-2);
        println("*");
      }
      stars(w*3);
    }

    public static String println(String n) {
      //this method takes string inputs and prints them then goes to a new line
      System.out.println(n);
      return n;
    }?? ????//
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

    public static void iftst() {

      int dip = 30;

      for (int i=0; i <= 3; i++) {
        if (dip < 40){
          dip = buy(dip);
          //^^ this needs the update statement, as the return of "buy()" means nothing
          // if its not used to update the variable its affecting.
        } else {
          hodl();
        }
      }
      println("$"+dip);
    }
    public static int buy(int n) {
      n += 5;
      return n;
    }
    public static void hodl() {
      println("I got that GGGG-CASH");
    }

    public static void castTST() {
      int j = 10;
      int i = 25;
      int k = 15;
      char kj = (char) (k+j);
      char beepo = (char)(100);
      System.out.println(beepo +""+ (char)(beepo +10));
      System.out.println(kj);
    }

    public static void alphabetprint(){
      for (char c = 'a'; c <= 'z'; c++) {
      System.out.print(c);
      //how is this working?
      //Primitives correspond to numerical values..
      //Each char is mapped to an integer value internally – Called an ASCII value 'A' is 65 'B' is 66 ' ' is 32 'a' is 97 'b' is 98 '*' is 42
// thus java can treat chars as numbers and can increment them. What is handwavey is that somehow java knows to
//print chars and not the numbers associated with the chars when they are used in this very numerical way.
//is this something that is only explained by diving deep into the way java treats data/characters? (is it worth knowing about?)
}//it knows to print chars because the type is defined as char inside the loop... if it was an int.. itd print the associated numbers instead!
    }






}
