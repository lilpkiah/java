import java.util.Scanner;

public class test14 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String course [] = {"Java", "C++", "HTML5", "컴퓨터 구조", "안드로이드"};
		int score [] = {95, 88, 76, 72, 55};
		
		
		
		while(true) {
			System.out.print("과목 이름>>");
		
			String name = sc.next();
			int cnt = 0;
		
			if(name.equals("그만"))
				break;
			
			for(int i = 0; i < course.length; i++) {				
				if(course[i].equals(name)) {
					int n = score[i];
					System.out.println(course[i] + "의 점수는 " + n );
					cnt += 1;
				} 
			}
			
			if(cnt == 0)
				System.out.println("없는 과목입니다.");
			
			
		
		}
		
		
	}
}
