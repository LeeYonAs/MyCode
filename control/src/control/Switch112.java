package control;

import java.util.Scanner;

public class Switch112 {

	public static void main(String[] args) {
		int m;
		String day = null;
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		m= in.nextInt();
		switch(m) {
			case 1: case 3:case 5:case 7:case 8:case 10:case 12:
				day="月有31天";
			break;
			case 4:case 6:case 9:case 11:
				day="月有30天";
			break;
			case 2: 
				day="月有28或29天";
			break;
			default:
				day="你输入了错误的月份 请重新输入";
				}
		System.out.println(m+day);
	}

}
