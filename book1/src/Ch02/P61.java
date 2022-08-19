package Ch02;

public class P61 {
	public static void main(String[] args) {
		final int MAX_NUM = 100;		// 선언과 동시에 초기화
		final int MIN_NUM;
		
		MIN_NUM = 0;					// 사용전 초기화, 하지 않으면 오류 발생
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		
		//MAX_NUM = 1000; 오류발생, final 값의 상수는 변경할 수 없음
	}
}
