import java.util.*;
public class Series9
{
    public static void main(String[] args)
    {
        double a = 2;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        
        for(int i=1;i<=n;i++)
        {
            System.out.printf("%.0f ",a);
            double b = a*a;
            double d = b;
            a= (d-1);
            
            
        }
        
        
    }
}
