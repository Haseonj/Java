package sub3;

public class Calc {
	
	private static Calc instance = new Calc(); // 싱글톤 조건
	
	public static Calc getInstance() { //클래스 타입으로 바로 호출
		return instance;
	}
	
	private Calc() {}; // 생성자를 따로 호출 못하게 ..
	
	
	public int plus(int x, int y) {
		return x+y;
	}
	
	public int minus(int x, int y) {
		return x-y;
	}
	
	public int multi(int x, int y) {
		return x*y;
	}
	
	public int div(int x, int y) {
		return x/y;
	}
}
