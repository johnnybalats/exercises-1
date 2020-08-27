package exercises.on.arrays.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> primesList = new ArrayList<Integer>();
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number into the list (terminates with 0): ");
        int number;

        while((number = Integer.parseInt(scanner.nextLine())) > 0) {

            list.add(number);
        }
        scanner.close();

        for (int i = 1; i <= list.size(); i++) {
            if (isPrime(i))
                primesList.add(i);
        }

        System.out.println(primesList.toString());
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
