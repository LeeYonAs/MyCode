package mycust;

import java.util.Scanner;

public class SmallShop {
	int price=5;//单价
	int total;//总收入
	int num=5;//库存
	int buynum;//用户买的数量
	int dog;//幸运数字 中奖数字
	//int random;
	
		
	void showWelcome() //欢迎信息
	{
		System.out.println("欢迎使用");
	}
	
	void showPrice() //单价
	{
		System.out.println("一瓶可乐"+price+"元");
	}
	
		
	void buysth(int buynum)//用户买的数量
	{
		if (buynum<num) {
			num = num-buynum;
			total = buynum*price;
			System.out.println("你买了"+buynum+"件");}
		else
			System.out.println("不好意思 现在只有"+num+"件");
	}
	void showTotal() //显示总收入
	{
			System.out.println("总收入"+total+"元");
	}
	
	void getFood() //用户拿走商品
	{
		if(num>1) {
			System.out.println("请拿好你的商品");
			System.out.println("商品剩余"+num+"件");}
		else
			System.out.println("不好意思 卖完了");
		
	}
	
	void lucky() //对3取余中奖
	{
		System.out.println("请输入一个数字");
		@SuppressWarnings("resource")
		Scanner ss = new Scanner(System.in);
		dog = ss.nextInt();
//		dog = (int)(Math.random()*10);
//			System.out.println(random); 
		if(dog%3 == 0) {
			System.out.println("恭喜你 中奖了");}
		else
			System.out.println("很遗憾 谢谢惠顾");
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
