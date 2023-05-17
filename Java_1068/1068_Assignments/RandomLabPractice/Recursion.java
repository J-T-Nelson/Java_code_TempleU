public class Recursion {
    public static void main(String[] args) {
        f(1);
        // f(1), 1 <= 1, so print "1\n"
        //
        // 1

        System.out.println();
        f(2);
        // f(2), 2 > 1 (!(2<=1)), so call f(2 / 2 = 1)
        //   f(1), 1 <= 1, so print "1\n"
        // we return to f(2), and print ", 2"
        //
        // 1
        // , 2

        System.out.println('\n');
        f(3);
        // f(3), 3 > 1, so call f(3 / 2 = 1), remember that integer division rounds down
        //   f(1), 1 <= 1, so print "1\n"
        // we return to f(3), and print ", 3"
        //
        // 1
        // , 3

        System.out.println('\n');
        f(5);
        // f(5), 5 > 1, so call f(5 / 2 = 2)
        //   f(2), 2 > 1, so call f(2 / 2 = 1)
        //     f(1), 1 <= 1, so print "1\n"
        //   we return to f(2), and print ", 2"
        // we return to f(5), and print ", 5"
        //
        // 1
        // , 2, 5
        
        System.out.println('\n');
        f(16);
        // f(16), 16 > 1, so call f(16 / 2 = 8)
        //   f(8), 8 > 1, so call f(8 / 2 = 4)
        //     f(4), 4 > 1, so call f(4 / 2 = 2)
        //       f(2), 2 > 1, so call f(2 / 2 = 1)
        //         f(1), 1 <= 1, so print "1\n"
        //       we return to f(2), and print ", 2"
        //     we return to f(4), and print ", 4"
        //   we return to f(8), and print ", 8"
        // we return to f(16), and print ", 16"
        //
        // 1
        // , 2, 4, 8, 16

        System.out.println('\n');
    }

    public static void f(int n) {
        if (n <= 1) {
            System.out.println(n);
        } else {
            f(n / 2);
            System.out.print(", " + n);
        }
    }
}
