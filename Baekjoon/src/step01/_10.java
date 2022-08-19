package step01;

import java.util.Scanner;

public class _10 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int king = sc.nextInt();
		int queen = sc.nextInt();
		int rook = sc.nextInt();
		int bis = sc.nextInt();
		int knight = sc.nextInt();
		int pawn = sc.nextInt();
		
		int k = 1 - king;
		int q = 1 - queen;
		int r = 2 - rook;
		int b = 2 - bis;
		int kn = 2 - knight;
		int p = 8 - pawn;
		
		System.out.printf("%d %d %d %d %d %d", k, q, r, b, kn, p);
		
	}
}
