package edu.nyu.cs.effectivejava.chapter10.item67;

/**
 * @author shenli
 * <p>
 * Set observer callback interface
 */
public interface SetObserver<E> {
    // Invoked when an element is added to the observable set
    void added(ObservableSet<E> set, E element);
}
