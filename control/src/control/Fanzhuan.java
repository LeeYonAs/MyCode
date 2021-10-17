package control;

import java.util.Scanner;

public class Fanzhuan {

	public static void main(String[] args) {
		int i;
		@SuppressWarnings("resource")
		Scanner in = new Scanner (System.in);
		System.out.println("请输入一个数");
		i = in.nextInt();
		//System.out.println(i);
		do {
			System.out.print(i%10);
			i=i/10;
			}while(i!=0);
			}
}
