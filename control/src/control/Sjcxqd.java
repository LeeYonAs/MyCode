package control;

import java.util.Scanner;

public class Sjcxqd {

	public static void main(String[] args) {
		int month ;
		String season;
		System.out.println("������һ���·�");
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		month=in.nextInt();
		switch(month) {
			case 12:
			case 1:
			case 2:
				season="����";
				break;
			case 3:
			case 4:
			case 5:
				season="����";
				break;
			case 6:
			case 7:
			case 8:
				season="�ļ�";
				break;
			case 9:
			case 10:
			case 11:
				season="�＾";
				break;
			default:
				season="�������˴�����·� ����������";
		}
		if(month<13 && month>0)
			System.out.println(month+"����"+season+"��");
		else
			System.out.println("�������˴�����·� ����������");
	}

}
