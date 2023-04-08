package arrayss;
import java.util.Scanner;
public class Smaller {


	

		
			public static void main(String[] args) {
				// TODO Auto-generated method stub

				
		Scanner cs = new Scanner(System.in);

		int [] sud = new int [7] ;  
		System.out.println("Enter integer values:");

		for(int i=0; i < sud.length; i++) {
		       
		    sud[i] = cs.nextInt();
		}
			        
			        int min = sud[0];  
			        
			        for (int i= 0;  i< sud.length; i++) {  
			           
			           if(sud[i] <min)  
			               min = sud[i];  
			        }  
			        System.out.println("Smallest element present in given array: " + min);  
			     
			cs.close();  
			
}
}		




