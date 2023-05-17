public class MultipleChoiceQuestion extends ObjectiveQuestion{
  private String[] possibleAnswers;

  public MultipleChoiceQuestion(int points, int difficulty, int answerSpace, String questionText, String correctAnswer, String[] possibleAnswers){
    super(points, difficulty, answerSpace, questionText, correctAnswer);
    this.answerSpace = 1;
    this.possibleAnswers = possibleAnswers;
  }

  public String toString(){
    return super.toString() + "\nPossible Answers: "+printPosAnswers();
  }

  public String presentQuestion(){
    String s = questionText + "\n";
    for (int i=0; i<possibleAnswers.length; i++){
      s += (i+1) +". "+possibleAnswers[i]+"\n";
    }
    s += "\n"; // <-- the single answerSpace line
    return s;
  }

  public String presentQuestionToGrader(){
    //Clones possibleAnswers, and highlights the correct answer with ***,
    //then returns a formatted String of the questionText followed by the possibleAnswers
    //with the correctAnswer highlighted.
    String[] pAnsClone = possibleAnswers.clone();
    for (int i=0; i<pAnsClone.length; i++){
      if (pAnsClone[i].equals(correctAnswer)){
        pAnsClone[i] = "*** "+correctAnswer+" ***";
      }
    }//currently this is case sensitive.

    String s = questionText+"\n";
    for (int i=0; i<pAnsClone.length; i++){
      s += (i+1) +". "+pAnsClone[i]+"\n";
    }
    s += "\n"; // <-- single answerSpace line
    return s;
  }
  public String printPosAnswers(){
    String s = "";
    for (int i=0; i<possibleAnswers.length; i++){
      s += (i+1)+". " +possibleAnswers[i]+", ";
    }
    return s;
  }
}
