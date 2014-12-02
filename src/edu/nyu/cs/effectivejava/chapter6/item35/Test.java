package edu.nyu.cs.effectivejava.chapter6.item35;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author shenli
 * <p>
 * Marker annotation type declaration. Indicates that the annotated method is a test method. Use only on 
 * parameterless static methods.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Test {

}
