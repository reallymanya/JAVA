package loops;
import java.util.Scanner;
public class enhancedswitch {
    public static void main(String[] args) {
        //enhanced switch = a replacement to many else if statements
        //(java14 feature)
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the day: ");
        String day = scanner.nextLine();

        switch(day){
            case "Monday", "Tuesday" , "Wednesday", "Thursday", "Friday" -> System.out.println("It's a weekday 🙃 ");
            case "Saturday", "Sunday" -> System.out.println("It's weekend 😍");
            default -> System.out.println(day + "is not a day");
           
        }
        scanner.close();
    }
}
