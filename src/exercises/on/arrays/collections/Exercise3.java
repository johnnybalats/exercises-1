package exercises.on.arrays.collections;

import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to return its digits in descending order: ");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println(descendingOrderNumber(number));
    }

    private static int descendingOrderNumber(int number) {

        int length = Integer.toString(number).length();
        int a[] = new int[length];
        int num = number;
        int i = 0;

        while (num != 0) {
            a[i] = num % 10;
            num /= 10;
            i++;
        }

        for (i = 0; i < length; i++) {
            for (int j = 0; j < length - 1 - i; j++) {
                if (a[j] < a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        String result = "";
        for (i = 0; i < length; i++)
            result += a[i];

        int descendingNumber = Integer.parseInt(result);

        return descendingNumber;
    }
}
