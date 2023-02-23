package chapter3;

public class OperationEx3 {
    public static void main(String[] args) {
        int num1 = 10;
        int i = 2;

        // && : 두 문장이 모두 참 일때만 참, 하나라도 거짓이면 거짓
        // 논리 곱에서 앞 항의 결과 값이 거짓이므로 두 번째 항은 실행되지 않음
        boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);    // 두 번째 항을 실행되지 않아서 i 값은 그대로 2
        System.out.println(value);
        System.out.println(num1);
        System.out.println(i);

        // || : 두 문장 중 하나라도 참일 경우 참, 모두 거짓 이어야 거짓
        // 논리 합에서 앞 항의 결과 값이 참이므로 두 번째 항은 실행되지 않음
        value = ((num1 = num1 + 10) > 10) || ((i = i + 2) < 10);            // 두 번째 항을 실행되지 않아서 i 값은 그대로 2
        System.out.println(value);
        System.out.println(num1);
        System.out.println(i);
    }
}
