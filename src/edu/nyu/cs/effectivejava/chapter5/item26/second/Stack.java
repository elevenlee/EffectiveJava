package edu.nyu.cs.effectivejava.chapter5.item26.second;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * @author shenli
 * <p>
 * Initial attempt to generify Stack -- won't compile!
 */
public class Stack<E> {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;
    
    public Stack() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }
    
    public void push(E e) {
        ensureCapacity();
        elements[size++] = e;
    }
    
    // Appropriate suppression of unchecked warning
    public E pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        // push requires elements to be of type E, so cast is correct
        @SuppressWarnings("unchecked")
        E result = (E) elements[--size];
        elements[size] = null;  // Eliminate obsolete reference
        return result;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    /**
     * Ensure space for at least one more element, roughly doubling the capacity each time the array needs to grow.
     */
    private void ensureCapacity() {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }
    
    // Little program to exercise our generic Stack
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        for (String arg : args) {
            stack.push(arg);
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop().toUpperCase());
        }
    }
    
}
