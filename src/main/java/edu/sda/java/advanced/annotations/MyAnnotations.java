package edu.sda.java.advanced.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * We create it by adding @ before keyword interface
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD) // What do You appply this anotation to
public @interface MyAnnotations {
    String value();
    String name();

}
