public class Rectangle { //seems like I will have to figure out how to use classes in Atom in order to separate a class file
  //from a separate .java file that calls for that class... Maybe I need a class file to call upon it?
  public int l; //I wonder if I can declare these all in the same line, without having to retype "public int ..."
  public int w;
  public int x;
  public int y;

public Rectangle(int initialX, int initialY, int initialL, int initialW){ //I believe this is my constructor method
  x = initialX;
  y = initialY;
  l = initialL;
  w = initialW;
}
public String toString() {
  return "(x: " + x + ", y: " + y + " Length: " + l + " Width: " + w + ")";
}
public static void main(String[] args){
  Rectangle r1 = new Rectangle(5,5,10,15);
  System.out.println("r1.x: " + r1.x + " r1.y: " + r1.y + " r1.l: " + r1.l + " r1.w: " + r1.w);
  System.out.println("this is our toString method: "+ r1.toString());

}
}
