package control;

import java.util.Scanner;

public class Cainum {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int num = (int)(Math.random()*1200+1);
		int a;
		int count=0;
		System.out.println("��ʼ�����ְ�");
		do {
			a = in.nextInt();
			count = count +1;
			if(a>num) {
				System.out.println("�������ֵƫ��");
			}
			else if(a<num) {
				System.out.println("�������ֵƫС");
			}
		}while(a!=num);
		System.out.println("��ϲ��"+count+"�β¶��ˣ�");
	}
}
