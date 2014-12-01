package edu.nyu.cs.effectivejava.chapter4.item18;

import java.util.AbstractList;
import java.util.Collections;
import java.util.List;

/**
 * @author shenli
 * <p>
 * Concrete implementation built atop skeletal implementation.
 */
public class IntArrays {
    
    static List<Integer> intArrayAsList(final int[] a) {
        if (a == null) {
            throw new NullPointerException();
        }
        
        return new AbstractList<Integer>() {

            @Override
            public Integer get(int i) {
                return a[i];    // Autoboxing
            }

            @Override
            public int size() {
                return a.length;
            }
            
            @Override
            public Integer set(int i, Integer val) {
                int oldVal = a[i];
                a[i] = val;     // Auto-boxing
                return oldVal;  // Autoboxing
            }
            
        };
    }
    
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }
        List<Integer> list = intArrayAsList(a);

        Collections.shuffle(list);
        System.out.println(list);
    }

}
