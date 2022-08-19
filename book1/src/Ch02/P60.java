package Ch02;

public class P60 {
	public static void main(String[] args) {
		var i = 10;		// int i = 10 으로 컴파일됨
		var j = 10.0;		// double j = 10.0 으로 컴파일 됨
		var str = "hello";	// String str = "hello"로 컴파일 됨
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		str = "test";
		//str = 3; str을 String으로 먼저 사용하였기 때문에 정수값을 넣을 수 없음
	}
}
