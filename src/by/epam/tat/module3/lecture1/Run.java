package by.epam.tat.module3.lecture1;

import java.util.ArrayList;
import java.util.Scanner;

public class Run {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("\nSelect preferable task from the list:");
		System.out.println("1" + "\nCalculator\n" + "2"
				+ "\nSort List By Length\n" + "3"
				+ "\nSort List By Number Of Vowels\n");
		String task = scanner.nextLine(); // user chooses the task

		switch (task) {
		case "1":
			Calculator.executeCalculation();
			break;
		case "2":
			ArrayList<String> list1 = new ArrayList<String>();
			ListSorting.sortByLength(list1);
			break;
		case "3":
			ArrayList<String> list2 = new ArrayList<String>();
			ListSorting.sortArrayByVowels(list2);
			break;
		default:
			System.out.println("Specified task is not valid!");
		}

		System.out.println("\nWould you like to run another task? Y/N"); // ask
																			// if
																			// user
																			// wants
																			// to
																			// perform
																			// onother
																			// operation
		String answer = scanner.nextLine().toLowerCase();
		if (answer.equals("y")) {
			main(args);
		} else {
			System.exit(0);
		}

	}

}
