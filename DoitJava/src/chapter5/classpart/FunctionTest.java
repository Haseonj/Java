package chapter5.classpart;

public class FunctionTest {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        int sum = add(num1, num2);  // add() 함수 호출
        System.out.println(num1 + " + " + num2 + " = " + sum + "입니다.");
    }

    // add() 함수
    public static int add(int n1, int n2){ // n1, n2 >> num1, num2
        int result = n1 + n2;
        return result;  // 결과 값 반환
    }
}
