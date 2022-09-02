package sub1;

public class ArrayTest {
	public static void main(String[] args) {
		
		int[] arr1 = {1, 2, 3, 4, 5};
		char[] arr2 = {'A', 'B', 'C'};
		String[] arr3 = {"서울", "대전", "대구", "부산", "광주"};
		
		System.out.println("arr1[0] : " + arr1[0]);
		System.out.println("arr1[2] : " + arr1[2]);
		System.out.println("arr1[4] : " + arr1[4]);
		
		System.out.println("arr2[0] : " + arr2[0]);
		System.out.println("arr2[1] : " + arr2[1]);
		
		System.out.println("arr3[1] : " + arr3[1]);
		System.out.println("arr3[3] : " + arr3[3]);
		
		System.out.println("arr1 배열 길이 : " + arr1.length);
		System.out.println("arr2 배열 길이 : " + arr2.length);
		System.out.println("arr3 배열 길이 : " + arr3.length);
		
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		
		for(char ch : arr2) {
			System.out.println(ch + " ");
		}
		System.out.println();
		
		for(String ch2 : arr3) {
			System.out.println(ch2 + "");
		}
		System.out.println();
		
		int[] scores = {80, 60, 78, 62, 92};
		int total = 0;
		
		for(int score : scores) {
			total += score;
		}
		System.out.println("score의 합 : " + total);
		
		int[][] arr2d = {{1,  2,  3,  4},
						 {5,  6,  7,  8}, 
						 {9, 10, 11, 12}};
		
		for(int a = 0; a < 3; a++) {
			for(int b = 0; b < 4; b++) {
				System.out.println("arr2d[" + a + "][" + b + "] : " + arr2d[a][b]);
			}
		}
		
		int[][][] arr3d = {{{1,  2,  3},
						   {4,   5,  6},
						   {7,   8,  9}},
						  {{10, 11, 12},
						   {13, 14, 15},
						   {16, 17, 18}},
						  {{19, 20, 21},
						   {22, 23, 24},
						   {25, 26, 27}}};
		
		for(int a = 0; a < 3; a++) {
			for(int b =0; b < 3; b++) {
				for(int c = 0; c < 3; c++) {
					System.out.printf("arr3d[%d][%d][%d] : %d\n", a,b,c, arr3d[a][b][c]);
				}
			}
		}
	}
}
