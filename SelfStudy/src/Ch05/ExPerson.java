package Ch05;

public class ExPerson {
	int age;
	String name;
	boolean Married;
	int son;
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean getMarried() {
		return Married;
	}
	
	public int getSon() {
		return son;
	}
	
	public static void main(String[] args) {
		ExPerson personJ = new ExPerson();
		
		personJ.name = "James";
		personJ.age = 40;
		personJ.Married = true;
		personJ.son = 3;
		
		System.out.println(personJ.getName());
		System.out.println(personJ.getAge());
		System.out.println(personJ.getMarried());
		System.out.println(personJ.getSon());
		
		System.out.println(personJ.name);
		System.out.println(personJ.age);
		System.out.println(personJ.Married);
		System.out.println(personJ.son);
	}
}
