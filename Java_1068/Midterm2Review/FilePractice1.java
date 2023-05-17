import java.io.*;
import java.util.*;

public class FilePractice1 {
   public static void main(String[] args) throws FileNotFoundException {
     File in_1 = new File("E:\\Atom_Programming_Files\\Java_1068\\Midterm2Review\\Testtxt.txt");
     File in_2 = new File("E:\\Atom_Programming_Files\\Java_1068\\Midterm2Review\\Testtxt2.txt");

     System.out.println("This is the char # in your file: " + fileLetterN(in_1));

     System.out.println("Word # in your file: " + fileWordN(in_1));
     System.out.println("Word # in your file: " + fileWordN(in_2));

     System.out.println("Longest word length: " + fileLongWord(in_2));

     File in_3 = new File("E:\\Atom_Programming_Files\\Java_1068\\Midterm2Review\\Grades.txt");
     System.out.println("Highest test average: " + topGradeAvrg(in_3));

     System.out.println("# of blank lines in Grades.txt: " + blankLineNum(in_3));
   }

   public static int fileLetterN(File f) throws FileNotFoundException{
     //def had some difficulties with this, but a good learning experience.
     //I can just assign scanned content to a String!
     String s = "";
     Scanner fileRead = new Scanner(f);
     //PrintStream filePS = new PrintStream(s);
     int total = 0;

     while (fileRead.hasNextLine()) {
       //filePS.println(fileRead.nextLine());
       s = fileRead.nextLine();
       total += s.length();
       //System.out.println(s);//this just shows the line being read
     }
     return total;
   }

   public static int fileWordN(File f) throws FileNotFoundException{



     Scanner fileRead = new Scanner(f);
     int total = 0;
     while (fileRead.hasNext()) {
       fileRead.next();
       total ++;
     }
     return total;
   }

   public static int fileLongWord(File f) throws FileNotFoundException{
     String s = "";
     Scanner fileRead = new Scanner(f);

     while (fileRead.hasNext()) {
       String temp = fileRead.next();
       if (s.length() < temp.length()) {
         s = temp;
       }
     }

     int total = s.length();
     //
     System.out.println(s);
     return total;
     /*Notes from this method... the capitalization convention followed for methods stays true for
     all standard library methods in java.. it seems confusing when next is capitalized in hasNext
     but not it .next ... but it makes sense when you recognize all methods are following the same convention
     Second note: this method is technically incomplete, as it does not account for punctuation when looking for the
     longest word... I would need some word fixing code to really make this work correctly, but as of now, I think its fine.  */
   }

   public static int topGradeAvrg(File f) throws FileNotFoundException{
     //prof didnt specify that we have to actually return the students name.. but taht would be a more complete program.
     Scanner fileRead = new Scanner(f);
     int total = 0;
     int NewTotal = 0;
     String line = "";

     while (fileRead.hasNextLine()) {
       line = fileRead.nextLine();
       Scanner lineRead = new Scanner(line);//if not placed here this scanner will exclusively read from the line variable declared just above it..
       //how do I redefine what a scanner is reading from?
       //System.out.println(line);
       total = 0; //reset total for the next line read
       int count = 0;
       if (line.length() == 0){continue;}//this prevents the method from throwing an error in the case a blank line is encountered.
       lineRead.next();//this will progress the cursor of our scanner past the name at the start of each line.
       while(lineRead.hasNextInt()){ //this is where my problem is occuring. My second while loop isnt executing, as hasNextInt checks
         //only the very NEXT token as an int, and thus returns FALSE when its not an int.. so it just never executes.
         total += lineRead.nextInt();
         count++;
       }
       total = total/count;
       if (NewTotal < total){
         NewTotal = total;
       }
     }
     return NewTotal;
   }

   public static int blankLineNum(File f) throws FileNotFoundException{
     Scanner fileRead = new Scanner(f);
     int count = 0;
     while (fileRead.hasNextLine()){
       String line = fileRead.nextLine();
       if (line.length() == 0){
         count++;
       }
     }
     return count;
   }
}
