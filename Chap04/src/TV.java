
public class TV {
	// 1. �������
	String product;
	int year;
	int inch;
	
	// 2. ������
	public TV(String p, int y, int i) {
		product = p;
		year = y;
		inch = i;
	}
	
	// 3. �޼ҵ�
	void show() {
		System.out.println(product + "���� ���� " + year + "���� " + inch + "��ġ TV");
	}
	
	
}
