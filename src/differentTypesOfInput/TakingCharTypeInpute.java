package differentTypesOfInput;

import java.util.Scanner;

public class TakingCharTypeInpute {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Char type inpute");
		char c = sc.next().charAt(0);
		System.out.println();
		System.out.println("The value of c is:"+ c);
	}
}
