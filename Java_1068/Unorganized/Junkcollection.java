//junk to set aside while I work out something complicated in another script
for (int y = 1; y <= 2; y++) {

  for (int b = 1; b <= a; b++) {
    System.out.print(" ");
  }
  //when z = 8 print . x2 , when z = 7 print ... x2 ... so as z decreases, print (9-z)*2-1
  //at 8 =1 at 7 =3 at 6 =5 at 5 =7 at 4 =9 at 3 =11... ok

//original pyramid drawing code I made up.
  public static void stadiumTM() {
    for (int z = 9; z >= 1; z--) {
      System.out.print("|");
      for (int a = 1; a<= (z*2-2); a++) { System.out.print(" ");}
      System.out.print("_");
      for (int x = 1; x < (10-z); x++) {
        for (int v = 1; v == x; v--) { System.out.print("/");}
        for( int wmod = 1; wmod == x; wmod--){
          for (int w = 1; w <= ((9-z)*2-1); w++) {
            System.out.print("..");
            }
          }
        }
      }
      for (int j = 1; j <= (9-z); j += 10) { System.out.print("\\");}
      System.out.print("_");
      for (int a = 1; a<= (z*2-2); a++) { System.out.print(" ");}
      System.out.println("|");
    }

  }

    public static void stadiumTopreference() {
      System.out.print(" ");

      for (int i = 1; i <= (SIZE*9-2); i++) {
      System.out.print("_");
      }
      System.out.println(" ");
    }


    for (int i=1; i <=w; i++) {
      print("*");
    }
    println(""):
