package Ch08;

public class P254TestA {
	int num;
	
	void aaa() {
		System.out.println("aaa() 출력");
	}
	
	public static void main(String[] args) {
		P254TestA a1 = new P254TestA();
		a1.aaa();
		P254TestA a2 = new P254TestA();
		a2.aaa();
	}
}
