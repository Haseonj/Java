package ex01;

public class Note {
	public static void main(String[] args) {
		
		String strCsv = "60, 72, 82, 86, 92";
		String[] scores = strCsv.split(",");
		
		int total = 0;
		
		for(int i = 0; i < scores.length; i++) {
			total += Integer.parseInt(scores[i]);
		}
		
		System.out.println("총점 : " + total);
	}
}
