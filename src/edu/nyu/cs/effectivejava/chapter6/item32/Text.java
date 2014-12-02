package edu.nyu.cs.effectivejava.chapter6.item32;

import java.util.EnumSet;
import java.util.Set;

/**
 * @author shenli
 * <p>
 * EnumSet -- a modern replacement for bit fields.
 */
public class Text {
    public enum Style { BOLD, ITALIC, UNDERLINE, STRIKETHROUGH }
    
    // Any Set could be passed in, but EnumSet is clearly best
    public void applyStyles(Set<Style> styles) {
        // Body goes here
    }
    
    public static void main(String[] args) {
        Text text = new Text();
        text.applyStyles(EnumSet.of(Style.BOLD, Style.ITALIC));
    }

}
