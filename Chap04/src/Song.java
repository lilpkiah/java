
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
		System.out.println(year + "�� " + country + "������ " + artist + "�� �θ� " + title);
	}
	
	public static void main(String[] args) {
		Song s = new Song("Dancing Queen", "ABBA", 1978, "������");
		s.show();
	}
}
