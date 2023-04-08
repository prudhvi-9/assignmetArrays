package arrayss;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner cs = new Scanner(System.in);

		int[] sud = new int[7];
		System.out.println("Enter integer values:");

		for (int i = 0; i < sud.length; i++) {

			sud[i] = cs.nextInt();
		}
		int max = sud[0];

		for (int i = 0; i < sud.length; i++) {

			if (sud[i] > max)
				max = sud[i];
		}
		System.out.println("Largest element present in given array: " + max);
		cs.close();
	}

}
