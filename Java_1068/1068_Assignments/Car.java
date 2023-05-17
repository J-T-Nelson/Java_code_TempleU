public class Car {
  private String make;
  private String model;
  private int year;
  private double MPG;
  private double milesDriven;
  private double fuelCapacity;
  private double fuelRemaining;

  public Car(String Imake, String Imodel, int Iyear, double IMPG, int ImilesDriven, int IfuelCapacity, double IfuelRemaining){
    //what can I do to make long initialization statements more readable? Java doesnt like it when I put a space down.
    //I also just learned you cannot have class attributes = the same variable as initialization arguments in java... which I believe differs from python.
    make = Imake;
    model = Imodel;
    year = Iyear;
    MPG = IMPG;
    milesDriven = ImilesDriven;
    fuelCapacity = IfuelCapacity;
    fuelRemaining = IfuelRemaining;
  }

  public void fillTank(double g){//dont know if I need to write Car.fuelRemaining to call for that value in this method..
    //I assume they will use a variable for a car object, and that variable will automatically access its
    //objects value without a more generalized input? yeah inside other class files, all you need is the name of the
    //attribute within a function in order to call it up and operate on it.
    if (g + fuelRemaining > fuelCapacity){
      System.out.println("Whoa there, " +g+" gallons is too much fuel!");
      System.out.println("Try to add some again, but don't exceed the gas-tanks limit: " + fuelCapacity);
    } else {
        fuelRemaining += g;
        System.out.println("Awww yeah, thats some gas right there! Now we have " + fuelRemaining +
        " gallons of gas in the tank.");
      }
  }

  public void drive(double m){
    // need to deal with the situation where the user drives the car further than we have gas for... which will
    //mean adding the total amount of drive possible, than letting the user know our fuel is all gone
    double maxDrive = fuelRemaining * MPG;
    if (m >= maxDrive){
      double fuelUsed = maxDrive/MPG;
      fuelRemaining -= fuelUsed;
      milesDriven += maxDrive;
      System.out.println("Well we went " + maxDrive + " miles, in the " + year+" "+model + ", and now we are all out of fuel...\n"+
      "Time to fuel up!");
    } else {
        double fuelUsed = m/MPG;
        fuelRemaining -= fuelUsed;
        milesDriven += m;
        System.out.println("We went " + m + " miles, and we have " + fuelRemaining + " gallons of gas left in the " + year+" "+model);
    }
  }

  public double getFuelRemaining(){//depending on how we want this method to work, we could have it return a string representation
    //of the fuelRemaining attribute.... we can also return it as a double...
    //we could print it out directly. not sure whats best.
    //looking further at the instructions tells me that its good to just return the value itself.
    return fuelRemaining;
  }

  public String toString(){
    return "Make: " + make + " Model: " + model + " Year: " + year + " MPG: " + MPG +
     " Miles Driven: " + milesDriven + " Fuel Capacity: " + fuelCapacity + " Fuel Remaining: " + fuelRemaining;
     //wondering if this return will work for returning a string... we will see.
  }
}
