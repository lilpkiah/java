import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 3개 입력>>");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int mid = a;
		
		if(a > b && b > c)
			mid = b;
		else if(b > a && a > c)
			mid = a;
		else
			mid = c;
	
		System.out.println("중간 값은 " + mid);
	
	}

}
