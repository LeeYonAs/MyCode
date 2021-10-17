package control;

public class sqrt {
	public static float sqrtRoot(float m) {
	   if ( m == 0 ) {
		   return 0;
	   }
		float x1 = m / 2;
		for(int i=0;i<1000;i++){
			float x2 = (x1 + (m/x1))/2;
			if(x1-x2 <= 0.0001){
				return x2;
			}
			x1 = x2;
		}
	   return 0;
	}
    public static void main(String []args) {
		float i = 14;
		float l = sqrtRoot(i);
       	System.out.println(l);
    }
}