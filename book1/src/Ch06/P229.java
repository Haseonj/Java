package Ch06;

public class P229 {
	public static void main(String[] args) {
		P227Student studentLee = new P227Student(1001, "Lee");
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 50);
		
		P227Student studentKim = new P227Student(1002, "Kim");
		studentKim.addSubject("국어", 70);
		studentKim.addSubject("수학", 85);
		studentKim.addSubject("영어", 100);
		
		studentLee.showStudentInfo();
		System.out.println("=======================");
		studentKim.showStudentInfo();
		
		
	}
}
