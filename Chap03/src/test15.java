import java.util.InputMismatchException;
import java.util.Scanner;

public class test15 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			try {
			System.out.print("곱하고자 하는 두 수 입력>>");
			int n = sc.nextInt();
			int m = sc.nextInt();
			System.out.print(n + "x" + m + "=" + n*m);
			
			break;
			} catch (InputMismatchException e) {
				// Scanner 버그로 인해 다시 초기화해야함.
				sc = new Scanner(System.in);
				System.out.println("예외 발생. 정수로만 입력 바람");
			}
		}
		
		sc.close();
	}
}
