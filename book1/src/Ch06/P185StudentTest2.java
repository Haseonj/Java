package Ch06;

public class P185StudentTest2 {
	public static void main(String[] args) {
		P184Student1 studentLee = new P184Student1();
		studentLee.setStudentName("이지원");
		System.out.println(studentLee.serialNum);
		System.out.println(studentLee.studentName + "학번 : " + studentLee.studentID);
		
		P184Student1 studentSon = new P184Student1();
		studentSon.setStudentName("손수경");
		System.out.println(studentSon.serialNum);
		System.out.println(studentSon.studentName + "학번 : " + studentSon.studentID);
		
		
	}
}
