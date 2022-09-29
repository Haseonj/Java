package sub08;

class Member {
	private String name;
	private String hp;
	private int age;
	
	public Member(String name, String hp, int age) {
		this.name = name;
		this.hp = hp;
		this.age = age;
	}
	@Override
	public String toString() {
		return String.format("%s,%s,%d", name, hp, age);
	}
	
}

public class Test03 {
	
}
