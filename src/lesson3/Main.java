package lesson3;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Laptop laptop = new Laptop("laptop", 800.0,
                "samsung", "Series 5", 8);
        laptop.setAssembly();

        boolean status = false;

        do {
            System.out.println("Input number - 1 or 0");
            Scanner scanner = new Scanner(System.in);
            int choiceOfUser = scanner.nextInt();

            Random random = new Random();
            int min = 0;
            int max = 1;
            int choiceOfComp = random.nextInt(max + 1) + min;
            System.out.println("random = " + choiceOfComp);

            if (!status) {
                System.out.println(laptop + " WAS OFF");
                if (choiceOfComp == choiceOfUser) {
                    laptop.isOn();
                    status = true;
                } else {
                    laptop.isDown();
                }

            } else {
                System.out.println(laptop + " WAS ON");
                if (choiceOfComp == choiceOfUser) {
                    laptop.isOff();
                    status = false;
                } else {
                    laptop.isDown();
                }
            }
        } while (laptop.maxWorkingCount > 0);
    }
}
