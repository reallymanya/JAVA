package arrays;

public class intro {
    public static void main(String[] args) {
        // array = use to store multiple values in a single variable'

        /*
         * String[] cars ={"Range Rover", "Thar", "Scorpio"};
         * cars[0] = "Mustang";
         * System.out.println(cars[2]);
         */

        String[] cars = new String[3];

        cars[0] = "Range Rover";
        cars[1] = "Thar";
        cars[2] = "Tesla";

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

    }
}
