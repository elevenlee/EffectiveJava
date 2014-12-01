package edu.nyu.cs.effectivejava.chapter5.item28;

import java.util.Arrays;
import java.util.List;

/**
 * @author shenli
 * <p>
 * Private helper method for wildcard capture.
 */
public class Swap {
    
    public static void swap(List<?> list, int i, int j) {
        swapHelper(list, i, j);
    }
    
    // Private helper method for wildcard capture
    private static <E> void swapHelper(List<E> list, int i, int j) {
        list.set(i, list.set(j, list.get(i)));
    }

    public static void main(String[] args) {
        List<String> argList = Arrays.asList(args);
        // Swap the first and last argument and print the resulting list
        swap(argList, 0, argList.size() - 1);
        System.out.println(argList);
    }

}
