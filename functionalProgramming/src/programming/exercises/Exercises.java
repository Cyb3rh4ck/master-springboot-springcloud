package programming.exercises;

import java.util.List;

public class Exercises {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
		List<String> courses = List.of("Spring","Spring Boot","API","Microservices","AWS");
		printOddNumber(numbers);
		printAllCourses(courses);
		printCoursesContainSpring(courses);
		printCoursesAtLeast4Letters(courses);

	}
	//Print Courses Whose Name has atleast 4 letters
	private static void printCoursesAtLeast4Letters(List<String> courses) {
		courses.stream() //convert to stream
			.filter(course -> course.length()>=4) //lambda expresion
			.forEach(System.out::println); //Method reference
	}

	//Print All courses containing the word "Spring"
	private static void printCoursesContainSpring(List<String> courses) {
		courses.stream()  //convert to stream
			.filter(course -> course.contains("Spring")) // lambda expresion
			.forEach(System.out::println); //Method reference
	}

	//Print All courses individually
	private static void printAllCourses(List<String> courses) {
		
		courses.stream() //convert to stream
			.forEach(System.out::println); //Method reference
		
	}

	//Print Only Odd Numbers from the List
	private static void printOddNumber(List<Integer> numbers) {
		
		numbers.stream() //convert to stream
			.filter(number -> number%2 != 0 )  //lambda expresion
			.forEach(System.out::println);  //Method reference
		
	}
	
	

}
