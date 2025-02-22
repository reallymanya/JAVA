package operators.ternary;

public class into {
    public static void main(String[] args) {
        // ternary operator ? = Return 1 of 2 values if a condition is true
        // variable = (condition) ? ifTrue : ifFalse;

        /*int score = 55;

        String evenOrodd = (score % 2 == 0) ? "EVEN" : "ODD"; 
*/

        /*int hours = 13;

        String timeOfDay = (hours < 12) ? "A.M." : "P.M.";
        System.out.println(timeOfDay);
        */

        int income = 60000;
        double taxRate = (income >= 40000) ? 0.25 : 0.15;
        System.out.println(taxRate);
    }
}
