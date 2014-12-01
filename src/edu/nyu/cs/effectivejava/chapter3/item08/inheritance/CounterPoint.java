package edu.nyu.cs.effectivejava.chapter3.item08.inheritance;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author shenli
 * <p>
 * Trivial subclass of Point - doesn't add a value component.
 */
public class CounterPoint extends Point {
    private static final AtomicInteger COUNTER = new AtomicInteger();
    
    public CounterPoint(int x, int y) {
        super(x, y);
        COUNTER.incrementAndGet();
    }
    
    public int numberCreated() {
        return COUNTER.get();
    }

}
