package mycust;

public class Puppy {
	int age;
	String name;
	int size;
	
	void setage(){
		
	}
	
	void setname() {
		
	}
	
	void setsise() {
		
	}
		
	    public Puppy(){
	    }
	 
		public Puppy(String name,int age,int size){
		      //这个构造器仅有一个参数：name
		      System.out.println("小狗的名字是 : " + name +age+size); 
		   }
		public Puppy(String string) {
			// TODO 自动生成的构造函数存根
		}

		public static void main(String[] args){
		      // 下面的语句将创建一个Puppy对象
		      Puppy name = new Puppy( "tommy" );
		      //Puppy size= new Puppy(20);
		      //first.name = "tommy";
		   }
		}


