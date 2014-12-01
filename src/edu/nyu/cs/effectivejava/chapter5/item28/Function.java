package edu.nyu.cs.effectivejava.chapter5.item28;

/**
 * @author shenli
 * <p>
 * Generic Function interface.
 */
interface Function<T> {
    T apply(T arg1, T arg2);
}
