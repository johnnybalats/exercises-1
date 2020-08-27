package exercises.on.simple.algorithms;

import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter a number to see the sum of series 1 + 1/2 + 1/3 + ... + 1/n: ");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.printf("The sum is %f", sumOfSeries(number));
    }

    // function to return sum of 1 + 1/2 + 1/3 + ... + 1/n
    private static double sumOfSeries(int n) {

        double i, sum = 0.0;
        for (i = 1; i <= n; i++)
            sum += 1/i;
        return sum;
    }
}
