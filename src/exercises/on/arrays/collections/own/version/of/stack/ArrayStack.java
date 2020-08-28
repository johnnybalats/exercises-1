package exercises.on.arrays.collections.own.version.of.stack;

public class ArrayStack implements Stack {

    public static final int CAPACITY = 100;
    private int capacity;
    private Object[] Student;
    private char[] character;
    private int top = -1;

    public ArrayStack() {

        this(CAPACITY);
    }

    public ArrayStack(int capacity) {

        this.capacity = capacity;
        Student = new Object[capacity];
        character = new char[capacity];
    }

    @Override
    public int size() {
        return (top + 1);
    }

    @Override
    public boolean isEmpty() {

        if (top == -1)
            return true;
        else
            return false;
    }

    @Override
    public boolean isFull() {
        if (top == capacity)
            return true;
        else
            return false;
    }

    @Override
    public Object top() {
        if (isEmpty())
            System.out.println("Stack is empty!");
        return Student[top];
    }

    @Override
    public void push(Object item) {
        if (size() == capacity)
            System.out.println("Stack is full!");
        Student[++top] = item;
    }

    @Override
    public Object pop() {
        Object element;
        if (isEmpty())
            System.out.println("Stack is empty!");
        element = Student[top];
        Student[top--] = null;
        return element;
    }

    @Override
    public void pushChar(char item) {
        if (size() == capacity)
            System.out.println("Stack is full!");
        character[++top] = item;
    }

    @Override
    public char popChar() {
        char element;
        if (isEmpty())
            System.out.println("Stack is empty!");
        element = character[top--];
        return element;
    }
}
