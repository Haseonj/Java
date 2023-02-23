package chapter3;

public class OperationEx4 {
    public static void main(String[] args) {
        int fatherAge = 45;
        int motherAge = 47;

        // 조건 연산자(삼항 연산자) : 항이 세 개여서 삼항 연산자 라고도 부르며, 조건식이 참일 때와 거짓일 때 다른 결과 값이 나온다.
        // (조건식) ? '참일 경우' : '거짓일 경우'
        char ch;
        ch = (fatherAge > motherAge) ? 'T' : 'F';

        System.out.println(ch);
    }
}
