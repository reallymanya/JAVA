package loops;

import java.util.Scanner;

public class nestedfor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows;
        int col;
        String symbol = "";

        System.out.println("Enter # of rows: ");
        rows = sc.nextInt();
        System.out.println("Enter # of columns: ");
        col = sc.nextInt();
        System.out.println("Enter symbol to use: ");
        symbol = sc.next().trim();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= col; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
        sc.close();
    }

}
