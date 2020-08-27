package exercises.on.simple.algorithms;

import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to see if it is prime or not: ");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println(isPrime(number));
    }

    private static boolean isPrime(int number) {

        if (number < 2) return false;

        for (int i = 2; i < number / 2; i++) {
            if (number %  i == 0)
                return false;
        }
        return true;
    }
}
