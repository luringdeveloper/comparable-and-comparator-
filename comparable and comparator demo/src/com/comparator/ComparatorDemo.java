package com.comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

	public static void main(String[] args) {
	
		List<Student> sList=new ArrayList<Student>();
		
		sList.add(new Student(2, "b"));
		sList.add(new Student(3, "c"));
		sList.add(new Student(4, "d"));
		sList.add(new Student(1, "a"));
		sList.add(new Student(1, "aa"));
		
//	Collections.sort(sList,new Comparator<Student>() {
//		@Override
//		public int compare(Student o1, Student o2) {
//			// TODO Auto-generated method stub
//		if (o1.getName().equals(o2.getName())) {
//			return o1.getMarks()-o2.getMarks();
//		}
//		else {
//			return o1.getName().compareTo(o2.getName());
//		}
//		}
//	});
		
//		Collections.sort(sList,(o1,o2)-> {
//			
//			if (o1.getName().equals(o2.getName())) {
//				return o1.getMarks()-o2.getMarks();
//			}
//			else {
//				return o1.getName().compareTo(o2.getName());
//			}
//			
//		});
//			
		
		//Collections.sort(sList, Comparator.comparing(Student::getName).thenComparing(Student::getMarks));
		Collections.sort(sList, Comparator.comparing(Student::getName).reversed().thenComparing(Student::getMarks));
		
	sList.stream().forEach(x->System.out.println(x.getName()+"\t"+x.getMarks()));
		//sList.forEach(System.out::println);
		
		
	}

}
