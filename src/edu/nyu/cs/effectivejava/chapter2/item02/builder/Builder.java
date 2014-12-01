package edu.nyu.cs.effectivejava.chapter2.item02.builder;

/**
 * @author shenli
 * <p>
 * A builder for objects of type T.
 */
public interface Builder<T> {
    public T build();
}
