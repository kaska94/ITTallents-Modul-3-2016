import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = 10;
		int[] arr = new int[size];
		int firstNumber;

		System.out.println("Enter the first number");
		firstNumber = sc.nextInt();

		for (int index = 0; index < arr.length; index++) {
			if (index == 0 || index == 1) {
				arr[index] = firstNumber;
			} else {
				arr[index] = arr[index - 1] + arr[index - 2];
			}
		}
		for (int index = 0; index < arr.length; index++) {
			System.out.print(arr[index] + " ");
		}
	}

}
