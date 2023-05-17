import java.util.*;

public class HoneyDoList{
  private Task tasks[];
  private int numTasks;
  private int INITIAL_CAPACITY;

  public HoneyDoList(Task t[], int IC){ //according to fiores instructions... we should not be passing a task array to this object..
    //rather, we should only be adding tasks via the add task feature.. 
    tasks = t;// a little unsure about the syntax of an array within a constructor method.
    //in the instructions it says we have to 'create' the array of tasks in the constructor method...
    //but I think that sounds wrong. It makes much more sense to pass a preconstructed array of tasks right?
    INITIAL_CAPACITY = IC; //tbh IDK why this is a thing. It just doesnt need to be a part of the object..
    //It only makes sense in so far as a memory regulatory tool? but I think its more sensible to just pass an array...
    //and add to it when needed.
    //Maybe to avoid creating new arrays of tasks whenever a new one is added that expands it is more optimal for computer resources?
    numTasks = tasks.length - numNullTasks(tasks); //unsure of whether or not I can have a shifting value like this within a constructor...
    //I imagine the program would then have to refer to the constructor in the class anytime it wants to use or see
    // this value, which I am not sure makes sense..
  }

  public static int numNullTasks(Task t[]){ //need this method to get an accurate numTasks
    int count = 0;
    for (int i=0; i<t.length; i++){
      if (t[i] == null){ count++; }
    }
    return count;
  }

  public String toString(){ //this should work but I see some room for bugs/error.
    String s = "Tasks:";
    for (int i=0; i<tasks.length; i++){
      if (tasks[i] == null){ continue; }
      s += tasks[i] + " "; //formatting will need work.
    }
    return s;
  }

  public int find(String name){
    int index = -1;
    index = Arrays.binarySearch(tasks, name); // due to the nature of the binary search algorithm... I wonder if I can use it for this task?
    //if binarysearch doesnt work, I can just make my own solution using a for loop I think.
    //I am actually curious to know if the binary search would work in all cases, when if it doesnt:
    /* for (int i=0; i<tasks.length; i++){
    if (tasks[i].equals(name)){ index = i; break;} // <-- this should work as 'tasks[i]' should automatically
    // be a string when java realizes we are doing a .equals comparison...
  }*/
    return index;
  }

  public void addTask(Task t){
    if (numNullTasks(tasks) == 0){
      Task[] newTaskArray = new Task[tasks.length + 1];
      newTaskArray[newTaskArray.length - 1] = t; //setting our new task into our new array at the last position.
      for (int i=0; i<tasks.length; i++){//setting all positions except the last = to the same postions Tasks in tasks.
        newTaskArray[i]=tasks[i];
      }
      tasks = newTaskArray; //set our new array to be tasks for the instance of the class (I wonder if there will be scope issues without a return?)
    } else {
        for (int i=0; i<tasks.length; i++){
          if (tasks[i] == null){
            tasks[i] = t;
            return; //pretty sure return is important here, such that we don't have multiple indecies set to our new task.
          }
        }
      }
    }

  public int totalTime(){
    int total = 0;
    for (int i=0; i<tasks.length; i++){
      if (tasks[i]!=null){
        total += tasks[i].getEstMinsToComplete();
      }
    }
    return total;
  }

  public int shortestTime(){
    int index = -1;
    int longestTime = 0;
    for (int i=0; i<tasks.length; i++){
      if (tasks[i]!=null){ // I am including this right now because I don't know if there would be an issue if I tried to check a null entry
      //for a field... I imagine an error would be thrown. Ill test later.
        if (tasks[i].getEstMinsToComplete() > longestTime){
          index = i;
        }
      }
    }
    return index;
  }

  public Task completeTask(int index){
    Task cTask = tasks[index];
    if (index > tasks.length-1 || index < 0){
      return null;
    } else {
    /*if (tasks[index]==null){ //I think this code may be useless... as I am already returning whatever task is completed, thus if its a null task... I imagine that would return null.
      return null;
    } else {*/
        //Task nTask; // <-- just a null task to add into the very last position in the case the list was completely full.
        for (int i=0+index; i<tasks.length-1; i++){
          tasks[i]=tasks[i+1];
        }
        tasks[tasks.length-1] = null; // java was complaining about setting an indecie in my tasks object equal to a null object..
        //as it was uninitialized...
        //so I am directly setting it equal to null and will just have to see if that causese any issues
      }
    return cTask;
  }
// We are finished with all of the non extra credit methods, now we should test out whether everything works properly or not..

  public static void main(String args[]){
    Task t1 = new Task("Git Gramcracker", 20, 500);
    Task t2 = new Task("Help", 15, 65);
    Task t3 = new Task("be dumb", 0, 100000000);
    Task t4 = new Task("Git Gramcracker2", 20, 500);
    Task t5 = new Task("Help2", 15, 65);
    Task t6 = new Task("be dumb2", 0, 100000000);

    Task ta1[] = {t1, t2, t3, t4, t5, t6};
    HoneyDoList h1 = new HoneyDoList(ta1, )

  }
}
