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
//I think that I misunderstood the assignment a little bit. I see that we have not yet been introduced to any class which can make a multi type list, and thus we are to actually use a parent class of ObjectiveQuestion with the ArrayList in order to fulfill the needs of this Test class I assume? What I don't know yet is if all subclasses of some parent class can be loaded into any object or argument where the parent class is expected... I don't remember us covering this.
//Apparently, by polymorphism, I should indeed be able to pass subclasses to parent class arguments
  public Test(ArrayList<ObjectiveQuestion> questions){
    this.questions = questions;
    totalPoints = countTotalPoints(); //I am wondering what issues I will see when trying to have my constructor use questions in the constructor itself.. I guess there shouldnt be any issue since its a necessary argument to the constructor itself.
  }

  public int countTotalPoints(){ //I don't know if I need the static keyword here... as the method only needs to be used internally, and thus can be an instance/class method correct?
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
