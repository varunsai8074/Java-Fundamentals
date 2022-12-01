import java.util.*;
public class Series10
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double a=95.0,b=20.5;
        int n = sc.nextInt();
        
        
        for(int i=1; i<=n; i++)
        {
            System.out.printf("%.1f ",a);
            double c= a+b;
            a=c;
            b+=2;
        }
    }
}
