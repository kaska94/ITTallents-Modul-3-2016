import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sizeOfFirst, sizeOfSecond;
		int[] arrFirst;
		int[] arrSecond;
		boolean areEqualSize = false;
		boolean areEqualElements = true;

		System.out.println("[First array] Enter size:");
		sizeOfFirst = sc.nextInt();
		if ((sizeOfFirst > 128) || (sizeOfFirst <= 0)) {
			System.out.println("Must be positive and bellow 128");
			return;
		}
		System.out.println("[Second array] Enter size:");
		sizeOfSecond = sc.nextInt();
		if ((sizeOfSecond > 128) || (sizeOfSecond <= 0)) {
			System.out.println("Must be positive and bellow 128");
			return;
		}

		// size check
		if (sizeOfFirst == sizeOfSecond) {
			areEqualSize = true;
		}

		// initialize arrays
		arrFirst = new int[sizeOfFirst];
		arrSecond = new int[sizeOfSecond];

		// Get arrays
		for (int index = 0; index < sizeOfFirst; index++) {
			System.out.println("[First array] Enter the " + index + " element(" + (sizeOfFirst - index) + ") left");
			arrFirst[index] = sc.nextInt();
		}

		for (int index = 0; index < sizeOfSecond; index++) {
			System.out.println("[Second array] Enter the " + index + " element(" + (sizeOfSecond - index) + ") left");
			arrSecond[index] = sc.nextInt();
		}

		// Check if the elements are equal
		for (int index = 0; index < sizeOfFirst; index++) {
			if ((arrFirst.length > index) && (arrSecond.length > index))
				if (arrFirst[index] != arrSecond[index]) {
					areEqualElements = false;
				}
		}

		if (areEqualSize) {
			if (areEqualElements) {
				System.out.println("They are Equal!");
			} else {
				System.out.println("They are not Equal!");
			}
		} else {
			if (areEqualElements) {
				System.out.println("Not equal, but elements from one of the arrays can be found in the other one");
			} else {
				System.out.println("They are not Equal!");
			}
		}

	}

}
