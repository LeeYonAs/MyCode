package control;

public class Sum1100 {

	public static void main(String[] args) {
		int sum=0,sum1=0,sum2=0,n=1,m=1;
		//第一种for循环
		for(int i=1;i<101;i++) {
			sum=sum+i;
		}
		System.out.println(sum);
		//第二种do-while循环
		do {
			sum1=sum1+n;
			n++;
		}while(n<101);
		System.out.println(sum1);
		//第三章while循环
		while(m<101) {
			sum2=sum2+m;
			m++;
		}
		System.out.println(sum2);
	}

}
