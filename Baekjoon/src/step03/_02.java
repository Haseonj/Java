package step03;

import java.util.Scanner;

public class _02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		
		int b;
		int c;
		
		for(int i = 0; i < a; i++) {
			b = scan.nextInt();
			c = scan.nextInt();
			System.out.println(b + c);
		}
	}

}
