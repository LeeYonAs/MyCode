package control;

public class For99{
    public static void main(String[] args)
    {
        System.out.println("�˷��ھ���");
        for(int i=1;i<=9;i++)
        {
            for(int j=1;j<=i;j++)
            {
                int k=i*j;
            	System.out.print(j+"*"+i+"="+k+"\t");
            }
            System.out.println();
        }
    }
}