import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int average = 0;
		int sum = 0;
		int difference, tempDiffrence;
		int indexToRememeber = 0;
		int size = 7;
		
		int[] arrayOfSevenElements = new int[size];
		
		for (int index = 0; index < arrayOfSevenElements.length; index++) {
			System.out.println("Enter the " + index + " element(" + (size - index) + ") left");
			arrayOfSevenElements[index] = sc.nextInt();
		}

		for (int index = 0; index < arrayOfSevenElements.length; index++) {
			sum += arrayOfSevenElements[index];
		}

		average = (sum / (arrayOfSevenElements.length));

		difference = average - arrayOfSevenElements[0];
		difference = (difference < 0) ? -difference : difference;

		for (int index = 1; index < arrayOfSevenElements.length; index++) {
			tempDiffrence = average - arrayOfSevenElements[index];
			tempDiffrence = (tempDiffrence < 0) ? -tempDiffrence : tempDiffrence;
			if (tempDiffrence < difference) {
				difference = tempDiffrence;
				indexToRememeber = index;
			}
		}
		System.out.println(
				"Average is " + average + " Closest to the average and first apearing is " + arrayOfSevenElements[indexToRememeber]);

	}
}
