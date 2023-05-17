import java.util.*;
import java.io.*;
//type[] name = new type[length]
public class ArrayPractice2 {
  public static void main(String[] args) throws FileNotFoundException{
    int Ay1[] = {100, 99, 70, 60, 50, 30, 123, 560, 30};
    System.out.println("Number of passing scores from section Ay1[]: "+ passingScoreNum(Ay1, 100));

    int Ay2[] = {100, 99, 70, 60, 50, 30, 50, 60, 70, 99, 100};
    System.out.println("T or F; Is Ay1 a palindrome?" + palindromeArray(Ay1)); System.out.println("T or F; Is Ay2 a palindrome?" + palindromeArray(Ay2));


    int Ay3[] = {100, 99, 70, 60, 50, 30, 50, 60, 70, 99, 100};
    System.out.println("Ay2 and Ay1 are the same? " + same(Ay1, Ay2)); System.out.println("Ay2 and Ay3 are the same? " + same(Ay3, Ay2));

    System.out.println("Ay1 gon be copied... here go: " + Arrays.toString(copy(Ay1)));
    System.out.println("First n elements of Ay1 gon be copied... here go: n=5 " + Arrays.toString(copy(Ay1, 5)));

    System.out.println("Ay2 gon be sliced... here go: " + Arrays.toString(slice(Ay2, 2, 8)));

    System.out.println("Filtering out numbers below n: n=100 "+ Arrays.toString(copyFilterH(Ay3, 100)));

    int Ay4[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    System.out.println("is Ay3 in ascending order? " + isIncArray(Ay3));
    System.out.println("is Ay4 in ascending order? " + isIncArray(Ay4));

    System.out.println("triNum trials for 3, 1, 7, 8"+ Arrays.toString(triangleNumbers(3))
    + Arrays.toString(triangleNumbers(1))+ Arrays.toString(triangleNumbers(7))+ Arrays.toString(triangleNumbers(8)));

    System.out.println(stringReverse("Roundabout"));

    String sAy1[] = {"apple", "beenan", "Shehand", "slamdunk", "skunkbunk", "Ieatass"};
    System.out.println(Arrays.toString(sArrayReverse(sAy1)));

    int mAy1[][] = {Ay1, Ay2, Ay4}; //not sure if this is a valid declaration of a 2d array.
    matrixPrint(mAy1);
    matrixColumnPrint(mAy1);

    int Ay41[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int Ay42[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int Ay43[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int mAy2[][] = {Ay41, Ay42, Ay43};
    System.out.println("mAy2 before: " + Arrays.toString(Ay41)+ Arrays.toString(Ay43));
    initialize(mAy2, 200);
    System.out.println("mAy2 after: " + Arrays.toString(Ay41)+ Arrays.toString(Ay43));

    System.out.println("Largest value in matrix mAy1: " + largestItemMatrix(mAy1));


  }
    public static int passingScoreNum(int a[], int pass){//I dont think I need a capital A for an array parameter, just the brackets.. we will see
      int passCount = 0;
      for (int i=0; i < a.length; i++){
        if (a[i] >= pass){
          passCount++;
        }
      }
      return passCount;
    }
    public static String palindromeArray(int A[]){
      int checkLen = A.length/2;
      for (int i=0; i < checkLen; i++){
        if (A[i] != A[A.length-1-i]){
          return "FALSE";
        }
      }
      return "TRUE";
    }
    public static String same(int A[], int B[]){
      if (A.length != B.length){return "FALSE";}

      for (int i=0; i < A.length; i++){
        if (A[i] != B[i]){
          return "FALSE";
        }
      }
      return "TRUE";
    }
    public static int[] copy(int A[]){
      int B[] = new int[A.length];
      for (int i=0; i < A.length; i++){
        B[i] = A[i];
      }
      return B;
    }
    public static int[] copy(int A[], int n){
      int B[] = new int[n];
      for (int i=0; i < n; i++){
        B[i] = A[i];
      }
      return B;
    }
    public static int[] slice(int A[], int i, int j){
      int C[] = new int[j+1-i];
      int idx = 0;
      for (int e=i; e <= j; e++){
        C[idx] = A[e];
        idx++;
      }
      return C;
    }
    public static int[] copyFilterH(int A[], int n){
      int count = 0;
      for (int i=0; i<A.length; i++){
        if (A[i] >= n){
          count++;
        }
      }

      int B[] = new int[count];
      int c = 0;
      for (int i=0; i<A.length; i++){
        if (A[i] >= n){
          B[c]=A[i];
          ++c;
        }
      }
      return B;
    }
    public static String isIncArray(int A[]){
      for (int i=0; i < (A.length-1); i++){
        if(A[i] < A[i+1]) {continue;} else {return "FALSE";}
      }
      return "TRUE";
    }
    public static int[] triangleNumbers(int x){
      int A[] = new int[x];
      int triNum = 0;

      for (int i=0; i< A.length; i++){
        triNum += (i+1);
        A[i] = triNum;
      }
      return A;
    }
    public static String stringReverse(String s){
      String A[] = new String[s.length()];
      for (int i=0; i<s.length(); i++){
        A[i] = s.substring(i, i+1);
      }
      String rev = "";
      //PrintStream toRev = new PrintStream(rev);
      for (int i=0; i<s.length(); i++){
        rev = rev + A[s.length()-i-1];
        //toRev.print(A[s.length()-i-1]);
      }
      return rev; //I don't know if I can use a printstream to append chars to a string... Still don't know. Printstream path failed due to FileNotFoundException
      //I may be able to use a += type of adding of chars to the string to expand it.. This worked!
    }
    public static String[] sArrayReverse(String[] S){
      String B[] = new String[S.length];
      for (int i=0; i<S.length; i++){
        B[i]= stringReverse(S[i]);
      }
      return B;
    }
    public static void matrixPrint(int A[][]){
      for (int i=0; i<A.length; i++){
        System.out.print(A[i][0]);
        for (int j=1; j<A[i].length; j++){
          System.out.print(", " + A[i][j]);
        }
        System.out.println();
      }
    }
    public static void matrixColumnPrint(int A[][]){
      int maxLen = 0;
      for (int i=0; i<A.length; i++){ //need to find max length of any row in our matrix First
        if (A[i].length > maxLen){
          maxLen = A[i].length;
        }//after this loop maxLen will be the value of the longest array in our 2D array
      }
      System.out.println("MaxLen: " + maxLen);
      for (int i=0; i<maxLen; i++){
        System.out.print("Column " + i +": ");
        for (int j=0; j<A.length; j++){
          if (A[j].length > i){
            System.out.print(A[j][i] + ", ");
          } else {System.out.print("N/V, ");}
        }
        System.out.println(); //Important to note about this method, the j value represents our row index... (y in excel)
        // i value represents our column index (x in excel)... so if the row we are working on is shorter than the current
        //value of i, we are telling java to grab an out of bounds index.. thus we must account for this possible error with an if statement.
      }

    }

    public static void initialize(int A[][], int initVal){
      for (int i=0; i<A.length; i++){
        for (int j=0; j<A[i].length; j++){
          A[i][j] = initVal;
        }
      }
    }

    public static int largestItemMatrix(int A[][]){
      int lrg = 0;
      for (int i=0; i<A.length; i++){
        for (int j=0; j<A[i].length; j++){
          if (A[i][j] > lrg) {
            lrg = A[i][j];
          }
        }
      }
      return lrg;
    }


}
