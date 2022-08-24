package sub01;

public class Note {
	public static void main(String[] args) {
		
		int total = 0;
		
		for(int k = 1; k <= 10; k++) {
			if(k % 2 == 0 || k % 3 == 0) {
				total += k;
			}
		}
		System.out.println("1 ~ 10까지 정수 중 2의 배수와 3의 배수의 합 : " + total);

	}

}
