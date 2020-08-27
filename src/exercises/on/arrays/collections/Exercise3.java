package exercises.on.arrays.collections;

import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to return its digits in descending order: ");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println(reverseNumber(number));
    }

    private static int reverseNumber(int number) {

        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        return reversed;
    }
}
