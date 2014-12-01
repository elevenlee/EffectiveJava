package edu.nyu.cs.effectivejava.chapter5.item28;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author shenli
 * <p>
 * Using a recursive type bound with wildcards.
 */
public class RecursiveTypeBound {

    // Using a recursive type bound to express mutual comparability
    public static <T extends Comparable<? super T>> T max(List<? extends T> list) {
        if (list.size() == 0) {
            throw new IllegalArgumentException(list + ": empty");
        }
        Iterator<? extends T> iter = list.iterator();
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
