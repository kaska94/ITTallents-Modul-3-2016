import java.util.Scanner;

public class Exercise8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sizeOfFirst;
		int[] arrFirst;
		int counter = 1;
		int max = 1;
		int endingIndexInSequence = 0;

		System.out.println("[First array] Enter size:");
		sizeOfFirst = sc.nextInt();
		if ((sizeOfFirst > 128) || (sizeOfFirst <= 0)) {
			System.out.println("Must be positive and bellow 128");
			return;
		}

		arrFirst = new int[sizeOfFirst];

		for (int index = 0; index < sizeOfFirst; index++) {
			System.out.println("Enter the " + index + " element(" + (sizeOfFirst - index) + ") left");
			arrFirst[index] = sc.nextInt();
		}

		for (int index = 1; index < sizeOfFirst; index++) {
			if (arrFirst[index] != arrFirst[index - 1]) {
				counter = 1;
				if (max < counter) {
					max = counter;
					endingIndexInSequence = index;
				}
			} else {
				counter++;
				if (max < counter) {
					max = counter;
					endingIndexInSequence = index;
				}
			}

		}
		System.out.println("The first sequence with " + max + " length is: ");
		for (int index = (endingIndexInSequence - max + 1); index < endingIndexInSequence + 1; index++) {
			System.out.print(arrFirst[index]);
		}

	}

}
