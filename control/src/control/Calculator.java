package control;

import java.util.Scanner;

public class Calculator {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		double a,b,c;
		char f;
		System.out.println("������ӡ������ˡ�����ȡ�����е�һ�����㷨��");
		Scanner ss = new Scanner(System.in);
	    f = ss.next().charAt(0);	
		System.out.println("�밴˳����������Ԫ��");
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
				System.out.println("���㷨�������������ȷ�����㷨��");
		}
		
		}

}
