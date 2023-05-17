import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintStream;
import java.io.File;
import java.io.FileNotFoundException;

public class Test{
  //for now I am making the arraylist aspect of this public, as it saves a lot of work, since all ArrayList methods can simply be used on the ArrayList Field of any Test object.
  //I suppose the main problem with this is that you are basically reserving "questions" as a keyword whenever using a Test object, but for this class that is a non issue.
  public ArrayList<ObjectiveQuestion> questions;
  private int totalPoints;

  public Test(ArrayList<ObjectiveQuestion> questions){
    this.questions = questions;
    totalPoints = countTotalPoints(); //I am wondering what issues I will see when trying to have my constructor use questions in the constructor itself.. I guess there shouldnt be any issue since its a necessary argument to the constructor itself.
  }

  public int countTotalPoints(){ 
    int total = 0;
    for (int i=0; i<questions.size(); i++){
      total += questions.get(i).getPoints();
    }
    return total;
  }

  public String toString(){
    return "Number of Questions on this Test: " +questions.size()+" Total Points: "+totalPoints;
  }

  public String presentTest(){
    String fullTest = "";
    for (int i=0; i<questions.size(); i++){
      fullTest += questions.get(i).presentQuestion();
    }
    return fullTest;
  }

  public String presentTestToGrader(){
    String answerKey = "";
    for (int i=0; i<questions.size(); i++){
      answerKey += questions.get(i).presentQuestionToGrader();
    }
    return answerKey;
  }

  public String getFileName(){
    Scanner in = new Scanner(System.in);
    String fileName = in.next();
    return fileName;
  }

  public void generateTest() throws FileNotFoundException{
    System.out.println("What file would you like to print the test to?");
    String targetFile = getFileName();
    File test = new File(targetFile);
    PrintStream testOut = new PrintStream(test);

    testOut.println(presentTest());
  }

  public void generateAnswerKey() throws FileNotFoundException{
    System.out.println("What file would you like to print the answerkey to?");
    String targetFile = getFileName();
    File test = new File(targetFile);
    PrintStream testOut = new PrintStream(test);

    testOut.println(presentTestToGrader());
  }

}
