
public class TV {
	// 1. 멤버변수
	String product;
	int year;
	int inch;
	
	// 2. 생성자
	public TV(String p, int y, int i) {
		product = p;
		year = y;
		inch = i;
	}
	
	// 3. 메소드
	void show() {
		System.out.println(product + "에서 만든 " + year + "년형 " + inch + "인치 TV");
	}
	
	
}
