// 1. Ŭ���� �����
class Person {
	// �������
	private String name;
	private int age;
	private double height;
	
	//������
	Person() {
		System.out.println("���� ������!");
	}
	
	//�޼ҵ�
	int addAge(int plus) {
		age = age + plus;
		return age;
	}
	
	void Setname(String name) {
		this.name = name;
	}
	
	String Getname() {
		return name;
	}
	
	void Setage(int age) {
		this.age = age;
	}
	
	int Getage() {
		return age;
	}
}


public class Ex04_Test {

	public static void main(String[] args) {
		// 2. Ŭ���� ���, 3. ��ü �����
		Person p1 = new Person();
		
		// 4.��ü ���
//		p1.name = "ȫ�浿";
//		p1.age = 20; // �������
		//System.out.println(p1.name + "�� ���̴�" + p1.age);
		
//		
//		p1.add(); // �޼ҵ�
		System.out.println("��¥ ���̴�=>" + p1.addAge(3));
		
	}
}
