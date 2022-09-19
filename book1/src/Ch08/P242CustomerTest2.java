package Ch08;

public class P242CustomerTest2 {
	public static void main(String[] args) {
		P237VIPCustomer customerKim = new P237VIPCustomer(10020, "김유신", 20);
		//customerKim.setCustomerID(10020);
		//customerKim.setCustomerName("김유신");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
	}
}
