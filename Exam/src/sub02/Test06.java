package sub02;


import java.util.Scanner;

/*
 * 날짜 : 2022/08/26
 * 이름 : 하선주
 * 내용 : 자바 메서드 연습문제
 */
public class Test06 {
	public static void intro() {
		System.out.println("******* START *******");
		System.out.println("두개의 정수를 입력");
	}
	
	public static int input(Scanner scan, String name) {
		System.out.println("변수 " + name + " 값 입력 : ");
		int input = scan.nextInt();
		return input;
	}
	
	public static void result(int val) {
		System.out.println("덧셈 결과 : " + val);
		System.out.println("******* END *******");
	}
	
	public static int add(int x, int y) {
		return x + y;
	}
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String name;
		
		int a = input(scan, "a");
		int b = input(scan, "b");
		
		int output = add(a, b);
		result(output);
		
		scan.close();
	}
}
