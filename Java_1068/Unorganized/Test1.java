// I hope this stuff works...
import java.util.*;
import java.io.*;

public class Test1 {
  public static final Scanner IN = new Scanner(System.in);

  public static void main(String[] Args) {
    System.out.println("Hello jawn");
  tst();
  tst2();
  arrayT();
  //playerMove();
//  System.out.println(playerMove() + " 2, this dun workin now.");

  int A[] = {10, 20, 30};

  System.out.println(Arrays.toString(A));
  inc(A);
  System.out.println(Arrays.toString(A));
  String s = "jawnson";
  strngCH(s);
  System.out.println("This the String in the main: " +s);
  //interesting to note that despite the fact both Strings and Arrays are objects, and their addresses are referred to when you do ==
  //but when you send a String to a method, it sends a copy, and when you send an Array, it sends the address and thus anything done
  //on the array is done permanently.. I assume an array of strings would work the same way
  String[] SA = {"jorb", "jornk", "jarnk", "garnk", "larnk"};
  System.out.println("This before strArrayCH method: " + Arrays.toString(SA));
  strArrayCH(SA);
  System.out.println("This after: " + Arrays.toString(SA));
  }
  public static void tst() {
    for (int i=1; i<4; i++) {
      for (char c= 'a'; c<='c'; c++) {
        if (i%2==0) {
        i++;
        System.out.println(i + " " + c);
        } else {
        c++;
        System.out.println(c + " " + i);
        }
        }
          }
}
  public static void tst2() {
    String s1="bob";
String s2="lob";
String s3="law";
for (int i=0; i<4; i++) {
if (i%2==0) {
s1+=s2;
} else {
s2=s1+s3;
}
}
System.out.println(s1);
  }

  public static void arrayT(){
    String[] moveSet = {"lillasjon", "insvep", "tjena", "dromsack", "nordli"};
    Random roller = new Random();
    int roll = roller.nextInt(5);

    for (int i=0; i < 10; i++){
      roll = roller.nextInt(5);
      System.out.print("Random roll " + (i+1) + ": ");
      System.out.println(moveSet[roll]);

    }
    System.out.println(Arrays.binarySearch(moveSet, "tjena"));
    // ^^ this statement prints the index of the String I am searching for in the specified array.
    // the binary search algorithm is being used, which I do not understand exactly how it works... but for know
    // its sufficient to know it will find the index I am seeking and thus can be used for my project.



  }

  public static String playerMove(){
    System.out.println("What is your first move?");
    String Pmove = IN.next().toLowerCase();

    while (true){
      if (Pmove.equals("lillasjon") || Pmove.equals("insvep") || Pmove.equals("tjena") || Pmove.equals("nordli") || Pmove.equals("dromsack")){
        System.out.println(Pmove);
        return Pmove;
      } else {
          System.out.println("That is not a valid move friend, please, try again?");
          Pmove = IN.next().toLowerCase();
          continue;
        }
    }

  }

  public static void inc(int []a){
    for (int i=0; i < a.length; i++){
      a[i]++;
    }
  }
  public static void strngCH(String s){
    s = s +" Judson";
    System.out.println("This the modifed string in the method: " +s);
  }
  public static void strArrayCH(String []a){
    for (int i=0; i < a.length; i++){
      a[i] = a[i] + " lord!";
    }
  }
}
