package com.git.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiSortExample {

	public static void main(String[] args) {
		// creating List
		List<Student> students=fetchStudents();
		List<Student> sortedStudents=students;

		sortedStudents.forEach(System.out::println);
		
		//using java 7 		//sorting by name if name are same then by age
		Collections.sort(students, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getName().equals(o2.getName())? o1.getAge().compareTo(o2.getAge())
						:o1.getName().compareTo(o2.getName());
			}
		});
		
		
		//using java 8 //sorting by name if name are same then by age
		sortedStudents=students.stream().sorted((s1,s2)->
			 s1.getName().equals(s2.getName())?s1.getAge()-s2.getAge():
				 s1.getName().compareTo(s2.getName())
		).collect(Collectors.toList());
		
		//using java 8 Comparator.comparing() method //sorting by name if name are same then by age
		sortedStudents=students.stream().sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList());
		
		System.out.println("-------After Sorting-------");
		sortedStudents.forEach(System.out::println);

	}
	
	
	
	public static List<Student> fetchStudents(){		
		List<Student> students=new ArrayList<>();
		students.add(new Student("ATest", 29));
		students.add(new Student("ETest", 21));
		students.add(new Student("BTest", 13));
		students.add(new Student("DTest", 24));
		students.add(new Student("XTest", 46));
		students.add(new Student("BTest", 12));		
		return students;
	}

}

class Student {
	private String name;
	private Integer age;	
	
	public Student(String name, Integer age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() { return name;}
	public void setName(String name) {this.name = name;}
	
	public Integer getAge() {return age;}
	public void setAge(Integer age) {this.age = age;}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";}
}

