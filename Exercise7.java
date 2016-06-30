import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sizeOfFirst;
		int[] arrFirst;
		int[] arrSecond;

		System.out.println("[First array] Enter size:");
		sizeOfFirst = sc.nextInt();
		if (sizeOfFirst > 128) {
			System.out.println("Must be positive and bellow 128");
			return;
		}

		arrFirst = new int[sizeOfFirst];
		arrSecond = new int[sizeOfFirst];

		for (int index = 0; index < sizeOfFirst; index++) {
			System.out.println("Enter the " + index + " element(" + (sizeOfFirst - index) + ") left");
			arrFirst[index] = sc.nextInt();
		}

		for (int index = 0; index < arrFirst.length; index++) {
			if ((index == 0) || (index == (arrFirst.length - 1))) {
				arrSecond[index] = arrFirst[index];
			} else {
				arrSecond[index] = arrFirst[index - 1] + arrFirst[index + 1];
			}
		}
		for (int index = 0; index < arrSecond.length; index++) {
			System.out.print(arrSecond[index] + " ");
		}
	}

}
