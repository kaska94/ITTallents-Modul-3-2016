import java.util.Scanner;

public class Exercise12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int size = 7;
		int[] arrayOfSevenElements = new int[size];

		for (int index = 0; index < arrayOfSevenElements.length; index++) {
			System.out.println("Enter the " + index + " element(" + (size - index) + ") left");
			arrayOfSevenElements[index] = sc.nextInt();
		}
		
		for (int index = 0; index < arrayOfSevenElements.length; index++) {
			System.out.print(arrayOfSevenElements[index] + " ");
		}
		
		for (int index = 0; index < arrayOfSevenElements.length; index++) {
			switch (index) {
			case 0:
				int temp = arrayOfSevenElements[index];
				arrayOfSevenElements[index] = arrayOfSevenElements[index + 1];
				arrayOfSevenElements[index + 1] = temp;
				break;
			case 2:
				arrayOfSevenElements[index] = arrayOfSevenElements[index] + arrayOfSevenElements[index + 1];
				arrayOfSevenElements[index + 1] = arrayOfSevenElements[index] - arrayOfSevenElements[index + 1];
				arrayOfSevenElements[index] = arrayOfSevenElements[index] - arrayOfSevenElements[index + 1];
				break;
			case 4:
				arrayOfSevenElements[index] = arrayOfSevenElements[index] * arrayOfSevenElements[index + 1];
				arrayOfSevenElements[index + 1] = arrayOfSevenElements[index] / arrayOfSevenElements[index + 1];
				arrayOfSevenElements[index] = arrayOfSevenElements[index] / arrayOfSevenElements[index + 1];
				break;
			}
		}
		System.out.println();
		for (int index = 0; index < arrayOfSevenElements.length; index++) {
			System.out.print(arrayOfSevenElements[index] + " ");
		}
	}

}
