import java.util.ArrayList;
//A driver class to test out the various question class types and their methods.
public class QuestionsDriver{
  public static void main(String args[]){
    ObjectiveQuestion q1 = new ObjectiveQuestion(55, 5, 4, "What is the captol of Nevada?", "Carson City");

    FillInTheBlankQuestion q2 = new FillInTheBlankQuestion(5, 5, 3, "______ forks go on the dinner table when seating two guests", "Four");


    String[] posAnswers_1 = {"All", "Dang, I don't know if I want to kill any ducks", "Eleven", "OVER 9000!!!!", "At least 3", "7"};
    MultipleChoiceQuestion q3 = new MultipleChoiceQuestion(3, 3, 1, "How many ducks does it take to feed your souls bloodlust?", "All", posAnswers_1);

    //The below line is to test the error that comes from improper length underscore blank space
      //FillInTheBlankQuestion q4 = new FillInTheBlankQuestion(5, 5, 3, "___ forks go on the dinner table when seating two guests", "Four");

    //The below line is to test the illegal argument exception throw for MAX_DIFFICULTY
      //ObjectiveQuestion q5 = new ObjectiveQuestion(5, 11, 4, "What is the captol of Nevada?", "Carson City");

    System.out.println("q1 methods: \ntoString"+q1.toString()+"\nPresentQuestion: "+q1.presentQuestion()+"\nPresentQuestionToGrader: "+q1.presentQuestionToGrader() +
    "Getters: \ngetPoints: "+q1.getPoints()+"\ngetDifficulty: "+q1.getDifficulty()+"\ngetAnswerSpace: "+q1.getAnswerSpace()+"\ngetQuestionText: "+
    q1.getQuestionText()+"\ngetMinDifficulty: "+q1.getMinDifficulty()+"\ngetMaxDifficulty: "+q1.getMaxDifficulty());

    System.out.println("q2 methods: \ntoString"+q2.toString()+"\nPresentQuestion: "+q2.presentQuestion()+"\nPresentQuestionToGrader: "+q2.presentQuestionToGrader());

    System.out.println("q3 methods: \ntoString"+q3.toString()+"\nPresentQuestion: "+q3.presentQuestion()+"\nPresentQuestionToGrader: "+q3.presentQuestionToGrader());


    //TESTING ARRAYLISTS BELOW:

    ArrayList<ObjectiveQuestion> questions = new ArrayList<ObjectiveQuestion>();
    questions.add(q1);
    questions.add(q2);
    questions.add(q3);
    System.out.println(questions.size());
    System.out.println(questions.get(0).getPoints()); //Everything behind this works so far

    /*ArrayList<ObjectiveQuestion> questions2 = {q1, q2, q3}; //Want to check if there are the same shorcut methods for arrayList as array.
    //^^ I am getting an illegal initializer error for this one. So no array shortcut.
    System.out.println(questions2.size());
    System.out.println(questions2.get(0).getPoints());*/
  }
}
