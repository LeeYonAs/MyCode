package control;

import java.util.Scanner;

public class SignFunction {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int x,y;
		System.out.println("请输入x的值");
		Scanner in = new Scanner(System.in);
		x=in.nextInt();
		if(x>0)
			y=1;
		else if(x==0)
			y=0;
		else
			y=-1;
		System.out.println("当x="+x+"时");
		System.out.println("y="+y);
	}

}
