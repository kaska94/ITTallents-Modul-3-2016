
public class Exercise5 {

	public static void main(String[] args) {
		int size = 10;
		int[] array = new int[size];

		for (int index = 0; index < array.length; index++) {
			array[index] = index * 3;
		}
		for (int index = 0; index < array.length; index++) {
			System.out.print(array[index] + " ");
		}
	}

}
