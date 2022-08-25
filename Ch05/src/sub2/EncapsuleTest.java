package sub2;

/*
 * 날짜 : 2022/08/25
 * 이름 : 하선주
 * 내용 : Java 갭슐화 실습하기
 */
public class EncapsuleTest {
	public static void main(String[] args) {
		
		// 객체 생성
		Car sonata = new Car("소나타", "흰색", 10);
		
		sonata.setColor("은색");
		sonata.speedUp(80);
		sonata.speedDown(40);
		sonata.show();
		
		// Account 객체 생성
		Account kb = new Account("국민은행", "101-12-1011", "홍길동", 1000);
		
		kb.deposit(47000);
		kb.withdraw(35000);
		kb.show();
		
		
		Account wr = new Account("우리은행", "101-12-2012", "김춘추", 10000);
		
		wr.deposit(75400);
		wr.withdraw(54100);
		wr.show();
		
	}
}
