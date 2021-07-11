
public class test1_2 {
	public static void main(String[] args) {
		
		// 1
				int sum = 0, i = 0;
				
				for(; i < 100; i++) {
					sum += i;
					i += 2;
				}
				
				System.out.println(sum);
				
				
				// 2
				int n[][] = {{1}, {1, 2, 3}, {1}, {1, 2, 3, 4}, {1, 2}};
				
				for(int j = 0; j <= n.length; j++) {
					for(int z = 0; z <= n[j].length; z++) {
						System.out.print(n[j][z] + "\t");
					}
					System.out.println();
				}
				
	}
}
