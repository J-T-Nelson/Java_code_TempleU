import java.util.ArrayList;
import java.io.FileNotFoundException;
//A driver class to test out the various question class types and their methods.
public class QuestionsDriver{
  public static void main(String args[]) throws FileNotFoundException{
    ObjectiveQuestion q1 = new ObjectiveQuestion(55, 5, 4, "What is the capitol of Nevada?", "Carson City");

    FillInTheBlankQuestion q2 = new FillInTheBlankQuestion(5, 5, 3, "______ forks go on the dinner table when seating two guests.", "Four");


    String[] posAnswers_1 = {"All", "Dang, I don't know if I want to kill any ducks", "Eleven", "OVER 9000!!!!", "At least 3", "7"};
    MultipleChoiceQuestion q3 = new MultipleChoiceQuestion(3, 3, 1, "How many ducks does it take to feed your souls bloodlust?", "All", posAnswers_1);

    //The below line is to test the error that comes from improper length underscore blank space
      //FillInTheBlankQuestion q4 = new FillInTheBlankQuestion(5, 5, 3, "___ forks go on the dinner table when seating two guests", "Four");

    //The below line is to test the illegal argument exception throw for MAX_DIFFICULTY
      //ObjectiveQuestion q5 = new ObjectiveQuestion(5, 11, 4, "What is the captol of Nevada?", "Carson City");

    System.out.println("q1 methods: \ntoString\n"+q1.toString()+"\nPresentQuestion: "+q1.presentQuestion()+"\nPresentQuestionToGrader: "+q1.presentQuestionToGrader() +
    "Getters: \ngetPoints: "+q1.getPoints()+"\ngetDifficulty: "+q1.getDifficulty()+"\ngetAnswerSpace: "+q1.getAnswerSpace()+"\ngetQuestionText: "+
    q1.getQuestionText()+"\ngetMinDifficulty: "+q1.getMinDifficulty()+"\ngetMaxDifficulty: "+q1.getMaxDifficulty());

    System.out.println("q2 methods: \ntoString\n"+q2.toString()+"\nPresentQuestion: "+q2.presentQuestion()+"\nPresentQuestionToGrader: "+q2.presentQuestionToGrader());

    System.out.println("q3 methods: \ntoString\n"+q3.toString()+"\nPresentQuestion: "+q3.presentQuestion()+"\nPresentQuestionToGrader: "+q3.presentQuestionToGrader());


    ArrayList<ObjectiveQuestion> questions = new ArrayList<ObjectiveQuestion>();
    questions.add(q1);
    questions.add(q2);
    questions.add(q3);

    Test t1 = new Test(questions);
    System.out.println("toString: "+t1.toString());
    System.out.println("presentTest: "+t1.presentTest());
    System.out.println("presentTestToGrader: "+t1.presentTestToGrader());


    //EXTRA CREDIT TESTING:

    t1.generateTest();
    t1.generateAnswerKey();

  }
}
