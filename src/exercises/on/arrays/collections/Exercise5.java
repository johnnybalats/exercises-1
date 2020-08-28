package exercises.on.arrays.collections;

import exercises.on.arrays.collections.own.version.of.stack.ArrayStack;

public class Exercise5 {

    public static void main(String[] args) {

        StringBuffer string = new StringBuffer("Something");

        reverseString(string);

        System.out.println("Reversed string is " + string);
    }

    private static void reverseString(StringBuffer stringBuffer) {

        int cap = stringBuffer.length();
        ArrayStack obj = new ArrayStack(cap);

        for (int i = 0; i < cap; i++)
            obj.pushChar(stringBuffer.charAt(i));

        for (int i = 0; i < cap; i++) {
            char character = obj.popChar();
            stringBuffer.setCharAt(i, character);
        }
    }
}
