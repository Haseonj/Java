package step03;

import java.util.Scanner;

public class _01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		
		scan.close();
		
		for(int i = 1; i < 10; i++) {
			System.out.println(a + " * " + i + " = " + (a * i));
		}
	}
}
