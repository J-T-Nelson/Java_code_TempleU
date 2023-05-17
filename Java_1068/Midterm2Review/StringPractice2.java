import java.util.Scanner;

public class StringPractice2{
  public static void main (String[] args){
    String s1 = "double letter test 1";
    String s2 = "double let test 2";
    if (doubleLetter(s1)){
      System.out.println("s1 is True!");
    }else {System.out.println("s1 is False!");}
    if (doubleLetter(s2)){
      System.out.println("s2 is True!");
    }else {System.out.println("s2 is False!");}

    String s3 = "fawelkIvnawekVjasfdoigejM", s4 = "i dont have a single char they they want";
    System.out.println("s3 Roman numeral test: " + lastRN(s3) + " ... s4 Roman Numeral test: " + lastRN(s4));

    System.out.println("I am going to remove all of the vowels from: "+ s1 +" now. --> " + noVowelConverter(s1));

    System.out.println(titleCapilalization(s3));
    String s5 = "This is going to be quite the title!";
    System.out.println(titleCapilalization(s5));
    System.out.println("\\");
  }
  public static boolean doubleLetter(String s){
    for (int i =0; i<s.length()-1; i++){
      if (s.charAt(i) == s.charAt(i+1)){
        return true;}
      }
      return false;
  }

  public static int lastRN(String s){// a better way to do this would be to just reverse the string... and then return the first index of a roman numeral?
    String romanNum[] = {"I", "V", "X", "L", "C", "D", "M"};
    for (int i=0; i<romanNum.length; i++){
      if (s.indexOf(romanNum[i]) != -1){
        break;
      }
      if (i == 6){return -1;}
    }
    int highIndex = 0;
    for (int i=0; i<s.length(); i++){
      if (s.charAt(i) == 'I' || s.charAt(i) == 'V' || s.charAt(i) == 'X' || s.charAt(i) == 'L' ||
      s.charAt(i) == 'C' || s.charAt(i) == 'V' || s.charAt(i) == 'M'){
        highIndex = i;
      }
    }
    return highIndex;//an alternate solution would be to use a char array of roman numerals, and then to compare each charAt(i)
    //to each char in that array with a nested for loop, and then instead to start my highIndex at -1.... then return high index.
  }

  public static String noVowelConverter(String s){
    String ns = "";
    s = s.toLowerCase();
    for (int i=0; i<s.length(); i++){
      if (s.charAt(i) != 'a' && s.charAt(i) != 'e' && s.charAt(i) != 'i' && s.charAt(i) != 'o' && s.charAt(i) != 'u'){
        ns = ns + s.charAt(i); //little shakey on whether or not this will properly cast the
      }//chars into strings which can be added to my return string
    }
    return ns;
  }

  public static String titleCapilalization(String s){
    Scanner sRead = new Scanner(s); //I am not sure I can use a scanner to read a string
    String ns = "";
    while (sRead.hasNext()){
      String nw = "";
      String word = sRead.next();
      Character c = word.charAt(0);
      c = Character.toUpperCase(c);//THIS LINE IS IMPORTANT.... HOW TO USE THE CHARACTER CLASS A LITTLE BIT.
      nw = nw + c;
      for (int i =1; i<word.length(); i++){
        nw = nw + word.charAt(i);
      }
      ns = ns + nw + " ";
    }
    return ns;

  }


}
