package exercises.on.simple.algorithms;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to calculate the factorial: ");
        int number = Integer.parseInt(scanner.nextLine());
        int factorial = factorial(number);
        System.out.println("The factorial of " + number + " (" + number + "!) is: " + factorial);
    }

    // factorial of n (n!) = 1 * 2 * 3 *4 * ... * n
    private static int factorial(int n) {

        int output;
        if (n == 1)
            return 1;

        // Recursion
        output = factorial(n - 1) * n;

        return output;
    }
}
