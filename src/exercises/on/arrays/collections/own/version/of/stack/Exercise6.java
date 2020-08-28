package exercises.on.arrays.collections.own.version.of.stack;

import java.util.Scanner;

public class Exercise6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word to see if it is symmetric: ");
        String word = scanner.nextLine();

        word = word.replaceAll("[^A-Za-z]+", "").toLowerCase();

        if(isSymmetric(word))
            System.out.println("Word is symmetric");
        else
            System.out.println("Word is not symmetric");
    }

    private static boolean isSymmetric(String word) {

        int stringLength = word.length();
        for (int i = 0; i < (stringLength/2); i++) {

            if (word.charAt(i) != word.charAt(stringLength - i - 1))
                return false;
        }

        return true;
    }
}
