public class HoneyDoList{
  private Task tasks[];
  private int numTasks;
  private int INITIAL_CAPACITY;

  public HoneyDoList(int IC){

    if (IC < 0){
      throw new IllegalArgumentException("Initial Capacity must be positive.");
      //Ideally I would like to have a more robust program that allows you to mess up Initial Capacity for a
      //HoneyDoList and would handle all the following issues, but for now it works to just throw a program
      //halting exception
    }
    INITIAL_CAPACITY = IC;
    tasks = new Task[IC];
    numTasks = 0;
  }
  public static int numNullTasks(Task t[]){
    //This method is a bit of an artifact of an early misinterpretation I had about the instructions for HoneyDoList
    //Thus it is used throughout, however I am sure I did not actually need it.
    int count = 0;
    for (int i=0; i<t.length; i++){
      if (t[i] == null){ count++; }
    }
    return count;
  }

  public String toString(){

    if (numNullTasks(tasks) == tasks.length){
      return "No Tasks in this HoneyDoList";
    }

    String s = "";
    s += tasks[0].getName();
    for (int i=1; i<tasks.length; i++){
      if (tasks[i] == null){ return s; }
      s += ", " + tasks[i].getName();
    }
    return s;
  }

  public int find(String name){
    int index = -1;
    for (int i=0; i<tasks.length; i++){
      if (tasks[i].getName().equals(name)){
        index = i;
        break;
      }
    }
    return index;
  }

  public void addTask(Task t){
    numTasks += 1;
    if (numNullTasks(tasks) == 0){

      Task[] newTaskArray = new Task[tasks.length + 1];
      newTaskArray[newTaskArray.length - 1] = t; //setting our new task into our new array at the last position.
      for (int i=0; i<tasks.length; i++){//setting all positions except the last = to the same postions Tasks in tasks.
        newTaskArray[i]=tasks[i];
      }
      tasks = newTaskArray;

    } else {
        for (int i=0; i<tasks.length; i++){
          if (tasks[i] == null){
            tasks[i] = t;
            return;
          }
        }
      }
    }

  public int totalTime(){
    int total = 0;
    for (int i=0; i<tasks.length; i++){
      if (tasks[i]==null) {return total;}
      total += tasks[i].getEstMinsToComplete();
    }
    return total;
  }

  public int shortestTime(){
    if (tasks[0] == null) {return -1;}
    int index = 0;
    int shortestTime = tasks[0].getEstMinsToComplete();
    for (int i=1; i<tasks.length; i++){
      if (tasks[i] == null) {return index;}
      if (tasks[i].getEstMinsToComplete() < shortestTime){
        index = i;
      }
    }
    return index;
  }

  public Task completeTask(int index){
    Task compTask = tasks[index];
    if (index > tasks.length-1 || index < 0){
      return null;
    } else {
        for (int i=0+index; i<tasks.length-1; i++){
          tasks[i]=tasks[i+1];
        }
        tasks[tasks.length-1] = null; //this should always run, as in the case we have a full list,
        //its just the easiest way to appropriately overwrite it
        // java was complaining about setting an indecie in my tasks object equal to a null object..
        //as it was uninitialized...
        //so I am directly setting it equal to null and will just have to see if that causese any issues
      }
    numTasks -= 1;
    return compTask;
  }

}
