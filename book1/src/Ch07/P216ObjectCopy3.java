package Ch07;

public class P216ObjectCopy3 {
	public static void main(String[] args) {
		P207Book[] bookArray1 = new P207Book[3];
		P207Book[] bookArray2 = new P207Book[3];
		
		bookArray1[0] = new P207Book("태백산맥", "조정래");
		bookArray1[1] = new P207Book("데미안", "헤르만 헤세");
		bookArray1[2] = new P207Book("어떻게 살 것인가", "유시민");
		
		bookArray2[0] = new P207Book();
		bookArray2[1] = new P207Book();
		bookArray2[2] = new P207Book();
		
		for(int i = 0; i < bookArray1.length; i++) {
			bookArray2[i].setBookName(bookArray1[i].getBookName());
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
		}
		
		for(int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
		
		bookArray1[0].setBookName("나목");
		bookArray1[0].setBookName("박완서");
		
		System.out.println("=== bookArray1 ===");
		for(int i = 0; i < bookArray1.length; i++) {
			bookArray1[i].showBookInfo();
		}
		
		System.out.println("=== bookArray2 ===");
		for(int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
	}
}
