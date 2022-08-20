package step01;

import java.util.Scanner;

public class _12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int A = a * (b % 10);
		int B = a * (b % 100/10);
		int C = a * (b / 100);
		int D = a * b;
		
		System.out.printf("%d\n%d\n%d\n%d", A, B, C, D);
	}

}
