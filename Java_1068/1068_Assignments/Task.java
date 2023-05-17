public class Task {
  private String name;
  private int priority;
  private int estMinsToComplete;

  public Task(String Iname, int Iprior, int minToComp){
    name = Iname;
    priority = Iprior;
    estMinsToComplete = minToComp;
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

  public void setName(String newName){
    name = newName;
  }
  public void setEstMinsToComplete(int n){
    estMinsToComplete = n;
  }

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
            estMinsToComplete;
  }
}
