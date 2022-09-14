package Ch06;

public class P187Student2 {
	private static int serialNum = 1000;
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public P187Student2() {
		serialNum++;
		studentID = serialNum;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String Name) {
		this.studentName = Name;
	}
	
	public static int getSerialNum() {
		int i = 10;
		return serialNum;
	}
	
	public static void setSerialNum(int serialNum) {
		P187Student2.serialNum = serialNum;
	}
	
}
