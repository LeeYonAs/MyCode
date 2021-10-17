package control;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		int year;
		System.out.println("请输入年份");
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		year=in.nextInt();
		if(year % 4 ==0 && year % 100 !=0 || year %400 ==0) {
			System.out.println(+year+"年是闰年");
		}
		else {
			System.out.println(+year+"年不是闰年");
		}

	}

}
