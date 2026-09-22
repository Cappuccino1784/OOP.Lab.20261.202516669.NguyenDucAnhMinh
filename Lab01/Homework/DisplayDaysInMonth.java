package Lab01.Homework;

import java.util.Scanner;

public class DisplayDaysInMonth {
	private static final String[] MONTH_NAMES = {
		"january", "february", "march", "april", "may", "june",
		"july", "august", "september", "october", "november", "december"
	};

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int month;
		int year;

		while (true) {
			System.out.print("Enter a month (name, abbreviation, or number): ");
			String monthInput = keyboard.nextLine().trim().toLowerCase();
			month = getMonthNumber(monthInput);

			System.out.print("Enter a non-negative year: ");
			String yearInput = keyboard.nextLine().trim();

			if (month != -1 && yearInput.matches("\\d+")) {
				try {
					year = Integer.parseInt(yearInput);
					break;
				} catch (NumberFormatException exception) {
				}
			}

			System.out.println("Invalid month or year. Please enter them again.\n");
		}

		int days = getDaysInMonth(month, year);
		System.out.println(MONTH_NAMES[month - 1] + " " + year + " has " + days + " days.");
		keyboard.close();
	}

	private static int getMonthNumber(String input) {
		if (input.matches("\\d+")) {
			try {
				int month = Integer.parseInt(input);
				return month >= 1 && month <= 12 ? month : -1;
			} catch (NumberFormatException exception) {
				return -1;
			}
		}

		String normalized = input.replace(".", "");
		for (int index = 0; index < MONTH_NAMES.length; index++) {
			String monthName = MONTH_NAMES[index];
			if (normalized.equals(monthName) || normalized.equals(monthName.substring(0, 3))) {
				return index + 1;
			}
		}
		return -1;
	}

	private static int getDaysInMonth(int month, int year) {
		if (month == 2) {
			return isLeapYear(year) ? 29 : 28;
		}
		return (month == 4 || month == 6 || month == 9 || month == 11) ? 30 : 31;
	}

	private static boolean isLeapYear(int year) {
		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	}
}
