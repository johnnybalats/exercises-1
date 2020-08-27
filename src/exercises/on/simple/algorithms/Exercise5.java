package exercises.on.simple.algorithms;

import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a long number: ");
        long number = Long.parseLong(scanner.nextLine());
        System.out.println("Number of digits from the given number: " + countDigits(number));
    }

    private static int countDigits(long number) {

        int count = 0;
        for(; number != 0; number /= 10, ++count) {}

        return count;
    }
}
