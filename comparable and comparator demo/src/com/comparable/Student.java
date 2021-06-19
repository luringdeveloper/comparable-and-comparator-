package com.comparable;

public class Student implements Comparable<Student> {
	private Integer marks;
	private String name;

	public Student(Integer marks, String name) {
		super();
		this.marks = marks;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [marks=" + marks + ", name=" + name + "]";
	}

	public Integer getMarks() {
		return marks;
	}

	public void setMarks(Integer marks) {
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Student o) {
		if (this.marks>o.marks) {
			return 1;
		}
		else if (this.marks<o.marks) {
			return -1;
		}
		return this.name.compareTo(o.name);
	}
	
	
}
