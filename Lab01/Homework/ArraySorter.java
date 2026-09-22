package Lab01.Homework;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySorter {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter the number of elements: ");
		int size = keyboard.nextInt();

		if (size <= 0) {
			System.out.println("The array must contain at least one element.");
			keyboard.close();
			return;
		}

		int[] numbers = new int[size];
		int sum = 0;

		for (int index = 0; index < numbers.length; index++) {
			System.out.print("Enter element " + index + ": ");
			numbers[index] = keyboard.nextInt();
			sum += numbers[index];
		}

		Arrays.sort(numbers);
		double average = (double) sum / numbers.length;

		System.out.println("Sorted array: " + Arrays.toString(numbers));
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + average);

		keyboard.close();
	}
}
