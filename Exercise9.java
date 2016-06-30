import java.util.Scanner;

public class Exercise9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sizeOfFirst;
		int[] arrFirst, arrSecond;
		int temp;

		System.out.println("[First array] Enter size:");
		sizeOfFirst = sc.nextInt();
		if ((sizeOfFirst > 128) || (sizeOfFirst <= 0)) {
			System.out.println("Must be positive and bellow 128");
			return;
		}

		arrFirst = new int[sizeOfFirst];
		arrSecond = new int[sizeOfFirst];

		for (int index = 0; index < sizeOfFirst; index++) {
			System.out.println("Enter the " + index + " element(" + (sizeOfFirst - index) + ") left");
			arrFirst[index] = sc.nextInt();
		}

		int indexFromStart = 0;
		int indexFromEnd = arrFirst.length - 1;

		System.out.println("Reversing ...");
		for (; indexFromStart < indexFromEnd; indexFromStart++, indexFromEnd--) {
			temp = arrFirst[indexFromEnd];
			arrFirst[indexFromEnd] = arrFirst[indexFromStart];
			arrFirst[indexFromStart] = temp;
		}

		for (int index = 0; index < arrFirst.length; index++) {
			System.out.print(arrFirst[index] + " ");
		}

		System.out.println("\nReversing again ...");

		indexFromStart = 0;
		indexFromEnd = arrFirst.length - 1;
		for (; indexFromStart < arrFirst.length; indexFromStart++, indexFromEnd--) {
			arrSecond[indexFromStart] = arrFirst[indexFromEnd];
		}
		
		for (int index = 0; index < arrSecond.length; index++) {
			System.out.print(arrSecond[index] + " ");
		}
	}

}
