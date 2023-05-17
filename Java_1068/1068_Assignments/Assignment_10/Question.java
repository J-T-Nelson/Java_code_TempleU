public class Question{
  protected int points;
  protected int difficulty;
  protected int answerSpace;
  protected String questionText;
  protected final int MIN_DIFFICULTY = 1;
  protected final int MAX_DIFFICULTY = 10;

  public Question(int points, int difficulty, int answerSpace, String questionText){
    if (difficulty > 10 || difficulty < 1){
      throw new IllegalArgumentException("Question difficulty must be within the range of 1 to 10");
    }
    this.points = points;
    this.difficulty = difficulty;
    this.answerSpace = answerSpace;
    this.questionText = questionText;
  }
  //toString has been resevered for inspection of Question class instances
  //and is not to be used as the question a student would see.
  public String toString(){
    return "Points: " + points + "\nDifficulty: "+difficulty+"\nAnswer Space: "
           +answerSpace+"\nQuestion Text: "+questionText;
  }
  //presentQuestion is used to display what a student will see when they
  //are presented with a given question on a test.
  public String presentQuestion(){
    String s = questionText+"\n";
    for (int i=0; i<answerSpace; i++){
      s += "\n";
    }
    return s;
  }
  public int getPoints(){
    return points;
  }
  public int getDifficulty(){
    return difficulty;
  }
  public int getAnswerSpace(){
    return answerSpace;
  }
  public String getQuestionText(){
    return questionText;
  }
  public int getMinDifficulty(){
    return MIN_DIFFICULTY;
  }
  public int getMaxDifficulty(){
    return MAX_DIFFICULTY;
  }
}
