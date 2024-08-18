package stream;

import java.util.*;
import java.util.stream.Collectors;

public class StudentStreamExample {
	
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
			    new Student(1, "Rohit", "Mall", 30, "Male", "Mechanical Engineering", 2015, "Mumbai", 122),
			    new Student(2, "Pulkit", "Singh", 56, "Male", "Computer Engineering", 2018, "Delhi", 67),
			    new Student(3, "Ankit", "Patil", 25, "Female", "Mechanical Engineering", 2019, "Kerala", 164),
			    new Student(4, "Satish Ray", "Malaghan", 30, "Male", "Mechanical Engineering", 2014, "Kerala", 26),
			    new Student(5, "Roshan", "Mukd", 23, "Male", "Biotech Engineering", 2022, "Mumbai", 12),
			    new Student(6, "Chetan", "Star", 24, "Male", "Mechanical Engineering", 2023, "Karnataka", 90),
			    new Student(7, "Arun", "Vittal", 26, "Male", "Electronics Engineering", 2014, "Karnataka", 324),
			    new Student(8, "Nam", "Dev", 31, "Male", "Computer Engineering", 2014, "Karnataka", 433),
			    new Student(9, "Sonu", "Shankar", 27, "Female", "Computer Engineering", 2018, "Karnataka", 7),
			    new Student(10, "Shubham", "Pandey", 26, "Male", "Instrumentation Engineering", 2017, "Mumbai", 98));

		//using java 7 		//sorting by name if name are same then by age
		Collections.sort(list, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getFirstName().equals(o2.getFirstName())? o1.getAge().compareTo(o2.getAge())
						:o1.getFirstName().compareTo(o2.getFirstName());
			}
		});


		//using java 8 //sorting by name if name are same then by age
//		list.stream().sorted((s1,s2)->
//				s1.getFirstName().equals(s2.getFirstName())?s1.getAge()-s2.getAge():
//						s1.getFirstName().compareTo(s2.getFirstName())
//		).collect(Collectors.toList());

		//using java 8 Comparator.comparing() method //sorting by name if name are same then by age
//		list=list.stream().sorted(Comparator.comparing(Student::getFirstName)).collect(Collectors.toList());

		System.out.println("-------After Sorting-------");
		list.forEach(System.out::println);

//		Find list of students whose first name starts with alphabet A
		
		List<Student> studentsNamewithA = list.stream().filter(name -> name.getFirstName().startsWith("A"))
				.collect(Collectors.toList());
		System.out.println(" list of students whose first name starts with alphabet A\n"+studentsNamewithA);
		
		
//		Group The Student By Department Names
		
		Map<String, List<Student>> studentMap=list.stream().collect(Collectors.groupingBy(st->st.getDepartmantName()));
		System.out.println(studentMap);
		
		
		
//		 Find the count of student in each department
		
		Map<String, Long> countStudentIneachDepartment = list.stream()
				.collect(Collectors.groupingBy(dt -> dt.getDepartmantName(), Collectors.counting()));
	}

}
