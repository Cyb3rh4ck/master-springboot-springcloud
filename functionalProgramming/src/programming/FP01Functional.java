package programming;

import java.util.List;

public class FP01Functional {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
		
//		printAllNumbersInListFunctional(numbers);
		printEvenNumbersInListFunctional(numbers);

	}
	
//	private static void print(int number) {
//		System.out.println(number);
//	}
	
//	private static boolean isEven(int number) {
//		return number%2==0;
//	}

	private static void printAllNumbersInListFunctional(List<Integer> numbers) {
		//[12,9,13,4,6,2,4,12,15]
		// numbers.stream()
		//12
		//9
		//13
		//....
		
		//What to do
		numbers.stream()
			.forEach(System.out::print); //Method Reference
		
		//How to loop all the number?
//		for(int number : numbers) {
//			System.out.println(number);
//		}
	}
	
	private static void printEvenNumbersInListFunctional(List<Integer> numbers) {

		numbers.stream()
		//.filter(FP01Functional::isEven)  //Filter - Only Allow Even Numbers
		.filter(number -> number%2==0 )
		.forEach(System.out::println); //Method Reference

	}

}
