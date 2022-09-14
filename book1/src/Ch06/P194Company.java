package Ch06;

public class P194Company {
	
	private static P194Company instance = new P194Company();
	private P194Company() {}
	
	public static P194Company getInstance() {
		if(instance == null) {
			instance = new P194Company();
		}
		return instance;
	}
}
