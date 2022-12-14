package differentTypesOfInput;

import java.util.Scanner;

public class TakingByteTypeInpute {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any Byte inpute");
		byte b = sc.nextByte();
		System.out.println("The value of b is :"+ b);
	}
}
