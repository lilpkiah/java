import java.util.Scanner;

public class test9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("���� �߽ɰ� ������ �Է�>>");
		
		int rx = sc.nextInt();
		int ry = sc.nextInt();
		double r = sc.nextDouble();
		
		System.out.print("�� �Է�>>");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		double d;
		
		d = Math.sqrt(((x - rx) * (x - rx)) + ((y - ry) * (y - ry)));
		
		if(d < r)
			System.out.println("�� (" + x + "," + y + ")�� �� �ȿ� �ִ�.");
		else
			System.out.println("�� (" + x + "," + y + ")�� �� �ȿ� ����.");
		
		
	}

}
