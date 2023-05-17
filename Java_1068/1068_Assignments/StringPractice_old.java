//import junit.framework.TestCase;

public class StringPractice {

  public static void main(String[] args) {
    //test if the methods you're designing work here.
    testisPunct();
    testNUMPunct();

  }
  public static void testisPunct(){
      System.out.println(isPunct('.'));
    System.out.println(isPunct(';'));
  System.out.println(isPunct('?'));
  System.out.println(isPunct('\''));
  System.out.println(isPunct(','));
  System.out.println(isPunct(':'));
  System.out.println(isPunct('!'));
  System.out.println(isPunct(' '));
  System.out.println(isPunct('_'));
  System.out.println(isPunct('a'));
  System.out.println(isPunct('\t'));
  System.out.println(isPunct('\n'));
  }
  public static void testNUMPunct(){
      System.out.println(numPunct("cheesy poofs"));
      System.out.println(numPunct(""));
      System.out.println(numPunct("!"));
      System.out.println(numPunct("! "));
      System.out.println(numPunct("! "));
      System.out.println(numPunct(" !"));
      System.out.println(numPunct(".!"));
      System.out.println(numPunct(". !"));
        System.out.println(numPunct("There's always money in the banana stand."));
      System.out.println(numPunct("", 1));
  }
  public static void testNUMPunct2(){
      System.out.println(numPunct("cheesy poofs", 4));
      System.out.println(numPunct("", 1));
      System.out.println(numPunct("!", 0));
      System.out.println(numPunct("! ", 1));
      System.out.println(numPunct("! "));
      System.out.println(numPunct(" !"));
      System.out.println(numPunct(".!"));
      System.out.println(numPunct(". !"));
        System.out.println(numPunct("There's always money in the banana stand."));

  }
  /* returns true if c is a punctuation mark or false otherwise
   *
   * Punctuation mark is defined as:
   * apostrophe '
   * comma ,
   * period .
   * semicolon ;
   * colon :
   * exclamation point !
   * question mark ?
   *
   * (You don't have to worry about any others)
   */
  public static boolean isPunct(char c) {
    return (c == '\'' || c==',' || c=='.' || c==';' || c==':' || c=='!' || c=='?');
  // since I am using boolean comparisons I am automatically returning true or false
  //thus no need for an if/else statement.
  }

  /*
   * returns the number of punctuation marks
   * found in s.
   *
   * call your isPunct( ) method. Do not copy and paste
   * the same logic into this function */
  public static int numPunct(String s) {
    int count = 0;

    for (int i=0; i < s.length(); i++){
      if (isPunct(s.charAt(i))){
        count += 1;
      } else {continue;}
    }
    return count;
  }

  /*
   * returns the number of punctuation marks
   * found in s starting at the given index.
   *
   * call your isPunct( ) method. Do not copy and paste
   * the same logic into this function */
  public static int numPunct(String s, int startIndex) {
    s = s.substring(startIndex);
    return numPunct(s);
  }

  /*
   * returns the index of the first occurrence
   * of a punctuation mark in s starting
   * from index startPosition or returns -1 if there are
   * none at index startPosition or later.
   *
   * When implementing this function, call your isPunct( ) method.
   * Do not simply copy and paste the body of isPunct( ) into this method.
   */
   //it is not clarified if we are to have it report the index with respect to
   //the original strings index or the index of the string where the start position
   //is not 0.. guessing the original string would be desireable, but the instructions are tough to interpret.

  public static int indexOfFirstPunct(String s, int startPosition) {
    //if ifp (indexFirstPunctuation) isnt updated by any isPunct rounds evaluating as true,
    //ifp starts at -1 and thus will return as -1.. which is sort of the false value in this method
    int ifp = -1;
    s = s.substring(startPosition);

    for (int i=0; i < s.length(); i++){
      if (isPunct(s.charAt(i))){
        ifp = i + startPosition;
        break;
      }//shouldnt need an else to continue naturally when my if statement is false
    }
    return ifp;
  }

  /*
   * returns the index of the first punctuation mark in s or
   * -1 if s contains no punctuation marks
   *
   * use your solution to indexOfFirstPunct(String s, int startPosition)
   * in this function. Do not repeat the same logic.
   *
   * Notice that this method has the same name as the
   * previous one, but that it takes a different number of arguments. This is
   * perfectly legal in Java. It's called "method overloading"
   *
   */
   //the above function... 'index OfFirstPunct' with 2 args can just have its startPosition
   //passed at 0 to do exactly what the below method with one arg would... so no need for
   //for the redundancy
  public static int indexOfFirstPunct(String s) {
    return indexOfFirstPunct(s,0);
  }

  /*
   * returns the index of the last occurrence of a punctuation
   * mark in s or -1 if s contains no punctuation
   *
   * When implementing this function, call your isPunct( ) method.
   * Do not simply copy and paste the body of isPunct( ) into this method.
   */
  public static int indexOfLastPunct(String s) {
    int ilp = -1;
//for loop runs through the characters of the string, updating the ilp variable to the index of each
//punctuation mark, thus the last one will be the final update, and will be returned.
    for (int i=0; i < s.length(); i++){
      if (isPunct(s.charAt(i))){
        ilp = i;
      }
    }
    return ilp;
  }

  /*
   * returns a new String which is the same as s but with
   * each instance of oldChar replaced with newChar
   */
   // in substitute, just build a new string from the old string by looping through import junit.framework.TestCase;
   // dont try to modify the original string.
  public static String substitute(String s, char oldChar, char newChar) {
    String newString = "";

    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == oldChar) {
        newString = newString + newChar;
      } else {
        newString += s.charAt(i);
      }
    }
    return newString;
  }

  /*
   * returns a new String which is the same as s, but
   * with each instance of a punctuation mark replaced
   * with a single space character
   *
   * Use at least one of your other functions in your
   * solution to this.
   *
   */
  public static String substitutePunct(String s) {
    //there may be a way to do this by calling our substitute method..
    //but we would need the second parameter to be all valid punction marks somehow
    String newString = "";

    for (int i = 0; i < s.length(); i++) {
      if (isPunct(s.charAt(i))) {
        newString = newString + " ";
      } else {
        newString += s.charAt(i);
      }
    }
    return newString;
  }

  /*
   * returns a new String which is the same as s,
   * but with all of the punctuation
   * marks removed.
   *
   * Use at least one of your other functions
   * in your solution to this one.
   *
   */
  public static String withoutPunct(String s) {
    //same as substitute punct, theres gotta be a way to do this with the
    //substitute method, but the oldChar parameter has to = any punction marks
    // I could rewrite the method to do what I want.. but thats not less redundant
    String newString = "";

    for (int i = 0; i < s.length(); i++) {
      if (isPunct(s.charAt(i))) {
        continue;
      } else {
        newString += s.charAt(i);
    //this code can be made more efficient with !()... avoiding the else.
    //once testing is working and youre revising look into doing so
      }
    }
    return newString;
  }

  /* returns true if c is found in s or false otherwise */
  public static boolean foundIn(String s, char c) {
    for (int i=0; i < s.length(); i++){
      if (s.charAt(i) == c){
        return true;
      }
    }
    return false;
  }

  /*
   * Returns true if s contains none of the characters
   * found in chars or false otherwise.
   */
  public static boolean containsNone(String s, String chars) {
    //I am sure there is a prettier more readable way to do this,
    //I think I would need a command or function that automates checking 1 char against a list of chars though
    for (int i=0; i < s.length(); i++){
      for (int j=0; j < chars.length(); j++){
        if (s.charAt(i) == chars.charAt(j)){
          return false;
        }
      }
    }
    return true;
    }
  /*
   * Returns true of s is comprised of only punctuation or
   * false otherwise
   *
   * Use at least one of your other
   * functions in this one.
   */
  public static boolean onlyPunct(String s) {
    //This should check to see if isPunct fails on any character in the string s
    // and in the case it does eval false itll be !(false) == true...
    //so itll return false as some charater was not punctuation
    for (int i=0; i < s.length(); i++){
      if (!(isPunct(s.charAt(i)))) {
        return false;
      } else{ continue; }
    }
    return true;
  }

  /*
   * Returns true of s contains no punctuation or
   * false otherwise
   *
   * Use at least one of your other
   * functions in this one.
   */
  public static boolean noPunct(String s) {
    //reverse of the above code. returns false when a punct is encountered,
    //and otherwise returns true when each char in the string has been itterated through
    for (int i=0; i < s.length(); i++){
      if ((isPunct(s.charAt(i)))) {
        return false;
      } else{ continue; }
    }
    return true;
  }

  /*
   * returns true if s has two punctuation marks
   * right next to each other or false otherwise
   *
   * use at least one of your other methods
   * in your solution to this method
   */
   // loop through the string, at each index run isPunct, if isPunct Returns
   // true 2 times the loop can end and the method should return true,
   // if isPunct only returns one true than the forloop should continue.
  public static boolean consecutivePuncts(String s) {

    for (int i=0; i < s.length(); i++){
      if ((isPunct(s.charAt(i)))) {
        if ((isPunct(s.charAt(i+1)))){ return true;
        } else { continue; } // probably can remove both continues.. but need to check code by testing before alteration
      } else{ continue; } //do I need this continue? if not here then there are other methods I wont need it in either
    }
    return false;
  }
}
