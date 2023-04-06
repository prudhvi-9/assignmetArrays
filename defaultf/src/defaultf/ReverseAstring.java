package defaultf;
import java.util.*;
public class ReverseAstring {
	public class ReverseString {
		
		public static void main(String[] args)   
		  
		{  
	
			Scanner sc= new Scanner(System.in);   
			System.out.print("Enter a string: ");  
			String strin= sc.nextLine();             
			System.out.print("You have entered: "+strin);             
			      
			        
			        String reversedStr = "";    
			            
			        
			        for(int i = strin.length()-1; i >= 0; i--){    
			            reversedStr = reversedStr + strin.charAt(i);    
			        }    
			            
			        System.out.println("Original string: " + strin);    
			      
			        System.out.println("Reverse of given string: " + reversedStr);    
			    }   
}	
		

	
}
