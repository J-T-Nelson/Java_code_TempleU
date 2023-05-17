public class TaskMain{
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

    Task t4 = null;
    Task ta1[] = {t1, t2, t3, t4, t4};
    System.out.println("Array to String test: " + ta1[0] + " this is t3: " + t3 + " this is t4: " + t4 +
    " printing arrayed t4s: Position 3: " + ta1[3] +" Position 4: "+ta1[4]);

  }
}
