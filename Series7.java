import java.util.Scanner;
public class Series7
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double a=1,b=2;
        double n=sc.nextDouble();
        System.out.printf("%.0f %.1f ",a,b);
        for(int i=1;i<n-1;i++)
        {
            if(i%2==0)
            {
                b=b*3;
                System.out.printf("%.1f ",b);
            }
            if(i%2!=0)
            {
                a=3*a;
                System.out.printf("%.1f ",a);
            }
        }
    }
}
