package control;

//利用for循环 取平均值
import java.util.Scanner;

public class AverageGrade {

	public static void main(String[] args) {
		int subnum;
		double score, sum, avg;
		Scanner in = new Scanner(System.in);
		sum = 0;
		System.out.println("请输入科目数");
		subnum = in.nextInt();
		System.out.println("请输入科目分数");
		for (int i = 0; i < subnum; i++) {
			score = in.nextDouble();
			sum = sum + score;
		}
		avg = sum / subnum;
		System.out.println(subnum + "门课的平均分是" + avg);
		System.out.printf("%d门课的平均分是%.1f", subnum, avg);
	}

}