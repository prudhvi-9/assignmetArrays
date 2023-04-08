package arrayss;

import java.util.Scanner;

public class PrintingOfArrays {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];

		System.out.println("Enter integer values:");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Array elements are:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		sc.close();
	}

}
