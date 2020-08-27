package exercises.on.arrays.collections.own.version.of.stack;

public class ArrayStack implements Stack {

    public static final int CAPACITY = 100;
    private int capacity;
    private Object[] Student;
    private int top = -1;

    public ArrayStack() {

        this(CAPACITY);
    }

    public ArrayStack(int capacity) {

        this.capacity = capacity;
        Student = new Object[capacity];
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
    public Object top() throws StackEmptyException {
        if (isEmpty()) throw new StackEmptyException("Stack is empty!");
        return Student[top];
    }

    @Override
    public void push(Object item) throws StackFullException {
        if (size() == capacity) throw new StackFullException("Stack is full!");
        Student[++top] = item;
    }

    @Override
    public Object pop() throws StackEmptyException {
        Object element;
        if (isEmpty())
            throw new StackEmptyException("Stack is empty!");
        element = Student[top];
        Student[top--] = null;
        return element;
    }
}
