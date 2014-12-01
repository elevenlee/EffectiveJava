package edu.nyu.cs.effectivejava.chapter5.item28;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author shenli
 * <p>
 * List-based generic reduction with wildcard type.
 */
public class Reduction {
    private static final Function<Number> MAX = new Function<Number>() {

        @Override
        public Number apply(Number arg1, Number arg2) {
            return Double.compare(arg1.doubleValue(), arg2.doubleValue()) > 0 ? arg1 : arg2;
        }
        
    };
    
    // Wildcard type for parameter that serves as an E producer
    static <E> E reduce(List<? extends E> list, Function<E> f, E initVal) {
        List<E> snapshot;
        synchronized(list) {
            snapshot = new ArrayList<E>(list);
        }
        E result = initVal;
        for (E e : snapshot) {
            result = f.apply(result, e);
        }
        return result;
    }
    
    public static void main(String[] args) {
        // We can use a Number function to reduce a list of Integer or Double
        List<Integer> intList = Arrays.asList(2, 7, 1, 8, 2, 8, 1, 8, 2, 8);
        System.out.println(reduce(intList, MAX, Integer.MIN_VALUE));
        
        List<Double> doubleList = Arrays.asList(2.718281828,
                3.141592654, 1.61803399);
        
        System.out.println(reduce(doubleList, MAX, Double.NEGATIVE_INFINITY));
    }

}
