import java.util.Scanner;

public class test10_11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 10 �� �� ������ �Ÿ�
		System.out.print("ù��° ���� �߽ɰ� ������ �Է�>>");
		
		int rx1 = sc.nextInt();
		int ry1 = sc.nextInt();
		double r1 = sc.nextDouble();
		
		System.out.print("�ι�° ���� �߽ɰ� ������ �Է�>>");
		
		int rx2 = sc.nextInt();
		int ry2 = sc.nextInt();
		double r2 = sc.nextDouble();
		
		double d = Math.sqrt(((rx1 - rx2) * (rx1 - rx2)) + ((ry1 - ry2) * (ry1 - ry2)));
		
		if(d <= r1 + r2)
			System.out.println("�� ���� ���� ��ģ��.");
		else
			System.out.println("�� ���� ���� ��ġ�� �ʴ´�.");
		
		
		// 11 - (1)
		System.out.print("���� �Է��ϼ���(1~12)>>");
		int m = sc.nextInt();
		
		if(m == 3 || m == 4 || m == 5) {
			System.out.println("��");
		}
		else if(m == 6 || m == 7 || m == 8) {
			System.out.println("����");
		}
		else if(m == 9 || m == 10 || m == 11) {
			System.out.println("����");
		}
		else if(m == 12 || m == 1 || m == 2){
			System.out.println("�ܿ�");
		}
		else {
			System.out.println("�߸��Է�");
		}
		
		// 11 - (2)
		
		System.out.print("���� �Է��ϼ���(1~12)>>");
		int m2 = sc.nextInt();
		
		switch(m2) {
		case 3,4,5: System.out.println("��"); break;
		case 6,7,8: System.out.println("����"); break;
		case 9,10,11: System.out.println("����"); break;
		case 12,1,2: System.out.println("�ܿ�"); break;
		default: System.out.println("�߸��Է�");
		}
		
	}
}
