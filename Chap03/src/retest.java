
public class retest {
	
	static void method01() {
		System.out.println("�ȳ�");
		System.out.println("�ϼ���.");
	}
	
	static void method02(int x, int y) {
		System.out.println("���Ѱ��=" + (x + y));
	}
	
	// in (x), out (o)
	static int method03() {
		int c = 100;
		return c;
	}
	
	// in (o), out (o)
	static int method04(int a, int b) {
		int c = a + b;
		return c;
	}
	
	static void method05(int[] arr) {
		arr[0] = arr[0] + 15;
		System.out.println("�޼ҵ�arr1[0]-->" + arr[0]);
	}
	
	static void method06(int g) {
		g = g + 11;

		System.out.println("�޼ҵ� g-->" + g);
	}
	
	public static void main(String[] args) {
	
		String s1 = args[0];
		String s2 = args[1];
		String s3 = args[2];
		
		int n1 = Integer.parseInt(s1);
		int n2 = Integer.parseInt(s2);
		int n3 = Integer.parseInt(s3);
		
		System.out.println("args�հ�-->" + (n1 + n2 + n3));
		
		
		method01();
		
		method02(3, 4);
		
		int x = 10, y = 32;
		method02(x, y);
		
		int a = 10, b = 20;
		method02(a, b);
		
		int d = method03();
		System.out.println("��ȯ��(���ϰ�)"+d);
		
		int f = method04(100, 200);
		System.out.println("��ȯ��(���ϰ�)"+f);
		
		
		int arr1[] = new int[3];
		arr1[0] = 11;
		arr1[1] = 23;
		
		method05(arr1);
		
		System.out.println(arr1[0]);
		
		
		int g = 10;
		method06(g);
		System.out.println("g-->" + g);
	}
	
	
}
