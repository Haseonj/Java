package chapter5.classpart;

public class Student {
    // 멤버변수
    int studentId;          // 학번
    String studentName;     // 학생이름
    int grade;              // 학년
    String address;         // 사는 곳

    // 메서드 추가
    public void showStudentInfo(){
        System.out.println(studentName + "," + address); // 이름, 주소 입력
    }

    public String getStudentName(){
        return studentName;
    }

    public void setStudentName(String name){
        studentName = name;
    }

    // main() 함수(가장 먼저 시작되는 메서드)
    public static void main(String[] args) {
        Student studentAhn = new Student(); // Student 클래스 생성
        studentAhn.studentName = "안연수";

        System.out.println(studentAhn.studentName);
        System.out.println(studentAhn.getStudentName());
    }
}
