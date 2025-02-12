package maths;
import java.util.Scanner;
public class exercise1 {
    public static void main(String[] args) {
        //hypotenuse of a right triangle
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double c;

        System.out.print("Enter length of side A: ");
        a = scanner.nextDouble();

        System.out.print("Enter length of side B: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));

        System.out.println("The hypotenuse (side c) is: "+c+" cm");

        scanner.close();
    }
}
