
public class MethodOverloading {
	
	public static int getSum(int i, int j) {
		return i + j;
	}
	
	public static int getSum(int i, int j, int k) {
		return i + j + k;
	}
	
	public static double getSum(double i, double j) {
		return i + j;
	}
	
	public static void main(String[] args) {
		
		int a = getSum(30, 40);
		
		int b = getSum(30, 40, 50);
		
		double c = getSum(5.2, 6.3);
		
		
		System.out.println(a + " " + b + " " + c);
		
	}
}
