import java.util.Scanner;

public class Ex02_12_Grading {
	public static void main (String[] args) {
		char grade;
		Scanner a = new Scanner(System.in);
		while (a.hasNext()) {
			int score = a.nextInt();
			if(score >= 90) // score�� 90 �̻��� ���
				grade = 'A';
			else if(score >= 80) // score�� 80 �̻��̸鼭 90 �̸��� ���
				grade = 'B';
			else if(score >= 70) // score�� 70 �̻��̸鼭 80 �̸��� ���
				grade = 'C';
			else if(score >= 60) // score�� 60 �̻��̸鼭 70 �̸��� ���
				grade = 'D';
			else // score�� 60 �̸��� ���
				grade = 'F';
			System.out.println("������ "+grade+"�Դϴ�");
		}
	}
}
