import java.io.*;
import java.util.Scanner;
/* This is a dirty draft of the webify assignment, gonna copy and paste this all straight into webify,
 and clean it for a final product.*/
public class File_read_2 {
  public static void main(String[] args) throws FileNotFoundException {
    String file = "Java_1068\\Shanty.txt";

    Scanner fileR = new Scanner(new File(file));

    String Fhtml = (file.substring(0, (file.length() -3)) + "html");
    System.out.println(Fhtml); //prints Java_1068\Shanty.html

    File Newshanty = new File(Fhtml);

    System.out.println(Newshanty.getName());//prints Shanty.html

    PrintStream htmlP = new PrintStream(Fhtml);
    //we cant pass Newshanty as the printstreams location to print to, as it is a file object which is not for writing into
    //an external file, rather it is only to read from the file and get info about the file. So we need a path to an
    //external file in order to write to an external file (which is referred to within a program by a String).


    htmlP.println("<html> \n<body>");
    while (fileR.hasNextLine()) {

      String line = fileR.nextLine();
      //System.out.println("Original: " + line);

      if (line.startsWith("-")){ // this needs to be modified to start and end with <ul> and </ul> as these open and close lists in html
        htmlP.println("<ul>");
        while (line.startsWith("-")){
          String h2Line = line.replaceAll("-", "<li>");
          htmlP.println(h2Line + "</li>");
          System.out.println("Modified: " + h2Line + "</li>");
          line = fileR.nextLine();// this should grab the next line of code using the scanner, progressing the position of our cursor.
          //the line will then feed back into the while and if it is still a list element it will loop again,
          //if not it will execute the rest of the if statement
        }
        htmlP.println("</ul>"); // I think it is necessary to not restart the loop here, and to instead pass the most recent line
        //through the rest of the code in order to ensure it gets converted appropriately, as for the while loop to terminate,
        //a line that is not a part of the list has to be read and converted into the line String object
      }
      if (line.startsWith("_") && line.endsWith("_")){
        String h1Line = line.replaceAll("_", "<h>");
        htmlP.println(h1Line);
        System.out.println("Modified: " + h1Line);
        continue; // more conventionaly to use else instead of continues
      }

      //System.out.println(line.contains("[") + " " + line.indexOf("[[") + " we are on loop: " + loops);
      if (line.indexOf("[[") != (-1)){ //USE SUBSTRINGS TO ASSIGN THE URL AND HYPERLINK TO VARIABLES. REG EXPRESSIONS ARE JUST BEYOND WHAT YOU ARE ABLE TO GET THROUGH RIGHT NOW

        String x = line.substring(2, line.indexOf("]["));
        String y = line.substring((line.indexOf("][")+2), (line.length()-2));
        htmlP.println("<a href=\"" + x + "\">" + y + "</a>");
        continue;
      }
      if (line.length() >= 1){// this should come first?
        htmlP.println(line + "<br />");
        System.out.println("Modified: " + line + "<br />");
        continue;
      }

      htmlP.println("<p>");// this should only execute when all if statements fail and thus we have an empty line.
      System.out.println("Modified: <p>");
    }
  }
}
// E:\Atom_Programming_Files\Java_1068\Shanty.html
//E:\Atom_Programming_Files\Java_1068\testweb.txt
