package Ch06;

public class P183StudentTest1 {
	public static void main(String[] args) {
		P182Student studentLee = new P182Student();
		studentLee.setStudentName("이지원");
		System.out.println(studentLee.serialNum);
		studentLee.serialNum++;
		
		P182Student studentSon = new P182Student();
		studentSon.setStudentName("손수경");
		System.out.println(studentSon.serialNum);
		System.out.println(studentLee.serialNum);
	}
}
