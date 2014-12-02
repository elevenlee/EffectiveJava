package edu.nyu.cs.effectivejava.chapter6.item34;

/**
 * @author shenli
 * <p>
 * Emulated extensible enum using an interface.
 */
public interface Operation {
    double apply(double x, double y);
}
