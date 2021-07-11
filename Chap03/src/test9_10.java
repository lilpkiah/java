
public class test9_10 {
	
	static void zero_arr(int[][] arr) {
		int x, y;
		
		for(int i = 0; i < 6; i++) {
			x = (int)(Math.random()*arr.length);
			y = (int)(Math.random()*arr[x].length);
			
			
			arr[x][y] = 0;
			
		}
	}
	
	public static void main(String[] args) {
		/*
		//9
		int arr[][] = new int [4][4];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int)(Math.random() * 10) + 1;
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		*/
		// 10
		int arr2[][] = new int [4][4];	// 4x4
		
		
		for(int i = 0; i < arr2.length; i++) {	// 1 ~ 10
			for(int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] =  (int)(Math.random()*10 + 1);
			}
		}
		

		zero_arr(arr2);	// 0인 6개 숫자 삽입메소드
		
		
		for(int i = 0; i < arr2.length; i++) {	// out
			for(int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
}
