import java.util.Scanner;

public class test16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str[] = {"����", "����", "��"};
		
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		
		while(true) {
			
			System.out.print("���� ���� ��!>>");
			String user = sc.next();
			
			int n = (int)(Math.random()*3);
			
			if(user.equals("����")) {
				System.out.print("����� = " + user);
				if(str[n].equals("����"))
					System.out.println(", ��ǻ�� = " + str[n] + ", ��ǻ�Ͱ� �̰���ϴ�.");
				else if(str[n].equals("����"))
					System.out.println(", ��ǻ�� = " + str[n] + ", �����ϴ�.");
				else if(str[n].equals("��"))
					System.out.println(", ��ǻ�� = " + str[n] + ", ��ǻ�Ͱ� �����ϴ�.");
				else
					System.out.println(", ��ǻ�� = " + str[n] + ", �ٽ� �ϼ���.");
					
			}
			
			else if(user.equals("����")) {
				System.out.print("����� = " + user);
				if(str[n].equals("��"))
					System.out.println(", ��ǻ�� = " + str[n] + ", ��ǻ�Ͱ� �̰���ϴ�.");
				else if(str[n].equals("����"))
					System.out.println(", ��ǻ�� = " + str[n] + ", �����ϴ�.");
				else if(str[n].equals("����"))
					System.out.println(", ��ǻ�� = " + str[n] + ", ��ǻ�Ͱ� �����ϴ�.");
				else
					System.out.println(", ��ǻ�� = " + str[n] + ", �ٽ� �ϼ���.");
					
			}
			
			else if(user.equals("��")) {
				System.out.print("����� = " + user);
				if(str[n].equals("����"))
					System.out.println(", ��ǻ�� = " + str[n] + ", ��ǻ�Ͱ� �̰���ϴ�.");
				else if(str[n].equals("��"))
					System.out.println(", ��ǻ�� = " + str[n] + ", �����ϴ�.");
				else if(str[n].equals("����"))
					System.out.println(", ��ǻ�� = " + str[n] + ", ��ǻ�Ͱ� �����ϴ�.");
				else
					System.out.println(", ��ǻ�� = " + str[n] + ", �ٽ� �ϼ���.");
					
			}
			
			else if(user.equals("�׸�")) {
				System.out.println("������ �����մϴ�. . .");
				break;
			}
			
		}
	}
}
