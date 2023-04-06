package arrayss;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int [] arr= new int [4] ;  
	
		System.out.println("Enter integer values:");

		for(int i=0; i < arr.length; i++) {
		       
		    arr[i] = sc.nextInt();
		}
		System.out.println("Even Numbers are:");  
		for(int i=0;i<arr.length;i++){  
		if(arr[i]%2==0){  
		System.out.println(arr[i]);  
		}  
		}  
		
		System.out.println("Odd Numbers are:");  
		for(int i=0;i<arr.length;i++){  
		if(arr[i]%2!=0){  
		System.out.println(arr[i]);  
		}  
		}  
		
		sc.close();
	}

}
