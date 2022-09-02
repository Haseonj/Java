package sub2;

public class MethodTest {
	 int num = 1;
	 
	 public static void main(String[] args) {
		 
		 int r1 = f(1);
		 int r2 = f(2);
		 int r3 = f(3);
		 
		 System.out.println("r1 : " + r1);
		 System.out.println("r2 : " + r2);
		 System.out.println("r3 : " + r3);
		 
		 int t1 = sum(1, 10);
		 int t2 = sum(1, 100);
		 
		 System.out.println("t1 : " + t1);
		 System.out.println("t2 : " + t2);
		 
		 
	 }
	 
	 public static int f(int x) {
		 int y = 2 * x + 3;
		 return y;
	 }
	 
	 public static int sum(int start, int end) {
		 int total = 0;
		 
		 for(int k = start; k <= end; k++) {
			 total +=k;
		 }
		 
		 return total;
	 }
}
