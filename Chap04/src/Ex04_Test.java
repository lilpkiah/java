// 1. 클래스 만들기
class Person {
	// 멤버변수
	private String name;
	private int age;
	private double height;
	
	//생성자
	Person() {
		System.out.println("나는 생성자!");
	}
	
	//메소드
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
		// 2. 클래스 사용, 3. 객체 만들기
		Person p1 = new Person();
		
		// 4.객체 사용
//		p1.name = "홍길동";
//		p1.age = 20; // 멤버변수
		//System.out.println(p1.name + "의 나이는" + p1.age);
		
//		
//		p1.add(); // 메소드
		System.out.println("진짜 나이는=>" + p1.addAge(3));
		
	}
}
