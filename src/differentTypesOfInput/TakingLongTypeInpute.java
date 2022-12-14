package differentTypesOfInput;

import java.util.Scanner;

public class TakingLongTypeInpute {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter long type inpute");
		
		long L = sc.nextLong();
		
		System.out.println("The value of L is:"+ L);
	}
}
