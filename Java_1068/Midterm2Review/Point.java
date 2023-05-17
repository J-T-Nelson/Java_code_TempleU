public class Point {
  private int x;
  private int y;
  private String name;

  public Point(int initialX, int initialY) {
    x = initialX;
    y = initialY;
    this.name = "name"; //I really would like to have the name automatically print the variables chars which refer to the object...
  }

  public void move(int dx, int dy) {
    x += dx;
    y += dy;
  }

  public String toString() {
    return "(" + x + "," + y + ")";
  }
  public String getName(){
    return name;
  }
  public static void main(String args[]) {
    Point p1 = new Point(10,20);
    Point p2 = p1;

    p2.x++;

    System.out.println("p1 = " + p1 + ", p2=" + p2);

    System.out.println(p1.name + "  "+ p2.name);
  }
}
