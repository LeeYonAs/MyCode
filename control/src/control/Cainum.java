package control;

import java.util.Scanner;

public class Cainum {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int num = (int)(Math.random()*1200+1);
		int a;
		int count=0;
		System.out.println("开始猜数字吧");
		do {
			a = in.nextInt();
			count = count +1;
			if(a>num) {
				System.out.println("你输入的值偏大");
			}
			else if(a<num) {
				System.out.println("你输入的值偏小");
			}
		}while(a!=num);
		System.out.println("恭喜你"+count+"次猜对了！");
	}
}
