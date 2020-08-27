package exercises.on.simple.algorithms;

import java.util.Scanner;

public class Exercise6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a float number to get its decimal part: ");
        float number = Float.parseFloat(scanner.nextLine());
        // set to .5f in case user gives a number with more decimals than two
        System.out.printf("Decimal part of number: %.5f", printDecimalPart(number));
    }

    private static float printDecimalPart(float number) {

        int decimal = (int) number;
        float fractional = number - decimal;

        return fractional;
    }
}
