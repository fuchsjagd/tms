package lesson2;

public class Task1 {
    public static void main(String[] args) {
        int max;

        byte numberOneByte = 127;
        short numberTwoShort = 12;
        int numberThreeInt = 50;

        if (numberOneByte >= numberTwoShort) {
            max = numberOneByte;
        } else {
            max = numberTwoShort;
        }
        if (numberThreeInt > max) {
            max = numberThreeInt;
        }
        System.out.println("max is: " + max);
        System.out.println("min is: " + Math.min(numberThreeInt, Math.min(numberTwoShort, numberOneByte)));
        System.out.println("average is: " + (numberOneByte + numberTwoShort + numberThreeInt) / 3);

    }
}
