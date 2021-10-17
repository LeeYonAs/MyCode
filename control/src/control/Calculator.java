package control;

import java.util.Scanner;

public class Calculator {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		double a,b,c;
		char f;
		System.out.println("请输入加·减·乘·除·取余其中的一个运算法则");
		Scanner ss = new Scanner(System.in);
	    f = ss.next().charAt(0);	
		System.out.println("请按顺序输入两个元素");
		a=ss.nextDouble();
		b=ss.nextDouble();
		switch (f) {
			case '+':
				c=a+b;
				System.out.println("a+b="+c);
				break;
			case '-':
				c=a-b;
				System.out.println("a-b="+c);	
				break;
			case '*':
				c=a*b;
				System.out.println("a*b="+c);	
				break;
			case '/':
				c=a/b;
				System.out.println("a/b="+c);	
				break;
			case '%':
				c=a%b;
				System.out.println("a%b="+c);	
				break;	
			default:
				System.out.println("运算法则错误，请输入正确的运算法则");
		}
		
		}

}
