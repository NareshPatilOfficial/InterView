package Patterns;

import java.util.Scanner;

public class CheckEvenOdd {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter The Number : ");
		int num = scan.nextInt();
		
		if(num%2 == 0) {
			System.out.println(num + " is even number.");
		}else {
			System.out.println(num + " is odd number.");
		}
	}
}
