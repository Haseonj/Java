package Ch06;

public class P175Student {
	public String studentName;
	public int grade;
	public int money;
	
	public P175Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(P177Bus bus) {
		bus.take(1000);
	}
	
	public void takeSubway(P178Subway subway) {
		subway.take(1500);
		this.money -= 1500;
	}
	
	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은" + money + "입니다.");
	}
}

