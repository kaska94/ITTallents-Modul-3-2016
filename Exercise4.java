import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		/*
		 * I didnt know if the size of the array is even number, the array can
		 * be still a mirroed one so in this task i assumed that: 1 2 3 2 1 is
		 * mirrrored 1 2 2 1 is mirroed too
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array");

		int size = sc.nextInt();
		if (size <= 0) {
			System.out.println("Size must be positive");
			return;
		}

		int[] arr = new int[size];
		boolean isMirroredArray = true;

		for (int index = 0; index < size; index++) {
			System.out.println("Enter the " + index + " element(" + (size - index) + ") left");
			arr[index] = sc.nextInt();
		}

		int indexFromStart = 0, indexFromEnd = size - 1;

		for (; indexFromStart < size; indexFromStart++, indexFromEnd--) {
			if (arr[indexFromStart] != arr[indexFromEnd]) {
				isMirroredArray = false;
			}
		}
		if (isMirroredArray) {
			System.out.println("Mirrored");
		} else {
			System.out.println("Not Mirrored");
		}
	}

}
