import java.util.Scanner;

public class test10_11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 10 두 점 사이의 거리
		System.out.print("첫번째 원의 중심과 반지름 입력>>");
		
		int rx1 = sc.nextInt();
		int ry1 = sc.nextInt();
		double r1 = sc.nextDouble();
		
		System.out.print("두번째 원의 중심과 반지름 입력>>");
		
		int rx2 = sc.nextInt();
		int ry2 = sc.nextInt();
		double r2 = sc.nextDouble();
		
		double d = Math.sqrt(((rx1 - rx2) * (rx1 - rx2)) + ((ry1 - ry2) * (ry1 - ry2)));
		
		if(d <= r1 + r2)
			System.out.println("두 원은 서로 겹친다.");
		else
			System.out.println("두 원은 서로 겹치지 않는다.");
		
		
		// 11 - (1)
		System.out.print("달을 입력하세요(1~12)>>");
		int m = sc.nextInt();
		
		if(m == 3 || m == 4 || m == 5) {
			System.out.println("봄");
		}
		else if(m == 6 || m == 7 || m == 8) {
			System.out.println("여름");
		}
		else if(m == 9 || m == 10 || m == 11) {
			System.out.println("가을");
		}
		else if(m == 12 || m == 1 || m == 2){
			System.out.println("겨울");
		}
		else {
			System.out.println("잘못입력");
		}
		
		// 11 - (2)
		
		System.out.print("달을 입력하세요(1~12)>>");
		int m2 = sc.nextInt();
		
		switch(m2) {
		case 3,4,5: System.out.println("봄"); break;
		case 6,7,8: System.out.println("여름"); break;
		case 9,10,11: System.out.println("가을"); break;
		case 12,1,2: System.out.println("겨울"); break;
		default: System.out.println("잘못입력");
		}
		
	}
}
