
import java.util.Scanner;

public class test12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// (1)
		System.out.print("����>> ");
		
		int a = sc.nextInt();
		String s = sc.next();
		int b = sc.nextInt();
		
		if(s.equals("+"))
			System.out.println(a + s + b + "�� ��� ����� " + (a+b));
		else if(s.equals("-"))
			System.out.println(a + s + b + "�� ��� ����� " + (a-b));
		else if(s.equals("*"))
			System.out.println(a + s + b + "�� ��� ����� " + (a*b));
		else if(s.equals("/")) {
			if(b == 0)
				System.out.println("0���� ���� �� �����ϴ�.");
			else
				System.out.println(a + s + b + "�� ��� ����� " + (a/b));
		}
		
		// (2)
		System.out.print("����>> ");
		int a2 = sc.nextInt();
		String s2 = sc.next();
		int b2 = sc.nextInt();
	
		switch(s2){
		case "+": System.out.println(a + s + b + "�� ��� ����� " + (a+b)); break;
		case "-": System.out.println(a + s + b + "�� ��� ����� " + (a-b)); break;
		case "*": System.out.println(a + s + b + "�� ��� ����� " + (a*b)); break;
		case "/": if(b2==0) {System.out.println("0���� ���� �� �����ϴ�.");} else {System.out.println(a + s + b + "�� ��� ����� " + (a+b));} break;
		}
		
	}
}