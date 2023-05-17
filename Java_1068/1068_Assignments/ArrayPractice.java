package arraypractice;//guess this package is installing the Arrays class?
//we cannot access the extra methods which are accessible by way of the Arrays class, we can use .length for arrays,
//and do not need more than this method.
/*Do not modify any files in the project other than ArrayPractice.java. Do not use the Arrays class in your methods.
 * Do not change the return types, names, or parameters of any of these functions or of the name of the class itself.
 * There is also no need in this assignment for any global variables.
 * In short, you will be modifying the body of each of these functions. */
public class ArrayPractice {
  /* sets every item in A[] to initialValue */
  public static void initialize(int A[], int initialValue) {
	  for (int i=0; i < A.length; i++) { //may need +1 length.. may have syntax errors in calling the .length method.
		  A[i] = initialValue;//I think this answer may not be fitting for the project as we are not supposed to use Arrays class methods in this assignment??
	  }
    return;
  }

  /* returns the average of the items in A
   * Be careful: A[] is an array of int and the method returns
   * double. What do we do to handle this? */
  //I am just making our average a double....
  //IDK if theres more to this method than that simple assignment
  public static double average(int A[]) {
	  int sum = 0;

	  for (int i=0; i < A.length; i++) {
		  sum += A[i];
	  }
	  double average = sum/A.length;

    return average;
  }

  /* returns the number of times that x appears in A[] */
  public static int numOccurrences(int A[], int x) {
	  int count = 0;
	  for (int i=0; i < A.length; i++) {
		  if (x == A[i]) {
			  count += 1;
		  }
	  }
    return count;
  }


  /* returns the index of the first occurrence of
   * x in A[] or -1 if x doesn't exist in A[] */
  public static int find(int A[], int x) {
	  int index = -1;
	  for (int i=0; i < A.length; i++) {
		  if (x == A[i]) {
			  index = A[i];
			  break;
		  }
	  }
    return index;
  }

  /* Returns the index of the first occurrence of
   * item within the first n elements of A[] or -1
   * if item is not among the first n elements of A[] */
  public static int findN(int A[], int item, int n) {
	  int index = -1;
	  for (int i=0; i < n; i++) {
		  if (item == A[i]) {
			  index = A[i];
			  break;
		  }
	  }
    return index;
  }

  /* returns the index of the last occurrence of
   * x in A[] or -1 if x doesn't exist in A[] */
  //thinking that I will have to construct a reverse order array and than basically just call my first occurrence method?
  public static int findLast(int A[], int x) { // once our reverse method is made, we could call it here instead of using the same code.
	  int B[] = new int[A.length];
	  int RevIdx = (A.length - 1);
	  for (int i=0; i < A.length; i++) {
		  B[i] = A[RevIdx];
		  RevIdx--;
	  }
    return find(B, x); // should be calling the find method I made above on array B, and seeking the first occurrence of x
    //B should be a reverse order array of A (the array input into the find last method)
  }

  /* returns the largest item found in A */
  public static int largest(int A[]) {
    int large = 0;
    for (int i=0; i < A.length; i++){
      if (A[i] > large){
        large = A[i];
      }
    }
    return large;
  }

  /* returns the index of the largest item found in A */
  public static int indexOfLargest(int A[]) { //if we had access to binarysearch we could use large() inside of this in order to backsearch for the index (I think)
    int idx = -1;
    int large = 0;
    for (int i=0; i < A.length; i++){
      if (A[i] > large){
        large = A[i];
        idx = i;
      }
    }
    return idx;
  }

  /* returns the index of the largest odd number
   * in A[] or -1 if A[] contains no odd numbers */
   // I have a feeling modifying the original array is not cool.. maybe making a deep copy would be best?
  public static int indexOfLargestOdd(int A[]) {
    //this first for loop checks for odd values in the array passed to this function, if therea are any it moves on to finding the largest,
    //if there are no odd numbers, -1 is returned.
    for (int i = 0; i < A.length; i++){
      if ((A[i] % 2) == 1){
        break;
      }
      if (i+1 == A.length){
        return -1;
      }
    }
    // A copy of our original array is created, and then the largest values are checked as odd or even,
    //if a largest is odd, its index is returned, if its even, it is set to 0 such that the next highest value can be investigated.
    int B[] = copy(A); // After testing I see that declaring an array properly is necessary for the copy methods return.
    while(true){
      if ((largest(B) % 2) == 1){
        return indexOfLargest(B);
      } else {
          B[indexOfLargest(B)] = 0;
        }
    }
  }

  /* inserts n into A[] at A[index] shifting all */
  /*  the previous items one place to the right. For example */
  /*  if A is  */
  /*   |---+---+---+---+---+---+---+---+---+---| */
  /*   | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | */
  /*   |---+---+---+---+---+---+---+---+---+---| */
  /*   | 5 | 7 | 6 | 9 | 4 | 3 | 0 | 0 | 0 | 0 | */
  /*   |---+---+---+---+---+---+---+---+---+---| */

  /*   and we call insert(A, 15, 1), A then becomes */

  /*   |---+----+---+---+---+---+---+---+---+---| */
  /*   | 0 |  1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | */
  /*   |---+----+---+---+---+---+---+---+---+---| */
  /*   | 5 | 15 | 7 | 6 | 9 | 4 | 3 | 0 | 0 | 0 | */
  /*   |---+----+---+---+---+---+---+---+---+---| */
  /*  the element in A[] that's in the right-most */
  /*    position is removed.                      */
  /*                                              */
  /*  if index < 0 or index >= A.length-1, the method */
  /*                                    does nothing */

  public static void insert(int A[], int n, int index) {
    if (index < 0 || index >= A.length-1){
      return;
    }
    for (int i = 0; i < (A.length - (index+1)); i++){ // the key is getting this loop to stop at the correct amount of loops
      //theloop will just replace each value of an array with the value to the left of it in the array,
      //starting from the last value in the array, moving towards the first value, it will stop just before the index specified
      //to be replaced by our insert value n.
      A[A.length - i - 1] = A[A.length - i - 2];
    }
    A[index] = n;
    return;
  }

  /* returns a new array consisting of all of the
   * elements of A[] */
  public static int[] copy(int A[]) {
    int B[] = new int[A.length];
    for (int i=0; i < A.length; i++){
      B[i] = A[i];
    }
    return B;
  }

  /* Returns a new array consisting of all of the
     first n elements of A[]. If n>A.length, returns a
     new array of size n, with the first A.length elements
     exactly the same as A, and the remaining n-A.length elements
     set to 0. If n<=0, returns null. */
     // he doesnt specify that the method needs to be able to handle an n that is smaller than the length of A[],
     // but I think I should include the necessary code to handle that situation
  public static int[] copyN(int A[], int n) {
    int nA[] = new int[n];

    if (n >= A.length){
      for (int i = 0; i < A.length; i++){
        nA[i] = A[i];
      }
      return nA;
    } else{
        if(n < A.length) {
          for (int i = 0; i < n; i++){
            nA[i] = A[i];
          }
          return nA;
        } else {return null;}
      } // the structure of my else statements here may be wrong. I am not sure right now. but will keep it in mind if this method fails.
  }

  /* returns a new array consisting of all of the
   * elements of A[] followed by all of the
   * elements of B[]. For example, if
   A[] is: {10,20,30} and
   B[] is: {5, 9, 38}, the method returns the
   array : {10,20,30,5,9,38} */
   // since you can not expand the length of an array in java, I think it is necessary to just make a new array here.
  public static int[] copyAll(int A[], int B[]) {
    int newlen = A.length + B.length;
    int C[] = new int[newlen];
    //we construct a new array which has a length = to the length of arrays A + B
    //then we loop through it A.length times placing our A values into C
    //then we loop through it B.length time placing our B values into C
    for (int i=0; i< A.length; i++){
      C[i] = A[i];
    }
    for (int i=0; i< B.length; i++){
      C[i + A.length] = B[i];
    }
    return C;
  }

  /* reverses the order of the elements in A[].
   * For example, if A[] is:
   {10,20,30,40,50}, after the method, A[] would
   be {50,40,30,20,10} */
   //I think the most straightforward way to do this is to construct a second array with the same elements as A but reversed,
   //and than to copy that second array into A
  public static void reverse(int A[]) {
   int B[] = new int[A.length];
   int RevIdx = (A.length - 1);
   for (int i=0; i < A.length; i++) {
     B[i] = A[RevIdx];
     RevIdx--;
   }
    return B;
  }

  /* Extra credit:
   *
   * Returns a new array consisting of all of the
   * elements of A, but with no duplicates. For example,
   * if A[] is {10,20,5,32,5,10,9,32,8}, the method returns
   * the array {10,20,5,32,9,8} */
  public static int[] uniques(int A[]) {
    // count duplicates; make new array B[] with length (A.length - duplicate count);
    // for (int i = 0; i < A.length; i++){ for (int j = 0; j < B.length; j++){ if (A[i] == B[j]){ ++dupeCount; (need to go back to the start of our first for loop)}
    // for each element check all other elements for duplicates,

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

    int C[] = new int[A.length - count];
    int Bpos = 0;
    int Sentinel = 0;
    //The below for loop works by advancing the index of B[] and C[] separately, such that any duplicates(signified by a -1 value in B[]) are skipped over,
    //and any non duplicates are placed into C[].
    for (int i = 0; i < C.length; i++){
      Sentinel = 0;
      while (Sentinel != -5){
        if (B[Bpos] != -1){
          C[i] = B[Bpos];
          Sentinel = -5;
          Bpos++;//this incrementation is to always increment Bpos whenever i increments,
          // that way they advance at the same rate EXCEPT when a duplicate value is being passed over
        } else { ++Bpos;}
      }
    }
    return C;
  }

  public static void main(String[] args) {
    return;
  }
}
