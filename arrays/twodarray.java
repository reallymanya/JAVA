package arrays;

public class twodarray {
    public static void main(String[] args) {
        //2d arrays = an array of arrays

        String[][] cars = {
            {"Thar", "Harrier", "Range Rover"},
            {"Mercedes", "BMW", "Mustang"},
            {"Ferrari", "Lamborghini", "Rolls-Royce"}
        };

        for(int i = 0; i<cars.length; i++){
            for(int j = 0; j<cars.length; j++){
                System.out.print(cars[i][j] + " ");
            }
            System.out.println();
        }

        // declaration
        //String[][] cars = new String[3][3];

    }
}
