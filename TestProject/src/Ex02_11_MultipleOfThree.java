import java.util.Scanner;

public class Ex02_11_MultipleOfThree {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("���� �Է��Ͻÿ�: ");
		int number = in.nextInt();
		
		if(number % 3 == 0)
			System.out.println("3�� ����Դϴ�.");
		else
			System.out.println("3�� ����� �ƴմϴ�.");

	}

}
