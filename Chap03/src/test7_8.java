import java.util.Scanner;

public class test7_8 {
	public static void main(String[] args) {
		
		// 7
		int arr[] = new int[10];
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
			sum += arr[i];
		}
		
		System.out.println("랜덤한 정수들 : ");
		for(int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();
		System.out.println("평균은 " + (double)sum / arr.length);
	
		
		// 8
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 몇개? ");
		
		int num = sc.nextInt();
		int arr2[] = new int[num];
		
		for(int i = 0; i < arr2.length; i++) {
			int rand = (int)(Math.random() * 100 + 1);
			if((i != 0) && (rand == arr2[i-1]))
				rand = (int)(Math.random() * 100 + 1);
			else
				arr2[i] = rand;
		}
		
		for(int i = 0; i < arr2.length; i++) {
			if(i % 10 == 0 && i != 0) {
				System.out.println();
			}
			System.out.print(arr2[i] + " ");
		}
	
	}
}
