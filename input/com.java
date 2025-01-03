package input;

import java.util.Scanner;
public class com {
    public static void main(String[] args){
       
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter you age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); //nextline method of scanner object to clear the input buffer

        System.out.print("Enter your favourite color: ");
        String color = scanner.nextLine();

        System.out.println("You are: "+age+" years old");
        System.out.println("You like the color "+color);
        scanner.close();
    }
}
