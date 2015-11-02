package by.epam.tat.module3.lecture1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ListSorting {

	private static void fillTheList(ArrayList<String> list) { // method for list
		// filling
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string:");
		String line = scanner.nextLine();
		list.add(line);

		System.out.println("Would you like to enter one more string? Y/N");
		String answer = scanner.nextLine();
		if (answer.toLowerCase().equals("y")) {
			fillTheList(list); // recursively call the method for list filling
		} else {
			return;
		}
	}

	private static void outputTheList(ArrayList<String> list) { // method for
																// array
		// output
		// in console
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
	}

	public static void sortByLength(ArrayList<String> list) { // method for
																// sorting
		// array elements by
		// length
		fillTheList(list);

		for (int j = 1; j < list.size(); j++) {

			for (int i = 0; i < list.size() - 1; i++) {
				if (list.get(i + 1).toString().length() > list.get(i)
						.toString().length()) {
					String prev = list.get(i).toString();
					list.set(i, list.get(i + 1));
					list.set(i + 1, prev);
				}
			}

		}
		outputTheList(list);
	}

	private static int countVowels(String line) { // method for counting vowels
		// in the line
		int vowels = 0;
		Pattern vowelPattern = Pattern.compile("[aeiouy]");
		Matcher vowelMatcher = vowelPattern.matcher(line);
		while (vowelMatcher.find()) {
			vowels++;
		}
		return vowels;
	}

	public static void sortArrayByVowels(ArrayList<String> list) { // method for
																	// sorting
		// array elements by
		// number of vowels
		fillTheList(list);

		for (int j = 1; j < list.size(); j++) {

			for (int i = 0; i < list.size() - 1; i++) {
				if (countVowels(list.get(i + 1).toString().toLowerCase()) > countVowels(list
						.get(i).toString().toLowerCase())) {
					String prev = list.get(i).toString();
					list.set(i, list.get(i + 1));
					list.set(i + 1, prev);
				}
			}

		}
		outputTheList(list);
	}
}
