package exampledemo;

public class DemoExample {
    public static void main(String args[])

    {
        int num=1;
        	for(int i=1;i<=5; i++)
            {
                for(int j=num; j<=i+1; j++)
                {

                    System.out.print(j+" ");

                }
              num++;
                System.out.println();
            }
    }
}
