public class Online_ex1 {

  public static void main(String[] args) {
      for (int n = 0; n < 10; n++) {
          System.out.println(repeat(n) + " Hello");
      }
      for (int n = 0; n < 10; n++) {
          System.out.println(repeat(n, ":-) ") + " Hello");
      }
  }

    public static String repeat(int count, String with) {
        return new String(new char[count]).replace("\0", with);
    }

    public static String repeat(int count) {
        return repeat(count, " ");
    }
/* interesting thing in this program is that we have two different methods
both with the exact same name that are only differentiated by the number
of arguments they accept. Thus you can create a deceptively complex single function
which actually is multiple functions bundled into one.  */

}
