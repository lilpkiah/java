import java.util.Scanner;

public class test14 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String course [] = {"Java", "C++", "HTML5", "��ǻ�� ����", "�ȵ���̵�"};
		int score [] = {95, 88, 76, 72, 55};
		
		
		
		while(true) {
			System.out.print("���� �̸�>>");
		
			String name = sc.next();
			int cnt = 0;
		
			if(name.equals("�׸�"))
				break;
			
			for(int i = 0; i < course.length; i++) {				
				if(course[i].equals(name)) {
					int n = score[i];
					System.out.println(course[i] + "�� ������ " + n );
					cnt += 1;
				} 
			}
			
			if(cnt == 0)
				System.out.println("���� �����Դϴ�.");
			
			
		
		}
		
		
	}
}
