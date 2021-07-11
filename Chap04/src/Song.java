
public class Song {
	String title;
	String artist;
	int year;
	String country;
	
	Song() {}
	
	Song(String t, String a, int y, String c){
		title = t;
		artist = a;
		year = y;
		country = c;
	}
	
	void show() {
		System.out.println(year + "년 " + country + "국적의 " + artist + "가 부른 " + title);
	}
	
	public static void main(String[] args) {
		Song s = new Song("Dancing Queen", "ABBA", 1978, "스웨덴");
		s.show();
	}
}
