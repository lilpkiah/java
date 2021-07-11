import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 3
		System.out.print("금액을 입력하시오>>");
		
		int money = sc.nextInt();
		int ea = 0;
		
		while(money != 0) {
			if(money > 50000) {
				ea = money / 50000;
				money = money - (ea * 50000);
				System.out.println("오만원권 " + ea + "매");
			}
			else if(money > 10000) {
				ea = money / 10000;
				money = money - (ea * 10000);
				System.out.println("만원권 " + ea + "매");
			}
			else if(money > 1000) {
				ea = money / 1000;
				money = money - (ea * 1000);
				System.out.println("천원권 " + ea + "매");
			}
			else if(money > 500) {
				ea = money / 500;
				money = money - (ea * 500);
				System.out.println("오백원 " + ea + "개");
			}
			else if(money > 100) {
				ea = money / 100;
				money = money - (ea * 100);
				System.out.println("백원 " + ea + "개");
			}
			else if(money > 50) {
				ea = money / 50;
				money = money - (ea * 50);
				System.out.println("오십원 " + ea + "개");
			}
			else if(money > 10) {
				ea = money / 10;
				money = money - (ea * 10);
				System.out.println("십원 " + ea + "개");
			}
		}
		
	

	}

}
