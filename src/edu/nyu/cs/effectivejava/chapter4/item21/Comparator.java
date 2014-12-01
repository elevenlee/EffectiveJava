package edu.nyu.cs.effectivejava.chapter4.item21;

/**
 * @author shenli
 * <p>
 * Strategy interface.
 */
public interface Comparator<T> {
    public int compare(T t1, T t2);
}
