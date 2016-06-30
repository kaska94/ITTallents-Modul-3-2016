import java.util.Scanner;

public class Exercise13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number, counter = 0;
		int size = 128;
		int[] arrayOfBites = new int[size];

		System.out.println("Enter positive number");
		number = sc.nextInt();

		for (int index = 0; index < arrayOfBites.length; index++) {
			arrayOfBites[index] = -1;
		}
		
		if (number < 0) {
			System.out.println("Not a positive number");
			return;
		}
		
		while (number >= 1) {
			arrayOfBites[counter] = number % 2;
			number = number / 2;
			counter++;
		}

		System.out.print("The number in binary is: ");
		for (int index = arrayOfBites.length - 1; index >= 0; index--) {
			if (arrayOfBites[index] != -1) {
				System.out.print(arrayOfBites[index]);
			}
		}
	}
}
