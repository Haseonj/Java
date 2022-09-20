package Ch08;

import java.util.ArrayList;

public class P268CustomerTest {
	public static void main(String[] args) {
		ArrayList<P234Customer> customerList = new ArrayList<P234Customer>();
		
		P234Customer customerLee = new P234Customer(10010, "이순신");
		P234Customer customerShin = new P234Customer(10020, "신사임당");
		P234Customer customerHong = new P267GoldCustomer(10030, "홍길동");
		P234Customer customerYoul = new P267GoldCustomer(10040, "이율곡");
		P234Customer customerKim = new P237VIPCustomer(10050, "김유신", 12345);
		
		customerList.add(customerLee);
		customerList.add(customerShin);
		customerList.add(customerHong);
		customerList.add(customerYoul);
		customerList.add(customerKim);
		
		System.out.println("===== 고객 정보 출력 =====");
		
		for(P234Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("===== 할인율과 보너스 포인트 계산 =====");
		
		int price = 10000;
		for(P234Customer customer : customerList) {
			
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + " 님이 " + cost + "원 지불하셨습니다.");
			System.out.println(customer.getCustomerName() + " 님의 현재 보너스 포인트는 " + customer.bonusPoint + "점 입니다.");
		}
	}
}
