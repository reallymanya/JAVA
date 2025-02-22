package loops;
import java.util.Scanner;
public class calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1;
        double num2;
        char op;
        double result = 0;
        boolean validOp = true;
        System.out.print("Enter the first number: ");
        num1 = sc.nextDouble();

        System.out.println("Enter an operator (+, -, *, /, ^): ");
        op = sc.next().charAt(0);

        System.out.print("Enter the second number: ");
        num2 = sc.nextDouble();

        switch(op){
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if(num2 == 0){
                    System.out.println("Cannot divide by 0");
                    validOp = false;
                }else{
                    result = num1 / num2;
                }
            }
            case '^' -> result = Math.pow(num1, num2);
            default -> {
                System.out.println("Invalid operator");
                validOp = false;
            }

        }
        if(validOp){
        System.out.println(result);
        }
        sc.close();

    }
}
