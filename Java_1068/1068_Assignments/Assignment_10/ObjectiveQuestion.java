public class ObjectiveQuestion extends Question{
  protected String correctAnswer;

  public ObjectiveQuestion(int points, int difficulty, int answerSpace, String questionText, String correctAnswer){
    super(points, difficulty, answerSpace, questionText);
    this.correctAnswer = correctAnswer;
  }

  public String toString(){
    return super.toString() + "\nCorrect Answer: "+correctAnswer;
  }

  public String presentQuestion(){
    return super.presentQuestion();
  }

  public String presentQuestionToGrader(){
    return "Correct Answer: "+correctAnswer+"\n"+super.presentQuestion();
  }
}
