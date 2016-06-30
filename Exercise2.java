
public class Exercise2 {

	public static void main(String[] args) {
		int size = 12;
		int[] array = new int[size];
		int[] arrayCreatedFromTheOldArray = new int[size];
		int counter = 0;

		for (int index = 0; index < array.length; index++) {
			array[index] = index;
		}

		/*
		 * Or for (int index = 0; index < array.length; index++) {
		 * System.out.println("Enter the " + index + " element(" + (size -index)
		 * + ") left"); arr[index] = sc.nextInt(); }
		 */

		for (int index = 0; index < array.length; index++) {
			System.out.print(array[index] + " ");
		}

		for (int index = 0; index < array.length; index++) {
			if (index < (size / 2)) {
				arrayCreatedFromTheOldArray[index] = array[index];
			} else {
				arrayCreatedFromTheOldArray[index] = array[(size - 1) - counter];
				counter++;
			}
		}
		System.out.println("\nAfter the magic is done");
		for (int index = 0; index < array.length; index++) {
			System.out.print(arrayCreatedFromTheOldArray[index] + " ");
		}

	}

}
