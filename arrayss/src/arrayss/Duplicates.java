package arrayss;
import java.util.*;
public class Duplicates {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   
		Scanner sc = new Scanner(System.in);

		int [] arr= new int [8] ;  
	
		System.out.println("Enter integer values:");

		for(int i=0; i < arr.length; i++) {
		       
		    arr[i] = sc.nextInt();
		}
		  System.out.println("Duplicate elements in given array: ");  
	        //Searches for duplicate element  
	        for(int i = 0; i < arr.length; i++) {  
	            for(int j = i + 1; j < arr.length; j++) {  
	                if(arr[i] == arr[j])  
	                    System.out.println(arr[j]);  
	            }
	            }
	sc.close();
	}	
	}


