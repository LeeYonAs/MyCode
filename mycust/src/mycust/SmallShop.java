package mycust;

import java.util.Scanner;

public class SmallShop {
	int price=5;//����
	int total;//������
	int num=5;//���
	int buynum;//�û��������
	int dog;//�������� �н�����
	//int random;
	
		
	void showWelcome() //��ӭ��Ϣ
	{
		System.out.println("��ӭʹ��");
	}
	
	void showPrice() //����
	{
		System.out.println("һƿ����"+price+"Ԫ");
	}
	
		
	void buysth(int buynum)//�û��������
	{
		if (buynum<num) {
			num = num-buynum;
			total = buynum*price;
			System.out.println("������"+buynum+"��");}
		else
			System.out.println("������˼ ����ֻ��"+num+"��");
	}
	void showTotal() //��ʾ������
	{
			System.out.println("������"+total+"Ԫ");
	}
	
	void getFood() //�û�������Ʒ
	{
		if(num>1) {
			System.out.println("���ú������Ʒ");
			System.out.println("��Ʒʣ��"+num+"��");}
		else
			System.out.println("������˼ ������");
		
	}
	
	void lucky() //��3ȡ���н�
	{
		System.out.println("������һ������");
		@SuppressWarnings("resource")
		Scanner ss = new Scanner(System.in);
		dog = ss.nextInt();
//		dog = (int)(Math.random()*10);
//			System.out.println(random); 
		if(dog%3 == 0) {
			System.out.println("��ϲ�� �н���");}
		else
			System.out.println("���ź� лл�ݹ�");
	}
	public static void main(String[] args) {
		SmallShop m1= new SmallShop();
		SmallShop m2= new SmallShop();
		m1.showWelcome();
		m1.showPrice();
		m1.buysth(2);
		m1.showTotal();
		m1.getFood();
		m1.lucky();
		m2.getFood();
	}

}
