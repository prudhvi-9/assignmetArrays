package arrayss;

import java.util.Scanner;

public class AscendingOrder {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[4];

		System.out.println("Enter integer values:");

		for (int i = 0; i < arr.length; i++) {

			arr[i] = sc.nextInt();
		}

		System.out.println("Elements of original array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		// Sort the array in ascending order
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int te = arr[i];
					arr[i] = arr[j];
					arr[j] = te;
				}
			}
		}

		System.out.println();

		System.out.println("Elements of array sorted in ascending order: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		sc.close();
	}

}
