package exercises.on.arrays.collections.own.version.of.stack;

public interface Stack {

    // Returns the size of the Stack
    int size();

    // Returns true if the Stack is empty
    boolean isEmpty();

    // Returns true if the Stack is full
    boolean isFull();

    // Returns the top item of the Stack
    Object top() throws StackEmptyException;

    // Adds an new item into the Stack
    void push(Object item) throws StackFullException;

    // Removes the top item of the Stack
    Object pop() throws StackEmptyException;
}
