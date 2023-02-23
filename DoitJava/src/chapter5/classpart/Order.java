package chapter5.classpart;

public class Order {
    String orderNo;
    String custId;
    String orderDate;
    String custName;
    String prodNo;
    String address;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getProdNo() {
        return prodNo;
    }

    public void setProdNo(String prodNo) {
        this.prodNo = prodNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public static void main(String[] args) {
        Order order = new Order();
        order.orderNo = "201803120001";
        order.custId = "abc123";
        order.orderDate = "2018년 3월 12일";
        order.custName = "홍길순";
        order.prodNo = "PD0345-12";
        order.address = "서울시 영등포구 여의도동 20번지";

        System.out.println("주문번호 : " + order.getOrderNo());
        System.out.println("주문자 아이디 : " + order.getCustId());
        System.out.println("주문 날짜 : " + order.orderDate);
        System.out.println("주문자 이름 : " + order.custName);
        System.out.println("주문 상품 번호 : " + order.getOrderNo());
        System.out.println("배송 주소 : " + order.address);
    }
}
