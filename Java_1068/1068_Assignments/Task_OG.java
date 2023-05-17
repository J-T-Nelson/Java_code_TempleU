public class Task {
  private String name;
  private int priority;
  private int estMinsToComplete;
  //private int whenDue;

  public Task(String Iname, int Iprior, int minToComp/*, int due*/){ //thiking the 'due' argument here may be
  // a little bit off, gotta research the java.time.LocalDateTime class
    name = Iname;
    priority = Iprior;
    estMinsToComplete = minToComp;
    //whenDue = due;
  }

  public String getName(){
    return name;
  }
  public int getPriority(){
  return priority;
  }
  public int getEstMinsToComplete(){
  return estMinsToComplete;
  }
  /*public String getWhenDue(){
  return whenDue;
}*/

  public void setName(String newName){
    name = newName;
  }
  public void setEstMinsToComplete(int n){
    estMinsToComplete = n;
  }
  /*public void setWhenDue(int n){
    WhenDue = n;//really not sure if this is an int or a String still
  }*/

  public void increasePriority(int amount){
    if (amount <= 0){ return; }
    priority += amount;
  }
  public void decreasePriority(int amount){
    priority -= amount;
    if (priority < 0){ priority = 0;}
  }

  public String toString(){//does my formatting of making two lines of this return, and tabbing out
    //to start at the same point (to the right of the return statement) make sense? Is it a normal convention?
    return "Name: "+ name + ", Priority: "+ priority + ", Estimated Mins-To-Complete: "+
            estMinsToComplete; //+ ", When Due: "+ whenDue
  }

  /*public boolean overdue(){
    return (curdate/time > whenDue); //this needs heavy modification I am sure, just placeholding right now.
  }*/
  public static void main(String args[]){
    Task t1 = new Task("Git Gramcracker", 20, 500);
    Task t2 = new Task("Help", 15, 65);
    Task t3 = new Task("be dumb", 0, 100000000);

    System.out.println("t1 name: " + t1.getName());

    System.out.println("t2 stuff: Name: " + t2.getName() +", Priority: "+ t2.getPriority() +", Mins to complete: "+ t2.getEstMinsToComplete());
    t2.setName("grab banana bars");
    t2.setEstMinsToComplete(5);
    t2.decreasePriority(5);
    System.out.println("t2 stuff after changes:\nName: "
    + t2.getName() +", Priority changed by 5: "+ t2.getPriority() +", Mins to complete: "+ t2.getEstMinsToComplete());

    System.out.println("To String test: " + t2);

    Task t4 = null; //interesting, I could not print t4 until i set it equal to null...
    // Task t4; on its own made java throw some errors. I wonder if there is a way to not have it throw those errors?
    //some throws ...blah.... statement? noteably I also could not
    Task ta1[] = {t1, t2, t3, t4, t4};
    System.out.println("Array to String test: " + ta1[0] + " this is t3: " + t3 + " this is t4: " + t4 + " printing arrayed t4s: Position 3: " + ta1[3] +" Position 4: "+ta1[4]);

    //I think I may need an equals method in order to could the # of null in an array.
    //System.out.println(numNullTasks(ta1)); //alright so the method works well enough, but you cannot tostring something that is null in java.
    //I also cannot do object.equals(object) when there is a null value... how to check if an object contains null or is null?
    // It is as simple as using a normal comparative == ... so null is more of a VALUE than it is a string..?
    Task ta2[] = new Task[6];
    System.out.println(numNullTasks(ta2));
  }
  public static int numNullTasks(Task t[]){ //need this method to get an accurate numTasks
    int count = 0;
    for (int i=0; i<t.length; i++){
      if (t[i] == null){ count++; }
    }
    return count;
  }

}
