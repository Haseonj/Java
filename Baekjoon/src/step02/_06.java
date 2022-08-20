package step02;

import java.util.Scanner;

public class _06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		int timer = sc.nextInt();
		
				
		if(minute + timer < 60) {
			minute = minute + timer;
		} else if(minute + timer >= 60 && minute + timer < 120) {
			if(hour >= 23) {
				hour = hour - hour;
				minute = (minute + timer) - 60;
			} else {
				hour = hour + 1;
				minute = (minute + timer) - 60;		
			}
		} else if(minute + timer >= 120) {
			if(hour >= 23) {
				hour = hour - hour + 1;
				minute = (minute + timer) - 120;
			} else {
				hour = hour + 2;
				minute = (minute + timer) - 120;
				if(hour == 24) {
					hour = 0;
				}
			}
		}
		System.out.printf("%d %d", hour, minute);
	}
}
