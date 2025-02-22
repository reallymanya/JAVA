package loops;
import java.util.Scanner;
public class dowhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0;

        do{
            System.out.print("Enter a num between 1-10: ");
            num = sc.nextInt();
        } while(num < 1 || num > 10);

        System.out.println("You picked "+num);

        sc.close();
    }
}
