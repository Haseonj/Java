package Ch07;

public class P209BookArray2 {
	public static void main(String[] args) {
		P207Book[] library = new P207Book[5];
		
		library[0] = new P207Book("태백산맥", "조정래");
		library[1] = new P207Book("데미안", "헤르만 헤세");
		library[2] = new P207Book("어떻게 살 것인가", "유시민");
		library[3] = new P207Book("토지", "박경리");
		library[4] = new P207Book("어린왕자", "생텍쥐페리");
		
		for(int i = 0; i < library.length; i++) {
			library[i].showBookInfo();
		}
		
		for(int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}
	}
}
