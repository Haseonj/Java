package Ch05;

public class ExOrder {
	String orderNum;
	String orderID;
	String orderDate;
	String orderName;
	String orderProduct;
	String address;
	
	// orderNum
	public String getOrderNum() {
		return orderNum;
	}
	// orderID
	public String getOrderID() {
		return orderID;
	}
	// orderDate
	public String getOrderDate() {
		return orderDate;
	}
	// orderName
	public String getOrderName() {
		return orderName;
	}
	// orderProduct
	public String getOrderProduct() {
		return orderProduct;
	}
	// address
	public String getAddress() {
		return address;
	}
	
	public static void main(String[] args) {
		ExOrder orderH = new ExOrder();
		
		orderH.orderNum = "201803120001";
		orderH.orderID = "abc123";
		orderH.orderDate = "2018년 3월 12일";
		orderH.orderName = "홍길순";
		orderH.orderProduct = "PD0345-12";
		orderH.address = "서울시 영등포구 여의도동 20번지";
		
		System.out.println("주문번호 : " + orderH.orderNum);
		System.out.println("주문자 아이디 : " + orderH.orderID);
		System.out.println("주문 날짜 : " + orderH.orderDate);
		System.out.println("주문자 이름 : " + orderH.orderName);
		System.out.println("주문 상품 번호 : " + orderH.orderProduct);
		System.out.println("배송주소 : " + orderH.address);
	}



}
