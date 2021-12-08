package lesson2;

public class Task2 {
    public static void main(String[] args) {
        byte variableOne = 20;
        short variableTwo = 2;
        float variableThree = 4.2f;
        long variableFour = 3L;
        boolean isOrIsnt = true;

        int divides = (int) (variableOne / variableFour);
        int substract = (int) (variableFour - variableTwo);
        double multiplies = divides * variableThree;
        int restOfDivides = (int) (variableOne % variableFour);
        char symbol = (char) (variableOne - variableTwo);

        if (restOfDivides + variableOne > substract) {
            System.out.println(isOrIsnt);
        }

        System.out.println("some result " + divides);
        System.out.println("some symbol " + symbol);
        System.out.println("some fractional number " + multiplies);
        System.out.println("one more result " + restOfDivides);
        System.out.println("one more number " + substract);
    }
}
