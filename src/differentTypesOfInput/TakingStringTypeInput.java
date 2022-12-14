package differentTypesOfInput;

import java.util.Scanner;

public class TakingStringTypeInput {
 
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter string type value");
	
	String name = sc.next();
	
	System.out.println("Your name is:"+ name);
	
	}
 
}
