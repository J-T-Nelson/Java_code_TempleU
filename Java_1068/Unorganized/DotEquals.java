public class DotEquals {
  /* This was made in class to show us what kind of code is occuring behind the scenes
  in order to verify that the contents of one string are equal to the contents of another*/
  public static void main(String[] args){

  }
  public static boolean same(String s1, String s2){

    if(s1.length() == s2.lenth()){
      continue;
    }else{ return false;}

    for (int i=0; i<s1.length(); i++) {
      if (s1.charAt(i) == s2.charAt(i)){
        continue;
      }else{return false;}

      return true;
    }
  }

    public static boolean same2(String s1, String s2){

      if(s1.length() != s2.lenth()){
        return false;}

      for (int i=0; i<s1.length(); i++) {
        if (s1.charAt(i) != s2.charAt(i)){
          return false;}
        //why is it ok to have no else in these cases?
        return true;
      }
  }

    public static boolean sameIgCase(String s1, String s2){
      s1 =  s1.toUpperCase();
      s2 =  s2.toUpperCase();

      return same2(s1, s2);
      }

    public static boolean sameIgCase(String s1, String s2){
        return same2(s1.toUpperCase(), s2.toUpperCase());
    }

}
