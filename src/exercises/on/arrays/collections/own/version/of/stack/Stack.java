package exercises.on.arrays.collections.own.version.of.stack;

public interface Stack {

    // Returns the size of the Stack
    int size();

    // Returns true if the Stack is empty
    boolean isEmpty();

    // Returns true if the Stack is full
    boolean isFull();

    // Returns the top item of the Stack
    Object top();

    // Adds an new item into the Stack
    void push(Object item);

    // Removes the top item of the Stack
    Object pop();

    // Add a new char into the Stack
    void pushChar(char item);

    // Removes a char from the top of the Stack
    char popChar();
}
