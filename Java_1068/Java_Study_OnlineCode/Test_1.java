// A Simple Java program to show working of user defined
// Generic functions

class Test_1{
    // A Generic method example
    static <T> void genericDisplay (T element){
        System.out.println(element.getClass().getName() + " = " + element);
    }
    // Driver method
    public static void main(String[] args){
         // Calling generic method with Integer argument
        genericDisplay(11);

        // Calling generic method with String argument
        genericDisplay("GeeksForGeeks");

        // Calling generic method with double argument
        genericDisplay(1.0);
    }
}
//What is interesting about this code is that they have used a lot of new things to me..
//I don't quite follow the syntax for this generic method... where <T> is inbetween static and void... I wonder how important that position is, or if its closer to brakets in arrays where the brakets can be just about anwhere... I also didn't know about the .getClass() method... and its cool to know about the .getClass().getName() method chain.. as that could be a useful investigative tool in the case I am limited in my resources. 
