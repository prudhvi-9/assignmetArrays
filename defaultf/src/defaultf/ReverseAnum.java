package defaultf;

import java.util.Scanner;

public class ReverseAnum {
	public static void main(String[] args) {  
	
System.out.print("Enter the number that you want to reverse: ");  
		Scanner cs = new Scanner(System.in);  
		int number = cs.nextInt();  
		
		int reverse = 0;  
		
		for( ;number != 0; number=number/10)   
		{  
		int remainder = number % 10;  
		reverse = reverse * 10 + remainder;  
		}  
		System.out.println("The reverse of the given number is: " + reverse);  
	}	 

	




			}
			