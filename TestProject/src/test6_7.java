import java.util.Scanner;

public class test6_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 6
		System.out.print("1~99 ������ ������ �Է��Ͻÿ�>>");
		
		int num = sc.nextInt();
		int num1 = num % 10;
		int num10 = num / 10;
		
		if(num1 % 3 == 0) {
			if(num10 % 3 == 0) {
				System.out.println("�ڼ�¦¦");
			}
			else
				System.out.println("�ڼ�¦");
		}else if(num10 % 3 == 0)
		{
			System.out.println("�ڼ�¦");
		}
		
		
		// 7
		System.out.print("�� (x,y)�� ��ǥ�� �Է��Ͻÿ�>>");
		int x1 = 100, y1 = 100;
		int x2 = 200, y2 = 200;
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if((x1 < x) && (x2 > x) && (y1 < y) && (y2 > y))
			System.out.println("("+ x +"," + y +")�� �簢�� �ȿ� �ֽ��ϴ�." );
		else
			System.out.println("("+ x +"," + y +")�� �簢�� �ȿ� ���� �ʽ��ϴ�." );
	}
	
	}
	
