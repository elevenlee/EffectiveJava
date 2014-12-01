package edu.nyu.cs.effectivejava.chapter5.item27;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author shenli
 * <p>
 * Using a recursive type bound to express mutual comparability.
 */
public class RecursiveTypeBound {

    // Using a recursive type bound to express mutual comparability
    public static <T extends Comparable<T>> T max(List<T> list) {
        if (list.size() == 0) {
            throw new IllegalArgumentException(list + ": empty");
        }
        Iterator<T> iter = list.iterator();
        T result = iter.next();
        while (iter.hasNext()) {
            T t = iter.next();
            if (t.compareTo(result) > 0) {
                result = t;
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        List<String> argList = Arrays.asList(args);
        System.out.println(RecursiveTypeBound.max(argList));
    }

}
