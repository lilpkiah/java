import java.util.Scanner;

public class test16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str[] = {"가위", "바위", "보"};
		
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		
		while(true) {
			
			System.out.print("가위 바위 보!>>");
			String user = sc.next();
			
			int n = (int)(Math.random()*3);
			
			if(user.equals("가위")) {
				System.out.print("사용자 = " + user);
				if(str[n].equals("바위"))
					System.out.println(", 컴퓨터 = " + str[n] + ", 컴퓨터가 이겼습니다.");
				else if(str[n].equals("가위"))
					System.out.println(", 컴퓨터 = " + str[n] + ", 비겼습니다.");
				else if(str[n].equals("보"))
					System.out.println(", 컴퓨터 = " + str[n] + ", 컴퓨터가 졌습니다.");
				else
					System.out.println(", 컴퓨터 = " + str[n] + ", 다시 하세요.");
					
			}
			
			else if(user.equals("바위")) {
				System.out.print("사용자 = " + user);
				if(str[n].equals("보"))
					System.out.println(", 컴퓨터 = " + str[n] + ", 컴퓨터가 이겼습니다.");
				else if(str[n].equals("바위"))
					System.out.println(", 컴퓨터 = " + str[n] + ", 비겼습니다.");
				else if(str[n].equals("가위"))
					System.out.println(", 컴퓨터 = " + str[n] + ", 컴퓨터가 졌습니다.");
				else
					System.out.println(", 컴퓨터 = " + str[n] + ", 다시 하세요.");
					
			}
			
			else if(user.equals("보")) {
				System.out.print("사용자 = " + user);
				if(str[n].equals("가위"))
					System.out.println(", 컴퓨터 = " + str[n] + ", 컴퓨터가 이겼습니다.");
				else if(str[n].equals("보"))
					System.out.println(", 컴퓨터 = " + str[n] + ", 비겼습니다.");
				else if(str[n].equals("바위"))
					System.out.println(", 컴퓨터 = " + str[n] + ", 컴퓨터가 졌습니다.");
				else
					System.out.println(", 컴퓨터 = " + str[n] + ", 다시 하세요.");
					
			}
			
			else if(user.equals("그만")) {
				System.out.println("게임을 종료합니다. . .");
				break;
			}
			
		}
	}
}
