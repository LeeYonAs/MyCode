package control;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		int year;
		System.out.println("���������");
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		year=in.nextInt();
		if(year % 4 ==0 && year % 100 !=0 || year %400 ==0) {
			System.out.println(+year+"��������");
		}
		else {
			System.out.println(+year+"�겻������");
		}

	}

}
