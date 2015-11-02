package by.epam.tat.module3.lecture1;

import java.util.Scanner;

public class Calculator {

	private static float sum(float x, float y) { // operation of sum
		return x + y;
	}

	private static float min(float x, float y) { // operation of minus
		return x - y;
	}

	private static float mult(float x, float y) { // operation of multiplication
		return x * y;
	}

	private static float div(float x, float y) {// operation of division
		if (y == 0){
			System.out.println("It's forbidden to divide into 0!");
			return 0;
		}
		return x / y;
	}

	private static void select_and_calculate(float a, float b) { // method of
																	// operator
																	// selection
																	// that
																	// calls
																	// one of
																	// the
																	// above
																	// method
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nSelect preferable operation from the list:");
		System.out.println("-Sum" + "\n" + "-Min" + "\n" + "-Mult" + "\n"
				+ "-Div" + "\n");
		String oper = scanner.nextLine(); // user chooses the operation
		float result = 0;

		switch (oper.toLowerCase()) {
		case "sum":
			result = sum(a, b);
			break;
		case "min":
			result = min(a, b);
			break;
		case "mult":
			result = mult(a, b);
			break;
		case "div":
			result = div(a, b);
			break;
		default:
			System.out.println("Specified operation is not valid!");
		}

		System.out.println("\nResult is:");
		System.out.println(result);
	}

	public static void executeCalculation() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("\nEnter value for a:");
		String a = scanner.nextLine(); // enter the first number

		System.out.println("\nEnter value for b:");
		String b = scanner.nextLine(); // enter the second number

		float x = Float.parseFloat(a); // parse entered string values to float
										// data type
		float y = Float.parseFloat(b);

		select_and_calculate(x, y); // call the method for operator selection
									// and calculation

		System.out.println("\nWould you like to continue? Y/N");
		String answer = scanner.nextLine().toLowerCase();
		if (answer.equals("y")) {
			executeCalculation(); // call main function recursively if user
									// wants to
			// continue with calculation
		}
	}

}
