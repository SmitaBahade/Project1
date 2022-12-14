package arithmaticOperation;

import java.util.Scanner;

public class TwoNoAddition {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter secont number");
		int b = sc.nextInt();
		int c = a+b;
		System.out.println("Addition of a and b:"+ c);
	}
}
