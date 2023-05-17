import java.util.*;

public class CommaCount {
  //practice code from Ch 5.
  public static void main(String[] args) {
    printNumbers(20);
    printPrimes(5);
    System.out.println(factorC(51798));
    printPrimes2(56);
    diceRoll6();

    Scanner roll = new Scanner(System.in);

  }
  public static void printNumbers(int n){
    for (int i=1; i<=n; i++){
      System.out.print(i);
      if (!(i == n)){
        System.out.print(", ");
      }
    }
    System.out.println();
  }
  public static void printPrimes(int n){
    if (n >= 2){ System.out.print("2");}
    for (int i=3; i<=n; i++){
      for(int t=2; t<i; t++){
        if (i%t == 0){break;}
        //break should terminate the loop upon the first instance of non prime divisibility
        if (t == i-1){ System.out.print(", " + i); }
      }
      }
    System.out.println();
  }


  public static void printPrimes2(int n){
    if (n >= 2){ System.out.print("2");}
    for (int i=3; i<=n; i++){
      if (factorC(i) == 2){ System.out.print(", " + i); }
    }
    System.out.println();
  }

  public static int factorC(int n){
    int C = 0;
    for (int i=1; i<=n; i++){
      if (n%i ==0){C++;}
    }
    return C;
  }

  public static void diceRoll6(){
    Random rool = new Random();
    // this simulates rolling two dice until 7 is achieved by adding the two rolls together
    // the results of each roll are printed
    int sum = 0;
    while ((sum != 7)){
      int rll = rool.nextInt(6)+1;
      int rll2 = rool.nextInt(6)+1;
      sum = rll + rll2;
      System.out.println(rll + "+" +rll2 + "=" + sum);
    }


  }
}
