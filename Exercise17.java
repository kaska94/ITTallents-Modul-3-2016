import java.util.Scanner;

public class Exercise17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean isZigZagged = true;

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
		int[] arrayOfInt = new int[size];

		for (int index = 0; index < arrayOfInt.length; index++) {
			System.out.println("Enter number: ");
			arrayOfInt[index] = sc.nextInt();
		}
		for (int index = 1; index < arrayOfInt.length - 1; index++) {
			if (index % 2 == 1) {
				if (!((arrayOfInt[index] > arrayOfInt[index - 1]) && (arrayOfInt[index] > arrayOfInt[index + 1]))) {
					isZigZagged = false;
				}
			}
		}

		if (isZigZagged) {
			System.out.println("Arrays is zigzaged from button to top");
		} else {
			System.out.println("Arrays is not zigzaged from button to top");
		}

	}

}
