
public class ClassPractice1 { //just having a class file named Rectangle in the same directory does not appear to allow
  //access to the Rectangle object in java just yet.
  public static void main(String[] args){
    Rectangle r1 = new Rectangle(5,5,10,15);
    System.out.println("r1.x:" + r1.x + "r1.y:" + r1.y + "r1.l:" + r1.l + "r1.w:" + r1.w);
    System.out.println("this is our toString method: "+ r1.toString);

  }
}
