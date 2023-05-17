public class Car1 {
    public void m1() {
        System.out.println("car 1");
    }

    public void m2() {
        System.out.println("car 2");
    }

    public String toString() {
        return "vroom";
    }

    public static void main(String[] args) {
        Convertible mycar = new Convertible();
        
        // Convertible doesn't have a toString, but Car1 does, so we use the Car1 toString and print "vroom"
        System.out.println(mycar);

        // Convertible has a m1, so we print "convertible 1"
        mycar.m1();

        // Convertible doesn't have a m2, but Car1 does, so we print "car 2"
        mycar.m2();
    }
}

class Convertible extends Car1 {
    public void m1() {
        System.out.println("convertible 1");
    }
}
