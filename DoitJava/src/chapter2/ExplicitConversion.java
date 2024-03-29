package chapter2;

public class ExplicitConversion {
    public static void main(String[] args) {
        double dNum1 = 1.2;
        float fNum2 = 0.9F;

        int iNum3 = (int)dNum1 + (int)fNum2;    // 두 실수가 각각 형 변환되어 더해짐 : 1.2 + 0.9 > 1 + 0 = 1
        int iNum4 = (int)(dNum1 + fNum2);       // 두 실수의 합이 먼저 계산되고 형 변환됨 : 1.2 + 0.9 = 2.0 > 2

        System.out.println(iNum3);
        System.out.println(iNum4);
    }
}
