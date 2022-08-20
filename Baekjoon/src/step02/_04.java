package step02;

import java.util.Scanner;

public class _04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int Quadrant ;
		
		if(x > 0 && y > 0) {
			Quadrant = 1;
		}else if(x < 0 && y > 0) {
			Quadrant = 2;
		}else if(x < 0 && y < 0) {
			Quadrant = 3;
		}else {
			Quadrant = 4;
		}
		System.out.println(Quadrant);
	}

}
