public class CarMain{
  public static void main(String args[]){
    Car mustang = new Car("Ford", "Mustang", 1800, .5, 10000000, 50, 50);
    Car truck = new Car("Chevy", "BigBoi", 2156, 500, 10, 40, 40);
    Car futureMustang = new Car("FordTron", "Must-daaang", 3001, 4000, 1000000000, 500, 500);
    Car truck2 = new Car("Chevy", "BigBoyo", 2000, 10.6, 12, 40, 40);

    System.out.println(mustang);
    Car carArray[] = {mustang, truck, futureMustang, truck2};
    System.out.println(carArray[3]);

    truck2.drive(500);
    System.out.println("Gas left in truck2: " + truck2.getFuelRemaining());
    truck2.fillTank(55);
    truck2.fillTank(40);
    futureMustang.drive(5000);
    futureMustang.drive(5000*5000);

  }
}
