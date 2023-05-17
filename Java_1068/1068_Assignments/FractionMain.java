public class FractionMain{
  public static void main(String args[]){
    //now we test methods
    Fraction f1 = new Fraction(605, 150);
    System.out.println(f1);
    Fraction f2 = new Fraction(1402, -204);
    System.out.println(f2);

    System.out.println("Fraction 1's numerator: " + f1.getNum() + ", Fraction 1's denominator: " + f1.getDenom());
    f1.setNum(456); f1.setDenom(582);
    System.out.println("Fraction 1's numerator post setter: " + f1.getNum() + ", Fraction 1's denominator post setter: " + f1.getDenom());
    Fraction f3 = f1.add(f2);
    System.out.println("Adding fraction 1 to fraction 2 = " + f3);
  }
}
