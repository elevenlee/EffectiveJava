package edu.nyu.cs.effectivejava.chapter6.item34;

import java.util.Arrays;
import java.util.Collection;

public class OperationTest {

    // test parameter is a bounded type token
    private static <T extends Enum<T> & Operation> void test(
            Class<T> opSet, double x, double y) {
        for (Operation op : opSet.getEnumConstants())
            System.out.printf("%f %s %f = %f%n",
                    x, op, y, op.apply(x, y));
    }
    
    private static void test2(Collection<? extends Operation> opSet,
            double x, double y) {
        for (Operation op : opSet)
            System.out.printf("%f %s %f = %f%n",
                    x, op, y, op.apply(x, y));
    }
    
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        test(ExtendedOperation.class, x, y);
        System.out.println();
        test2(Arrays.asList(ExtendedOperation.values()), x, y);
    }

}
