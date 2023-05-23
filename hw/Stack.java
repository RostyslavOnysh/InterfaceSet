package hw;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack<T> {
    private static final int CAPACITY = 10;
    private T[] element;
    private int top;

    public Stack() {
        element = (T[]) new Object[CAPACITY];
        top = -1;
    }

    public void push(T value) {
        if (top == element.length - 1) {
            expandCapacity();
        }
        element[++top] = value;
    }


    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return element[top];
    }

    private boolean isEmpty() {
        return top == -1;
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T item = element[top];
        element[top--] = null;
        return item;
    }

    public int size() {
        return top + 1;
    }

    private void expandCapacity() {
        int newCapacity = element.length * 2;
        element = Arrays.copyOf(element, newCapacity);
    }
}

