package Ch05;

public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	// 메서드 추가
	public String getStudentName() {
		return studentName;
	} // 학생의 이름을 반환하는 메서드
	
	
	// main() 함수
	public static void main(String[] args) {
		Student studentAhn = new Student(); // Student 클래서 생성
		studentAhn.studentName = "안연수";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}
}
