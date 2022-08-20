package step01;

import java.util.Scanner;

public class _11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int a = A + B;
		int b = A * B;
		int c = A % C;
		int d = B % C;
		
		int e = c + d;
		int f = c * d;
		
		int g = a % C;
		int h = b % C;
		int i = e % C;
		int j = f % C;
		System.out.printf("%d\n%d\n%d\n%d", g, i, h, j);
		
	}

}
