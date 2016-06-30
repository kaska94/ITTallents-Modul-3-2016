import java.util.Scanner;

public class Exercise15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float sum = 0;
		float[] arrayOfHightest = new float[3];

		System.out.println("Enter size");
		int size = sc.nextInt();

		if (size < 0 || size > 128) {
			System.out.println("Put smaller and positive size of array");
			return;
		}

		float[] arrayOfFloats = new float[size];

		for (int index = 0; index < arrayOfFloats.length; index++) {
			System.out.println("Enter the " + index + " element(" + (size - index) + ") left");
			arrayOfFloats[index] = sc.nextFloat();
		}

		for (int index = 0; index < arrayOfFloats.length; index++) {
			if (arrayOfFloats[index] > 0) {
				arrayOfFloats[index] = arrayOfFloats[index];
			} else {
				arrayOfFloats[index] = -arrayOfFloats[index];
			}
		}

		for (int index = 0; index < arrayOfFloats.length; index++) {
			if (arrayOfFloats[index] > arrayOfHightest[0]) {
				arrayOfHightest[0] = arrayOfFloats[index];
			}

		}

		System.out.println("First is " + arrayOfHightest[0]);

		for (int index = 0; index < arrayOfFloats.length; index++) {
			if (arrayOfFloats[index] != arrayOfHightest[0]) {
				if (arrayOfFloats[index] > arrayOfHightest[1]) {
					arrayOfHightest[1] = arrayOfFloats[index];
				}
			}
		}
		
		System.out.println("Second is " +arrayOfHightest[1]);

		for (int index = 0; index < arrayOfFloats.length; index++) {
			if ((arrayOfFloats[index] != arrayOfHightest[0]) && (arrayOfFloats[index] != arrayOfHightest[1])) {
				if (arrayOfFloats[index] > arrayOfHightest[2]) {
					arrayOfHightest[2] = arrayOfFloats[index];
				}
			}
		}

		System.out.println("Third is " +arrayOfHightest[2]);
		sum = arrayOfHightest[0] + arrayOfHightest[1] + arrayOfHightest[2];
		System.out.println("Max sum is " + sum);
	}

}
