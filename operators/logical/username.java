package operators.logical;

import java.util.Scanner;

public class username {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String user;
        System.out.println("Enter username: ");
        user = sc.nextLine();
        // using &&
        if (user.length() >= 4 && user.length() <= 12) {
            if (!(user.contains(" ")) && !(user.contains("-"))) {
                System.out.println("Hello " + user);
            } else {
                System.out.println("Invalid: no spaces or hyphrn allowed");
            }
        } else {
            System.out.println("Invalid username: Must be 4-12 characters");
        }

        /*
         * using ||
         * if(user.length() < 4 || user.length() > 12){
         * System.out.println("Invalid username: Must be 4-12 characters");
         * }
         * else if(user.contains(" ") || user.contains("-")){
         * System.out.println("Invalid: no spaces or hyphrn allowed");
         * }else{
         * System.out.println("Hello "+user);
         * }
         */
        sc.close();
    }
}
