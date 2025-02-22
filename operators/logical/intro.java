package operators.logical;
import java.util.Scanner;
public class intro {
    public static void main(String[] args) {
        
    
    /*logical operators = used to connect two or more expressions
     * && = both condn must be true
     * || = either must be true
     * ! = reverses boolean value of condition
     */

     /*int temp = 25;
     
     if(temp > 30){
        System.out.println("It's hot outside");
     }else if(temp >=20 && temp<=30){
        System.out.println("It's warm");
     }else{
        System.out.println("Its cold");
     }*/

     /*Scanner sc = new Scanner(System.in);
     System.out.println("You are playing a game! press q or Q to exit");
     String response = sc.next();
     if(response.equals("q") || response.equals("Q")){
        System.out.println("You quit");
     }else{
        System.out.println("you are still playing");
     }
     sc.close();*/
     Scanner sc = new Scanner(System.in);
     System.out.println("You are playing a game! press q or Q to exit");
     String response = sc.next();
     if(!response.equals("q") && !response.equals("Q")){
        System.out.println("You are still playingg");
     }else{
        System.out.println("you quit");
     }
     sc.close();

}

}