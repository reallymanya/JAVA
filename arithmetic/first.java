package arithmetic;

public class first {
    public static void main(String[] args) {
        int x = 10;
        int y = 3;
        //int z;

       /* z = x / y;
          z = x - y;
          z = x * y;
          z = x + y;
          z = x % y;
        */

        // augmented operators
        //x += y;
        //x -= y;
        //x *= y;
        //x /= y;
        //x %= y;

        //increment and decrement operators

        x++;
        x++;

        y--;
        y--;

        //order of operations(P-E-M-D-A-S)

        double result = 3 + 4 * (7-5) / 2.0;

        System.out.println(x);
        System.out.println(y);
        System.out.println(result);

    }
}
