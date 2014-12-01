package edu.nyu.cs.effectivejava.chapter5.item29;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;

/**
 * @author shenli
 * <p>
 * Use of asSubclass to safely cast to a bounded type token.
 */
public class PrintAnnotation {

    // Use of asSubclass to safely cast to a bounded type token
    static Annotation getAnnotation(AnnotatedElement element, String annotationTypeName) {
        Class<?> annotationType = null;     // Unbounded type token
        try {
            annotationType = Class.forName(annotationTypeName);
        } catch (Exception ex) {
            throw new IllegalArgumentException(ex);
        }
        return element.getAnnotation(
                annotationType.asSubclass(Annotation.class));
    }
    
    public static void main(String[] args) throws ClassNotFoundException {
        if (args.length != 2) {
            System.out.println("Usage: java PrintAnnotation <class> <annotation>");
            System.exit(1);
        }
        
        String className = args[0];
        String annotationTypeName = args[1];
        Class<?> klass = Class.forName(className);
        System.out.println(getAnnotation(klass, annotationTypeName));
    }

}
