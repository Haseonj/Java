package chapter5.classpart;

// 같은 패키지를 사용하여 선언된 Student 클래스를 사용 가능
// 서로 다른 패키지에 있다면, import 를 사용하여 클래스를 불러옴
public class StudentTest {
    // main() 함수
    public static void main(String[] args) {
        // new Student();로 Student 클래스를 생성하여 studentAhn에 대입
        Student studentAhn = new Student();
        studentAhn.studentName = "안승연";

        System.out.println(studentAhn.studentName);
        System.out.println(studentAhn.getStudentName());
    }
}
