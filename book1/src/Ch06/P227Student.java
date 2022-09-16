package Ch06;

import java.util.ArrayList;




public class P227Student {
	int studentID;
	String studentName;
	ArrayList<P228Subject> subjectList;
	
	public P227Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		subjectList = new ArrayList<P228Subject>();
	}
	
	public void addSubject(String name, int score) {
		P228Subject subject = new P228Subject();
		subject.setName(name);
		subject.setScorePoint(score);
		subjectList.add(subject);
	}
	
	public void showStudentInfo() {
		int total = 0;
		for(P228Subject s : subjectList) {
			total += s.getScorePoint();
			System.out.println("학생 " + studentName + "의 " + s.getName() + " 과목 성적은" +
								s.getScorePoint() + "입니다.");
		}
		System.out.println("학생 " + studentName + "의 총점은 " + total + " 입니다.");
	}
	
}