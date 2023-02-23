package chapter4.ifexample;

public class IfExample2 {
    public static void main(String[] args) {
        int age = 9;
        int charge;

        // ~else if : 첫 번째(if절) 이후에 다음 조건식을 대입할 수 있으며,
        // 이 모든 조건식이 아닌 나머지는 ~else문을 사용하여 출력한다.
        if(age < 8){
            charge = 1000;
            System.out.println("취학 전 아동입니다.");
        }else if(age < 14){
            charge = 2000;
            System.out.println("초등학생입니다.");
        }else if(age < 20){
            charge = 2500;
            System.out.println("중,고등학생입니다.");
        }else{
            charge = 3000;
            System.out.println("일반인입니다.");
        }
        // 출력문에서 +를 사용하여 단순 문자열 앞,뒤에 변수를 대입할 수 있다.
        System.out.println("입장료는 " + charge + "원 입니다.");
    }
}
