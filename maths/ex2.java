package maths;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();
        
        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius,2);
        double volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);


        System.out.println("The circumference is: "+circumference+" cm");
        System.out.println("The area is: "+area+" cm²");
        System.out.println("The volume is: "+volume+" cm³");
        System.out.printf("The volume is: %.1f cm3\n", volume);
        sc.close();

    }
}
