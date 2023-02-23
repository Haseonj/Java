package chapter4.ifexample;

public class SwitchCase {
    public static void main(String[] args) {
        int ranking = 1;
        char medalColor;

        // switch-case문 : if문과 비슷하지만, 주로 조건이 하나의 변수 값이나 상수 값으로 구분되는 경우 사용
        // break : switch문을 멈추고 빠져나가는 역할로 없으면 마지막 'default' 값을 출력하게 됨
        switch(ranking){
            case 1 : medalColor = 'G';
            break;
            case 2 : medalColor = 'S';
            break;
            case 3 : medalColor = 'B';
            break;
            default: medalColor = 'A';
        }
        System.out.println(ranking + "등 메달의 색깔은 " + medalColor + " 입니다.");
    }
}
