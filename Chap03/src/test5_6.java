import java.util.Scanner;

public class test5_6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 5
		int arr[] = new int[10];
		
		System.out.print("양의 정수 10개를 입력하시오>>");
		
		for(int i = 0; i < arr.length; i++) 
			arr[i] = sc.nextInt();
		
		for(int a : arr) {
			if(a % 3 == 0)
				System.out.print(a + " ");
		}
		
		// 6
		System.out.print("금액을 입력하시오>>");
		
		int money = sc.nextInt();
		
		int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		
		for(int i = 0; i < unit.length; i++) {
			if(money > unit[i]) {
				System.out.println(unit[i] + "원 짜리 : " + money / unit[i] + "개");
				money -= unit[i] * (money / unit[i]);
			}
			
		}
		



	}

}
