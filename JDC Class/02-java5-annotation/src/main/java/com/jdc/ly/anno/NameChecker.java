package com.jdc.ly;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//‌place to write
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface NameChecker {
//no arguments and must be return 
	String value() default "No Name";
//	int age();
	
}
