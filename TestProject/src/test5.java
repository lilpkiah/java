import java.util.Scanner;

public class test5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� 3���� �Է��Ͻÿ�>>");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a+b < c)
			System.out.println("�ﰢ���� �˴ϴ�.");
		else
			System.out.println("�ﰢ���� ���� �ʽ��ϴ�.");
	}
}
