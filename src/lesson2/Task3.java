package lesson2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("hi, type in some number");

        int sideOfSquare = scanner.nextInt();

        if (sideOfSquare > 0) {
            int[][] myArr = new int[sideOfSquare][sideOfSquare];
            for (int j = 0; j < sideOfSquare; j++) {
                for (int i = 0; i < sideOfSquare; i++) {
                    myArr[i][j] = 0;
                    System.out.print(" " + myArr[i][j]);
                }
                System.out.println();
            }
        }
        scanner.close();
    }
}
