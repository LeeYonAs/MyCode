package control;

import java.util.Scanner;

public class SignFunction {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int x,y;
		System.out.println("������x��ֵ");
		Scanner in = new Scanner(System.in);
		x=in.nextInt();
		if(x>0)
			y=1;
		else if(x==0)
			y=0;
		else
			y=-1;
		System.out.println("��x="+x+"ʱ");
		System.out.println("y="+y);
	}

}
