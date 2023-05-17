import java.util.Scanner;
import java.util.StringTokenizer;

public class FillInTheBlankQuestion extends ObjectiveQuestion{

  public FillInTheBlankQuestion(int points, int difficulty, int answerSpace, String questionText, String correctAnswer){
    super(points, difficulty, answerSpace, questionText, correctAnswer);
    this.answerSpace = 1; 
    Scanner qIn = new Scanner(questionText);
    int count = 0;
    StringTokenizer sentinel = new StringTokenizer(questionText);
    while (qIn.hasNext()){
      if (qIn.next().equals("______")){
        break;
      }
      ++count;
      if(count == sentinel.countTokens()){
        throw new IllegalArgumentException("Fill in the blank questions must have \"______\" as a part of their question text. That is 6 underscores exactly!");
      }
    }
  }

  public String toString(){
    return super.toString();
  }

  public String presentQuestion(){
    return super.presentQuestion();
  }

  public String presentQuestionToGrader(){
    String s = questionText+"\n\n";
    String correctA = "___"+correctAnswer+"___";
    return s.replace("______", correctA);
  }
}
