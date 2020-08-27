package exercises.on.arrays.collections;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise2 {

    public static void main(String[] args) {

        // getting an arraylist with duplicates
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 10, 1, 3, 3, 4, 5, 5, 23, 11, 22, 11, 44, 2, 6, 7, 8));

        System.out.println("ArrayList with duplicates: " + list);

        // removing the duplicates
        ArrayList<Integer> newList = removeDuplicates(list);

        System.out.println("ArrayList with duplicates removed: " + newList);
    }

    private static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {

        ArrayList<Integer> newList = new ArrayList<Integer>();

        for (Integer element : list) {

            if (!newList.contains(element)) {
                newList.add(element);
            }
        }

        return newList;
    }
}
