package loops;
import java.util.Scanner;
public class whiletwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String response = "";

        while(!response.equals("Q")){
            System.out.println("You are playing a game");
            System.out.print("Press Q to exit: ");
            response = sc.next().toUpperCase();
        }

        System.out.println("You have quit the game");

        sc.close();
    }
/* 
    Scanner sc = new Scanner(System.in);
    int age = 0;

    System.out.print("Enter the age: ");
    age = sc.nextInt();

    while(age < 0){
    System.out.println("Your age can't be negative");
    System.out.println("Enter your age: ");
    age = sc.nextInt();
    }

    System.out.println("You are "+age+" years old");
*/

/* 
    Scanner sc = new Scanner(System.in);
    int age = 0;

   // do-while first condition is checked

   do{
    System.out.println("Your age can't be negative");
    System.out.println("Enter your age: ");
    age = sc.nextInt();
    }while(age < 0);

    System.out.println("You are "+age+" years old");
*/
}
