package step03;

import java.util.Scanner;

public class _03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i <= a; i++) {
			sum = sum + i;
		}
		System.out.print(sum);
	}

}
