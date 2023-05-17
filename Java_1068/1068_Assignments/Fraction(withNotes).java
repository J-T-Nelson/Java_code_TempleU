public class Fraction{
  private int numerator;
  private int denominator;



  public Fraction(int n, int d){
    //(5 points) Constructor that creates a Fraction with numerator and denominator d. If d is 0, throw an ArithmeticException.
    //We haven't yet had a chance to cover exceptions in as much depth as we soon will, but this can be done simply in your method with the statement throw new ArithmeticException();
    if (d == 0){
      throw new ArithmeticException("Cannot divide by 0");
    }
    //since prof says that we should be storing fractions in reduced form, we essentially are going to have to take in the given n and d, and before setting numerator and denominator
    //= to them, reduce them to be the reduced fraction version, then set numerator and denominator with reducedn and reducedd
    //The hard part here is creating a robust means of reducing fractions. as its not as simple as checking for divisibilitiy by the digits 2,3,5,7... though...
    //maybe it is. as any prime number is only divisible by itself and 1. and any other number is divisible by one of those numbers, some x number of times.
    //if we just act on the n and d continuously until they are only only divisble by themselves and 1, then we know they are fully reduced, and thus are our true n and default:
    //another condidtion that needs to be fulfilled is that we need to only divide n if d is also divisible by a number. at the point only one is divisble by any of our
    //primary factors (wtf is the technical term for them? 2,3,5,7?) we are already in our fully reduced form.
    //now to check my theory against the theory professor pointed us towards.
    // while ()
    //while(n%7 == 0 ) for the method I have thought up in my head I would need a method that checks whether or not n//7 is an integer/whole number .. I think I could reasonable do {
      //this.. make the needed method that is, which would involve casting my result to a string, then finding a decimal in the double. then checking to see if the
      //length exceeds the index point + 1 as that would indicate that the quotient of n//7,5,3,2 is not a whole number and thus would be my condition of whether or not the quotient of
      // interest is a whole number or not
    // the above method I think would work fine in conjunktion with my original conception of a solution, however, the issue is that its a lot of extra code and processing
    //as opposed to what I assume is a relatively simple mathematical operation to find the LCD via Euclids algorithm. Think I will move straight to euclids alg. though I am happy I took the time to conceive a complete solution. (that MAY work.)

    int A = n, B = d, temp = 0; //copying our input

    while (A-B != 0){
      A = A - B;
      if (A > B){
        continue;
      } else {
          temp = B; //temp always == bigger value
          B = A; //now B is the smaller value
          A = temp; //A is the larger value and we are ready for another loop.
        }
    }
    numerator = n/B;
    denominator = d/B;
  }
  public int getNum(){
    //(2.5 points) Returns the value of the numerator field
    return numerator;
  }
  public int getDenom(){
    //(2.5 points) Returns the value of the denominator field
    return denominator;
  }
  public void setNum(int n){
    //(2.5 points) Sets the numerator field to the value given in n
    numerator = n;
  }
  public void setDenom(int d){
    //(2.5 points) Sets the denominator field to the value given in d. If d is 0, throw an ArithmeticException.
    if (d == 0){throw new ArithmeticException();}//doubtful I got the syntax correct here, but we will see
    denominator = d;
  }
  public Fraction add(Fraction a){
    //(5 points) Returns the fraction that is the sum of the subject of the method and a. For example
    //(new Fraction(3,4)).add(new Fraction(1,4)) is 16/16 i.e 1/1 We sum the fractions a/b and c/d as (a*d+b*c)/b*d then reduce.
    //it says to reduce here... but I don't know how to tell java how to reduce a fraction...
    int newNum = (numerator * a.getDenom() + a.getNum() * denominator);
    int newDenom = (denominator * a.getDenom());
    return newNum/newDenom;
    //int newFrac = newNum/newDenom;
    // now we just need to reduce? do we need to do anything to reduce? I don't think so. jshell prints 1 for 16/16... so. I think we just return newFrac.
    //Ahh but we ant to see the fraction represented as a fraction.. therefore we do need some clever way to reduce it than print it as
    //System.out.println(newRNum+"//"+newRDenom);

  }


  public boolean equals(Fraction a){
    //(5 points) Returns true if subject of method and argument of call are equal. Fractions a/b and c/d are equal
    //if a*d and b*c are equal or since the fractions are normalized, if a==c and b==d.
    return (denominator * a.getNum() == numerator * a.getDenom());
    }

  }
  public String toString(){
    //(5 points) Returns a String representation of the fraction. For example, if the numerator is 1 and the denominator is 2, the String "1/2" is returned.
    return numerator + "//" + denominator;

  }
}
