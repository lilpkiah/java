import java.util.Scanner;

public class test8 {

	// 8 
	public static boolean inRect(int x, int y, int rect_x1, int rect_y1, int rect_x2, int rect_y2) {
		if((x >= rect_x1 && x <= rect_x2) && (y >= rect_y1 && y <= rect_y2))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� �� (x1, y1), (x2, y2)�� ��ǥ�� �Է��Ͻÿ�>>");
		
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		
		if( inRect(x1, y1, 100, 100, 200, 200) || 
			inRect(x1, y2, 100, 100, 200, 200) ||
			inRect(x2, y1, 100, 100, 200, 200) ||
			inRect(x2, y2, 100, 100, 200, 200) )
		{
			System.out.println("�簢���� ��Ĩ�ϴ�.");
		}
		else
			System.out.println("�簢���� ��ġ�� �ʽ��ϴ�.");
		
	}
}
