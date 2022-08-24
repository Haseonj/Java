package step03;

import java.util.Scanner;

public class _04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int total = scan.nextInt();
		int count = scan.nextInt();
		
		for(int i = 0; i < count; i++) {
			int price = scan.nextInt();
			int num = scan.nextInt();
			
			total = total - (price * num);
		}
		if(total == 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
