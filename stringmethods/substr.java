package stringmethods;
import java.util.Scanner;
public class substr {
    public static void main(String[] args) {
        
        // substring() = a method used to extract a portion of a string
         // syntax = .substring(start, end)
        Scanner sc = new Scanner(System.in);

        String email;
        String username;
        String domain;

        System.out.print("Enter your email: ");

        email = sc.nextLine();

        if(email.contains("@")){
        username = email.substring(0, email.indexOf("@"));
        domain = email.substring(email.indexOf("@") + 1);

         System.out.println(username);
         System.out.println(domain);
         
        }
        else{
            System.out.println("Emails must contain @");
        }
        
         sc.close();
    }

}
