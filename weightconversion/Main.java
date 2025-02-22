package weightconversion;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //WEIGHT CONVERSION PROGRAM;
        Scanner sc = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        // welcome message

        System.out.println("Weight Conversion Program");
        System.out.println("1. Convert lbs to kgs");
        System.out.println("Convert kgs to lbs");

        System.out.print("Choose an option: ");
        choice = sc.nextInt();

        // option 1 to convert lbs to kgs

        if(choice == 1){
            System.out.print("Enter the weight in lbs: ");
            weight = sc.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("The new weight in kgs is: %.2f\n", newWeight); 
        }
     // option 2 convert kgs to lbs

     else if(choice == 2){
        System.out.print("Enter the weight in kgs: ");
        weight = sc.nextDouble();
        newWeight = weight * 2.20462;
        System.out.printf("The new weight in lbs is: %.2f\n", newWeight); 
    }
        
//else print invalid 
else{
    System.out.println("User didn't select a valid choice");
}


        sc.close();
    }

}
