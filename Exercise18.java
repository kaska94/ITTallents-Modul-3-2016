import java.util.Scanner;

public class Exercise18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size");
		int size = sc.nextInt();

		if (size < 0 || size > 128) {
			System.out.println("Put smaller and positive size of array");
			return;
		}
		if ((size > 0) && (size < 3)) {
			System.out.println("Array is to short! Try with size above 3.");
			return;
		}

		int[] arrayFirst = new int[size];
		int[] arraySecond = new int[size];
		int[] arrayResult = new int[size];

		for (int index = 0; index < arrayFirst.length; index++) {
			System.out.println("Enter number: [First array]");
			arrayFirst[index] = sc.nextInt();
		}

		for (int index = 0; index < arrayFirst.length; index++) {
			System.out.println("Enter number: [Second array]");
			arraySecond[index] = sc.nextInt();
		}

		for (int index = 0; index < arrayFirst.length; index++) {
			if (arrayFirst[index] == arraySecond[index]) {
				arrayResult[index] = arrayFirst[index];
			} else {
				if (arrayFirst[index] > arraySecond[index]) {
					arrayResult[index] = arrayFirst[index];
				} else {
					arrayResult[index] = arraySecond[index];
				}
			}
		}

		System.out.println("\nFirst");
		for (int index = 0; index < arrayFirst.length; index++) {
			System.out.print(arrayFirst[index] + " ");
		}
		System.out.println("\nSecond");
		for (int index = 0; index < arraySecond.length; index++) {
			System.out.print(arraySecond[index]+ " ");
		}

		System.out.println("\nResult");
		for (int index = 0; index < arrayResult.length; index++) {
			System.out.print(arrayResult[index] +" ");
		}
	}

}
