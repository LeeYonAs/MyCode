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
		      //�������������һ��������name
		      System.out.println("С���������� : " + name +age+size); 
		   }
		public Puppy(String string) {
			// TODO �Զ����ɵĹ��캯�����
		}

		public static void main(String[] args){
		      // �������佫����һ��Puppy����
		      Puppy name = new Puppy( "tommy" );
		      //Puppy size= new Puppy(20);
		      //first.name = "tommy";
		   }
		}


