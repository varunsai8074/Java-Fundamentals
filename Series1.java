import java.util.*;
public class Series1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        double sum=0;
        for(int i = 1; i<=n; i++)
        {
            sum = Math.pow(i,2);
            System.out.printf("%.0f ",sum);
        }
            
    }
}
