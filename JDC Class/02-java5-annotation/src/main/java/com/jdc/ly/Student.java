package com.jdc.ly;

import com.jdc.ly.anno.ParentAnno;

public class Student extends StudentAnno {

	public Student(String name, int age,int mark) throws NoSuchFieldException, NoSuchMethodException, SecurityException {
		super(name,age,mark);
		
	}

	public Grade[] getGrade() throws NoSuchMethodException, SecurityException {
		
		return grades;
	}

	public int getMark() {
		return mark;
	}
	public String getName() throws NoSuchFieldException {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getClassName() {
		ParentAnno anno=Student.class.getAnnotation(ParentAnno.class);
		if(null !=anno) {
			return anno.value();
		}
		return null;
	}
}
