package com.jdc.ly.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//‌place to write
@Repeatable(NameCheckers.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface NameChecker {
//no arguments and must be return 
	String value() default "No Name";

	
}
