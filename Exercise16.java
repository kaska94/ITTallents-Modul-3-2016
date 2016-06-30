import java.util.Scanner;

public class Exercise16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int size = 10;
		float[] arrayOfFloats = new float[size + 1];

		for (int index = 1; index < arrayOfFloats.length; index++) {
			System.out.println("Enter number: ");
			arrayOfFloats[index] = sc.nextFloat();
		}

		System.out.println("First Array:");
		for (int index = 1; index < arrayOfFloats.length; index++) {
			System.out.print(arrayOfFloats[index] + " ");
			if (arrayOfFloats[index] < -0.231) {
				arrayOfFloats[index] = (float) ((index * index) + 41.25);
			} else {
				arrayOfFloats[index] = arrayOfFloats[index] * index;
			}
		}
		System.out.println("\nNow changed ...");
		for (int index = 1; index < arrayOfFloats.length; index++) {
			System.out.print(arrayOfFloats[index] + " ");
		}
	}

}
