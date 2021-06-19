package com.comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ComparbleDemo {

	public static void main(String[] args) {
	
		List<Student> sList=new ArrayList<Student>();
		
		sList.add(new Student(2, "b"));
		sList.add(new Student(3, "c"));
		sList.add(new Student(4, "d"));
		sList.add(new Student(1, "a"));
		sList.add(new Student(1, "aa"));
		
	Collections.sort(sList);
		
		sList.forEach(System.out::println);
		
		
	}

}
