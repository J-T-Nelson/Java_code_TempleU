import java.io.*;
import java.util.*;

public class Arrays {
  public static void main(String[] args) throws FileNotFoundException {
    int nums[] = new int[10*2];
    for (int i=0; i < nums.length; i++){
      System.out.print("Index of nums = " + i + " Current value = " + nums[i]);

      int j = (int) Math.pow(i, 5); // I learened that Math.pow() outputs doubles automatically even if theyre not really necessary... so you need to
      //type cast the value back to an int to not have issues when java is expecting an int.
      System.out.println(" value being inserted into index " + i + " = " + j );
      nums[i] = j;
    }

    int TestArray[] = {5, 3, 6, 7, 3, 2};
    int B[] = copy(TestArray);
    System.out.println(B + " " + TestArray);
    System.out.println("This is the array B: [" +B[0]+", "+B[1]+", "+B[2]+", "+B[3]+", "+B[4]+", "+B[5]+"]" );
    //System.out.println(B + " This is TestArray: " + Arrays.toString(TestArray) + " This is B: " + Arrays.toString(B));
    // cant get arrays.toSTring to work right now... getting an error that seems more commonly associated with constructors for objects.
    System.out.println(B.length);
    //Garraytest();
    //System.out.println("post Garraytest: " + TestArray[0]);
    int A[] = {10,20,30};
      whatHappens(A);
      System.out.println(A[0]);
  }
  public static void whatsPrinted(int A[]) {
    for (int i=1; i<A.length; i++) {
      A[i] = A[i-1]*2-3;
    }
  }
  public static void whatHappens(int A[]) {
   int []B = new int[A.length];

   for (int i=0; i<A.length; i++) {
     B[i] = A[i] * 2 + 1;
   }

   A=B;
 }

  public static int[] copy(int A[]) {
    int B[] = new int[A.length];
    for (int i=0; i < A.length; i++){
      B[i] = A[i];
    }
    return B;
  }


// the Garraytest() fails as expected... arrays can not be manipulated by methods
// unless passed into or created within those methods
  /*public static void Garraytest(){
    for (int i=0; i<TestArray.length; i++){
      TestArray[i]++;
    }
  }*/

  /*public static int dupeCount(int A[]){ // I should test this method on its own to see if it works.
    int B[] = copy(A);
    int count = 0;

    for (int g = 0; g < (B.length-1); i++) { //this only needs to cylce through all elements except the last in our array
      for (int g2 = (1+g) ; g2 < (B.length-g); g2++){ //g2 = 1+g, makes the loop more efficient, as it only needs to look forward for dupes, not through the whole array
        if (B[g] == -1){
          continue;//this if works because the arrays being tested in JUnit don't have -1 or any negatives..
          //but a more robust uniques method would require some other means of functioning, as I always need to reserve 1 value as a sentienl value...
        }
        if (A[g] == B[g2]){
          B[g2] = -1;
          count++;
        }
      }
    }
    return count;
    /*for (int i=0; i < B.length; i++){
      if (B[i] == -1){
        count++;
      }*/ //comenting out this loop as I think its unnecessary. incrementing each time a value is changed to -1 should be sufficient for accurate count.
   //}
}
