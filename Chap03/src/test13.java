
public class test13 {
	public static void main(String[] args) {
		
		for(int i = 1; i < 100; i++) {
			
			if(i < 10) {
				if(i % 3 == 0)
					System.out.println(i + " �ڼ� ¦");
			} else {
			
				boolean b1 = false;
				boolean b2 = false;
				
				int num10 = i / 10; // 10	
				int num1 = i % 10;
				
				if(num1 == 3 || num1 == 6 || num1 == 9)
					b1 = true;
				
				if(num10 == 3 || num10 == 6 || num10 == 9)
					b2 = true;
				
				if(b1 && b2)
					System.out.println(i + " �ڼ� ¦¦");
				else if(b1 || b2)
					System.out.println(i + " �ڼ� ¦");
			
			
			}
				
		}
	}
}
