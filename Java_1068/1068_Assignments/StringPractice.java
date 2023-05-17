public class StringPractice {

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
      }
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
    if (s.length() == 0) {
    	return 0;
    }
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

  public static int indexOfFirstPunct(String s, int startPosition) {
    if (s.length() == 0) {
    	return -1;
    }

	  int ifp = -1;
    s = s.substring(startPosition);

    for (int i=0; i < s.length(); i++){
      if (isPunct(s.charAt(i))){
        ifp = i + startPosition;
        break;
      }
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
    String newString = "";

    for (int i = 0; i < s.length(); i++) {
      if (!(isPunct(s.charAt(i)))) {
    	  newString += s.charAt(i);
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
    return (numPunct(s) == s.length());
  }

  /*
   * Returns true of s contains no punctuation or
   * false otherwise
   *
   * Use at least one of your other
   * functions in this one.
   */
  public static boolean noPunct(String s) {
    return (numPunct(s) == 0);
  }

  /*
   * returns true if s has two punctuation marks
   * right next to each other or false otherwise
   *
   * use at least one of your other methods
   * in your solution to this method
   */

  public static boolean consecutivePuncts(String s) {

    for (int i=0; i < s.length(); i++) {
      if (isPunct(s.charAt(i))) {
        if (isPunct(s.charAt(i+1))) {
          return true;
        }
      }
    }
    return false;
  }
}
