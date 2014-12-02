package edu.nyu.cs.effectivejava.chapter7.item43;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Cheese {}

public class ReturnEmptyCollections {

    private final List<Cheese> cheesesInStock = new ArrayList<Cheese>();
    
    /**
     * @return an array containing all of the cheeses in the shop, or null if no cheeses are available for purchase.
     */
//  public Cheese[] getCheeses() {
//      if (cheesesInStock.size() == 0)
//          return null;
//      return (Cheese[]) cheesesInStock.toArray();
//  }
    
    // The right way to return an array from a collection
    private static final Cheese[] EMPTY_CHEESE_ARRAY = new Cheese[0];
    
    /**
     * @return an array containing all of the cheeses in the shop
     */
    public Cheese[] getCheeses() {
        return cheesesInStock.toArray(EMPTY_CHEESE_ARRAY);
    }
    
    // The right way to return a copy of a collection
    public List<Cheese> getCheeseList() {
        if (cheesesInStock.isEmpty()) {
            return Collections.emptyList(); // Always returns same list
        } else {
            return new ArrayList<Cheese>(cheesesInStock);
        }
    }
    
}
