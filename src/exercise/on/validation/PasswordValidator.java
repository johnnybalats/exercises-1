package exercise.on.validation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a given password: ");
        String passwd = scanner.nextLine();
        System.out.println("Please re-enter the password to confirm: ");
        String confirmPasswd = scanner.nextLine();

        List<String> errorList = new ArrayList<String>();

        while(!isValid(passwd, confirmPasswd, errorList)) {

            System.out.println("Invalid password");
            System.out.println("The following criteria must be met:");
            System.out.println("1. Password contains at least one uppercase character");
            System.out.println("2. Password contains at least one lowercase character");
            System.out.println("3. Contains at least one number");
            System.out.println("4. Contains at least one spacial character (e.g., !, _ etc)");
            System.out.println("5. Password length must be at least 8 characters long");
            System.out.println("6. Cannot contain a sequence of 3 same characters (i.e. aaa) or a sequence of 3 consecutive characters (i.e abc)");

            System.out.println("List with criteria your password does not met: ");
            for (String error: errorList)
                System.out.println(error);

            System.out.println("Please enter a given password: ");
            passwd = scanner.nextLine();
            System.out.println("Please re-enter the password to confirm: ");
            confirmPasswd = scanner.nextLine();
        }

        System.out.println("Your password is: " + passwd);
    }

    private static boolean isValid(String passwd, String confirmPasswd, List<String> errorList) {

        Pattern upperCasePattern = Pattern.compile("(?=.*[A-Z])");
        Pattern lowerCasePattern = Pattern.compile("(?=.*[a-z])");
        Pattern atLeastOneNumberPattern = Pattern.compile("(?=.*[0-9])");
        Pattern specialCharPattern = Pattern.compile("(?=.*[@#$%^&+=])");
        Pattern atLeastEightPattern = Pattern.compile(".{8,}");
        Pattern sequencePattern = Pattern.compile("(?i)(?:([a-z0-9])\\1{2,})*");
        errorList.clear();

        boolean flag = true;

        if (!passwd.equals(confirmPasswd)) {
            errorList.add("Password and Confirm Password does not match");
            flag = false;
        }

        if (!atLeastEightPattern.matcher(passwd).find()) {
            errorList.add("Password must be at least 8 characters long!");
            flag = false;
        }

        if (!(atLeastOneNumberPattern.matcher(passwd).find() && sequencePattern.matcher(passwd).find()) || !(specialCharPattern.matcher(passwd).find() && sequencePattern.matcher(passwd).find())) {
            errorList.add("Criteria 3,6 or 4,6 are not met!");
            flag = false;
        } else {
            System.out.println("Password OK");
        }

        if(!(atLeastEightPattern.matcher(passwd).find() && sequencePattern.matcher(passwd).find())) {
            errorList.add("Criteria 5,6 are not met!");
            flag = false;
        } else {
            System.out.println("Strong password");
        }

        if (upperCasePattern.matcher(passwd).find() && lowerCasePattern.matcher(passwd).find() && atLeastOneNumberPattern.matcher(passwd).find()
            && specialCharPattern.matcher(passwd).find() && atLeastEightPattern.matcher(passwd).find() && sequencePattern.matcher(passwd).find()) {
            System.out.println("Very Strong password");
        }

        return flag;
    }
}