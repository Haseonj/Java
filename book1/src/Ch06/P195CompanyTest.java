package Ch06;

public class P195CompanyTest {
	public static void main(String[] args) {
		P194Company myCompany1 = P194Company.getInstance();
		P194Company myCompany2 = P194Company.getInstance();
		System.out.println(myCompany1 == myCompany2);
	}
}
