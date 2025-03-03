package com.jdc.ly;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

import com.jdc.ly.anno.AgeChecker;
import com.jdc.ly.anno.GradeAdder;
import com.jdc.ly.anno.MarkChecker;
import com.jdc.ly.anno.NameChecker;
import com.jdc.ly.anno.NameCheckers;
import com.jdc.ly.anno.ParentAnno;

@ParentAnno("StudentAnno Class")
public class StudentAnno {

	@NameChecker("William")
	@NameChecker("John")
	String name;
	int age;
	Grade[] grades;
	int mark;

	public StudentAnno(String name, @AgeChecker(age = 5) int age,int mark)
			throws NoSuchFieldException, SecurityException, NoSuchMethodException {
		this.name = checkName(name);
		this.age = checkAge(age);
		this.grades = addGrade();
		this.mark=addMark();
	}

	private String checkName(String name) throws NoSuchFieldException, SecurityException {
		Field f = StudentAnno.class.getDeclaredField("name");
		NameChecker checker = f.getDeclaredAnnotation(NameChecker.class);

		if (null != checker) {
			return checker.value();
		}
		return name;
	}
   @SuppressWarnings("rawtypes ")
	private int checkAge(int age) throws NoSuchFieldException, SecurityException, NoSuchMethodException {
		Constructor[] cons = StudentAnno.class.getConstructors();

		for (Constructor con : cons) {
			Parameter[] params = con.getParameters();
			for (Parameter p : params) {

				if (p.isAnnotationPresent(AgeChecker.class)) {
					AgeChecker checker = p.getAnnotation(AgeChecker.class);
					return checker.age();
				}
			}
		}

		return age;
	}

	@GradeAdder({ Grade.GradeA, Grade.GradeB })
	private Grade[] addGrade() throws NoSuchMethodException, SecurityException {
		Method m = StudentAnno.class.getDeclaredMethod("addGrade");
		GradeAdder adder = m.getAnnotation(GradeAdder.class);

		if (null != adder) {
			return adder.value();
		}
		return new Grade[0];
	}
	@MarkChecker(mark=60)
	private int addMark() throws NoSuchMethodException, SecurityException{
		Method m=StudentAnno.class.getDeclaredMethod("addMark");
		MarkChecker checker=m.getAnnotation(MarkChecker.class);
		if(null !=checker) {
			return checker.mark();
		}
		return 0;
	}

}