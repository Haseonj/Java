package Ch03;

public class P85 {
	public static void main(String[] args) {
		int num = 0000000101;			// 5를 8비트 2진수로 나타냄
		
		System.out.println(num << 2);	// 왼쪽으로 2비트 이동 00010100
		System.out.println(num >> 2);	// 오른쪽으로 2비트 이동 0000001 (1)
		System.out.println(num >>> 2);	// 오른쪽으로 2비트 이동 0000001 (1)
		
		System.out.println(num);
		
		num = num << 2;
		System.out.println(num);
	}

}
