import java.util.Scanner;
import java.io.*;


public class ArrayListPractice1{
  public static void main(String args[]) throws FileNotFoundException{
    Scanner dataRead = new Scanner(new File("E:\\Atom_Programming_Files\\Java_1068\\ExamplesFromTB\\data_1.txt"));

    String s = "______ funk on me breaker bob.";

    System.out.println(s.replace("______", "___FORK___"));

    String pAns[] = {"orange", "slop on dat", "mange", "o-blue", "orae"};
    String s1 = "What is the name of my fucking mom??\n";
    for (int i=0; i<pAns.length; i++){
      s1 += (i+1) +". "+pAns[i]+"\n";
    }
    System.out.println(s1);

    String b[] = pAns.clone(); // clone array method gud.
    System.out.println(b[0]);
  }
}
