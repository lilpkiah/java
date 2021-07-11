import java.util.Scanner;

public class CircleManager {
	
	void run() {
		Scanner sc = new Scanner(System.in);
		
		// 3���� Circle �迭 ����
		Circle c[] = new Circle[3];
		
		
		for(int i = 0; i < c.length; i++) {
			System.out.print("x, y, radius >>");
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			int radius = sc.nextInt();
			c[i] = new Circle(x, y, radius);
		}
		
		for(int i = 0; i < c.length; i++)
			c[i].show();
		

		sc.close();
	
	}

}