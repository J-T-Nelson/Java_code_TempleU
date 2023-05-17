public class TestQ {
  public static void main(String[] args) {
  //  test1();
    System.out.print(numPunct("!", 1));

  }
/*  public static void test1(){
    int x=10, y=20;

    boolean isBored=true;
    if (isBored) {
    int z = x+y;
    } else {
    z = x-y;
    }
    System.out.println(z);
  } */
  public static void test2(){

  }
  public static boolean isPunct(char c) {
    return (c == '\'' || c==',' || c=='.' || c==';' || c==':' || c=='!' || c=='?');
  }
  public static int numPunct(String s) {
   int count = 0;

   for (int i=0; i < s.length(); i++){
     if (isPunct(s.charAt(i))){
       count += 1;
     } else {continue;}
   }
   return count;
 }

  public static int numPunct(String s, int startIndex) {
  System.out.print(s);
   if (s.length() == 0) {
     return 0;
   }
   s = s.substring(startIndex);
   System.out.println(s + "2nd print is go");
   return numPunct(s);
   //the lesson learned from this little inspection is that when you make a string into
   //a new string by using .substring, and specify its last character as the index to
   //start at, it makes a new string that is empty... i.e. "" <--
 }
}
