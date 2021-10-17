package control;

import java.util.Scanner;

public class Sjcxqd {

	public static void main(String[] args) {
		int month ;
		String season;
		System.out.println("请输入一个月份");
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		month=in.nextInt();
		switch(month) {
			case 12:
			case 1:
			case 2:
				season="冬季";
				break;
			case 3:
			case 4:
			case 5:
				season="春季";
				break;
			case 6:
			case 7:
			case 8:
				season="夏季";
				break;
			case 9:
			case 10:
			case 11:
				season="秋季";
				break;
			default:
				season="你输入了错误的月份 请重新输入";
		}
		if(month<13 && month>0)
			System.out.println(month+"月是"+season+"。");
		else
			System.out.println("你输入了错误的月份 请重新输入");
	}

}
