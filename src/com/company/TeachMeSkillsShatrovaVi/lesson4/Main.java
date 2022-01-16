package com.company.TeachMeSkillsShatrovaVi.lesson4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arab = new int[101];
        for (int i = 0; i < arab.length; i++) {
            arab[i] = i;
        }

        String[] roman = new String[]{"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"
        };

        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 0; i < arab.length; i++) {
            map.put(arab[i], roman[i]);
        }
//        Set<Integer> keys = map.keySet();
//        System.out.println("Ключи: " + keys);
//
//        ArrayList<String> values = new ArrayList<>(map.values());
//        System.out.println("Значения: " + values);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input arabic number");
        int arabNumb = scanner.nextInt();
        System.out.println(map.get(arabNumb));

    }
}
