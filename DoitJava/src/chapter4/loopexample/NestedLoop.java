package chapter4.loopexample;

public class NestedLoop {
    public static void main(String[] args) {
        int dan;
        int times;

        for(dan = 2; dan <= 9; dan++){
            // 외부 반복 수행 (내부의 반복값이 끝나면 외부 다음 값 수행)
            for(times = 1; times <= 9; times++){
                // 내부 반복 수행 (외부에서 한 번 수행 시, 내부의 반복값이 끝날때 까지 수행)
                System.out.println(dan + "X" + times + "=" + dan * times);
            }
        }
    }
}
