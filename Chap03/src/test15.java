import java.util.InputMismatchException;
import java.util.Scanner;

public class test15 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			try {
			System.out.print("���ϰ��� �ϴ� �� �� �Է�>>");
			int n = sc.nextInt();
			int m = sc.nextInt();
			System.out.print(n + "x" + m + "=" + n*m);
			
			break;
			} catch (InputMismatchException e) {
				// Scanner ���׷� ���� �ٽ� �ʱ�ȭ�ؾ���.
				sc = new Scanner(System.in);
				System.out.println("���� �߻�. �����θ� �Է� �ٶ�");
			}
		}
		
		sc.close();
	}
}