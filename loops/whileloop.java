package loops;
import java.util.Scanner;
public class whileloop {
    public static void main(String[] args) {
        
    
    //while loop = executes a block of code as long as it's remains true
    Scanner sc = new Scanner(System.in);
    String name = "";

    while(name.isBlank()){ //isEmpty()
        System.out.print("Enter your name: ");
        name = sc.nextLine();
    }
    System.out.println("Hello "+name);
    sc.close();
}
}
