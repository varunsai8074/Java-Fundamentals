import java.util.*;
public class Series3
{
    public static void main(String[] args)
    {
        int a=3;
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++)
        {
            double b = Math.pow(a,i);
            System.out.printf("%.0f ",b);
        }
        
    }
}
