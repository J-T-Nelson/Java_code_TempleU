public class Fraction{
  private int numerator;
  private int denominator;

  public Fraction(int n, int d){
    if (d == 0){
      throw new ArithmeticException("Cannot divide by 0");
    }
    int LCD = fracReduce(n, d);
    numerator = n/LCD;
    denominator = d/LCD;
  }

  public int getNum(){
    return numerator;
  }
  public int getDenom(){
    return denominator;
  }
  public void setNum(int n){
    numerator = n;
  }
  public void setDenom(int d){
    if (d == 0){throw new ArithmeticException();}
    denominator = d;
  }

  public Fraction add(Fraction a){
    int newNum = (numerator * a.getDenom() + a.getNum() * denominator);
    int newDenom = (denominator * a.getDenom());
    Fraction fracSum = new Fraction(newNum, newDenom);//since reducing is a part of our constructor method, we do not need to reduce again
    return fracSum;
  }

  public boolean equals(Fraction a){
    return (denominator * a.getNum() == numerator * a.getDenom());
    }

  public String toString(){
    return numerator + "/" + denominator;
  }

  public static int fracReduce(int n, int d){
    int A = Math.abs(n), B = Math.abs(d), temp = 0;
    while (A-B != 0){//When A-B=0, B is our lowest common denomenator,
      //therfore, n/B and d/B will represent our reduced fractions numerator and denominator
      A = A - B;
      if (A > B){
        continue;
      } else {
          temp = B; //temp always == bigger value
          B = A; //now B is the smaller value
          A = temp; //A is the larger value and we are ready for another loop.
        }
    }
    return B;
  }

  
}
