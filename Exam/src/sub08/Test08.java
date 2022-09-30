package sub08;

import java.util.HashMap;
import java.util.Map;

class Person {
	private String pid;
	private String name;
	private int age;
	
	public String getPid() {return pid;};
	public String getName() {return name;};
	public int getAge() {return age;};
	
	public Person(String pid, String name, int age) {
		this.pid = pid;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return String.format("아이디 : %s, 이름 : %s, 나이 : %d", pid, name, age);
	}
}

class PersonMap {
	private Map<String, Person> persons;
	
	public PersonMap() {
		persons = new HashMap<>();
	}
	
	public void addPerson(Person p) {
		persons.put(p.getPid(), p);
	}
	
	
}

public class Test08 {

}
