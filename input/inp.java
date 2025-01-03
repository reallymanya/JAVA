package input;

import java.util.Scanner;
public class inp {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        //String namee = scanner.next();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("What is your gpa: ");
        double gpa = scanner.nextDouble();

        System.out.println("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Hello "+name);
        //System.out.println("Hello "+namee);
        System.out.println("You are "+age+" years old");
        System.out.println("Your gpa is: "+gpa);
        System.out.println("Student: " + isStudent);

        if(isStudent){
            System.out.println("You are enrolled as a student");
        }else{
            System.out.println("You are NOT enrolled");
        }
        scanner.close();
    }
}
