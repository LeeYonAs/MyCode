package mycust;

class User{
	String name; 
	int ID;
	String PWD;
	int money;
	
	User(String newName,int newID, String newPWD,int newMoney){
		name = newName;
		ID= newID;
		PWD = newPWD;
		money = newMoney; 
	}
	void setMoney(int getMoney) {
		money = money-getMoney;
	}
	void getMoney(int saveMoney) {
		money = money+saveMoney;
	}
	void search() {
		System.out.println("户名："+name);
		System.out.println("账号："+ID);
		System.out.println("账户余额："+money);
		System.out.println("密码："+PWD);
	}
	void changePWD(String newPWD) {
		PWD= newPWD;
	}
}
public class BankDemo1 {

	public static void main(String[] args) {
		User user01= new User("张三",00002,"1111",1000);
		user01.setMoney(500);
		user01.getMoney(1000);
		user01.changePWD("6666");
		user01.search();

		User user02= new User("李四",00001,"2222",2000);
		user02.getMoney(5000);
		user02.search();
	}

}

