import java.util.Scanner;

public class test1_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 1
		System.out.print("��ȭ�� �Է��ϼ���(���� ��)>>");
		
		int won = sc.nextInt();
		
		double dollar = won / 1216.0;
		
		String str = String.format("%.2f", dollar);
		
		System.out.println(won + "���� $" + str + "�Դϴ�." );
		
		
		// 2
		System.out.print("2�ڸ��� ���� �Է�(10~99)>>");
		
		int num = sc.nextInt();
		int num1 = num % 10;
		int num10 = num / 10;
		
		
		if(num1 == num10)
			System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
		else
			System.out.println("No! �ٸ��ϴ�.");
		
		
	}

}
