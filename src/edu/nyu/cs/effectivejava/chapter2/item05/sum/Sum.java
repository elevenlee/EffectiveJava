package edu.nyu.cs.effectivejava.chapter2.item05.sum;

/**
 * @author shenli
 * <p>
 * Hideously slow program! Can you spot the object creation?
 */
public class Sum {

    public static void main(String[] args) {
        Long sum = 0L;
        for (long i = 0; i <= Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

}
