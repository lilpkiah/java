import java.util.Scanner;

public class test6_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 6
		System.out.print("1~99 사이의 정수를 입력하시오>>");
		
		int num = sc.nextInt();
		int num1 = num % 10;
		int num10 = num / 10;
		
		if(num1 % 3 == 0) {
			if(num10 % 3 == 0) {
				System.out.println("박수짝짝");
			}
			else
				System.out.println("박수짝");
		}else if(num10 % 3 == 0)
		{
			System.out.println("박수짝");
		}
		
		
		// 7
		System.out.print("점 (x,y)의 좌표를 입력하시오>>");
		int x1 = 100, y1 = 100;
		int x2 = 200, y2 = 200;
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if((x1 < x) && (x2 > x) && (y1 < y) && (y2 > y))
			System.out.println("("+ x +"," + y +")는 사각형 안에 있습니다." );
		else
			System.out.println("("+ x +"," + y +")는 사각형 안에 있지 않습니다." );
	}
	
	}
	
