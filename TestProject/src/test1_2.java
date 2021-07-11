import java.util.Scanner;

public class test1_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 1
		System.out.print("원화를 입력하세요(단위 원)>>");
		
		int won = sc.nextInt();
		
		double dollar = won / 1216.0;
		
		String str = String.format("%.2f", dollar);
		
		System.out.println(won + "원은 $" + str + "입니다." );
		
		
		// 2
		System.out.print("2자리수 정수 입력(10~99)>>");
		
		int num = sc.nextInt();
		int num1 = num % 10;
		int num10 = num / 10;
		
		
		if(num1 == num10)
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
		else
			System.out.println("No! 다릅니다.");
		
		
	}

}
