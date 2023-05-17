import java.io.*;
import java.util.*;

public class File_read_1 {
  public static void main(String[] args) throws FileNotFoundException {

    File ff = new File("Java_1068\\notes.txt"); //this is using a relative directoy
    File ff2 = new File("E:\\Atom_Programming_Files\\Java_1068\\notes.txt"); //this is an absolute directory

    Scanner Filereader = new Scanner(ff);// since I already made the file object, I need to enter the name of the object into the scanner to get it to read from the File
    Scanner filereader2 = new Scanner(new File("Java_1068\\ReadThis.txt"));

    if (ff.exists()){

      if (ff.canRead()) {
        System.out.println("Can read!");
      }
      if (ff.length() < 10000) {
        System.out.println("File is too weak for my fine ass.");
      }
      System.out.println(ff.getName());
      System.out.println(ff.length());
    } else { System.out.println("File "+ ff+ " not found or does not exist.");}

    if (ff2.exists()){

      if (ff2.canRead()) {
        System.out.println("Can read!");
      }
      if (ff2.length() < 10000) {
        System.out.println("File is too weak for my fine ass.");
      }
      System.out.println(ff2.getName());
      System.out.println(ff2.length());
    } else { System.out.println("File "+ ff2 + " not found or does not exist.");}

    System.out.println("Working Directory = " + System.getProperty("user.dir")); //this is printing out the working directory for the program.
    //System.out.println("Working Directory = " + System.getProperty("System.out"));// dont know whats happening here
    System.out.println("Installation dir for JRE = " + System.getProperty("java.home"));
    System.out.println("JRE version # = " + System.getProperty("java.version"));

    System.out.println(Filereader.nextLine());



    for (int i=0; i < 10; i++){
      System.out.print(Filereader.next()+" ");
    }

    System.out.println(filereader2.nextLine());
    for (int i=0; i < 10; i++){
      System.out.print(filereader2.next()+" ");
    }
    while (filereader2.hasNext()){ //this is the simplest way to print the contents of a file!
      System.out.println(filereader2.nextLine());
    }
    //if you ever want to just throw a token away simply do scannername.next(); ..
    // that will consume the next token moving the cursur forward, but not do anything with import junit.framework.TestCase;

  /*  while(scannerNAME.hasNextLine()){ // this while loop is the basic form of a decomposition scanner, where you take out and individually process each line of a file
      String line = scannerName.nextLine();
      Int tokenCount = 0;
      Scanner lineScan = new Scanner(line);
      while (lineScan.hasNext()){
            String word = lineScan.next();
            count++;
      } // this second while loop will keep count of the number of tokens in each isolated line
    }*/
    prntstrm();
  }
  public static void prntstrm() throws FileNotFoundException {
    PrintStream maketxt = new PrintStream(new File("Java_1068//printstreamtest.txt"));
    for (int i = 0; i<100; i++){
      maketxt.println("fork on me mum");
    }
  }
}
