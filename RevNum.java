package fibonacci;

import java.util.Scanner;

public class RevNum {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		System.out.println("Please Enter any Number: ");
		int Number = sc.nextInt();
		
		int reverse = 0;  
	  
		for( ;Number != 0; Number=Number/10) {  
			
			int remainder = Number % 10;  
			reverse = reverse * 10 + remainder;  
		}  
		
		System.out.println("The reverse of the given number is: " + reverse); 
		
		sc.close();
	}  

}
