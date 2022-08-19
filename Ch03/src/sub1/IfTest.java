package sub1;

/*
 * 날짜 : 2022/08/17
 * 이름 : 하선주
 * 내용 : Java 조건문 if 실습하기
 */
public class IfTest {
	public static void main(String[] args) {
		
		// If
		int num1 = 1;
		int num2 = 2;
		
		if(num1 < num2) {
			// 조건인 참일때 실행
			System.out.println("num1은 num2보다 작다.");
		}
		
		if(num1 > 1) {
			System.out.println("num1은 1보다 크다.");
		}
		
		if(num1 > 0) {
			if(num2 > 1) {
				System.out.println("num1은 0 보다 크고 num2는 1보다 크다.");
			}
		}
		
		if(num1 > 0 && num2 > 1) {
			System.out.println("num1은 0 보다 크고 num2는 1보다 크다.");
		}
		
		// If ~ else
		int var1 = 1, var2 = 2;
		
		if(var1 > var2) {
			// 조건이 참일때
			System.out.println("var1은 var2 보다 크다.");
		}else {
			// 조건이 거짓일때
			System.out.println("var1은 var2보다 작다.");
		}
		
		// If ~ else if ~ else
		int n1 = 1; 
		int n2 = 2;
		int n3 = 3;
		int n4 = 4;
		
		if(n1 > n2) {
			System.out.println("n1은 2n 보다 크다.");
		}else if(n2 > n3) {
			System.out.println("n2은 3n 보다 크다.");
		}else if(n3 > n4) {
			System.out.println("n3은 4n 보다 크다.");
		}else {
			System.out.println("n4가 가장 크다.");
		}
	}
}
