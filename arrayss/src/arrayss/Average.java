package arrayss;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int []  numbers= new int [4] ;  
	
		System.out.println("Enter integer values:");

		for(int i=0; i <  numbers.length; i++) {
		       
		    numbers[i] = sc.nextInt();
		}
		int sum = 0;
	       for(int i=0; i < numbers.length ; i++)
	        sum = sum + numbers[i];
	       //calculate average value
	        double average = sum / numbers.length;
	        System.out.println("Average value of the array elements is : " + average);
sc.close();
	}

}
