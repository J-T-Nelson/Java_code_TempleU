public class Car2 {
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
        
        // Convertible.toString calls super.toString() twice (super is Car2, so Car2.toString()) printing "vroomvroom"
        System.out.println(mycar);

        // Convertible has a m1, so we print "convertible 1"
        mycar.m1();

        // Convertible has an m2 that calls super (Car2).m1(), so we print "car 1"
        mycar.m2();
    }
}

class Convertible extends Car2 {
    public void m1() {
        System.out.println("convertible 1");
    }

    public void m2() {
        super.m1();
    }

    public String toString() {
        return super.toString() + super.toString();
    }
}
