import java.util.Scanner;

public class test9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("원의 중심과 반지름 입력>>");
		
		int rx = sc.nextInt();
		int ry = sc.nextInt();
		double r = sc.nextDouble();
		
		System.out.print("점 입력>>");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		double d;
		
		d = Math.sqrt(((x - rx) * (x - rx)) + ((y - ry) * (y - ry)));
		
		if(d < r)
			System.out.println("점 (" + x + "," + y + ")는 원 안에 있다.");
		else
			System.out.println("점 (" + x + "," + y + ")는 원 안에 없다.");
		
		
	}

}
