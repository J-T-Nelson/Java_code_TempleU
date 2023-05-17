public class FlashCard {
  public String q;
  public String a;


  public FlashCard(String initialQ, String initialA){
    q = initialQ;
    a = initialA;

  }
  public String toString() {
    return "Question: " + q + "Answer: " + a;
  }
  public static void main(String[] args){
    FlashCard n1 = new FlashCard("How many dogs are in my hat?", "None you fucking idiot.");
    System.out.println(n1.toString());//It is odd to note that Arrays.toString() needs
    //both arrays there and the object name within the parens... which is unusual notation
    // for a to string method it appears. I guess I wonder what other syntax exceptions
    //exist..

  }
}
