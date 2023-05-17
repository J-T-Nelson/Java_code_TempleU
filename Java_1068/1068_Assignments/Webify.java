import java.io.*;
import java.util.Scanner;

public class Webify {
  public static final Scanner IN = new Scanner(System.in);
  public static final String CD = System.getProperty("user.dir");

  public static void main(String[] args) throws FileNotFoundException {

    String file = requestTXT();
    htmlconvert(file);
  }
  //requestTXT() simply aquires the name of the file being webified from the user.
  //It will not accept anything without .txt at the end of the file before proceeding
  public static String requestTXT(){
    System.out.println("Please enter the file name which you would like to webify.");
    String file = IN.nextLine();

    while (!file.endsWith(".txt")){
      System.out.println("That is not a valid file, please enter a .txt file.");
      file = IN.nextLine();
    }

    System.out.println("You entered: " + file);
    return file;
  }

  //The htmlconvert() method converts the specified txt file into an html using a printstream object
  //I decided to create the various objects needed for the conversion actions, as I didn't see any obvious design advantages
  //to further compartmentalization of the program.
  public static void htmlconvert(String file) throws FileNotFoundException{

    Scanner fileR = new Scanner(new File(file));
    String Fhtml = (file.substring(0, (file.length() -3)) + "html");
    File htmlFile = new File(Fhtml);
    PrintStream htmlP = new PrintStream(htmlFile);//should be able to just pass the path name here

    System.out.println("Your html file name is: " + htmlFile.getName() + "\nIts path is: " + CD + "\\" + Fhtml);

    //all conversion occurs within this while loop,
    //each 'if' statement checks for charcters which correlate to tags and converts those chars to tags within a new String,
    //then printstreams the converted String to our html file.
    htmlP.println("<html> \n<body>");
    while (fileR.hasNextLine()) {
      //the ordering of 'if' statements is important in this method, and this converter would not work
      //for more general file conversion beyond the specifications of this assignment
      String line = fileR.nextLine();

      if (line.startsWith("-")){
        htmlP.println("<ul>");
        while (line.startsWith("-")){
          String h2Line = line.replaceAll("-", "<li>");
          htmlP.println(h2Line + "</li>");
          line = fileR.nextLine();
        }
        htmlP.println("</ul>");
      }

      if (line.startsWith("_") && line.endsWith("_")){
        String h1Line = line.replaceAll("_", "<h>");
        htmlP.println(h1Line);
        continue;
      }

      if (line.indexOf("[[") != (-1)){

        String x = line.substring(2, line.indexOf("]["));
        String y = line.substring((line.indexOf("][")+2), (line.length()-2));
        htmlP.println("<a href=\"" + x + "\">" + y + "</a>");
        continue;
      }
      if (line.length() >= 1){// this should come first?
        htmlP.println(line + "<br />");
        continue;
      }
      htmlP.println("<p>");
    }
    htmlP.println("</body>\n</html>");

    System.out.println("Your txt file has been converted to an html file.");
  }

}
