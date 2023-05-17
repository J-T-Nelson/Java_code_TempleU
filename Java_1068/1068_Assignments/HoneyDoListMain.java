public class HoneyDoListMain{
  public static void main(String args[]){
    Task t1 = new Task("Git Gramcracker", 20, 500);
    Task t2 = new Task("Help", 15, 65);
    Task t3 = new Task("be dumb", 0, 100000000);
    Task t4 = new Task("Git Gramcracker2", 20, 500);
    Task t5 = new Task("Help2", 15, 65);
    Task t6 = new Task("be dumb2", 0, 100000000);

    HoneyDoList h1 = new HoneyDoList(2);
    //HoneyDoList h2 = new HoneyDoList(-1); // <-- if you run this line the IllegalArgumentException will be thrown

    System.out.println("toString with no tasks: " + h1);
    h1.addTask(t1);
    System.out.println("toString after adding a task: " + h1);

    h1.addTask(t2); h1.addTask(t3); h1.addTask(t4);
    System.out.println("There should be 4 Tasks in h1: " +h1+ ", Total time: " + h1.totalTime() +
     ", Shortest Time: " + h1.shortestTime());

    System.out.println("Index of t3: " + h1.find("be dumb"));
    h1.completeTask(2);
    System.out.println("h1 post task completion: " + h1);
  }
}
