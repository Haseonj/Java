package Ch05;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentAhn = new Student(); // Student 클래서 생성
		studentAhn.studentName = "안승연";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());

	}
}
