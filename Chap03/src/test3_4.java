import java.util.Scanner;

public class test3_4 {
	public static void main(String[] args) {

		//3
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오>>");
		int num = sc.nextInt();
		
		for(int i = num; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();


		//4
		
		System.out.print("소문자 알파벳 하나를 입력하시오>>");
		String s = sc.next();
		char c = s.charAt(0);
		
		int a = (int)'a';
		
		
		for(int i = a; i <= c; c--) {
			for(int j = a; j <= c; j++) {
				System.out.print((char)j);
			}
			System.out.println();
		}
		
		for(char i = c; i >= 'a'; --i) {
			for(char j = 'a'; j <= i; ++j) {
				System.out.println(j);
			}
			System.out.println();
		}
		
		

	}
}
