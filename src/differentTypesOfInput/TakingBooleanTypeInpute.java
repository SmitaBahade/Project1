package differentTypesOfInput;

import java.util.Scanner;

public class TakingBooleanTypeInpute {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Boolean Value");
		boolean B = sc.nextBoolean();
		System.out.println("The value of B is:"+ B);
	}
}
