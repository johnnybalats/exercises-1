package exercises.on.simple.algorithms;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to calculate the factorial: ");
        int number = Integer.parseInt(scanner.nextLine());
        int factorial = factorial(number);
        System.out.println("The factorial of " + number + " (" + number + "!) is: " + factorial);

        System.out.println("Max value of integer " + findMaxValue(number));
    }

    private static int factorial(int n) {

        int output;
        if (n == 1)
            return 1;

        // Recursion
        output = factorial(n - 1) * n;

        return output;
    }

    private static int findMaxValue(int n) {

        int res = 2;
        int fact = factorial(n);

        while (true) {

            if (fact < 0)
                break;

            res++;
            fact = fact * res;
        }

        return res - 1;
    }
}
