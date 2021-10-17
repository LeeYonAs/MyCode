package mycust;

public class People {
	 String name;
	 int age;
	 int length;
	
	public People() {}
	public People(String name,int age,int length) {
		this.age = age;
		this.length = length;
		this.name =name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public static void main(String[] args) {
		People zs = new People();
		People ls = new People();
		zs.setName("ÕÅÈý");
		zs.setAge(20);
		zs.setLength(180);
		
		System.out.println(zs.name);
		System.out.println(zs.age);
		System.out.println(zs.length);
		System.out.println(ls.length);
	}

}
