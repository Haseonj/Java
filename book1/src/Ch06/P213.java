package Ch06;

public class P213 {
	public static void main(String[] args) {
		P207Book[] bookArray1 = new P207Book[3];
		P207Book[] bookArray2 = new P207Book[3];
		
		bookArray1[0] = new P207Book("태백산맥", "조정래");
		bookArray1[1] = new P207Book("데미안", "헤르만 헤세");
		bookArray1[2] = new P207Book("어떻게 살 것인가", "유시민");
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		for(int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
			
		}
	}
}
