import java.util.Scanner;

public class Exercise11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int size = 7;
		int counter = 0;
		int[] arrayOfSevenElements = new int[size];

		for (int index = 0; index < arrayOfSevenElements.length; index++) {
			System.out.println("Enter the " + index + " element(" + (size - index) + ") left");
			arrayOfSevenElements[index] = sc.nextInt();
		}

		for (int index = 0; index < arrayOfSevenElements.length; index++) {
			if (((arrayOfSevenElements[index] % 5) == 0) && (arrayOfSevenElements[index] > 5)) {
				System.out.print(arrayOfSevenElements[index] + ", ");
				counter++;
			}
		}
		System.out.println("We found " + counter + " numbers bigger than 5 and multiples by 5");
	}

}
