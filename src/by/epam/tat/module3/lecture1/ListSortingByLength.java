package by.epam.tat.module3.lecture1;

import java.util.ArrayList;
import java.util.Scanner;

public class ListSortingByLength {

	static ArrayList<String> list = new ArrayList<String>(); // create new list

	public static void fillTheList() { // method for list filling
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string:");
		String line = scanner.nextLine();
		list.add(line);

		System.out.println("Would you like to enter one more string? Y/N");
		String answer = scanner.nextLine();
		if (answer.toLowerCase().equals("y")) {
			fillTheList(); // recursively call the method for list filling
		} else {
			return;
		}
	}

	public static void sortArray(String[] arrayList) { // method for sorting
														// array elements by
														// length
		for (int j = 1; j < arrayList.length; j++) {

			for (int i = 0; i < arrayList.length - 1; i++) {
				if (arrayList[i + 1].length() > arrayList[i].length()) {
					String prev = arrayList[i];
					arrayList[i] = arrayList[i + 1];
					arrayList[i + 1] = prev;
				}
			}

		}
	}

	public static void outputArray(String[] array) { // method for array output
														// in console
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	public static void main(String[] args) {

		fillTheList(); // fill in the list
		String arrayList[] = list.toArray(new String[list.size()]); // transform
																	// input
																	// list into
																	// array
		sortArray(arrayList); // sort array by length asc
		outputArray(arrayList); // display sorted array

	}

}
