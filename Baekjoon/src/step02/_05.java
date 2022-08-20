package step02;

import java.util.Scanner;

public class _05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int hour = sc.nextInt();
		int minute = sc.nextInt();
	
		if(minute >= 45) {
			System.out.printf("%d ", hour);
			System.out.printf("%d", minute - 45);
		}else {
			if(hour == 0) {
				System.out.printf("%d ", hour + 23);
				System.out.printf("%d", minute + 15);
			}else {
				System.out.printf("%d ", hour - 1);
				System.out.printf("%d", minute +15);
			}
		}
	}
}