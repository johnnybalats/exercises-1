package exercises.on.arrays.collections;

import exercises.on.arrays.collections.own.version.of.stack.ArrayStack;
import exercises.on.arrays.collections.own.version.of.stack.Student;

import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayStack obj = new ArrayStack();
        Student student = new Student();
        int choice;

        System.out.println("--------------Student Stack-------------------");
        System.out.println("1. Enter a Student into the Stack");
        System.out.println("2. Remove a Student from the Stack");
        System.out.println("3. Size of the Stack");
        System.out.println("4. Check if the Stack is empty");
        System.out.println("5. Check if the Stack is full");
        System.out.println("6. Check the top of the Stack");
        System.out.println("7. Exit program");
        System.out.println("Enter your choice : ");
        choice = input.nextInt();

        do {

            if(choice == 1) {

                System.out.println("Give registration number of the Student : ");
                int AM = input.nextInt();
                String ex = input.nextLine();
                System.out.println("Give the name of the Student : ");
                String name = input.nextLine();
                System.out.println("Give the surname of the Student : ");
                String surname = input.nextLine();
                System.out.println("Give age of the Student : ");
                double age = input.nextDouble();
                System.out.println("Give sex of the Student : ");
                char sex = input.next().charAt(0);
                System.out.println("Give how many times the Student was absent from the course : ");
                int absents = input.nextInt();
                System.out.println("Give Students grade : ");
                double grade = input.nextDouble();

                student = new Student(AM, name, surname, age, sex, absents, grade);
                obj.push(student);
            }if(choice == 2) {

                obj.pop();
            }if(choice == 3) {

                System.out.println("Size of Stack : " + obj.size());
                System.out.println();
            }if(choice == 4) {

                System.out.println(obj.isEmpty());
            }if(choice == 5) {

                System.out.println(obj.isFull());
            }if(choice == 6) {

                System.out.println("In the top of the Stack is the Student with following data : \n" + obj.top());
                System.out.println();
            }if(choice == 7) {

                System.exit(0);
            }

            System.out.println("--------------Student Stack-------------------");
            System.out.println("1. Enter a Student into the Stack");
            System.out.println("2. Remove a Student from the Stack");
            System.out.println("3. Size of the Stack");
            System.out.println("4. Check if the Stack is empty");
            System.out.println("5. Check if the Stack is full");
            System.out.println("6. Check the top of the Stack");
            System.out.println("7. Exit program");
            System.out.println("Enter your choice : ");
            choice = input.nextInt();

        } while(choice <= 7 && choice > 0);
    }
}
