public class java_variables_Arr {
 public static void main(String []args) {

      int[] Intarr = {5,10,15,20,25,30,35};
      //Declaring int type variable inside the for loop
      for (int ArrItem : Intarr) { //Ok, something interesting is happening here with this for loop... I need to know how this shit works. It comiles and does what you would expect. But man oh man is it a shortcut for getting a for loop to do something.
        //Got my answer... this type of for loop is functioning because the Array object has an iterator object? attached to it and thus can use the iterator to do things like what is seen in this code... need to read up on itterators.

          System.out.println("The numeric array value: " + ArrItem);

      }
      for (int i; i < 10; i++){ System.out.println(i);}//testing if I can have i default to 0.. nope must be initialized for the compiler to not complain
    //for (int i : 10){System.out.println(i);}
  }
}
