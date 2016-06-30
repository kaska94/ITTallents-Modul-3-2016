import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the array");
		int size = sc.nextInt();

		if (size <= 0) {
			System.out.println("Size must be positive");
			return;
		}

		int[] arr = new int[size];
		int min = 0;

		for (int index = 0; index < size; index++) {
			System.out.println("Enter the " + index + " element(" + (size - index) + ") left");
			arr[index] = sc.nextInt();
		}

		for (int index = 0; index < size; index++) {
			if ((min > arr[index]) && ((arr[index] % 3) == 0)) {
				min = arr[index];
			}
		}
		System.out.println("Smallest is " + min);
	}

}
