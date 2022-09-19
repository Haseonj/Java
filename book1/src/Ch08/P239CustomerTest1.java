package Ch08;

public class P239CustomerTest1 {
	public static void main(String[] args) {
		P234Customer customerLee = new P234Customer(10010, "이순신");
		//customerLee.setCustomerID(10010);
		//customerLee.setCustomerName("이순신");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		P237VIPCustomer customerKim = new P237VIPCustomer(10020, "김유신", 10);
		//customerKim.setCustomerID(10020);
		//customerKim.setCustomerName("김유신");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
	}
}
