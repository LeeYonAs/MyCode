package control;

//����forѭ�� ȡƽ��ֵ
import java.util.Scanner;

public class AverageGrade {

	public static void main(String[] args) {
		int subnum;
		double score, sum, avg;
		Scanner in = new Scanner(System.in);
		sum = 0;
		System.out.println("�������Ŀ��");
		subnum = in.nextInt();
		System.out.println("�������Ŀ����");
		for (int i = 0; i < subnum; i++) {
			score = in.nextDouble();
			sum = sum + score;
		}
		avg = sum / subnum;
		System.out.println(subnum + "�ſε�ƽ������" + avg);
		System.out.printf("%d�ſε�ƽ������%.1f", subnum, avg);
	}

}