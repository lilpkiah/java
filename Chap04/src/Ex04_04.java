
public class Ex04_04 {
	
	static void f1() {}
	static void f2() {}
	
	public static void main(String[] args) {
		
		f1();
		char c[] = {'T','h','i','s',' ','a',' ','p','e','n','c','i','l','.'};
		
		ArrayParameter ap = new ArrayParameter();
		ap.printCharArray(c);
		ap.replaceSpace(c);
		ap.printCharArray(c);
	}
}
