package fibonacci;

import java.util.Scanner;

public class PerfectNum {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		System.out.println("Please Enter any Number: ");
		int Number = sc.nextInt();
		
		PerfectNumber (Number);
		
		sc.close();
	}

	public static void PerfectNumber (int Number) {
		int i, Sum = 0;
		for(i = 1 ; i < Number ; i++) {
			if(Number % i == 0)  {
				Sum = Sum + i;
			}
		}
		if (Sum == Number) {
			System.out.format("%d is a Perfect Number", Number);
		}
		else {
			System.out.format("%d is NOT a Perfect Number", Number);
		}
	}

}
