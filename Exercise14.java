import java.util.Scanner;

public class Exercise14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int counterOfElementsInSelectedArray = 0;
		int size = sc.nextInt();
		boolean isPositive;

		if (size < 0 || size > 128) {
			System.out.println("Put smaller and positive size of array");
			return;
		}

		float[] arrayOfFloats = new float[size];

		for (int index = 0; index < arrayOfFloats.length; index++) {
			System.out.println("Enter number: ");
			arrayOfFloats[index] = sc.nextFloat();
		}

		for (int index = 0; index < arrayOfFloats.length; index++) {
			if (arrayOfFloats[index] > 0) {
				isPositive = true;
			} else {
				isPositive = false;
			}

			if ((isPositive) && (3 - arrayOfFloats[index]) >= 0.001) {
				counterOfElementsInSelectedArray++;
			}

			if ((!isPositive) && (-3 - arrayOfFloats[index]) <= -0.001) {
				counterOfElementsInSelectedArray++;
			}
		}

		/*
		 * We can solve the exercise without the second for but we need to set
		 * he length of the second array to be the same as the first float[]
		 * arrayOfSelectedFloats = new float[size]; and we can set all values to
		 * 5 for example and then we will print all of the elements without the
		 * ones with value 5. We will add the selected values the for above this
		 * comment. I solved this way because it is clearer.
		 * 
		 */
		System.out.println("The Size of the new Array is " + counterOfElementsInSelectedArray);
		float[] arrayOfSelectedFloats = new float[counterOfElementsInSelectedArray];
		int indexCounterOfSelectedFloads = 0;

		int temp = 0;
		for (int index = 0; index < arrayOfFloats.length; index++) {
			if ((arrayOfFloats[index] > -3) && (arrayOfFloats[index] < 3)) {
				arrayOfSelectedFloats[indexCounterOfSelectedFloads] = arrayOfFloats[index];
				indexCounterOfSelectedFloads++;
			}
		}

		System.out.println("The new array is ");
		for (int index = 0; index < arrayOfSelectedFloats.length; index++) {
			System.out.print(arrayOfSelectedFloats[index] + " ");
		}
	}

}
